package meupacote;

import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet({ "/UploadFisicoComExibicaoImagem", "/upload-de-arquivos-imagem" })
@MultipartConfig(
		fileSizeThreshold = 1024*1024*5, //5MB 
		maxFileSize = 1024*1024*20, //20MB 
		maxRequestSize = 1024*1024*30 //30MB
	)
public class UploadFisicoComExibicaoImagem extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void upload(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException {
		
        String caminhoUsuario = System.getProperty("user.home");
        Part part = request.getPart("upload");        
        String tipoDeArquivo = part.getContentType();
        long  tamanhoDoArquivo = part.getSize();        
        String contentType = request.getContentType();
        
        response.setContentType("text/html; charset=UTF-8");
		String html = "<html><head>"+
		"<title>Arquivo enviado</title>"+
		"</head>"+
		"<body>";
        
        if ((contentType.indexOf("multipart/form-data") >= 0)) {
        	
        	var tiposPermitidos = Arrays.asList("image/jpeg","image/png"); 
        	
	       if(tiposPermitidos.contains(tipoDeArquivo)) {
	
			  String caminhoDoArquivo = caminhoUsuario + File.separator + "arquivos";
			         
			  String nomeOriginalDoArquivo = part.getSubmittedFileName();
			
			  part.write(caminhoDoArquivo + File.separator + nomeOriginalDoArquivo);
		   		
			  html += "Arquivo <strong>"
					  +nomeOriginalDoArquivo
					  + "</strong> recebido com sucesso!<br>"
					  + "O arquivo se encontra em <strong>"
					  + caminhoDoArquivo 
					  +"</strong> <br>"
					  + "O arquivo tem o tamanho <strong>"
					  + tamanhoDoArquivo 
					  +" bytes</strong> <br>"
					  + "<img src=\"arquivos/"+ nomeOriginalDoArquivo + "\">";
	       }else {
	    	   html += "Arquivo tem o tipo <strong>"+tipoDeArquivo+"</strong>.<br>"
	    		 + " Entretanto, aceitamos apenas PNG ou JPG";
	    	   
	       }
		
        }else {
        	html +=  "<h2>Seu formulário não possui enctype=\"multipart/form-data\"</h2>";
        }
        
        html +=  "</body></html>";
        
        response.getWriter().append(html);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException {
    	upload(request, response);
    }
	
    public void destroy() {
        super.destroy();
    }

}