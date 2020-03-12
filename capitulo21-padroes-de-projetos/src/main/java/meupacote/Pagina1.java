package meupacote;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Pagina1 implements View {

	@Override
	public void processa(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.getRequestDispatcher("pagina1.jsp").forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		} 
		
	}

}
