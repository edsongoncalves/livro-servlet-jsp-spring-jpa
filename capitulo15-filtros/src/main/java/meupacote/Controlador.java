package meupacote;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "controlador", urlPatterns = {"*.html" })
public class Controlador extends HttpServlet{
	private static final long serialVersionUID = 1L;
        
	protected void processaPedido(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
                
		String uri = request.getRequestURI();
		int lastIndex = uri.lastIndexOf("/");
		String action = uri.substring(lastIndex + 1);

		if(action.equals("index.html")) { 
                        
			System.out.println("Chamou o controle Servlet");
                
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	
	}
                
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		processaPedido(request, response);              
	}

}