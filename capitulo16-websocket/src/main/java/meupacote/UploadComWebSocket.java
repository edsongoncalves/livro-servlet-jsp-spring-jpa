package meupacote;

import java.io.*;
import java.nio.ByteBuffer;
import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/upload/arquivo")
public class UploadComWebSocket {

	static File uploadDoArquivo = null;
	static String nomeDoArquivo = null;
	static FileOutputStream fileOutputStream = null;
	final static String caminho=System.getProperty("user.home") + File.separator + "arquivos"+ File.separator;

	@OnOpen
	public void onOpen(Session sessao, EndpointConfig endpConf) {
		System.out.println("conexão iniciada");
	}

	@OnMessage(maxMessageSize=10000000)
	public void onMessage(final ByteBuffer byteBuffer, final Session sessao) throws IOException {
		System.out.println("Arquivo binário"); 
                         
		while(byteBuffer.hasRemaining()) {
			fileOutputStream.write(byteBuffer.get());
		}               
	}

	@OnMessage
	public void onMessage(Session sessao, String mensagem) {
                
		if(!mensagem.equals("enviado")) {
			nomeDoArquivo=mensagem.substring(mensagem.indexOf(':')+1);  
                        
			System.out.printf("Nome do arquivo enviado: %s%n", nomeDoArquivo);
                        
			File uploadDoArquivo= new File(caminho+nomeDoArquivo); 
			try {
				fileOutputStream = new FileOutputStream(uploadDoArquivo);
			} catch (FileNotFoundException e) {     
				e.printStackTrace();
			}
		}else {
			try {
				fileOutputStream.flush(); 
				fileOutputStream.close(); 
				System.out.println("Envio Finalizado");
			} catch (IOException e) {       
				e.printStackTrace();
			}
		}
	}

	@OnClose
	public void onClose(Session sessao, CloseReason creason) {
		System.out.printf("Conexão Encerrada: %s%n", creason.getCloseCode());
	}

	@OnError
	public void onError(Session sessao, Throwable t) {
		t.printStackTrace();
	}
}