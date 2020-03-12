package meupacote;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/primeiro-servlet") 
public class ServletUm extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		System.out.println("Entrando no Primeiro Servlet via método GET");  
		response.getWriter().write("Primeiro Servlet");  
		System.out.println("Saindo do Primeiro Servlet"); 
	}
}
