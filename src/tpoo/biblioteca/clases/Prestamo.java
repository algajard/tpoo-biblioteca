/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpoo.biblioteca.clases;

import java.util.Date;

/**
 *
 * @author algajard
 */
public class Prestamo {

    private static Integer idPrestamo;
    private Date fechaPrestamo;
    private Date fechaEntrega;
    private Socio socio;
    private Administrativo administrativo;
    private Libro libro;

    public Prestamo(Date fechaPrestamo, Socio socio, Libro libro, Administrativo administrativo) {
        this.fechaPrestamo = fechaPrestamo;
        this.socio = socio;
        this.administrativo = administrativo;
        this.libro = libro;

        idPrestamo++;
        idPrestamo = getIdPrestamo();
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public Administrativo getAdministrativo() {
        return administrativo;
    }

    public void setAdministrativo(Administrativo administrativo) {
        this.administrativo = administrativo;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public static Integer getIdPrestamo() {
        if (idPrestamo == null) {
            idPrestamo = 1;
        }

        return idPrestamo;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Prestamo No, : ").append(getIdPrestamo());
        builder.append(" - FECHA PRESTAMO : ").append(getFechaPrestamo());
        builder.append(" - FECHA ENTREGA : ").append(getFechaEntrega());
        builder.append(" - LIBRO : ").append(getLibro().getTitulo());
        builder.append(" - SOCIO : ").append(getSocio().toString());

        return builder.toString();
    }
}
