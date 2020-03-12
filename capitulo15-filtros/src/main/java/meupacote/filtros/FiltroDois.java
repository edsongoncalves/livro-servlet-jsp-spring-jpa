package meupacote.filtros;

import java.io.IOException;
import javax.servlet.*;

public class FiltroDois implements Filter {

	public void destroy() {}

	public void doFilter(ServletRequest request, 
			ServletResponse response, 
			FilterChain chain) 
		throws IOException, ServletException {                 
			System.out.println("Entrando no Segundo Filtro");
			chain.doFilter(request, response);
			System.out.println("Saindo do Segundo Filtro");
	}

	public void init(FilterConfig fConfig) throws ServletException {}
}