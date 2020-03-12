package meupacote;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/usando-get-parameter-values")
public class GetParameterValues extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void destroy( ) {
		super.destroy( );
	}   	 	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException 
	{
		String[] musicas = request.getParameterValues("musica"); 
		String html = "<html><head>"
			+ "<title>Trabalhando com Outros métodos em Servlet</title>"
			+ "</head>"
			+ "<body>" 
			+ "<h2>Músicas escolhidas:</h2>";
		if(musicas!=null) {
			for(String musica: musicas) { 
				html+= "<strong>"+musica+"</strong><br>";		
			}
		}else {
			html+= "<strong>Selecione uma música</strong><br>";	
		}
		html+="</body></html>";
		
	    response.setContentType("text/html");
	    PrintWriter writer = response.getWriter( );
	    writer.print(html);  
	    writer.close( );	
		
	}   	  	  	

	public void init( ) throws ServletException {
		super.init( );
	}   
}