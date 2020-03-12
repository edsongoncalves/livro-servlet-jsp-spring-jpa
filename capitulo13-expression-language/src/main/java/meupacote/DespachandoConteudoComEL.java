package meupacote;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/despachando-conteudo-jsp-el")
public class DespachandoConteudoComEL extends HttpServlet {
        private static final long serialVersionUID = 1L;
        
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		
		var dados = Arrays.asList("Brasil", "Argentina", "Paraguai", "Uruguai", "Chile");
		
		request.setAttribute("dados", dados);
		
		request.getRequestDispatcher("recebendo-com-el.jsp").forward(request, response);        
	}                 
}