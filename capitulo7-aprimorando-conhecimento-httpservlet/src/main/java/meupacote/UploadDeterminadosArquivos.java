package meupacote;

import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet({ "/UploadServlet", "/upload-de-arquivos-com-validacao" })
@MultipartConfig(
                fileSizeThreshold = 1024*1024*5, //5MB 
                maxFileSize = 1024*1024*20, //20MB 
                maxRequestSize = 1024*1024*30 //30MB
)
public class UploadDeterminadosArquivos extends HttpServlet {
	private static final long serialVersionUID = 1L;
        
	private static final String ARQUIVOS = "arquivos";

	public void destroy() {
		super.destroy();
	}

	protected void upload(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
        
		String caminhoDoAplicativo = request.getServletContext().getRealPath(""); 
		Part part = request.getPart("upload");       
		long  tamanhoDoArquivo = part.getSize();
		String nomeDoArquivo = part.getSubmittedFileName();
		String contentType = request.getContentType();
        
		response.setContentType("text/html; charset=UTF-8");
			String html = "<html><head>"
				+ "<title>Arquivo enviado</title>"
				+ "</head>"
				+ "<body>";
        
		if (contentType.indexOf("multipart/form-data") >= 0) {
        
			String tipoDeArquivo = part.getContentType();

			var tiposPermitidos = Arrays.asList("image/jpeg","image/png");
                
			if(tiposPermitidos.contains(tipoDeArquivo)) {
        
				String caminhoDoArquivo = caminhoDoAplicativo + File.separator + ARQUIVOS;                    
                        
				part.write(caminhoDoArquivo + File.separator + nomeDoArquivo);
                                        
				html += "Arquivo <strong>"
					+ nomeDoArquivo
					+ "</strong> recebido com sucesso!<br>"
					+ "O arquivo se encontra em <strong>"
					+ caminhoDoArquivo 
					+ "</strong> <br>"
					+ "O arquivo tem o tamanho <strong>"
					+ tamanhoDoArquivo +" bytes</strong> <br>";
                                
               }else {
                   html += "Arquivo tem o tipo <strong>"
					+ tipoDeArquivo
					+ "</strong>. <br>"
					+ "Entretanto, aceitamos apenas PNG ou JPG";
                   
               }
                
		}else {
			html +=  "<h2>Seu formulário não possui enctype=\"multipart/form-data\" </h2>";
		}
		html +=  "</body></html>";
        
		response.getWriter().append(html);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		upload(request, response);
	}
}