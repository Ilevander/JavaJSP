<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <p>JSP Content</p>

   <p>
	   <%
	     //String value = (String) request.getAttribute("var");
	     //out.println(value);
	   %> 
  </p>
  
  
  <p>
    <%
        String toto = (String) request.getAttribute("heure");
        if (toto.equals("jour")) {
            out.println("Bonjour"); 
        }
        else if (toto.equals("bonsoir")) {
            out.println("Bonsoir");
        }
        else
        	out.println("Nothing");
    %>
</p>

 <p>
    <%
        for (int i=0;i<10;i++)
        	out.println("I love coding <br>");
            
    %>
</p>

</body>
</html>