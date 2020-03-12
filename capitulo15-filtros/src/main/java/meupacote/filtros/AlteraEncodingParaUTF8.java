package meupacote.filtros;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class AlteraEncodingParaUTF8 implements Filter {

	public static final String ENCODING = "UTF-8";
	private String encoding;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		encoding = filterConfig.getInitParameter("encoding");
		if(encoding == null) encoding = ENCODING;	
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
	throws IOException, ServletException {
		if(request.getCharacterEncoding() == null) {
			request.setCharacterEncoding(encoding);
		}
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		// Nada aqui
	}
}