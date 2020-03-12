package meupacote;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/visualizar-imagens")
public class VisualizarImagens extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private String caminhoDoArquivo = System.getProperty("user.home")
			+ File.separator 
			+ "arquivos" 
			+ File.separator
			+ "imagens"
			+ File.separator;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		var imagens = list();
        
		response.setContentType("text/html; charset=UTF-8");
		String html = "<html><head>"
				+ "<Title>Imagens do diretório</title>"
				+ "</head>"
				+ "<body>";

		for(String imagem: imagens) {
			
			var img = encodeImage(imgToByte(imagem));
			html += "<img src=\"data:image/png;base64,"+img+"\" width=\"200\" height=\"200\">"
					+ "<br>";
		}
            
		html +=  "</body></html>";    
		response.getWriter().append(html);  
	}
    
	public static String encodeImage(byte[] imageByteArray) {
		return Base64.getEncoder().encodeToString(imageByteArray);
	}
    
	public byte[] imgToByte(String nome) throws IOException {
		return Files.readAllBytes(Paths.get(caminhoDoArquivo + nome));
	}
    
	private List<String> list() throws IOException{
        
	return  Files.walk(Paths.get(caminhoDoArquivo)) 
		.filter(Files::isRegularFile) //somente arquivos
		.map(f -> f.getFileName().toString()) //apenas o nome do arquivo
		.filter(f -> f.endsWith(".jpg") || f.endsWith("png")) //apenas imagens jpg ou png
		.collect(Collectors.toList()); 
    }
}