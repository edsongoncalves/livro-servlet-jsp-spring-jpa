package meupacote;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/visualiza-cookie")
 public class VisualizaCookie extends javax.servlet.http.HttpServlet {

	private static final long serialVersionUID = 1L;

	public void destroy( ) {
		super.destroy( );
	}   	

	protected void doGet(HttpServletRequest request, 
		HttpServletResponse response) 
	throws ServletException, IOException {

		Cookie[] cookies = request.getCookies( );  
	
		Optional<Cookie> cookie = null;

//		Cookie cookie = null; //outra forma de obter o cookie
		


		if (cookies != null) {
			
			cookie = Arrays
			.stream(cookies)
			 .filter( c -> c.getName( ).equals("nome"))
			 .findAny();

			
//			for(Cookie c: cookies){  //outra forma de obter o cookie
//				if (c.getName( ).equals("nome")) { 
//						cookie = c;
//		      		break;
//				}
//		  	}

		}

			
		String html = "<html><head>"+
			"<title>Visualizando um Cookie</title>"
			+ "</head>"
			+ "<body>"
			+ "O Cookie " 
			+ cookie.get().getName() // cookie.getName() //outra forma de obter o cookie
			+ " tem o valor <strong>" 
			+ cookie.get().getValue() // cookie.getValue() //outra forma de obter o cookie
			+ "</strong>"
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
