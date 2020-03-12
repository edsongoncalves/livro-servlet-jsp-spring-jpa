package meupacote.listeners;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;


@WebListener
public class IniciaComAplicacao implements ServletContextListener {
	
	@Override
	public void contextInitialized(ServletContextEvent event) {
		ServletContext context = event.getServletContext();
		System.out.println("Aplicativo iniciando: " + context.getContextPath());

	}
	
	
	@Override
	public void contextDestroyed(ServletContextEvent event) {
		ServletContext context = event.getServletContext();
		System.out.println("Aplicativo parando: " + context.getContextPath());

		
	}

}