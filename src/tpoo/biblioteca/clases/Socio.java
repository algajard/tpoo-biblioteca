/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpoo.biblioteca.clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author algajard
 */
public class Socio extends Persona {

    private static Integer ultimoSocio;
    private Integer codigoSocio;
    private Integer librosPrestados;
    private Boolean socioActivo;

    public Socio(Boolean socioActivo, String nombres, String apellidoPaterno, String apellidoMaterno, Domicilio domicilio) {
        super(nombres, apellidoPaterno, apellidoMaterno, domicilio);
        this.socioActivo = socioActivo;
        ultimoSocio++;
        this.codigoSocio = getUltimoSocio();
    }

    public Socio(Boolean socioActivo, String nombres, String apellidoPaterno, String apellidoMaterno) {
        super(nombres, apellidoPaterno, apellidoMaterno);
        this.socioActivo = socioActivo;
        this.codigoSocio = getUltimoSocio();
        ultimoSocio++;
    }

    public Integer getCodigoSocio() {
        return codigoSocio;
    }

    public static Integer getUltimoSocio() {
        if (ultimoSocio == null) {
            ultimoSocio = 1;
        }

        return ultimoSocio;
    }

    public Boolean getSocioActivo() {
        return socioActivo;
    }

    public void setSocioActivo(Boolean socioActivo) {
        this.socioActivo = socioActivo;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Código : ").append(getCodigoSocio());
        builder.append(" - ").append(super.toString());
        builder.append(" - ACTIVO : ").append(getSocioActivo());
        
        return builder.toString();
    }
    
    public Boolean equals(Socio s) {
        return Objects.equals(getCodigoSocio(), s.getCodigoSocio());
    }
}
