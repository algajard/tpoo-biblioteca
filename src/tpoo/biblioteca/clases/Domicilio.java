/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpoo.biblioteca.clases;

/**
 *
 * @author algajard
 */
public class Domicilio {
    
    private String calle;
    private String numero;
    private String departamento;
    private String bloque;

    public Domicilio(String calle, String numero, String departamento, String bloque) {
        this.calle = calle;
        this.numero = numero;
        this.departamento = departamento;
        this.bloque = bloque;
    }

    public Domicilio(String calle, String numero) {
        this.calle = calle;
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getBloque() {
        return bloque;
    }

    public void setBloque(String bloque) {
        this.bloque = bloque;
    }
}
