package meupacote;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/despachando-conteudo-jsp")
public class DespachandoConteudo extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	public void destroy( ) {
		super.destroy( );
	}               

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		
		request.setAttribute("conteudo", "Este conteúdo veio do Servlet");
		
		request.getRequestDispatcher("recebendo-do-servlet.jsp").forward(request, response);        
	}                 

	public void init( ) throws ServletException {
		super.init( );
	}   
}