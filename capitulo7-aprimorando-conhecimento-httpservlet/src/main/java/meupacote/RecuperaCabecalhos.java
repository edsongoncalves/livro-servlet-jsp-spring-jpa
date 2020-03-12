package meupacote;

import java.io.*;
import java.util.Collections;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/recupera-cabecalhos")
public class RecuperaCabecalhos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void destroy( ) {
		super.destroy( );
	}                                 
	public void init( ) throws ServletException {
		super.init( );
	}   
	protected void service(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException 
	{       
		response.setContentType("text/html;charset=UTF-8");
		String[] html = {
			"<html>"
			+ "<head><title>Recuperando Cabeçalhos</title></head>"
			+ "<body>"
		};
                
		Collections.list(request.getHeaderNames()) 
		.forEach(headerName ->
			Collections.list(request.getHeaders(headerName)) 
			.forEach(headerValue -> {
				html[0] += "<strong>"+ headerName +": </strong>" + headerValue + "<br>";              
			})
		);
                
                
		html[0]+= "</body></html>";
		PrintWriter out = response.getWriter( );
		out.print(html[0]);
	}
}
