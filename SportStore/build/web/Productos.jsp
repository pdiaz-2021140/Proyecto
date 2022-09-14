<%-- 
    Document   : Productos
    Created on : 2/09/2022, 10:20:35 PM
    Author     : Jose Cifuentes
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        
        <title>Productos</title>
    </head>
    <body>
        <div class="d-flex">
            <div class="card col-sm-4">
                <div class="card-body">
                    <form action="Controlador?menu=Producto" method="POST" enctype="multipart/form-data">
                        <div class="form-group">
                            <label>Nombre:</label>
                            <input type="text" value="${producto.getNombreProducto()}" name="txtNombreProducto" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Stock</label>
                            <input type="text" value="${producto.getStock()}" name="txtStock" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Precio</label>
                            <input type="text" value="${producto.getPrecio()}" name="txtPrecio" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Marca</label>
                            <input type="text" value="${producto.getCodigoMarca()}" ${read} name="txtCodigoMarca" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Talla</label>
                            <input type="text" value="${producto.getCodigoTalla()}" ${read} name="txtCodigoTalla" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Tipo Producto</label>
                            <input type="text" value="${producto.getCodigoTProducto()}" ${read} name="txtCodigoTProducto" class="form-control">
                        </div>
                         <div class="form-group">
                            <label>Foto Producto</label>
                            <input type="file"  name="fileProducto" >
                        </div>
                        <input type="submit" formaction="Controlador?menu=Producto&accion=Agregar" name="accion" value="Agregar" class="btn btn-info">
                        <input type="submit" formaction="Controlador?menu=Producto&accion=Actualizar" name="accion" value="Actualizar" class="btn btn-success">
                    </form>
                </div>
            </div>
            <div class="col-sm-8">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <td>CODIGO</td>
                            <td>NOMBRES</td>
                            <td>STOCK</td>
                            <td>PRECIO</td>
                            <td>MARCA</td>
                            <td>TALLA</td>
                            <td>TIPO PRODUCTO</td>
                            <td>FOTO PRODUCTO</td>
                            <td>ACCIONES</td>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="producto" items="${productos}">
                        <tr>
                            <td>${producto.getCodigoProducto()}</td>
                            <td>${producto.getNombreProducto()}</td>
                            <td>${producto.getStock()}</td>
                            <td>${producto.getPrecio()}</td>
                            <td>${producto.getCodigoMarca()}</td>
                            <td>${producto.getCodigoTalla()}</td>
                            <td>${producto.getCodigoTProducto()}</td>
                            <td><img src="${producto.getFotoProducto()}" width="60" height="60"></td>
                            <td>
                                <a class="btn btn-warning" href="Controlador?menu=Producto&accion=Editar&codigoProducto=${producto.getCodigoProducto()}">Editar</a>
                                <a class="btn btn-danger" href="Controlador?menu=Producto&accion=Eliminar&codigoProducto=${producto.getCodigoProducto()}">Eliminar</a>
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