package meupacote;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/recebe-dados-post")
public class TrabComPost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
                throws ServletException, IOException {

		//captura os dados submetidos dos campos usuario e senha
		String usuario = request.getParameter("usuario"); 
		String senha = request.getParameter("senha"); 
		//string contendo tags HTML
		String html = "<html><head>"+
                        "<title>Trabalhando com Método Post em Servlet</title>"+
                        "</head>"+
                        "<body>";       
		if(usuario.equals("edson") && senha.equals("123")) 
			html += "Seja bem vindo Edson"; 

		else
			html += "Usuário ou senha inválidos"; 
                
		html += "</body></html>";
                
           //responde ao navegador que se trata
           //de uma página HTML
           response.setContentType("text/html");  
           
            //imprime as informações contidas na String
            PrintWriter writer = response.getWriter( );   
            writer.print(html); 
            writer.close( );
	}

}