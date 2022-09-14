<%-- 
    Document   : CarritoCompras
    Created on : Sep 13, 2022, 11:22:19 PM
    Author     : Jefferson Calderón
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link rel="stylesheet" href="./CSS/carrito.css">
        <link rel="stylesheet" href="./CSS/productosCliente.css">
        <title>Carrito</title>
    </head>
    <body>
        
        <div class = "ctn-main-carrito">
            <div class = "encabezado-carrito">
                <h3>Carrito</h3>
            </div>
        
            <div class = "ctn-producto-carrito" >
                <div id="contenedorCarrito">
                    <div class="card-container">
                        <c:forEach var="cr" items="${carrito}">
                            <div class="carta-productos" style="width: 250px; height: 100%;">
                                <div class="producto-img">
                                    <img class="card-image" src="${cr.getFotoProducto()}" alt="cardimg">
                                </div>
                                <div>
                                    <p style="width:100%; height:10%; text-align: center;"><a href="#" class="producto-carrito">${cr.getNombreProducto()}</a></p>
                                    <div class = "linea-separador"> 
                                        <svg>
                                            <rect x="1" y="1" fill = "none"></rect>
                                        </svg>
                                    </div>
                                    <h6>Precio unitario: Q${cr.getPrecio()}</h6>
                                    <h6>Cantidad: <input type="number" min="1" readOnly value="${cantidad.get(cr.getCodigoProducto())}" style="width: 30px;" class="input-cant"></h6>
                                    <a href="Controlador?menu=CarritoCompras&accion=Eliminar&id=${cr.getCodigoProducto()}&total=${cr.getPrecio()}" class="btn btn-outline-danger">Eliminar</a>
                                </div>
                            </div>
                            
                        </c:forEach>
                    </div>
                </div>
            </div>
        
            <div class = "totales-carrito">
                <h2 class="itemCartTotal">Total: ${total}</h2>
            </div>
        
        </div>
        
        
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
         <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
         <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
        
    </body>
</html>
