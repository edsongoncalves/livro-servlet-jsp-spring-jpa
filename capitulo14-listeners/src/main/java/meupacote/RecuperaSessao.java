package meupacote;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/recuperando-uma-sessao")
public class RecuperaSessao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void destroy( ) {
		super.destroy( );
	}   	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		
		HttpSession sessao = request.getSession(true);
		String nome = (String)sessao.getAttribute("nome");
	
		String html = "<html><head>"+
		"<title>Trabalhando com Sessão</title>" +
		"</head>"+
		"<body>";
		
		if(nome!=null){ 
			html += "Sua ID é:<strong>" 
				+ sessao.getId( )
				+ "</strong><br />"
				+ "E seu nome é: <strong>"+nome+"</strong>"
				+ "<br />"
				+ "<a href=\"operando-sessao?sessao=remove\">Clique aqui</a>"
				+ " para remover o atributo da sessão em andamento"
				+ "<br />"
				+ "<a href=\"operando-sessao?sessao=invalida\">Clique aqui</a>"
				+ " para invalidar a sessão em andamento"
				+ "<br />"
				+ "<a href=\"operando-sessao?sessao=troca\">Clique aqui</a>"
				+ " para trocar a sessão em andamento";
		}
		else{
			html += "Sua sessão não foi criada. <br />"
				+ "<a href=\"criando-uma-sessao\">Clique aqui</a>"
				+ " para criar a sua sessão.";
				
		}
		html += "</body></html>";
		
	    response.setContentType("text/html");
	    PrintWriter writer = response.getWriter( );
	    writer.print(html);  
	    writer.close( );			
		
	}  	  	  	  

	public void init( ) throws ServletException {
		super.init( );
	}   

}