<%-- 
    Document   : Usuario
    Created on : Sep 2, 2022, 12:40:33 AM
    Author     : Jefferson Calderón
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link rel="shortcut icon" href="./img/favicon.png" type="image/x-icon">
        <title>Usuario</title>
    </head>
    <body>
        <div class="d-flex">
            <div class="card col-sm-4">
                <div class="card-body">
                    <form action="Controlador?menu=Usuario" method="POST" enctype="multipart/form-data">
                        <div class="form-group">
                            <label>NIT:</label>
                            <input type="text" value="${usuario.getNIT()}" name="txtNITUsuario" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Nombre:</label>
                            <input type="text" value="${usuario.getNombreUsuario()}" name="txtNombreUsuario" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Apellido:</label>
                            <input type="text" value="${usuario.getApellidoUsuario()}" name="txtApellidoUsuario" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Usuario:</label>
                            <input type="text" value="${usuario.getUsuario()}" name="txtUser" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Contraseña:</label>
                            <input type="text" value="${usuario.getPasswordUser()}" name="txtPass" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Correo:</label>
                            <input type="text" value="${usuario.getCorreoElectronico()}" name="txtCorreoElectronico" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Departamento:</label>
                            <input type="text" value="${usuario.getCodigoDepartamento()}" ${read} name="txtCodigoDepartamento" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Tipo de usuario:</label>
                            <input type="text" value="${usuario.getCodigoTUsuario()}" ${read} name="txtTipoUser" class="form-control">
                        </div>
                         <div class="form-group">
                            <label>Elegir Imagen:</label>
                            <input type="file"  name="fileImg" >
                        </div>
                        <input type="submit" formaction="Controlador?menu=Usuario&accion=Agregar" name="accion" value="Agregar" class="btn btn-info">
                        <input type="submit" formaction="Controlador?menu=Usuario&accion=Actualizar" name="accion" value="Actualizar" class="btn btn-success">
                    </form>
                </div>
            </div>
            
            <div class="col-sm-8">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <td>CÓDIGO</td>
                            <td>NIT</td>
                            <td>NOMBRE</td>
                            <td>APELLIDO</td>                           
                            <td>USUARIO</td>
                            <td>CONTRASEÑA</td>
                            <td>CORREO</td>
                            <td>DEPARTAMENTO</td>
                            <td>TIPO USUARIO</td>
                            <td>FOTO USUARIO</td>
                            <td>ACCIONES</td>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="usuario" items="${usuarios}">
                        <tr>
                            <td>${usuario.getCodigoUsuario()}</td>
                            <td>${usuario.getNIT()}</td>
                            <td>${usuario.getNombreUsuario()}</td>
                            <td>${usuario.getApellidoUsuario()}</td>
                            <td>${usuario.getUsuario()}</td>
                            <td>${usuario.getPasswordUser()}</td>
                            <td>${usuario.getCorreoElectronico()}</td>
                            <td>${(dep.listarCodigoDepto(usuario.getCodigoDepartamento())).getDepartamento()}</td>
                            <td>${(tipoUser.listarTipoUsuario(usuario.getCodigoTUsuario())).getTipoUsuario()}</td>
                            <td> <img src="${usuario.getFotoUsuario()}" width="60" height="60"></td>
                            <td>
                                <a class="btn btn-warning" href="Controlador?menu=Usuario&accion=Editar&codigoUsuario=${usuario.getCodigoUsuario()}">Editar</a>
                                <a class="btn btn-danger" href="Controlador?menu=Usuario&accion=Eliminar&codigoUsuario=${usuario.getCodigoUsuario()}">Eliminar</a>                                                                
                            </td>
                        </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
            
        </div>
        
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>
