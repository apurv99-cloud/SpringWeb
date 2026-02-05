<%@page language="java" %>
<html>
  <body> 
    <!--JSP FILE GIVE US DEFAULT ACCESS TO SESSION, REQ AND RES OBJECT-->
    
    <!--This is Servlet Way-->
    <h2>Result is: <%= session.getAttribute("result") %></h2>

    <!-- THIS IS JSTL(JSP STANDARD LIBRARY) way
     <h2>Result is: ${Result} </h2>-->
    
  </body>
</html>
