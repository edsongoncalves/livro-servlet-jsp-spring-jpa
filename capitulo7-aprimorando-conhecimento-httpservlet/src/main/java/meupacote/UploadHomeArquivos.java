package meupacote;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/upload-home-arquivos")
@MultipartConfig(
	fileSizeThreshold = 1024*1024*5, //5MB 
	maxFileSize = 1024*1024*20, //20MB 
	maxRequestSize = 1024*1024*30 //30MB
)
public class UploadHomeArquivos extends HttpServlet {
	private static final long serialVersionUID = 1L;        
        
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {

		Part part = request.getPart("upload");      
		String caminhoDoUsuario = System.getProperty("user.home"); 
		String caminhoDoArquivo = caminhoDoUsuario + File.separator + "arquivos";     
		String nomeOriginalDoArquivo = part.getSubmittedFileName();
		part.write(caminhoDoArquivo + File.separator + nomeOriginalDoArquivo);
  
		String html = "<html><head>"
			+ "<title>Arquivo enviado</title>"
			+ "</head>"
			+ "<body>"
			+ "Arquivo <strong>"
			+ nomeOriginalDoArquivo
			+ "</strong> recebido com sucesso!"
			+ "</body></html>";
        
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = response.getWriter( );
		writer.print(html);  
		writer.close( );
	}
}