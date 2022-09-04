/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author mario
 */
public class Departamento {
    private int codigoDepartamento; 
    private String departamento; 
    private String municipio;
    private int codigoUsuario;

    public Departamento() {
    }

    public Departamento(int codigoDepartamento, String departamento, String municipio, int codigoUsuario) {
        this.codigoDepartamento = codigoDepartamento;
        this.departamento = departamento;
        this.municipio = municipio;
        this.codigoUsuario = codigoUsuario;
    }
    // coment 

    public int getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(int codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }
    
    
}
