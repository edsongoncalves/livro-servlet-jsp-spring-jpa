package meupacote;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/remover-atributo-sessao")
public class RemoverAtributoSessao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void destroy( ) {
		super.destroy( );
	}   	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
			
		HttpSession sessao = request.getSession(true);
        
		sessao.removeAttribute("nome"); 
		String nome = (String) sessao.getAttribute("nome"); 
		String html = "<html><head>"
			+ "<title>Terminando uma Sessão</title>"
			+ "</head>"
			+ "<body>"
			+ "<h4>Observe que o valor deixa de existir, mas o ID não</h4>"
			+ "Sua ID é:<strong>" 
			+ sessao.getId( ) 
			+ "</strong><br>"
			+ "E seu nome é: <strong>"+nome+"</strong><br>"
			+ "<a href=\"criando-uma-sessao\">Clique aqui</a>"
			+ " para iniciar uma nova sessão"
			+ "</body></html>";
                
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter( );
		writer.print(html);  
		writer.close( );
	}  	  	  	  	  

	public void init( ) throws ServletException {
		super.init( );
	}   

}