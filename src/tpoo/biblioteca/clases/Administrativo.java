/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpoo.biblioteca.clases;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author algajard
 */
public class Administrativo extends Persona {

    private static Integer ultimoAdministrativo;
    private Integer codigoAdministrativo;

    public Administrativo(String nombres, String apellidoPaterno, String apellidoMaterno, Domicilio domicilio) {
        super(nombres, apellidoPaterno, apellidoMaterno, domicilio);
        this.codigoAdministrativo = getUltimoAdministrativo();
        ultimoAdministrativo++;
    }

    public Administrativo(String nombres, String apellidoPaterno, String apellidoMaterno) {
        super(nombres, apellidoPaterno, apellidoMaterno);
        this.codigoAdministrativo = getUltimoAdministrativo();
        ultimoAdministrativo++;
    }

    public Integer getCodigoAdministrativo() {
        return codigoAdministrativo;
    }

    public void setCodigoAdministrativo(Integer codigoAdministrativo) {
        this.codigoAdministrativo = codigoAdministrativo;
    }

    public static Integer getUltimoAdministrativo() {
        if(ultimoAdministrativo==null) {
            ultimoAdministrativo = 1;
        }
        
        return ultimoAdministrativo;
    }
    
    public Boolean equals(Administrativo a) {
        return Objects.equals(a.getCodigoAdministrativo(), getCodigoAdministrativo());
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Código : ").append(getCodigoAdministrativo());
        builder.append(" - ").append(super.toString());
        
        return builder.toString();
    }
}
