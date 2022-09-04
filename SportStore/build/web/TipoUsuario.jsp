
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
            <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TipoUsuario</title>
    </head>
    <body>
        <div class="d-flex">
            <div class="card col-sm-3">
                <div class="card-body" >
                    <form action="Controlador?menu=TipoUsuario" method="POST" >
                        
                        <div>
                            <label>TipoUsuario:</label>
                            <input type="text" name="txtTipoUsuario" class="form-control">  
                        </div>

                            <br><br>
                        <input type="submit" name="accion" value="Agregar" class=" btn btn-info">
                        <input type="submit" name="accion" value="Actualizar" class=" btn btn-success">
                    </form>
                </div>
            </div>
                
            <div class="col-sm-8">
                <table class="table table-hover"> 
                    <thead style="background-color: #CCCCCC ">
                        <tr>
                            <td>CODIGO</td>
                            <td>TIPO DE USUARIO</td>
                            <td>ACCIONES</td>
                        </tr>
                    </thead>
                    <tbody>
                        
                        <c:forEach var="tipoUsuario" items="${tipoUsuarios}">
                        <tr>
                            <td>${tipoUsuario.getCodigoTUsuario()}</td>
                            <td>${tipoUsuario.getTipoUsuario()}</td>
                            <td>
                                <a class="btn btn-info" href="" >EDITAR</a>
                                <a class="btn btn-danger" href="">ELIMINAR</a>
                            </td>
                        </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
            
        </div>
        
        
        
        
        
        
        
        
        
    </body>
</html>
