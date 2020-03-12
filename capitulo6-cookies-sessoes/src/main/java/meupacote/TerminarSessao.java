package meupacote;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/terminar-sessao")
public class TerminarSessao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void destroy( ) {
		super.destroy( );
	}   	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
			
			HttpSession sessao = request.getSession(false); 
			if(sessao!=null) sessao.invalidate( );
			
			String html = "<html><head>"
					+ "<title>Terminando uma Sessão</title>"
					+ "</head>"
					+ "<body>"
					+ "<h4>ID da sessão destruída:</h4>";
			
			if(sessao!=null) sessao.getId( );
			
			html += "</strong><br />"
					+ "<a href=\"criando-uma-sessao\">Clique aqui</a> para iniciar uma nova sessão"
					+ "</body></html>";
		    PrintWriter writer = response.getWriter( );
		    writer.print(html);  
		    writer.close( );
	}  	  	  	  	  

	public void init( ) throws ServletException {
		super.init( );
	}   

}