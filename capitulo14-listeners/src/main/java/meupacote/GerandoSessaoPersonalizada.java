package meupacote;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import meupacote.listeners.SessaoPersonalizada;


@WebServlet("/criando-uma-sessao-personalizada")
public class GerandoSessaoPersonalizada extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		
			HttpSession sessao = request.getSession(true);
			sessao.setAttribute("sessaoPersonalizada", new SessaoPersonalizada());
		
			String html = "<html><head>"
			+ "<title>Trabalhando com Sessão Personalizada</title>"
			+ "</head>"
			+ "<body>"
			+ "Sua sessão foi criada com sucesso!<br>"
			+ "Sua ID é: <strong>" 
			+ sessao.getId( ) 
			+ "</strong><br>" 
			+ "</body></html>";
			
		    response.setContentType("text/html");
		    PrintWriter writer = response.getWriter( );
		    writer.print(html);  
		    writer.close( );	

	}  	
	
	public void destroy( ) {
		super.destroy( );
	}   	
	 
}