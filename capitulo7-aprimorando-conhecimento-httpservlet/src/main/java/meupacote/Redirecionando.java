package meupacote;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/redirecionando-com-servlet")
public class Redirecionando extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	public void destroy( ) {
		super.destroy( );
	}   	 	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");	
		if(usuario.equals("edson") && senha.equals("123")){
			response.sendRedirect("usuario-valido.html"); 
		}
		else{
			response.sendRedirect("usuario-invalido.html"); 
		}
	}   	  	  

	public void init( ) throws ServletException {
		super.init( );
	}   


}