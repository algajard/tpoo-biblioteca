/*
 * Son administradores de una biblioteca donde se prestan libros solamente a usuarios autorizados para este fin. 
 * Todos los días se dan de alta nuevos lectores y se dan de baja otros tantos lectores. Se tiene un stock de libros, 
 * de cada libro hay una cantidad total 'm' de libros pero se pueden prestar solamente 'n' libros. Existen dos asistentes 
 * que reciben y prestan libros; registran nuevos libros; registran nuevos lectores y dan de baja a los lectores. Un lector 
 * puede tener en su poder hasta 3 libros. Los libros son catalogados con un número secuencial y ascendente; además se 
 * cataloga de acuerdo al género del libro.
 *
 * Se debe construir un sistema que permita automatizar las tareas antes descritas."
 */
package tpoo.biblioteca;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import tpoo.biblioteca.clases.*;

/**
 *
 * @author algajard
 */
public class TpooBiblioteca {

    private static Biblioteca biblioteca;
    private static List<Genero> generos;
    private static List<Autor> autores;
    private static List<Editorial> editoriales;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        configurarBiblioteca();

        String opcion = "";
        System.out.println();

        while (!opcion.equalsIgnoreCase("0")) {
            try {
                printMenu();
                System.out.println("================================");
                opcion = getString("Opcion (0/7): ");

                switch (opcion) {
                    case "1": {
                        listarSocios();
                        break;
                    }
                    case "2": {
                        listarLibros();
                        break;
                    }
                    case "3": {
                        listarPrestamos();
                        break;
                    }
                    case "4": {
                        altaSocio();
                        break;
                    }
                    case "5": {
                        bajaSocio();
                        break;
                    }
                    case "6": {
                        registrarLibro();
                        break;
                    } 
                    case "7": {
                        prestarLibro();
                        break;
                    }
                }

            } catch (Exception ex) {
                System.out.println("ERROR: Ocurrió algún tipo de error.");
                opcion = "";
            }
        }
    }

    private static void configurarBiblioteca() {
        Domicilio domicilioBiblioteca = new Domicilio("Arturo Prat", "S/N");
        Administrativo encargado = new Administrativo("Alvaro", "Gajardo", "Becerra");
        biblioteca = new Biblioteca(domicilioBiblioteca, encargado);
        generos = new ArrayList<>();
        autores = new ArrayList<>();
        editoriales = new ArrayList<>();

        generos.add(new Genero("Ciencia Ficción"));
        generos.add(new Genero("Filosofía"));
        generos.add(new Genero("Informática"));
        generos.add(new Genero("Matemáticas"));
        generos.add(new Genero("Física"));

        autores.add(new Autor("Albert", "Einstein", null, null));
        autores.add(new Autor("Platón", null, null, null));
        autores.add(new Autor("Alan", "Turing", null, null));
        autores.add(new Autor("Isaac", "Newton", null, null));
        autores.add(new Autor("Isaac", "Asimov", null, null));
        
        editoriales.add(new Editorial("Editorial Planeta"));
        editoriales.add(new Editorial("Editorial Catalonia"));
    }

    private static void listarAutores() {
        System.out.println("================================");
        System.out.println("LISTA DE AUTORES");
        System.out.println("================================");

        for (Autor a : autores) {
            System.out.println(a.toString());
        }

        System.out.println();
    }
    
    private static void listaGeneros() {
        System.out.println("================================");
        System.out.println("LISTA DE GENEROS");
        System.out.println("================================");

        for (Genero g : generos) {
            System.out.println(g.toString());
        }

        System.out.println();
    }
    
    private static void listaEditoriales() {
        System.out.println("================================");
        System.out.println("LISTA DE EDITORIALES");
        System.out.println("================================");

        for (Editorial e : editoriales) {
            System.out.println(e.toString());
        }

        System.out.println();
    }

    public static void printMenu() {
        System.out.println("================================");
        System.out.println("MENU PRINCIPAL BIBLIOTECA");
        System.out.println("================================");
        System.out.println("0. Salir");
        System.out.println("1. Listar Socios");
        System.out.println("2. Listar Libros");
        System.out.println("3. Listar Préstamos");
        System.out.println("4. Dar de alta Socio");
        System.out.println("5. Dar de baja Socio");
        System.out.println("6. Registrar Libro");
        System.out.println("7. Prestar Libro");
        System.out.println("8. Devolver Libro");
    }

    private static String getString(String cadena) {
        String data;
        Scanner scanner = new Scanner(System.in);
        System.out.print(cadena);
        data = scanner.nextLine();

        return data;
    }

    private static void listarSocios() {
        List<Socio> listaSocios;

        System.out.println("================================");
        System.out.println("LISTA DE SOCIOS");
        System.out.println("================================");

        listaSocios = biblioteca.getSocios();
        for (Socio s : listaSocios) {
            System.out.println(s.toString());
        }

        System.out.println();
    }

    private static void listarLibros() {
        List<Libro> listaLibros;

        System.out.println("================================");
        System.out.println("LISTA DE LIBROS");
        System.out.println("================================");

        listaLibros = biblioteca.getLibrosBiblioteca();
        for (Libro l : listaLibros) {
            System.out.println(l.toString());
        }

        System.out.println();
    }

    private static void listarPrestamos() {
        List<Prestamo> listaPrestamos;

        System.out.println("================================");
        System.out.println("LISTA DE PRESTAMOS");
        System.out.println("================================");

        listaPrestamos = biblioteca.getLibrosPrestados();
        for (Prestamo p : listaPrestamos) {
            System.out.println(p.toString());
        }

        System.out.println();
    }

    private static void altaSocio() {
        Socio nuevoSocio;
        String nombres;
        String apellidoPaterno;
        String apellidoMaterno;
        String calle, numero, departamento, bloque;
        Boolean alta = false;

        try {
            System.out.println("================================");
            System.out.println("INFORMACION SOCIO");
            System.out.println("================================");
            nombres = getString("NOMBRES : ");
            apellidoPaterno = getString("APELLIDO PATERNO : ");
            apellidoMaterno = getString("APELLIDO MATERNO : ");
            calle = getString("CALLE : ");
            numero = getString("NUMERO : ");
            departamento = getString("DEPARTAMENTO : ");
            bloque = getString("BLOQUE : ");

            nuevoSocio = new Socio(Boolean.TRUE, nombres, apellidoPaterno, apellidoMaterno);
            nuevoSocio.setDomicilio(new Domicilio(calle, numero, departamento, bloque));

            biblioteca.registrarSocio(nuevoSocio);

            alta = true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (alta) {
                System.out.println("SOCIO REGISTRADO CON EXITO.");
            } else {
                System.out.println("SOCIO REGISTRADO SIN EXITO.");
            }
        }
    }

    private static void bajaSocio() {
        Boolean baja = false;
        String codSocio;
        List<Socio> listaSocios;
        try {
            listarSocios();
            listaSocios = biblioteca.getSocios();
            codSocio = getString("CODIGO SOCIO : ");
            biblioteca.removerSocio(listaSocios.get(Integer.parseInt(codSocio) - 1));

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (baja) {
                System.out.println("SOCIO REGISTRADO CON EXITO.");
            } else {
                System.out.println("SOCIO REGISTRADO SIN EXITO.");
            }
        }
    }

    private static void registrarLibro() {
        Boolean exito = false;
        String codAutor, codGenero, codEditorial;
        String titulo;
        Date fechaPublicacion;
        Integer cantidadLibros;
        Libro libro;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            listarLibros();
            System.out.println("================================");
            System.out.println("REGISTRAR LIBRO");
            System.out.println("================================");
            listarAutores();
            codAutor = getString("SELECCIONE AUTOR : ");
            System.out.println("================================");
            listaGeneros();
            codGenero = getString("SELECCIONE GENERO : ");
            System.out.println("================================");
            listaEditoriales();
            codEditorial = getString("SELECCIONE EDITORIAL : ");
            System.out.println("================================");
            System.out.println("INFORMACION LIBRO");
            System.out.println("================================");
            titulo = getString("TITULO : ");
            fechaPublicacion = formato.parse(getString("FECHA PUBLICACION (dd/MM/yyyy) : "));
            cantidadLibros = Integer.parseInt(getString("STOCK INICIAL : "));
            libro = new Libro(titulo, autores.get(Integer.parseInt(codAutor)-1), 
                                        generos.get(Integer.parseInt(codGenero)-1), 
                                        editoriales.get(Integer.parseInt(codEditorial)-1), 
                                        fechaPublicacion, 
                                        cantidadLibros);
            
            biblioteca.registrarLibro(libro);
            exito = true;
        } catch (Exception ex) {
            System.out.println("ERROR: OCURRIO UN ERROR AL REGISTRAR LIBRO.");
        } finally {
            if (exito) {
                System.out.println("LIBRO REGISTRADO CON EXITO.");
            } else {
                System.out.println("LIBRO REGISTRADO SIN EXITO.");
            }
        }
    }

    private static void prestarLibro() {
        Boolean exito = false;
        String codLibro, codSocio;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            listarLibros();
            System.out.println("================================");
            System.out.println("PRESTAMO LIBRO");
            System.out.println("================================");
            listarAutores();
            
            exito = true;
        } catch (Exception ex) {
            System.out.println("ERROR: OCURRIO UN ERROR AL REGISTRAR SOCIO.");
        } finally {
            if (exito) {
                System.out.println("SOCIO REGISTRADO CON EXITO.");
            } else {
                System.out.println("SOCIO REGISTRADO SIN EXITO.");
            }
        }
    }
}
