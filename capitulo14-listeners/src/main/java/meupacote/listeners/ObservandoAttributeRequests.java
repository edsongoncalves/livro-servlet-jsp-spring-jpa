package meupacote.listeners;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;

@WebListener
public class ObservandoAttributeRequests implements ServletRequestAttributeListener {
        
	public void attributeAdded(ServletRequestAttributeEvent event)  { 
		System.out.printf("Observando a Adição do Atributo %s  de Valor %s %n", 
			event.getName(), event.getValue());
	}

	public void attributeReplaced(ServletRequestAttributeEvent event)  {
		System.out.printf("Observando a Alteração do Atributo %s  de Valor %s %n", 
			event.getName(), event.getValue());
	}       
        
	public void attributeRemoved(ServletRequestAttributeEvent event)  {
		System.out.printf("Observando a Remoção do Atributo %s  de Valor %s %n", 
			event.getName(), event.getValue());
	}      
}