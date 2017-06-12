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
public class Genero {
    
    private static Integer ultimoCodigo;
    private Integer codigo;
    private String categoria;

    public Genero(String categoria) {
        this.categoria = categoria;
        this.codigo = getUltimoCodigo() + 1;
        ultimoCodigo++;
    }

    public static Integer getUltimoCodigo() {
        if(ultimoCodigo==null) {
            ultimoCodigo = 0;
        }
        
        return ultimoCodigo;
    }
    
    public Integer getCodigo() {
        return codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    
    public void setCategoria(String Categoria) {
        this.categoria = Categoria;
    }
    
    public Boolean equals(Genero g) {
        return Objects.equals(g.getCodigo(), getCodigo());
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        builder.append("Cod. Categoría : ").append(getCodigo());
        builder.append(" - Categoría : ").append(getCategoria());
        
        return builder.toString();
    }
}
