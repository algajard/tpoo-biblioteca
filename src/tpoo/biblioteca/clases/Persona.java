/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpoo.biblioteca.clases;

import java.util.List;

/**
 *
 * @author algajard
 */
public abstract class Persona {
    
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Domicilio domicilio;

    public Persona(String nombres, String apellidoPaterno, String apellidoMaterno, Domicilio domicilio) {
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.domicilio = domicilio;
    }

    public Persona(String nombres, String apellidoPaterno, String apellidoMaterno) {
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("NOMBRE : ").append(getApellidoPaterno());
        builder.append(" ").append(getApellidoMaterno());
        builder.append(", ").append(getNombres());
        
        return builder.toString();
    }
}
