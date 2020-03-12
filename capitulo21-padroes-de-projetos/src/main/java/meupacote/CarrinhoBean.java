package meupacote;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoBean {
	List<String> itens;
	String cmd=null;
	public CarrinhoBean( ){
		itens = new ArrayList<String>( );
	}
	public void adicionar(String produto) {  
		itens.add(produto);     
	} 
	public void remover(String produto) { 
		itens.remove(produto);  
	}  
	public void setCmd(String s){
		cmd=s;
	}
	public List<String> getProdutos( ){
		return itens;
	}
	public void processa(String produto){
		if(produto!=null && cmd!=null){
			if(cmd.equals("add"))
				adicionar(produto);
			else            
				remover(produto);
            limpar( );
        }
    }
    private void limpar( ){
        cmd = null;
    }
}