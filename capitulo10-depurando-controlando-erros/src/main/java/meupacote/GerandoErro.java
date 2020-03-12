package meupacote;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gerando-erro")
public class GerandoErro extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	public void init( ) throws ServletException {
		super.init( );
	} 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		int val1 = Integer.parseInt(request.getParameter("val1"));
		int val2 = Integer.parseInt(request.getParameter("val2")); 
		float resultado=val1/val2;
		String html = "<html><head>"
			+ "<title>Tratando Erros</title>"
			+ "</head>"
			+ "<body>"
			+ "O resultado é: <strong>"+resultado+"</strong><br>" 
			+ "A query string enviada é: <strong>" 
			+ request.getQueryString( ) 
			+ "</strong><br>" 
			+ "<form action=\"gerando-erro\" method=\"get\">"
			+ "Valor 1: <input type=\"text\" name=\"val1\"><br>" 
			+ "Valor 2: <input type=\"text\" name=\"val2\"><br>" 
			+ "<input type=\"submit\" value=\"Enviar\">" 
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