<%-- 
    Document   : formaDePago
    Created on : 2/09/2022, 01:05:23 AM
    Author     : User
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"> 
        <title>Forma De Pago</title>
    </head>
    <style>
        
        .card{
         transition: box-shadow 0.3s ease; 
         border-radius: 1rem;   
         border-style: solid;
         font-family: «Helvetica Neue»;
        }
        
        .card:hover{
            box-shadow: 0 0 2rem rgba(0, 0, 0,0.8);
            border-radius: 1.4rem;
            cursor: pointer;
        }
        
    </style>
    <body>
        
        <div class="d-flex" >
            <div class="card col-sm-4" style="transition: box-shadow 0.3s ease ; background-color: #F2F3F4;">
                <div class="card-body">
                    <form action="Controlador?menu=FormaDePago" method="POST">
                        <div class="form-group">
                            <label>Forma De Pago</label>
                            <input type="text" name="txtFormaDePago" class="form-control">
                        </div>
                        <input type="submit" name="accion" value="Agregar" class="btn btn-info">
                        <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
                    </form>
                </div>
            </div>
            

        
        <div class="row mx-5">
            <c:forEach var="formaDePago" items="${formaDePagos}">
            <div class="col mt-5" style="margin: 5px;">
                <div class="card" style="width: 18rem; background-color: #1B4F72; color: white; ">
                    <img src="img/formasDePago.png" alt="Forma De Pago" style="border-radius:1rem;"/>
                    <div class="card-body">
                        <h1>${formaDePago.getFormaDePago()}</h1>
                        <details>
                            <summary>💲</summary>
                            <p>La culpa de gastar, se acaba al estrenar</p>
                        </details>
                        <a href="#" class="btn btn-primary">._.</a>
                        <a class="btn btn-warning" href="#">Editar</a>
                        <a class="btn btn-danger" href="#">Eliminar</a> 
                    </div>
                </div> 
            </div>
            </c:forEach>
            
            
            
        </div><br>
            
            
            
            
        </div>
        
        
        
        
       <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
       <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
       <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script> 
    </body>
</html>
