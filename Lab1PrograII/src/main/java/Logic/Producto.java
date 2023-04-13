/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author seylinsanchez
 */
public class Producto {
    
    int codigo;
    String nombre;
    int precio;
    int ultimoID;

    public Producto() {
    }

    public Producto(int codigo, String nombre, int precio, int ultimoID) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.ultimoID = ultimoID;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getUltimoID() {
        return ultimoID;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setUltimoID(int ultimoID) {
        this.ultimoID = ultimoID;
    }

    @Override
    public String toString() {
        return "Info Producto: \n"+" Codigo: "+codigo+" \n Nombre: "+nombre+" \n Precio: "+precio+" \n ID: "+ultimoID;
    }
    
    
}
