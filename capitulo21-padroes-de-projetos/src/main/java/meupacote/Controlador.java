package meupacote;

import java.io.*;
import java.util.Properties;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("*.html")
public class Controlador extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private static Properties mapping;
    
	@Override
	public void init() throws ServletException {
		ServletContext context = getServletContext();
		try {
			InputStream inputStream = context
				.getResourceAsStream("/WEB-INF/mapping.properties");
			mapping = new Properties();
			mapping.load(inputStream);
			inputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		super.init();
	}
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		processaPedido(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		processaPedido(request, response);
	}

	private void processaPedido(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException {
		String path = request.getServletPath();
		path = path.substring(1, path.indexOf("."));

		String caminhoDaClasse = mapping.getProperty(path);
        
		if(caminhoDaClasse == null)         
			throw new ServletException(String.format("O caminho informado em %s não existe",path));
            
		try {
			Comando comando = (Comando) Class
				.forName(caminhoDaClasse)
				.getDeclaredConstructor()
				.newInstance();
			comando.inicia(request, response);
			comando.processa(); 
        
		} catch (Exception e) {
			request.setAttribute("exception", e);
			throw new ServletException(e);
		}
	}
}