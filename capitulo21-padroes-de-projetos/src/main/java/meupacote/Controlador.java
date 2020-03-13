package meupacote;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import meupacote.util.LocalizaClasse;

@WebServlet("*.html")
public class Controlador extends HttpServlet{

	private static final long serialVersionUID = 1L;

	private Map<String,String> classes; 
    
	@Override
	public void init(ServletConfig config) throws ServletException {
		String localClasses = "meupacote"; 
        
		classes = new HashMap<>(); 
        
		try {
			classes = 
				LocalizaClasse.pesquisarClassesAtravesDoPacote(localClasses); 
			
			
            
		} catch (Exception e) {
			throw new ServletException(e);
		}
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
        
		String caminhoDaClasse = classes.get(path); 
            
		if(caminhoDaClasse == null) 
			throw new ServletException(String.format("O caminho informado em %s não existe",path)); 
            
		try {

			Comando command = (Comando) Class
					.forName(caminhoDaClasse)
					.getDeclaredConstructor()
					.newInstance(); 
			command.inicia(request, response);
			command.processa();

		} catch (Exception e) {
			request.setAttribute("exception", e);
			throw new ServletException(e);
		}
	}
}