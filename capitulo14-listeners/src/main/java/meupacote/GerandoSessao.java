package meupacote;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/criando-uma-sessao")
public class GerandoSessao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		
			HttpSession sessao = request.getSession(true);
			sessao.setAttribute("nome", "Edson");
			sessao.setMaxInactiveInterval(3600);
		
			String html = "<html><head>"
			+ "<title>Trabalhando com Sessão</title>"
			+ "</head>"
			+ "<body>"
			+ "Sua sessão foi criada com sucesso!<br />"
			+ "O tempo máximo de inatividade é de: <strong>"
			+ sessao.getMaxInactiveInterval( ) 
			+ "</strong> segundo(s)<br />"
			
			+ "Sessão criada em: <strong>"
			+ DateTimeFormatter
				.ofPattern("dd/MM/yyyy HH:mm:ss")
				.withZone(ZoneId.systemDefault())
				.format(
					Instant.ofEpochMilli(sessao.getCreationTime( ))
				)
			+ "</strong><br />"
			+ "Último acesso em: <strong>"
			+ DateTimeFormatter
				.ofPattern("dd/MM/yyyy HH:mm:ss")
				.withZone(ZoneId.systemDefault())
				.format(
					Instant.ofEpochMilli(sessao.getLastAccessedTime( ))
				)
			+ "</strong><br />"
			
			
			+ "Sua ID é: <strong>" 
			+ sessao.getId( ) 
			+ "</strong><br />" 
			+ "<a href=\"recuperando-uma-sessao\">Clique aqui</a>"
			+ " para ver a sessão ativa na página seguinte."	
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