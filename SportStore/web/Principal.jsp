<%-- 
    Document   : Principal
    Created on : Sep 1, 2022, 11:56:38 PM
    Author     : Jefferson Calderón
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <title>Principal page</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-lighr bg-dark">
            
              <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                  <li class="nav-item active">
                    <a style='margin-left: 10px; border: none' class="btn btn-outline-light" href="Controlador?menu=Home" target="homeFrame">Home</a>
                  </li>
                  <li class="nav-item">
                      <a style='margin-left: 10px; border: none' class="btn btn-outline-light" href="Controlador?menu=Usuario&accion=Listar" target="homeFrame">Usuario</a>
                  </li>
                  <li class="nav-item">
                      <a style='margin-left: 10px; border: none' class="btn btn-outline-light" href="Controlador?menu=Marca&accion=Listar" target="homeFrame">Marca</a>
                  </li>
                  <li class="nav-item active">
                      <a style="margin-left: 10px; border: none"class="btn btn-outline-light" href="Controlador?menu=TipoProducto&accion=Listar" target="homeFrame">TipoProducto</a>
                  </li>
                  <li class="nav-item">
                      <a style='margin-left: 10px; border: none' class="btn btn-outline-light" href="Controlador?menu=Producto&accion=Listar" target="homeFrame">Producto</a>
                  </li>
                  <li class="nav-item">
                      <a style='margin-left: 10px; border: none' class="btn btn-outline-light" href="Controlador?menu=FormaDePago&accion=Listar" target="homeFrame">Forma De Pago</a>
                  </li>
                  <li class="nav-item active">
                    <a style="margin-left: 10px; border: none"class="btn btn-outline-light" href="Controlador?menu=Factura&accion=Listar" target="homeFrame">Factura</a>
                  </li>
                  <li class="nav-item">
                    <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=TipoUsuario&accion=Listar" target="homeFrame">TipoUsuario</a>

                  </li>   

                    <li class="nav-item">
                    <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=Departamento&accion=Listar" target="homeFrame">Departamento</a>
                  </li>   
                  </li>
                   <li class="nav-item active">
                      <a style="margin-left: 10px; border: none"class="btn btn-outline-light" href="Controlador?menu=Talla&accion=Listar" target="homeFrame">Talla</a>
                  </li>

                </ul>
              </div>
            <div class="dropdown">
                <button style='border: none' class="btn btn-outline-light dropdown-toggle" type="button" id='dropdownMenuButton' data-toggle="dropdown" aria-haspopup='true' aria-expanded="false">
                  ${usuario.getNombreUsuario()} ${usuario.getApellidoUsuario()}
                </button>
                <div class='dropdown-menu text-center' aria-labelledbdy='dropdownMenuButton'>
                    <a class="dropdown-item" href="#">
                        <img src='img/usuario.png' alt='' width="50">
                    </a>
                    <a class="dropdown-item" href="#">${usuario.getUsuario()}</a>
                    <a class="dropdown-item" href="#">${usuario.getCorreoElectronico()}</a>
                    <div class='dropdown-divider'></div>
                        <form action='Validar' method="POST">
                            <button name='accion' name='Salir' class='dropdown-item' href='#'>Salir</button>
                        </form>
                    
                </div>
                
              </div>
          </nav>
                    
                    <div class="m-4" style="height: 800px">
                        <iframe name="homeFrame" style="height: 100%; width: 100%; border: none"></iframe>
                    </div>
                        
          <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
          <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
          <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>
