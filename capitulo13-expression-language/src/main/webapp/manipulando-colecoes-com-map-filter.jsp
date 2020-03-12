<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Trabalhando com Expression Language</title>
</head>
<body>
<h2>Manipulando Coleções em Map ou Filter</h2>
    <p>
        <strong>Multiplica todos os valores por 4:</strong>
        ${[1,2,3,4,5].stream().map(x -> 4 * x).toList()} 
    </p>
    <p>
        <strong>Coloca os valores em maiúsculas:</strong>   
        ${["Brasil", "Argentina", "Paraguai", "Uruguai", "Chile"]
        	.stream()
        	.map(x -> x.toUpperCase())
        	.toList()
        } 
    </p>
    <p>
        <strong>Ordem alfabética:</strong>  
        ${["Brasil", "Argentina", "Paraguai", "Uruguai", "Chile"]
        	.stream()
        	.map(x -> x.toLowerCase())
        	.toList()
        } 
    </p>
    <p>
        <strong>Filtrando valores Iniciando com B:</strong>
        ${["Brasil", "Argentina", "Paraguai", "Uruguai", "Chile"]
        	.stream()
        	.filter(x -> x.startsWith("B"))
        	.toList()
        } 
    </p>
    <p>
        <strong>Filtrando valores Terminando com a:</strong>    
        ${["Brasil", "Argentina", "Paraguai", "Uruguai", "Chile"]
        	.stream()
        	.filter(x -> x.endsWith("a"))
        	.toList()
        } 
    </p>

</body>
</html>