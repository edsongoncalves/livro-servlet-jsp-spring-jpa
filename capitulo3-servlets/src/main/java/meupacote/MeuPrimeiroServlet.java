package meupacote;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;

@WebServlet("/MeuPrimeiroServlet")
public class MeuPrimeiroServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void init( ) throws ServletException {
        super.init( );
    }  

    protected void service(HttpServletRequest request,
            HttpServletResponse response) 
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8"); 
        String html = "<html>" +
                "<head><title>Trabalhando com Servlets</title></head>" +
                "</head>" +
                "<body>" +
                "<h1>Meu Primeiro Servlet</h1>" +
                "</body>" +
                "</html>";
        PrintWriter out = response.getWriter( );
        out.print(html);
        out.close( );
    }

    public void destroy( ) {
        super.destroy( );
    }   
}