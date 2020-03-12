package meupacote.filtros;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns="*.html")
public class PrimeiroFiltro implements Filter {
        
	int contar = 0; 

	public void doFilter(ServletRequest request, 
		ServletResponse response, 
		FilterChain chain) 
	throws IOException, ServletException {
                
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
                
		contar++;
                
		System.out.printf("Filtro iniciado no chamado %s%n", contar); 
                
		String uri = req.getRequestURI();
		int lastIndex = uri.lastIndexOf("/");
		String action = uri.substring(lastIndex + 1);
		
		
                
		if(action.equals("index.jsp")) {
                
			resp.sendRedirect("index.html");
		}
		else {
			chain.doFilter(request, response);
		}
                
		System.out.printf("Filtro finalizado no chamado %s%n", contar);
                
	}
}