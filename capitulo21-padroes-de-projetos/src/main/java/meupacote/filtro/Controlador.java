package meupacote.filtro;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter( filterName = "/Controlador",
            urlPatterns = { "/*" }
)
public class Controlador implements Filter {

	public void destroy() {}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
	throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;

		String uri = req.getRequestURI();
        
		int lastIndex = uri.lastIndexOf("/");
		String action = uri.substring(lastIndex + 1);

		if (action.equals("Pagina1"))
			request.getRequestDispatcher("pagina1.jsp").forward(request, response);
        	
		else if (action.equals("Pagina2")) 
			request.getRequestDispatcher("pagina2.jsp").forward(request, response);
        	
		else
			chain.doFilter(request, response);
    }

	public void init(FilterConfig fConfig) throws ServletException {}

}