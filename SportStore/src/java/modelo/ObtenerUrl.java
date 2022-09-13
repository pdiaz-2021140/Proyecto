
package modelo;


public class ObtenerUrl {
    
    public String url(){ 
        String u = String.valueOf(ObtenerUrl.class.getResource("Buscame.txt"));
        u = u.replace("file:/", "");
        u = u.replace("%20", " ");
        u = u.replace("build/", "");
        u = u.replace("WEB-INF/classes/modelo/Buscame.txt", "img/Perfil/");
        return u;
    }
    
     public String urlPro(){ 
        String a = String.valueOf(ObtenerUrl.class.getResource("Buscame.txt"));
        a = a.replace("file:/", "");
        a = a.replace("%20", " ");
        a = a.replace("build/", "");
        a = a.replace("WEB-INF/classes/modelo/Buscame.txt", "img/Producto/");
        return a;
    }
    
    
}
