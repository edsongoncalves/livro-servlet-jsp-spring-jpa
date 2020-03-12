package meupacote.listeners;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import meupacote.filtros.*;

@WebListener
public class Configurador implements ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent event) {
		FilterRegistration.Dynamic primeiroFiltro = 
			event.getServletContext().addFilter("FiltroUm", new FiltroUm());
		primeiroFiltro.addMappingForUrlPatterns( null, false, "/*" );
                
		FilterRegistration.Dynamic segundoFiltro = 
			event.getServletContext().addFilter("FiltroDois", new FiltroDois());
		segundoFiltro.addMappingForUrlPatterns( null, false, "/segundo-servlet", "/terceiro-servlet" );

		FilterRegistration.Dynamic terceiroFiltro = 
			event.getServletContext().addFilter("FiltroTres", new FiltroTres());
		terceiroFiltro.addMappingForUrlPatterns( null, false, "/terceiro-servlet" );
        }
}