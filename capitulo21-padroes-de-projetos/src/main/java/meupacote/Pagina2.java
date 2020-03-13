package meupacote;

import meupacote.annotation.Controle;

@Controle("pagina2")
public class Pagina2 extends Comando {


	@Override
	public void processa() throws Exception {
		request.setAttribute("titulo", "Título da Página 2");
		request.setAttribute("conteudo", "Conteúdo da Página 2");
		despachar("pagina");
		
	}

}
