/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpoo.biblioteca.clases;

import java.util.Objects;

/**
 *
 * @author algajard
 */
public class Editorial {
    
    private static Integer ultimoCodigoEditorial;
    private Integer codigoEditorial;
    private String nombreEditorial;
    private Domicilio domicilioEditorial;

    public Editorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
        this.codigoEditorial = getUltimoCodigoEditorial();    
        ultimoCodigoEditorial++;
    }

    public static Integer getUltimoCodigoEditorial() {
        if(ultimoCodigoEditorial==null) {
            ultimoCodigoEditorial = 1;
        }
        
        return ultimoCodigoEditorial;
    }

    public Integer getCodigoEditorial() {
        return codigoEditorial;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public Domicilio getDomicilioEditorial() {
        return domicilioEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    public void setDomicilioEditorial(Domicilio domicilioEditorial) {
        this.domicilioEditorial = domicilioEditorial;
    }

    public void setCodigoEditorial(Integer codigoEditorial) {
        this.codigoEditorial = codigoEditorial;
    }
    
    public Boolean equals(Editorial e) {
        return Objects.equals(e.getCodigoEditorial(), getCodigoEditorial());
    }
    
    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        builder.append("Cod. Editorial : ").append(getCodigoEditorial());
        builder.append(" -  Editorial : ").append(getNombreEditorial());
        
        return builder.toString();
    }
}
