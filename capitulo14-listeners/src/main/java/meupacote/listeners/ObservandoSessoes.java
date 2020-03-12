package meupacote.listeners;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;
import javax.servlet.http.HttpSessionListener;

@WebListener 
public class ObservandoSessoes implements HttpSessionListener, HttpSessionIdListener {

    private String date() {
        return DateTimeFormatter
    			.ofPattern("dd/MM/yy - HH:mm:ss")
    			.withZone(ZoneId.systemDefault())
    			.format(
    				LocalDateTime.now()
    			);
    }
        
    public void sessionCreated(HttpSessionEvent event)  { 
        System.out.println(this.date() + ": Sessão " + event.getSession().getId() + " criada");
    }

    public void sessionDestroyed(HttpSessionEvent event)  { 
        System.out.println(this.date() + ": Sessão " + event.getSession().getId() + " destruída.");
    }
    
    public void sessionIdChanged(HttpSessionEvent event, String string)  { 
        System.out.println(this.date() + ": ID " + string + " alterada para " + event.getSession().getId());
    }
}