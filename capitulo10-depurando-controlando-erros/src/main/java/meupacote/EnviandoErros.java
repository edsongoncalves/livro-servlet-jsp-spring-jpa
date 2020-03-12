package meupacote;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/enviando-erros")
public class EnviandoErros extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void destroy( ) {
		super.destroy( );
	}   	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		response.sendError(HttpServletResponse.SC_FORBIDDEN,"Você não tem permissão");
	}  	  	  	  

	public void init( ) throws ServletException {
		super.init( );
	}   

}