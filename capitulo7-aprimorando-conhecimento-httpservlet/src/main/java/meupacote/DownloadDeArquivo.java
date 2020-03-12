package meupacote;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/download")
public class DownloadDeArquivo extends HttpServlet {

	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
     
		response.setContentType("image/jpg");
		response.setHeader("Content-disposition", "attachment; filename=foto.jpg");
        
		try(InputStream inputStream = 
			request.getServletContext().getResourceAsStream("/WEB-INF/foto.jpg");
			OutputStream outputStream = response.getOutputStream()) {
				int nRead;
				byte[] data = new byte[1024];
				while ((nRead = inputStream.read(data)) > 0) {
					System.out.println("Enviando arquivo para download");
					outputStream.write(data, 0, nRead);
				}
		}
	}
}