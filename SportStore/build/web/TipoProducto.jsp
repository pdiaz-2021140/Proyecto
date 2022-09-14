<%-- 
    Document   : TipoProducto
    Created on : 1/09/2022, 07:02:41 AM
    Author     : Carlos
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <title>TIPO PRODUCTO</title>
    </head>
    <body>
     
        <div class="d-flex">
            <div class="card col-sm-4">
                <div class="card-body">
                    <form action="Controlador?menu=TipoProducto" method="POST">
                        <div class="form-group">
                            <label>DESCRIPCIÓN</label>
                            <input type="text" value="${tipoProducto.getDescripcion()}" name="txtDescripcion" class="form-control">
                        </div>
                          <div class="form-group">
                            <label>GÉNERO DEL PRODUCTO</label>
                            <input type="text"  value="${tipoProducto.getGenero()}" name="txtGenero" class="form-control">
                        </div>
                        <input type ="submit" name="accion" value="Agregar" class="btn btn-info">
                         <input type ="submit" name="accion" value="Actualizar" class="btn btn-success">
                    </form>
                </div>
            </div>
            
            <div class="col-sm-8">
                
                  <table class=" table table-hover table-bordered  ">
                    <thead class="bg-dark">
                         <td style="color: white">CODIGO</td>
                         <td style="color: white">DESCRIPCIÓN</td>
                         <td style="color: white">GÉNERO DE LA MARCA</td>
                         <td style="color: white">ACCIONES</td>
                    </thead>
                    <tbody>
                 <c:forEach var="tipoProducto" items="${tipoProductos}">
                        <tr>
                            <td>${tipoProducto.getCodigoTProducto()}</td>
                            <td>${tipoProducto.getDescripcion()}</td>
                            <td>${tipoProducto.getGenero()}</td>
                            <td>
                                <a class="btn btn-warning" href="Controlador?menu=TipoProducto&accion=Editar&codigoTProducto=${tipoProducto.getCodigoTProducto()}">Editar</a>
                                <a class="btn btn-danger" href="Controlador?menu=TipoProducto&accion=Eliminar&codigoTProducto=${tipoProducto.getCodigoTProducto()}">Eliminar</a>
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
