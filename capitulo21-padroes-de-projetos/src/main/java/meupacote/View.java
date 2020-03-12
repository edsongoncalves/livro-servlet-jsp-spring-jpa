package meupacote;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface View {
	
	void processa(HttpServletRequest request, HttpServletResponse response);


}
