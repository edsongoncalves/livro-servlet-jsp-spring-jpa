package meupacote;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet-sem-async")
public class TrabalhoSincrono extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {

		String tempo = request.getParameter("tempo");           
                
		if(tempo == null){
			String html = "<html><head>"
				+ "<title>Processando</title>"
				+ "</head>"
				+ "<body>"
				+ "<a href=\"servlet-sem-async?tempo=3000\">"
				+ "Clique aqui para iniciar o processamento"
				+ "</a>"
				+ "</body></html>";                         
			response.setContentType("text/html");
			PrintWriter writer = response.getWriter( );
			writer.print(html);  
			writer.close( );
		}else{
			int segundos = Integer.valueOf(tempo);                     
			request.setAttribute("threadPrincipal", Thread.currentThread().getName()); 
			processando(segundos);
			request.setAttribute("threadEmOperacao", Thread.currentThread().getName()); 
			request.getRequestDispatcher("/verificar-threads.jsp").forward(request, response); 
		}

	}
	private void processando(int segundos) {
		try {
			Thread.sleep(segundos);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}