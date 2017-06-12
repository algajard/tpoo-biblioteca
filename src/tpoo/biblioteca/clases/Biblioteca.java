/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpoo.biblioteca.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author algajard
 */
public class Biblioteca {

    private Domicilio domicilioBiblioteca;
    private List<Libro> librosBiblioteca;
    private List<Prestamo> librosPrestados;
    private List<Socio> socios;
    private Administrativo encargado;

    public Biblioteca(Domicilio domicilioBiblioteca, Administrativo encargado) {
        this.domicilioBiblioteca = domicilioBiblioteca;
        this.encargado = encargado;
    }

    public List<Libro> getLibrosBiblioteca() {
        if (librosBiblioteca == null) {
            librosBiblioteca = new ArrayList<>();
        }

        return librosBiblioteca;
    }

    public List<Prestamo> getLibrosPrestados() {
        if (librosPrestados == null) {
            librosPrestados = new ArrayList<>();
        }

        return librosPrestados;
    }

    public List<Socio> getSocios() {
        if (socios == null) {
            socios = new ArrayList<>();
        }
        return socios;
    }

    public Domicilio getDomicilioBiblioteca() {
        return domicilioBiblioteca;
    }

    public void setDomicilioBiblioteca(Domicilio domicilioBiblioteca) {
        this.domicilioBiblioteca = domicilioBiblioteca;
    }

    public Administrativo getEncargado() {
        return encargado;
    }

    public void setEncargado(Administrativo encargado) {
        this.encargado = encargado;
    }

    public Socio buscarSocio(Socio socio) {

        Socio existe = null;

        for (Socio s : getSocios()) {
            if (socio.equals(s)) {
                existe = s;
            }
        }

        return existe;
    }

    public void registrarSocio(Socio nuevoSocio) throws Exception {
        if (buscarSocio(nuevoSocio) == null) {
            getSocios().add(nuevoSocio);
        } else {
            throw new Exception("ERROR: SOCIO YA EXISTE.");
        }
    }

    public void removerSocio(Socio socio) throws Exception {
        Socio existe = buscarSocio(socio);

        if (existe != null) {
            existe.setSocioActivo(Boolean.FALSE);
        } else {
            throw new Exception("ERROR: SOCIO NO EXISTE.");
        }
    }

    public Libro buscarLibro(Libro libro) {
        Libro existe = null;

        for (Libro s : getLibrosBiblioteca()) {
            if (libro.equals(s)) {
                existe = s;
            }
        }

        return existe;
    }

    public void registrarLibro(Libro libro) throws Exception {
        Libro existe = buscarLibro(libro);

        if (existe == null) {
            getLibrosBiblioteca().add(libro);
        } else {
            throw new Exception("ERROR: LIBRO YA EXISTE.");
        }
    }

}
