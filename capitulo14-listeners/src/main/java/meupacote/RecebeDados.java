package meupacote;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/recebe-dados")
public class RecebeDados extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		request.setAttribute("nome", "Edson");
		request.setAttribute("nome", "Luanna");
		request.removeAttribute("nome");

		response
			.getWriter()
			.append(
				"<html><body><h2>Atributo criado, modificado e removido</h2></body></html>"
			);
	}
}