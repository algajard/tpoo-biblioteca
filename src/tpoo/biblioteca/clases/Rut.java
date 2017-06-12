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
public class Rut {

    private Integer rut;
    private String dv;

    public Rut(Integer rut, String dv) {
        this.rut = rut;
        this.dv = dv;
    }

    public Integer getRut() {
        return rut;
    }

    public void setRut(Integer rut) {
        this.rut = rut;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }
    
    public Boolean validar() {
        Boolean rutValido = false;
        Integer multiplicador = 2;
        Integer suma = 0;
        Integer rut = getRut();
        Integer digito;
        
        for(int i=0; rut>0; i++) {
            digito = rut % 10;
            suma += multiplicador * digito;
            rut = rut / 10;
            multiplicador = (multiplicador>7)?(2):(multiplicador+1);
        }
        
        suma = 11-(suma%11);
        
        if(!rutValido && getDv().equalsIgnoreCase(String.valueOf(suma))) {
            rutValido = true;
        }
        
        if(!rutValido && getDv().equalsIgnoreCase("k") && suma==10) {
            rutValido = true;
        }
        
        if(!rutValido && getDv().equalsIgnoreCase("0") && suma==1) {
            rutValido = true;
        }
        
        return rutValido;
    }
    
    
}
