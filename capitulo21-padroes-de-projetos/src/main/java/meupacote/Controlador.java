package meupacote;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		String p = request.getParameter("param");

		if(p.equals("Pagina1"))
			request.getRequestDispatcher("pagina1.jsp").forward(request, response);
        else 
            request.getRequestDispatcher("pagina2.jsp").forward(request, response);
        	
    	}

}