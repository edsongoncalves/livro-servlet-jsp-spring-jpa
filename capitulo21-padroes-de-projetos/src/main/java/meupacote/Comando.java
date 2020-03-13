package meupacote;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class Comando{
	
    protected HttpServletRequest request;
    protected HttpServletResponse response;
	
    public void inicia( HttpServletRequest request, HttpServletResponse response) {
    	this.request = request;
    	this.response = response;
    }
	
    public abstract void processa() throws Exception;

    protected void despachar(String pagina) throws Exception {
    	pagina = String.format("%s.jsp", pagina);
    	request.getRequestDispatcher(pagina).forward(request, response); 
    }


}