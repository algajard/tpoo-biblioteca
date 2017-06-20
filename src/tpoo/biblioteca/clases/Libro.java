/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpoo.biblioteca.clases;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author algajard
 */
public class Libro {
    
    private static Integer ultimoCodigo;
    private Integer codigoLibro;
    private String titulo;
    private Autor autor;
    private Genero categoria;
    private Editorial editorial;
    private Date fechaPublicacion;
    private Integer cantidadLibros;
    
    public Libro(String titulo, 
            Autor autor, 
            Genero categoria, 
            Editorial editorial, 
            Date fechaPublicacion, 
            Integer cantidadLibros) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.cantidadLibros = cantidadLibros;
        
        this.codigoLibro = getUltimoCodigo();
        ultimoCodigo++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Genero getCategoria() {
        return categoria;
    }

    public void setCategoria(Genero categoria) {
        this.categoria = categoria;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Integer getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(Integer codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public Integer getCantidadLibros() {
        return cantidadLibros;
    }

    public static Integer getUltimoCodigo() {
        if( ultimoCodigo == null ) {
            ultimoCodigo = 1;
        } 
     
        return ultimoCodigo;
    }
    
    public Boolean equals(Libro l) {
        return Objects.equals(l.getCodigoLibro(), getCodigoLibro());
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Cod. : ").append(getCodigoLibro());
        builder.append(" - Título : ").append(getTitulo());
        builder.append(" - Autor : ").append(getAutor().toString());
        builder.append(" - Fecha Publicación : ").append(getFechaPublicacion().toString());
        
        return builder.toString();
    }
}
