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
public class Cliente {
    
    String nombre;
    String apellido;
    String correo;
    int nif; 

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String correo, int nif) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public int getNif() {
        return nif;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Info de cliente: \n"+" Nombre: "+nombre+"\n Apellido: "+apellido+"\n Correo: "+ correo + "\n NIF: "+ nif;
    }
 
}
