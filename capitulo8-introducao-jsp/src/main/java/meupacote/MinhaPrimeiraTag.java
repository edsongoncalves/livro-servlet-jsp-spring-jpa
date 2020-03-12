package meupacote;

import java.io.IOException;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.TagSupport;

public class MinhaPrimeiraTag extends TagSupport { 

	private static final long serialVersionUID = 1L;

		public int doStartTag( ) throws JspException { 
	        try {
	            pageContext.getOut( ).print("Desenvolvendo com taglib"); 
	       
		 } catch (IOException ioe) { 
	            throw new JspTagException("Erro: IOException"); 
	        }
	        return SKIP_BODY; 
	    }

}