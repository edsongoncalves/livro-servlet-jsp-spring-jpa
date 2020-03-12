package meupacote;

import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet({ "/recebe-dados-post-get" })
public class TrabComPostGet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {

		//responde ao navegador que se trata
		//de uma página HTML
		response.setContentType("text/html"); 
		//imprime as informações contidas na String
		PrintWriter writer = response.getWriter( ); 
        
		//captura os dados submetidos, não importa qual o parâmetro
		Map<String, String[]> dados = request.getParameterMap();

		//string contendo tags HTML             
		String[] html = { 
			"<html><head>"
			+ "<title>Trabalhando com Método Post e Get em Servlet</title>"
			+ "</head>"
			+ "<body>"
		};      
                
		//Varre todos os dados recebidos
		dados.forEach(
			(key,values) -> {               
				String[] valoresRecebidos = dados.get(key);
				String valor = valoresRecebidos[0];
				html[0] += "<p> Variável: "+ key +" - Valor: " + valor + "</p>";    
			}
		);

		html[0] += "</body></html>";             
		writer.print(html[0]);  
		writer.close( );
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		//chama o método doPost
		doPost(request, response); 
	}

}