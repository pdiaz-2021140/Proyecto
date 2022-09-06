<%-- 
    Document   : login
    Created on : 4/09/2022, 12:25:15 AM
    Author     : Alessandro Gutiérrez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="login.css" rel="stylesheet" type="text/css"/>
    <div class="login-box">
        <h2>Login</h2>
        <form class="form-sign" action="Validar" method="POST">
            <div class="user-box">
              <input type="text" name="txtUser" required="">
              <label>Username</label>
            </div>
            <div class="user-box">
              <input type="password" name="txtPass" required="">
              <label>Password</label>
            </div>
            <input type="submit" name="accion" value="Ingresar" class="a">
        </form>
    </div>
</html>
