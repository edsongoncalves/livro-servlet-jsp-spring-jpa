package meupacote;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/operando-sessao")
public class OperandoSessao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void destroy( ) {
		super.destroy( );
	}   	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		
			HttpSession sessao = request.getSession(true);
		
			if(request.getParameter("sessao").equals("invalida")) {
				sessao = request.getSession(false); 
				if(sessao!=null) sessao.invalidate( );
				
			}
			if(request.getParameter("sessao").equals("remove")) {
				
				sessao.removeAttribute("nome"); 
				
			}
			if(request.getParameter("sessao").equals("troca")) {
				sessao.setAttribute("nome", "Gonçalves");
				
			}
			
	
			
			String html = "<html><head>"
					+ "<title>Operando a Sessão</title>"
					+ "</head>"
					+ "<body>"
					+ "<h4>ID e Valor da sessão:</h4>";
			
			if(sessao!=null && !request.getParameter("sessao").equals("invalida")) { 
				 html += sessao.getId( );
				 html += "<br>";
				 html += sessao.getAttribute("nome");
			}
			
			html += "</strong><br />"
					+ "<a href=\"criando-uma-sessao\">Clique aqui</a> para navegar ou criar nova sessão"
					+ "</body></html>";
		    PrintWriter writer = response.getWriter( );
		    writer.print(html);  
		    writer.close( );
	}  	  	  	  	  

	public void init( ) throws ServletException {
		super.init( );
	}   

}