package meupacote.filtros;

import java.io.IOException;
import javax.servlet.*;

public class FiltroTres implements Filter {

	public void destroy() {}

	public void doFilter(ServletRequest request, 
			ServletResponse response, 
			FilterChain chain) 
		throws IOException, ServletException {             
			System.out.println("Entrando no Terceiro Filtro");
			chain.doFilter(request, response);
			System.out.println("Saindo do Terceiro Filtro");
		}

	public void init(FilterConfig fConfig) throws ServletException {}
}