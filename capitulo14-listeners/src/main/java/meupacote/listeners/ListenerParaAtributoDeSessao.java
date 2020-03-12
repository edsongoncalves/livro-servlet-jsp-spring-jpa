package meupacote.listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.*;

@WebListener
public class ListenerParaAtributoDeSessao implements HttpSessionAttributeListener {

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
       System.out.println("O setAttribute adicionado é: "+event.getName());
    }
 
    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
           System.out.println("O setAttribute removido é:  "+event.getName());
    }
 
    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
       System.out.println("O setAttribute trocado é:  "+event.getName());
    }

}