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
        <div id="login_contents">
            <form action="ValidadorLogin" method="post" class="form-horizontal">
                <fieldset>
                   <legend>Login</legend>
                   <div class="form-group">
                     <label for="inputUser" class="col-lg-2 control-label">UserName:</label>
                     <div class="col-lg-10">
                       <input type="text" class="form-control" id="inputUser" name="inputUser" placeholder="Your user name">
                     </div>
                   </div>
                   <div class="form-group">
                     <label for="inputPassword" class="col-lg-2 control-label">Password:</label>
                     <div class="col-lg-10">
                       <input type="password" class="form-control" id="inputPassword" name="inputPassword" placeholder="Password"> 
                     </div>
                   </div> 
                   <div class="form-group">
                     <div class="col-lg-10 col-lg-offset-2"> 
                       <button type="submit" class="btn btn-primary">Submit</button>
                     </div>
                   </div>
                </fieldset>
            </form>
        </div>
    </body>
</html>
