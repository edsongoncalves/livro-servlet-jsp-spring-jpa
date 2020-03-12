package meupacote;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/segundo-servlet") 
public class ServletDois extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		System.out.println("Entrando no Segundo Servlet via método GET");  
		response.getWriter().write("Segundo Servlet");  
		System.out.println("Saindo do Segundo Servlet"); 
	}
}