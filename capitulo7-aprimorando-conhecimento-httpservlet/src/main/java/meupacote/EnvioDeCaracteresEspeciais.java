package meupacote;

import java.io.*;
import java.net.URLEncoder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/submetendo-caracteres-especiais")
public class EnvioDeCaracteresEspeciais extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
		protected void service(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
			
			//codifica os caracteres especiais para a transmissão via URL
			String queryString = URLEncoder.encode("Cidadão&João","UTF-8"); 
			String html = "<html><head>"
			+ "<title>Enviando Caracteres especiais</title>"
			+ "</head>"
			+ "<body>" 
			+ "<a href=\"recebe-caracteres-especiais?dados="+queryString+"\">" 
			+ "Clique aqui para enviar"
			+ "</a>"
			+ "</body></html>";
		
		    response.setContentType("text/html");
		    PrintWriter writer = response.getWriter( );
		    writer.print(html);  
		    writer.close( );	
	}
}