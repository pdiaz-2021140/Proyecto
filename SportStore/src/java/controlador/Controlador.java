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
import modelo.Factura;
import modelo.FacturaDAO;
import modelo.FormaDePago;
import modelo.FormaDePagoDAO;
import modelo.Marca;
import modelo.MarcaDAO;
import modelo.Producto;
import modelo.ProductoDAO;
import modelo.TipoProducto;
import modelo.TipoProductoDAO;
import modelo.Usuario;
import modelo.UsuarioDAO;


/**
 *
 * @author Kevin
 */
public class Controlador extends HttpServlet {


    Marca marca = new Marca();
    MarcaDAO marcaDAO = new MarcaDAO();
    Usuario usuario = new Usuario();
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    TipoProducto tpProucto = new TipoProducto();
    TipoProductoDAO tpProductoDAO = new TipoProductoDAO();
    Producto producto = new Producto();
    ProductoDAO productoDAO = new ProductoDAO();
    FormaDePago formaPago = new FormaDePago();
    FormaDePagoDAO formaPagoDAO = new FormaDePagoDAO();
    
    Factura factura = new Factura();
    FacturaDAO facturaDAO = new FacturaDAO();
    
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
                    break;
                    
                case "Agregar":
                    String NIT = request.getParameter("txtNITUsuario");
                    String nombre = request.getParameter("txtNombreUsuario");
                    String apellido = request.getParameter("txtApellidoUsuario");
                    String tel = request.getParameter("txtTelefonoUsuario");
                    String user = request.getParameter("txtUser");
                    String pass = request.getParameter("txtPass");
                    String correoElec = request.getParameter("txtCorreoElectronico");
                    int codTUser = Integer.parseInt(request.getParameter("txtTipoUser"));
                    
                    usuario.setNombreUsuario(nombre);
                    usuario.setApellidoUsuario(apellido);
                    usuario.setNIT(NIT);
                    usuario.setTelefonoContacto(tel);
                    usuario.setUsuario(user);
                    usuario.setPasswordU(pass);
                    usuario.setCorreoElectronico(correoElec);
                    usuario.setCodigoTUsuario(codTUser);
                    usuarioDAO.agregar(usuario);
                    request.getRequestDispatcher("Controlador?menu=Usuario&accion=Listar").forward(request, response);
                    
                    break;
                    
                case "Editar":
                    
                    break;
                    
                case "Actualizar":
                    
                    break;
                    
                case "Eliminar":
                    
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
                    int codigoMarca = Integer.parseInt(request.getParameter("txtCodMarca"));
                  
                    tpProucto.setDescripcion(descripcion);
                    tpProucto.setCodigoMarca(codigoMarca);
                    tpProductoDAO.agregar(tpProucto);
                    request.getRequestDispatcher("Controlador?menu=TipoProducto&accion=Listar").forward(request, response);
                    break;
                    
                case "Editar" :
                    
                    break;
                    
                case "Actualizar":
                    
                    break;
                    
                case "Eliminar":
                    
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
                    int codigoTP = Integer.parseInt(request.getParameter("txtCodigoTProducto"));
                    int codigoTa = Integer.parseInt(request.getParameter("txtCodigoTalla"));
                    
                    producto.setNombreProducto(nombrePro);
                    producto.setStock(stock);
                    producto.setPrecio(prec);
                    producto.setCodigoTProducto(codigoTP);
                    producto.setCodigoTalla(codigoTa);
                    productoDAO.agregar(producto);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                    
                    break;
                    
                case "Editar":
                    
                    break;
                    
                case "Actualizar":
                    
                    break;
                    
                case "Eliminar":
                    
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
                    
                    break;
                case "Actualizar":
                    
                    break;
                case "Eliminar":
                    
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
                    
                    break;
                    
                case "Actualizar":
                    
                    break;
                    
                case "Eliminar":
                    
                    break;
            }
            
            request.getRequestDispatcher("Factura.jsp").forward(request, response);
            
        } else if (menu.equals("Marca")){
            switch(accion){
                case "Listar":
                    List listaMarca = marcaDAO.listar();
                    request.setAttribute("marcas", listaMarca);
                    break;
                case "Agregar":
                    String nombres = request.getParameter("txtNombreMarca");
                    String numero = request.getParameter("txtNumeroContacto");
                    marca.setNombreMarca(nombres);
                    marca.setNumeroContacto(numero);
                    marcaDAO.agregar(marca);
                    request.getRequestDispatcher("Controlador?menu=Marca&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    
                    break;
                case "Actualizar":
                    
                    break;
                case "Eliminar":
                        
                        break;
            }
             request.getRequestDispatcher("Marca.jsp").forward(request, response);
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
    

