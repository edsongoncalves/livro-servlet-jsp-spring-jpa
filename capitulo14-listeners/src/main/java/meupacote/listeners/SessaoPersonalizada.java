package meupacote.listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

@WebListener
public class SessaoPersonalizada implements HttpSessionBindingListener {

	  @Override
	  public void valueBound(HttpSessionBindingEvent event) {
	      System.out.printf("Sessão Criada: ID: %s -  Nome:%s - Valor: %s%n",
	    		  event.getSession().getId(),  event.getName(), event.getValue());
	  }

	  @Override
	  public void valueUnbound(HttpSessionBindingEvent event) {
	      System.out.printf("Sessão Removida: ID: %s -  Nome:%s - Valor: %s%n",
	    		  event.getSession().getId(),  event.getName(), event.getValue());
	  }

}
