package meupacote;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "controlador", urlPatterns = {"/Pagina1", "/Pagina2" })
public class Controlador extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {


		String uri = request.getRequestURI();
		int lastIndex = uri.lastIndexOf("/");
		String pagina = uri.substring(lastIndex + 1);
		
		//Neste ponto o nome da classe se junta ao pacote, para obter o caminho completo
		String caminhoDaClasse = String.format("meupacote.%s", pagina);
		
		try {
			View view = (View) Class.forName(caminhoDaClasse).getDeclaredConstructor().newInstance();
			view.processa(request, response);
		} catch (Exception e) {

			e.printStackTrace();
		}

		
	}
    		

}