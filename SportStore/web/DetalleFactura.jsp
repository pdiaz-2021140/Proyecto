<%-- 
    Document   : DetalleFactura
    Created on : 3/09/2022, 05:14:45 PM
    Author     : User
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link rel="shortcut icon" href="./img/favicon.png" type="image/x-icon">
         <title>Detalle Factura</title>
    </head>
    <body>
        <div class ="d-flex">
            <div class="card col-sm-4">
                <div class="card-body">
                <form action="Controlador?menu=DetalleFactura" method="POST">
                        <div class="form-group">
                            <label>HORA DETALLE FACTURA</label>
                            <input type="time" value="${detalleFactura.getHoraDeEmision()}" name="txtHoraDeEmision" class="form-control" />
                        </div>
                    <div class="form-group">
                        <label>CODIGO PRODUCTO</label>
                        <input type="text" value="${detalleFactura.getCodigoProducto()}" ${read} name="txtCodigoProducto" class="form-control">  
                    </div>
                     <div class="form-group">
                        <label>CODIGO FACTURA</label>
                        <input type="text" value="${detalleFactura.getCodigoFactura()}" ${read} name="txtCodigoFactura" class="form-control">  
                    </div>
                    <input type="submit" name="accion" value="Agregar" class="btn btn-info">
                    <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
                </form>
            </div>
        </div>
        
        <div class="col-sm-8">
            <table class="table table-hover">
                <thead>
                    <tr>
                        <td>CODIGO DE FACTURA</td>
                        <td>HORA DE EMISION</td>
                        <td>CODIGO PRODUCTO</td>
                        <td>CODIGO FACTURA</td>
                    </tr>
                </thead>
                <tbody>  
                    <c:forEach var="detalleFactura" items="${detalleFacturas}">
                    <tr>
                        <td>${detalleFactura.getCodigoDFactura()}</td> 
                        <td>${detalleFactura.getHoraDeEmision()}</td>
                        <td>${(pro.listarCodigoProducto(detalleFactura.getCodigoProducto())).getNombreProducto()}</td> 
                        <td>${detalleFactura.getCodigoFactura()}</td> 
                        <td>
                             <a class="btn btn-warning" href="Controlador?menu=DetalleFactura&accion=Editar&codigoDFactura=${detalleFactura.getCodigoDFactura()}">Editar</a>
                             <a class="btn btn-danger" href="Controlador?menu=DetalleFactura&accion=Eliminar&codigoDFactura=${detalleFactura.getCodigoDFactura()}">Eliminar</a>
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