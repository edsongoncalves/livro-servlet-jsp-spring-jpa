package meupacote;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/captura-erros")
public class CapturaDeErros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
	throws ServletException, IOException {

		Exception excecao = (Exception)req.getAttribute("javax.servlet.error.exception");
		Integer status = (Integer)req.getAttribute("javax.servlet.error.status_code");
		String servlet = (String)req.getAttribute("javax.servlet.error.servlet_name");
		String requestUri = (String)req.getAttribute("javax.servlet.error.request_uri");

		PrintWriter writer = resp.getWriter();
		String html = "<html><head><title>Captura Erro</title></head><body>"
			+ "<h3>Erro Encontrado no Aplicativo</h3>"
			+ "Por favor, veja o erro apresentado abaixo e contate o administrador<br>";

		if (status != 500){     
                html += "<strong>Código do Erro: </strong>" + status + "<br>"
				+ "<strong>URI requisitada: </strong>" + requestUri;
		} else {
                html += "<ul><li>Servlet: " + servlet + "</li>"
				+ "<li>Exceção: " + excecao.getClass().getName() + "</li>"
				+ "<li>URI requisitada: " + requestUri + "</li>"
				+ "<li>Exceção encontrada: " + excecao.getMessage() + "</li>"
				+ "</ul>";
		}
		html += "</body></html>";
		resp.setContentType("text/html");
		writer.write(html);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
	throws ServletException, IOException {
		doGet(req, resp);
	}
}