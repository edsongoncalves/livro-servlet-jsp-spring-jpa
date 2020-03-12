package meupacote;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Pagina2 implements View{

	@Override
	public void processa(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.getRequestDispatcher("pagina2.jsp").forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		} 
		
	}

}
