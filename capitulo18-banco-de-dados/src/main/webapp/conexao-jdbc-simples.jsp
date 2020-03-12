<%@ page language="java" 
    contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.sql.*"
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Trabalhando com Banco de dados usando JDBC</title>
</head>
<body>
<%
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    
    try {
     Class.forName("com.mysql.cj.jdbc.Driver").newInstance( ); 

     conn = DriverManager.getConnection("jdbc:mysql://localhost/livraria","edson","americapayment");

     st = conn.createStatement( );
     
     st.execute("INSERT INTO editoras (id,nome) VALUES ('1','Apress')");
     
     rs = st.executeQuery("SELECT * FROM editoras");

     while(rs.next( )) {
         
         out.print(rs.getString("nome") + "<br>"); 
         
     }

    
    }  catch (Exception ex) {
        ex.printStackTrace( );
    }  finally {
  			if (rs != null) rs.close( );     
            if (st != null) st.close( );
            if (conn != null) conn.close( );
    }
%>

</body>
</html>