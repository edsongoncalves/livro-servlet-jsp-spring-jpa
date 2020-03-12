package meupacote;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "controlador", urlPatterns = {"/Pagina1", "/Pagina2" })
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		
		String uri = request.getRequestURI(); 
		int lastIndex = uri.lastIndexOf("/");
		String pagina = uri.substring(lastIndex + 1);
		
		
		if (pagina.equals("Pagina1"))
			request.getRequestDispatcher("pagina1.jsp").forward(request, response);
		else 
			request.getRequestDispatcher("pagina2.jsp").forward(request, response);
		
		
	}

}