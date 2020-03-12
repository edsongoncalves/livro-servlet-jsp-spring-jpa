package meupacote;

import java.io.IOException;
import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
 
@ServerEndpoint("/ola-websocket") 
public class OlaWebSocket {

	@OnOpen 
	public void onOpen(Session sessao) throws IOException{
		System.out.printf("Conexão Aberta pelo ID: %s%n", sessao.getId());
		sessao.getBasicRemote().sendText("Conectado!"); 
	}
   
	@OnMessage 
	public void onMessage(String mensagem, Session sessao) throws IOException{
		System.out.printf("Mensagem enviada de %s: %s%n", sessao.getId(), mensagem);
		sessao.getBasicRemote().sendText(mensagem); 
	}	
 
	@OnClose 
	public void onClose(Session sessao){
		System.out.printf("Sessão Fechada pelo ID: %s%n",sessao.getId());
	}
	
	@OnError
	public void onError(Session sessao, Throwable t) throws IOException{
		System.out.printf("Erro ocorrido no ID %s da sessão: %s%n", sessao.getId(), t);
		sessao.getBasicRemote().sendText("Ocorreu um erro, analise os logs"); 
	}
}