package meupacote;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/obtendo-todos-objetos-do-formulario")
public class VarrendoTodosObjetos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void destroy( ) {
		super.destroy( );
	}   	 	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException 
	{
		Enumeration<String> objetos = request.getParameterNames( ); 
		
		String[] html = { 
			"<html><head>"
			+ "<title>Trabalhando com getParameterNames( )</title>"
			+ "</head>"
			+ "<body>" 
			+ "<h2>Dados Cadastrados:</h2>"
		};
		
		objetos.asIterator().forEachRemaining(objeto->{
			html[0] += "<strong>"+objeto+":</strong> "
			+ request.getParameter(objeto)+"<br>"; 
		});

		
//		while(e.hasMoreElements( )){ 
//				String param = (String) objetos.nextElement( ); 
//				html+= "<strong>"+param+":</strong>"+ 
//				request.getParameter(param)+"<br />"; 
//		}
		html[0] +="</body></html>";		
	    response.setContentType("text/html;charset=utf-8");
	    PrintWriter writer = response.getWriter( );
	    writer.print(html[0]);  
	    writer.close( );			
	}   	  	  

	public void init( ) throws ServletException {
		super.init( );
	}   

}