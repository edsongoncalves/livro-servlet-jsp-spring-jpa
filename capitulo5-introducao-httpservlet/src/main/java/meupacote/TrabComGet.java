package meupacote;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/recebe-dados-get")
public class TrabComGet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {

		String nome = request.getParameter("nome"); 
		String empresa = request.getParameter("empresa");
		//recupera a query string inteira
		String stringConsulta = request.getQueryString( );
		String html = "<html><head>"+
			"<title>Trabalhando com GET em Servlet</title>"+
			"</head>"+
			"<body>"+
			"Nome: <strong>"+nome+"</strong><br />"+
			"Empresa: <strong>"+empresa+"</strong><br />" +
			"A query string enviada é: <strong>"+ 
			stringConsulta+"</strong>" +
			"</body></html>";
		
	    response.setContentType("text/html");
	    PrintWriter writer = response.getWriter( );
	    writer.print(html);  
	    writer.close( );		

	}

}