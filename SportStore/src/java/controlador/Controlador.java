/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Departamento;
import modelo.DepartamentoDAO;
import modelo.DetalleFactura;
import modelo.DetalleFacturaDAO;
import modelo.Factura;
import modelo.FacturaDAO;
import modelo.FormaDePago;
import modelo.FormaDePagoDAO;
import modelo.Marca;
import modelo.MarcaDAO;
import modelo.Producto;
import modelo.ProductoDAO;
import modelo.Talla;
import modelo.TallaDAO;
import modelo.TipoProducto;
import modelo.TipoProductoDAO;
import modelo.TipoUsuario;
import modelo.TipoUsuarioDAO;
import modelo.Usuario;
import modelo.UsuarioDAO;



/**
 *
 * @author Kevin
 */
public class Controlador extends HttpServlet {

    TipoUsuario tipousuario = new TipoUsuario();
    TipoUsuarioDAO tipousuarioDAO = new TipoUsuarioDAO(); 
    Marca marca = new Marca();
    MarcaDAO marcaDAO = new MarcaDAO();
    Usuario usuario = new Usuario();
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    int codUsuario;
    TipoProducto tpProucto = new TipoProducto();
    TipoProductoDAO tpProductoDAO = new TipoProductoDAO();
    Producto producto = new Producto();
    ProductoDAO productoDAO = new ProductoDAO();
    FormaDePago formaPago = new FormaDePago();
    FormaDePagoDAO formaPagoDAO = new FormaDePagoDAO();
    Talla talla = new Talla();
    TallaDAO tallaDAO = new TallaDAO();
    Factura factura = new Factura();
    FacturaDAO facturaDAO = new FacturaDAO();
    DetalleFactura dtFactura = new DetalleFactura();
    DetalleFacturaDAO dtFacturaDAO = new DetalleFacturaDAO();
    Departamento dprt = new Departamento();
    DepartamentoDAO departamentoDAO = new DepartamentoDAO();
    int codTipoProdducto;
    int codFormaDePago;
    int codFactura;
    int codDept;
    int codProducto;
    int codTipoUser;
    int codTalla;
    int codDFactura;
    int codMarca;
    
    
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        
        if (menu.equals("Principal")) {
            request.getRequestDispatcher("Principal.jsp").forward(request, response);     
        } else if (menu.equals("Usuario")) {
            //CRUD Usuario
            switch(accion) {
                case "Listar":
                    List listaUsuario = usuarioDAO.listar();
                    request.setAttribute("usuarios", listaUsuario);
                    request.setAttribute("dep", departamentoDAO);
                    request.setAttribute("tipoUser", tipousuarioDAO);
                    break;
                    
                case "Agregar":
                    String NIT = request.getParameter("txtNITUsuario");
                    String nombre = request.getParameter("txtNombreUsuario");
                    String apellido = request.getParameter("txtApellidoUsuario");
                    String user = request.getParameter("txtUser");
                    String pass = request.getParameter("txtPass");
                    int codDep = Integer.parseInt(request.getParameter("txtCodigoDepartamento"));
                    String correoElec = request.getParameter("txtCorreoElectronico");
                    int codTUser = Integer.parseInt(request.getParameter("txtTipoUser"));
                    
                    usuario.setNombreUsuario(nombre);
                    usuario.setApellidoUsuario(apellido);
                    usuario.setNIT(NIT);
                    usuario.setUsuario(user);
                    usuario.setPasswordUser(pass);
                    usuario.setCorreoElectronico(correoElec);
                    usuario.setCodigoTUsuario(codTUser);
                    usuario.setCodigoDepartamento(codDep);
                    usuarioDAO.agregar(usuario);
                    request.getRequestDispatcher("Controlador?menu=Usuario&accion=Listar").forward(request, response);
                    
                    break;
                    
                case "Editar":
                    codUsuario = Integer.parseInt(request.getParameter("codigoUsuario"));
                    request.setAttribute("read", "readonly");
                    Usuario u = usuarioDAO.listarCodigoUsuario(codUsuario);
                    request.setAttribute("usuario", u);
                    request.getRequestDispatcher("Controlador?menu=Usuario&accion=Listar").forward(request, response);
                    
                    break;
                    
                case "Actualizar":
                    String nitUser = request.getParameter("txtNITUsuario");
                    String nombreUser = request.getParameter("txtNombreUsuario");
                    String apellidoUser = request.getParameter("txtApellidoUsuario");
                    String userU = request.getParameter("txtUser");
                    String passUser = request.getParameter("txtPass");
                    String correoUser = request.getParameter("txtCorreoElectronico");
                    
                    usuario.setNIT(nitUser);
                    usuario.setNombreUsuario(nombreUser);
                    usuario.setApellidoUsuario(apellidoUser);
                    usuario.setUsuario(userU);
                    usuario.setPasswordUser(passUser);
                    usuario.setCorreoElectronico(correoUser);
                    usuario.setCodigoUsuario(codUsuario);
                    usuarioDAO.actualizar(usuario);
                    
                    request.getRequestDispatcher("Controlador?menu=Usuario&accion=Listar").forward(request, response);
                    
                    break;
                    
                case "Eliminar":
                    codUsuario = Integer.parseInt(request.getParameter("codigoUsuario"));
                    usuarioDAO.eliminar(codUsuario);
                    
                    request.getRequestDispatcher("Controlador?menu=Usuario&accion=Listar").forward(request, response);
                    
                    break;
            }
            
            request.getRequestDispatcher("Usuario.jsp").forward(request, response);
            
        } else if (menu.equals("Home")) {
            request.getRequestDispatcher("Principal.jsp").forward(request, response);

        }else if(menu.equals("TipoProducto")){
         
            switch(accion){
                case "Listar":
                    List listaTipoProductos = tpProductoDAO.listar();
                    request.setAttribute("tipoProductos",listaTipoProductos);
                    break;
                case "Agregar":
                    String descripcion  = request.getParameter("txtDescripcion");
                    String genero = request.getParameter("txtGenero");
                  
                    tpProucto.setDescripcion(descripcion);
                    tpProucto.setGenero(genero);
                    tpProductoDAO.agregar(tpProucto);
                    request.getRequestDispatcher("Controlador?menu=TipoProducto&accion=Listar").forward(request, response);
                    break;
                    
                case "Editar" :
                    codTipoProdducto = Integer.parseInt(request.getParameter("codigoTProducto"));
                    TipoProducto e = tpProductoDAO.listaTipoProducto(codTipoProdducto);
                    request.setAttribute("tipoProducto", e);
                    request.getRequestDispatcher("Controlador?menu=TipoProducto&accion=Listar").forward(request, response);
                    break;
                   
                    
                case "Actualizar":
                    String descripTp = request.getParameter("txtDescripcion");
                    String genroTp = request.getParameter("txtGenero");
                    tpProucto.setDescripcion(descripTp);
                    tpProucto.setGenero(genroTp);
                    tpProucto.setCodigoTProducto(codTipoProdducto);
                    tpProductoDAO.actualizar(tpProucto);
                    request.getRequestDispatcher("Controlador?menu=TipoProducto&accion=Listar").forward(request, response);
                    break;
                    
                case "Eliminar":
                   codTipoProdducto = Integer.parseInt(request.getParameter("codigoTProducto"));
                   tpProductoDAO.eliminar(codTipoProdducto);
                    request.getRequestDispatcher("Controlador?menu=TipoProducto&accion=Listar").forward(request, response);       
                    break;
                    
                
            }
          request.getRequestDispatcher("TipoProducto.jsp").forward(request, response);   
    }else if(menu.equals("Producto")){
            
            switch(accion) {
                case "Listar":
                    List listaProducto = productoDAO.listar();
                    request.setAttribute("productos", listaProducto);
                    break;
                    
                case "Agregar":
                    String nombrePro = request.getParameter("txtNombreProducto");
                    int stock = Integer.parseInt(request.getParameter("txtStock"));
                    double prec = Double.parseDouble(request.getParameter("txtPrecio"));
                    int codMar = Integer.parseInt(request.getParameter("txtCodigoMarca"));
                    int codigoTa = Integer.parseInt(request.getParameter("txtCodigoTalla"));
                    int codigoTP = Integer.parseInt(request.getParameter("txtCodigoTProducto"));
                    
                    producto.setNombreProducto(nombrePro);
                    producto.setStock(stock);
                    producto.setPrecio(prec);
                    producto.setCodigoMarca(codMar);
                    producto.setCodigoTalla(codigoTa);
                    producto.setCodigoTProducto(codigoTP);
                    productoDAO.agregar(producto);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                    
                    break;
                    
                case "Editar":
                    codProducto = Integer.parseInt(request.getParameter("codigoProducto"));
                    Producto p = productoDAO.listarCodigoProducto(codProducto);
                    request.setAttribute("producto", p);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                    break;
                    
                case "Actualizar":
                    String nombrePr = request.getParameter("txtNombreProducto");
                    int stockk = Integer.parseInt(request.getParameter("txtStock"));
                    double preci = Double.parseDouble(request.getParameter("txtPrecio"));
                    producto.setNombreProducto(nombrePr);
                    producto.setStock(stockk);
                    producto.setPrecio(preci);
                    producto.setCodigoProducto(codProducto);
                    productoDAO.actualizar(producto);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                    break;
                    
                case "Eliminar":
                    codProducto = Integer.parseInt(request.getParameter("codigoProducto"));
                    productoDAO.eliminar(codProducto);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                    break;
            }
            
            request.getRequestDispatcher("Productos.jsp").forward(request, response);
        }else if(menu.equals("FormaDePago")){
            switch(accion){
                case "Listar":
                    List listaFormaDePago = formaPagoDAO.listar();
                    request.setAttribute("formaDePagos", listaFormaDePago);
                    break;
                case "Agregar":
                    String formaDPago = request.getParameter("txtFormaDePago");
                    formaPago.setFormaDePago(formaDPago);
                    formaPagoDAO.agregar(formaPago);
                    request.getRequestDispatcher("Controlador?menu=FormaDePago&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    codFormaDePago = Integer.parseInt(request.getParameter("codigoFormaDePago"));
                    FormaDePago form = formaPagoDAO.lsitarCodigoFormaDePago(codFormaDePago);
                    request.setAttribute("formaDePago", form);
                    request.getRequestDispatcher("Controlador?menu=FormaDePago&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String formDPago = request.getParameter("txtFormaDePago");
                    formaPago.setFormaDePago(formDPago);
                    formaPago.setCodigoFormaDePago(codFormaDePago);
                    formaPagoDAO.actualizar(formaPago);
                    request.getRequestDispatcher("Controlador?menu=FormaDePago&accion=Listar").forward(request, response);
                    break;
                case "Eliminar":
                    codFormaDePago = Integer.parseInt(request.getParameter("codigoFormaDePago"));
                    formaPagoDAO.eliminar(codFormaDePago);
                    request.getRequestDispatcher("Controlador?menu=FormaDePago&accion=Listar").forward(request, response);
                    break;
            }
            request.getRequestDispatcher("FormaDePago.jsp").forward(request, response);
        }
        // Inicio Factura    
        else if (menu.equals("Factura")) {
            //CRUD FACTURA
            switch(accion) {
                case "Listar":
                    List listaFactura = facturaDAO.listar();
                    request.setAttribute("facturas", listaFactura);
                    request.setAttribute("us", usuarioDAO);
                    request.setAttribute("fp", formaPagoDAO);
                    break;
                    
                case "Agregar":
                    
                    String fFactura = request.getParameter("txtFechaFactura");
                    int condition = Integer.parseInt(request.getParameter("txtEstado"));
                    int codUsuario = Integer.parseInt(request.getParameter("txtCodigoUsuario"));
                    int codFPago = Integer.parseInt(request.getParameter("txtFormaDePago"));                    
                    factura.setFechaFactura(fFactura);
                    factura.setEstado(condition);
                    factura.setCodigoUsuario(codUsuario);
                    factura.setCodigoFPago(codFPago);
                    facturaDAO.agregar(factura);
                    request.getRequestDispatcher("Controlador?menu=Factura&accion=Listar").forward(request, response);
                    break;
                    
                case "Editar": 
                        codFactura = Integer.parseInt(request.getParameter("codigoFactura"));
                        request.setAttribute("read", "readonly");
                        Factura f = facturaDAO.listarCodigoFactura(codFactura);
                        request.setAttribute("factura", f);
                        request.getRequestDispatcher("Controlador?menu=Factura&accion=Listar").forward(request, response);
                break;
                    
                case "Actualizar":
                    String codFFact = request.getParameter("txtFechaFactura");
                    int estad = Integer.parseInt(request.getParameter("txtEstado"));

                    factura.setFechaFactura(codFFact);
                    factura.setEstado(estad);
                    factura.setCodigoFactura(codFactura);
                    facturaDAO.actualizar(factura);
                    request.getRequestDispatcher("Controlador?menu=Factura&accion=Listar").forward(request, response);
                    break;
                    
                case "Eliminar":
                    codFactura = Integer.parseInt(request.getParameter("codigoFactura"));
                    facturaDAO.eliminar(codFactura);
                    request.getRequestDispatcher("Controlador?menu=Factura&accion=Listar").forward(request, response);
                    break;
            }            
            
            request.getRequestDispatcher("Factura.jsp").forward(request, response);
            
        }else if (menu.equals("Marca")){
            switch(accion){
                case "Listar":
                    List listaMarca = marcaDAO.listar();
                    request.setAttribute("marcas", listaMarca);
                    break;
                case "Agregar":
                    String nombres = request.getParameter("txtNombreMarca");
                    String numero = request.getParameter("txtNumeroContacto");
                    String correo = request.getParameter("txtCorreoContacto");
                    marca.setNombreMarca(nombres);
                    marca.setNumeroContacto(numero);
                    marca.setCorreoContacto(correo);
                    marcaDAO.agregar(marca);
                    request.getRequestDispatcher("Controlador?menu=Marca&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    codMarca = Integer.parseInt(request.getParameter("codigoMarca"));
                    Marca m = marcaDAO.listarCodigoMarca(codMarca);
                    request.setAttribute("marca", m);
                    request.getRequestDispatcher("Controlador?menu=Marca&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String NombreMarc = request.getParameter("txtNombreMarca");
                    String NumeroMarc = request.getParameter("txtNumeroContacto");
                    String CorreoMarc = request.getParameter("txtCorreoContacto");
                    marca.setNombreMarca(NombreMarc);
                    marca.setNumeroContacto(NumeroMarc);
                    marca.setCorreoContacto(CorreoMarc);
                    marca.setCodigoMarca(codMarca);
                    marcaDAO.actualizar(marca);
                    request.getRequestDispatcher("Controlador?menu=Marca&accion=Listar").forward(request, response);
                    break;
                case "Eliminar":
                    codMarca = Integer.parseInt(request.getParameter("codigoMarca"));
                    marcaDAO.eliminar(codMarca);
                    request.getRequestDispatcher("Controlador?menu=Marca&accion=Listar").forward(request, response);    
                        break;
            }
             request.getRequestDispatcher("Marca.jsp").forward(request, response);
        }else if (menu.equals("TipoUsuario")) {
             switch(accion){
                    case "Listar":
                        List listaTusuarios = tipousuarioDAO.listar();
                        request.setAttribute("tipoUsuarios", listaTusuarios);
                        
                            break;
                    case "Agregar":
                            String tipoUsuario = request.getParameter("txtTipoUsuario");
                            tipousuario.setTipoUsuario(tipoUsuario);
                            tipousuarioDAO.agregar(tipousuario);
                            request.getRequestDispatcher("Controlador?menu=TipoUsuario&accion=Listar").forward(request, response);
                  
                            break;
                            
                    case "Editar":
                           codTipoUser= Integer.parseInt(request.getParameter("codigoTUsuario"));
                           TipoUsuario tU = tipousuarioDAO.listarTipoUsuario(codTipoUser);
                           request.setAttribute("tipoUsuario", tU);
                           request.getRequestDispatcher("Controlador?menu=TipoUsuario&accion=Listar").forward(request, response);
                    
                        break;
                    
                case "Actualizar":
                    
                        String tUser = request.getParameter("txtTipoUsuario");
                        tipousuario.setTipoUsuario(tUser);
                        tipousuario.setCodigoTUsuario(codTipoUser);
                        tipousuarioDAO.actualizar(tipousuario);
                        request.getRequestDispatcher("Controlador?menu=TipoUsuario&accion=Listar").forward(request, response);
                    
                        break;
                    
                case "Eliminar":    
                    
                    codTipoUser = Integer.parseInt(request.getParameter("codigoTUsuario"));
                    tipousuarioDAO.eliminar(codTipoUser);
                    request.getRequestDispatcher("Controlador?menu=TipoUsuario&accion=Listar").forward(request, response);
                    
                        break;
                             
                }
                request.getRequestDispatcher("TipoUsuario.jsp").forward(request, response);


           

        } else if (menu.equalsIgnoreCase("Departamento")){
             switch(accion){
                case "Listar":
                    List listarcodigoDepto = departamentoDAO.listar();
                    request.setAttribute("departamentos",listarcodigoDepto);
                    break;
                case "Agregar":
                    // the last comment comment
                    String departamento  = request.getParameter("txtDepartamento");
                    String municipio = request.getParameter("txtMunicipio");
             
                    dprt.setDepartamento(departamento);
                    dprt.setMunicipio(municipio);
                 
                    departamentoDAO.agregar(dprt);
                    request.getRequestDispatcher("Controlador?menu=Departamento&accion=Listar").forward(request, response);

                    break;
                    
               case "Editar" :
                    codDept = Integer.parseInt(request.getParameter("codigoDepartamento"));
                    Departamento d = departamentoDAO.listarCodigoDepto(codDept);
                    request.setAttribute("departamento", d);
                    request.getRequestDispatcher("Controlador?menu=Departamento&accion=Listar").forward(request, response);
                    break;
                   
                    
                case "Actualizar":
                    String Ndep = request.getParameter("txtDepartamento");
                    String Nmun = request.getParameter("txtMunicipio");
                    dprt.setDepartamento(Ndep);
                    dprt.setMunicipio(Nmun);
                    dprt.setCodigoDepartamento(codDept);
                    departamentoDAO.actualizar(dprt);
                    request.getRequestDispatcher("Controlador?menu=Departamento&accion=Listar").forward(request, response);
                    break;
                    
                case "Eliminar":
                   codDept = Integer.parseInt(request.getParameter("codigoDepartamento"));
                   departamentoDAO.eliminar(codDept);
                    request.getRequestDispatcher("Controlador?menu=Departamento&accion=Listar").forward(request, response);       
                    break;
                     
             } request.getRequestDispatcher("Departamento.jsp").forward(request, response);


        }else if(menu.equals("Talla")){
        
        switch(accion) {
                case "Listar":
                    List listaTalla = tallaDAO.listar();
                    request.setAttribute("tallas", listaTalla);
                    break;
                    
                case "Agregar":
                    String noTa = request.getParameter("txtNoTalla");
                    talla.setNoTalla(noTa);
                    tallaDAO.agregar(talla);
                    request.getRequestDispatcher("Controlador?menu=Talla&accion=Listar").forward(request, response);
                    
                    break;
                    
                case "Editar":
                    codTalla = Integer.parseInt(request.getParameter("codigoTalla"));
                    Talla t = tallaDAO.listarCodigoTalla(codTalla);
                    request.setAttribute("talla", t);
                    request.getRequestDispatcher("Controlador?menu=Talla&accion=Listar").forward(request, response);
                    break;
                    
                    
                case "Actualizar":
                    String nombreTa = request.getParameter("txtNoTalla");
                    talla.setNoTalla(nombreTa);
                    talla.setCodigoTalla(codTalla);
                    tallaDAO.actualizar(talla);
                    request.getRequestDispatcher("Controlador?menu=Talla&accion=Listar").forward(request, response);
                    break;
                    
                    
                    
                case "Eliminar":
                    codTalla = Integer.parseInt(request.getParameter("codigoTalla"));
                    tallaDAO.eliminar(codTalla);
                    request.getRequestDispatcher("Controlador?menu=Talla&accion=Listar").forward(request, response);
                    break;
                    
                    
            }
        
        request.getRequestDispatcher("Talla.jsp").forward(request, response);
    }  else if (menu.equals("DetalleFactura")){
          switch(accion){
                case "Listar":
                    List listaDetalleFactura  = dtFacturaDAO.listar();
                    request.setAttribute("pro", productoDAO);
                    request.setAttribute("detalleFacturas",listaDetalleFactura );
                    break;
                case "Agregar":
                    String horaDEmision = request.getParameter("txtHoraDeEmision");
                    int codigoProducto = Integer.parseInt(request.getParameter("txtCodigoProducto"));
                    int codigoFactura = Integer.parseInt(request.getParameter("txtCodigoFactura"));
                    
                    dtFactura.setHoraDeEmision(horaDEmision);
                    dtFactura.setCodigoProducto(codigoProducto);
                    dtFactura.setCodigoFactura(codigoFactura);
                    dtFacturaDAO.agregar(dtFactura);
                    request.getRequestDispatcher("Controlador?menu=DetalleFactura&accion=Listar").forward(request, response);
                    
                    break;
                    
                case "Editar" :
                        codDFactura = Integer.parseInt(request.getParameter("codigoDFactura"));
                        request.setAttribute("read", "readonly");
                        DetalleFactura dt = dtFacturaDAO.listarCodigoDetalleFactura(codDFactura);
                        request.setAttribute("detalleFactura", dt);
                        request.getRequestDispatcher("Controlador?menu=DetalleFactura&accion=Listar").forward(request, response);
                    
                    break;
                    
                case "Actualizar":
                    String horaEmi = request.getParameter("txtHoraDeEmision");
                    dtFactura.setHoraDeEmision(horaEmi);
                    dtFactura.setCodigoDFactura(codDFactura);
                    dtFacturaDAO.actualizar(dtFactura);
                    request.getRequestDispatcher("Controlador?menu=DetalleFactura&accion=Listar").forward(request, response);
                    
                    
                    break;
                    
                case "Eliminar":
                    codDFactura = Integer.parseInt(request.getParameter("codigoDFactura"));
                    dtFacturaDAO.eliminar(codDFactura);
                    request.getRequestDispatcher("Controlador?menu=DetalleFactura&accion=Listar").forward(request, response);
                    
                    break;
                    
                
            }
                request.getRequestDispatcher("DetalleFactura.jsp").forward(request, response);
              
    }
}
        
    
        
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
             
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                
            
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}



