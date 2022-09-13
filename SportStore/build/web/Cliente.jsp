<%-- 
    Document   : cliente
    Created on : 8/09/2022, 09:07:47 PM
    Author     : Carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script src="https://kit.fontawesome.com/d40ea9438d.js" crossorigin="anonymous"></script>
    <link href="login.css" rel="stylesheet" type="text/css"/>
    <link rel="shortcut icon" href="./img/favicon.png" type="image/x-icon">
    <div class="login-box">
        <h2><i class="fa-solid fa-users-line fa-3x"></i></h2>
        <form action="Controlador?menu=Usuario" method="POST">
            <div class="user-box">
              <input type="text" name="txtNombreUsuario" required="">
              <label>Nombre</label>
            </div>
            <div class="user-box">
              <input type="text" name="txtApellidoUsuario" required="">
              <label>Apellido</label>
            </div>
            <div class="user-box">
              <input type="text" name="txtNITUsuario" required="">
              <label>Nit</label>
            </div>
            <div class="user-box">
              <input type="text" name="txtCorreoElectronico" required="">
              <label>Correo Electronico</label>
            </div>
            <div class="user-box">
              <input type="text" name="txtdepa" required="">
              <label>Departamento</label>
            </div>
            <div class="user-box">
              <input type="text" name="txtUser" required="">
              <label>Username <i class="fa-regular fa-user"></i></label>
            </div>
            
            <div class="user-box">
              <input type="password" name="txtPass" required="">
              <label>Password <i class="fa-solid fa-lock"></i></label>
            </div>
            <input type="submit" name="accion" value="AgregarCliente"class="a">
        </form>
    </div>
</html>
