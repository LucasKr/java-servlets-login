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
        <h1> Hello!!! Be free to go away! :O </h1>
        <% 
            String a = "";
            if(request.getAttribute("error") != null) {
                a = (String) request.getAttribute("error");
            }
        %>
        <form action="ValidadorLogin" method="get">
            <h2 style="color: red;"><%=a%></h2>
            <button type="submit" class="btn btn-primary">Go and login!</button>
        </form>
    </body>
</html>
