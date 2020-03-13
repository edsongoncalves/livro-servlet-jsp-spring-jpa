package meupacote;

import meupacote.annotation.Controle;

@Controle("pagina1")
public class Pagina1 extends Comando {

	public void processa() throws Exception {
		request.setAttribute("titulo", "Título da Página 1");
		request.setAttribute("conteudo", "Conteúdo da Página 1");
		despachar("pagina");
		
	}

}
