package meupacote;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/recebe-caracteres-especiais")
public class RecebeCaracteresEspeciais extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request,  HttpServletResponse response) 
	throws ServletException, IOException {
		
		String dados = request.getParameter("dados");
		String stringConsulta = request.getQueryString( );
		String html = "<html><head>"
		+ "<title>Recebendo caracteres especiais</title>"
		+ "</head>"
		+ "<body>"
		+ "Os dados recebidos são: <strong>"+dados+"</strong><br />"
		+ "A query string recebida é: <strong>"+stringConsulta+"</strong>"
		+ "</body></html>";
	
    	response.setContentType("text/html; charset=UTF-8");
    	PrintWriter writer = response.getWriter( );
    	writer.print(html);  
    	writer.close( );		

	}

}