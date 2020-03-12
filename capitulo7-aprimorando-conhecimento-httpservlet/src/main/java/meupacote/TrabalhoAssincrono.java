package meupacote;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/servlet-com-async", asyncSupported = true)
public class TrabalhoAssincrono extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
	
		String tempo = request.getParameter("tempo");
		
		request.setAttribute("threadPrincipal", Thread.currentThread().getName());
		
		if(tempo == null){
			String html = "<html><head>"
					+ "<title>Processando</title>"
					+ "</head>"
					+ "<body>"
					+ "<a href=\"servlet-com-async?tempo=3000\">"
					+ "Clique aqui para iniciar o processamento"
					+ "</a></body></html>";	
				
				    response.setContentType("text/html");
				    PrintWriter writer = response.getWriter( );
				    writer.print(html);  
				    writer.close( );		
		}else{
			int segundos = Integer.valueOf(tempo);
			final AsyncContext asyncContext = request.startAsync();
			asyncContext.setTimeout(5000);
			asyncContext.start(new Runnable() {
				@Override
				public void run() {
					try {
						Thread.sleep(segundos);
					} catch (InterruptedException e) {
					}
					request.setAttribute("threadEmOperacao", Thread.currentThread().getName());
					asyncContext.dispatch("/verificar-threads.jsp");
				}
			});		
			
		}
	}
	
}
