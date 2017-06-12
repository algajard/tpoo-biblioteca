/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpoo.biblioteca.clases;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author algajard
 */
public class Autor extends Persona {
    
    private List<Libro> librosEscritos;

    public Autor(String nombres, String apellidoPaterno, String apellidoMaterno, Domicilio domicilio) {
        super(nombres, apellidoPaterno, apellidoMaterno, domicilio);
    }

    public Autor(String nombres, String apellidoPaterno, String apellidoMaterno) {
        super(nombres, apellidoPaterno, apellidoMaterno);
    }

    public List<Libro> getLibrosEscritos() {
        return librosEscritos;
    }

    public void setLibrosEscritos(List<Libro> librosEscritos) {
        this.librosEscritos = librosEscritos;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
}
