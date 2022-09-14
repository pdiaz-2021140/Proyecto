<%-- 
    Document   : ProductosCliente
    Created on : 13/09/2022, 02:11:49 PM
    Author     : informatica
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link rel="shortcut icon" href="./img/favicon.png" type="image/x-icon">
        <link rel="stylesheet" href="./CSS/productosCliente.css">
        <title>Productos</title>
    </head>
    <body>
        <div>
            <div style='display: inline-block'>
                
                <div class='encabezado-productos'>
                    <h1>Productos</h1>
                </div>
                
                <div class="contenedor-productos">
                    <div class='card-container'>
                        <c:forEach var="pr" items="${productos}">
                                <div class="carta-productos" style="width: 250px; height: 100%;">
                                    <div class='producto-img'>
                                        <img class="card-image" src="${pr.getFotoProducto()}" alt="Card image">
                                    </div>

                                    <div class = "linea-separador"> 
                                        <svg>
                                            <rect x="1" y="1" fill = "none"></rect>
                                        </svg>
                                    </div>
                                    <div class="d-grid">
                                      <h4 class="card-title">${pr.getNombreProducto()}</h4>
                                      <p class="card-text">Q ${pr.getPrecio()}</p>
                                      <a href="Controlador?menu=ProductosCliente&accion=AgregarCarrito&id=${pr.getCodigoProducto()}&total=${pr.getPrecio()}" class="btn btn-outline-dark">Añadir al carrito</a>
                                    </div>
                            </div>
                            
                        </c:forEach>
                    </div>
                </div>
                
            </div>
        </div>
        
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>
