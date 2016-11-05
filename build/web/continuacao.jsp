
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
        <h1> 
            Hello!!! <% request.getCookies()[0].getValue(); %>
        </h1> 
    </body>
</html>
