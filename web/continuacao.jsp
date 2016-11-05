
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Parcial II</title>
        <link rel="stylesheet" href="https://bootswatch.com/cosmo/bootstrap.css">
        <link rel="stylesheet" href="./styles.css">
    </head>
    <body>
        <%
            
            edu.fameg.parcial.dao.UsersDao userDao = (edu.fameg.parcial.dao.UsersDao) request.getSession().getAttribute("login");
            if(userDao == null) {

        %>
        
        <jsp:forward page="login.jsp" /> 
        
        <%  } 
        
            String username = "";
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                 for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("userName")) {
                        username = cookie.getValue();
                        break;
                    }
                }
            } 
        %>
        <h1> 
            Hello!!! <%=username%>
            <form action="Logout" method="post">
            </form>
        </h1> 
    </body>
</html>
