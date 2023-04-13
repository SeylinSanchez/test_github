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
public class Main {
    
    public static void main(String[] args) {
       
    Cliente cliente1 = new Cliente("Sandra", "Elizondo", "sad@gmail.com", 123); 
        System.out.println(cliente1.toString());
        
    Producto producto1 = new Producto(001, "Libro", 2000, 1);
        System.out.println(producto1.toString());
        
    DetalleFactura detFact= new DetalleFactura(10, producto1);
    }       
    
}
