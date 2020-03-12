package meupacote;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/criando-cookie")
public class CriandoCookie extends javax.servlet.http.HttpServlet {
 
	private static final long serialVersionUID = 1L;

	public void destroy( ) {
		super.destroy( );
	}       
        
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException 
	{
		Cookie meucookie = new Cookie("nome", "Edson");
		meucookie.setMaxAge(60*60);          
		meucookie.setSecure(false);        
		meucookie.setComment("Meu nome");
		response.addCookie(meucookie);
                
		String html = "<html><head>"+
                "<title>Criando um Cookie</title>"+
                "</head><body>"+
                "<h2>Seu cookie foi criado com sucesso!</h2>"+
                "<a href=\"visualiza-cookie\">" +
                "Clique aqui para ver o Cookie criado" +
                "</a>"+
                "</body></html>";
        
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter( );
		writer.print(html);  
		writer.close( );
	}                         
        
	public void init( ) throws ServletException {
		super.init( );
	}   
}