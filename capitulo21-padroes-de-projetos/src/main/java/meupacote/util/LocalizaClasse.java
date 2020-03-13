package meupacote.util;

import java.io.File;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import meupacote.annotation.Controle;

public class LocalizaClasse {
	
	public static Map<String,String> pesquisarClassesAtravesDoPacote(String pacote) throws Exception { 

		Enumeration<URL> en = LocalizaClasse.class.getClassLoader().getResources(pacote.replace(".", "/")); 

		Map<String,String> classesEncontradas = new HashMap<String,String>();
		
	

		while (en.hasMoreElements()) {
			URL url = en.nextElement();
			File arquivo = new File(url.toURI());
			classesEncontradas = pesquisarClasse(classesEncontradas, pacote, arquivo); 	
		}
		
		return classesEncontradas;
	}

	
	public static Map<String,String> pesquisarClasse(Map<String,String>  classesEncontradas, String pacote, File diretorio) 
	throws ClassNotFoundException {

		
		for (File f : diretorio.listFiles()) { 
			
			if (f.isFile()) { 
				String pacoteClasse = 
					String.format("%s.%s", pacote, f.getName().substring(0, f.getName().lastIndexOf(".")));
				
				
				Class<?> classe = Class.forName(pacoteClasse);
				
				if(classe.isAnnotationPresent(Controle.class)) {

					
					Controle classeComAnotacaoControle = classe.getAnnotation(Controle.class);
					
					classesEncontradas.put(classeComAnotacaoControle.value(), pacoteClasse);
					
					
				}				
				
			}
			
			if (f.isDirectory()) { 
				String outroPacote = String.format( "%s.%s", pacote , f.getName() );
				
				pesquisarClasse(classesEncontradas, outroPacote, f);
			}
		}
		
		return classesEncontradas;
	}
}