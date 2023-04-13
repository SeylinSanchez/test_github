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
public class DetalleFactura {
    
    int cantidad;
    Producto producto;

    public DetalleFactura() {
    }

    public DetalleFactura(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    public int calcularPrecio () {
    
    int precioT= producto.precio * cantidad;
        return precioT;
        
    }
    
    @Override
    public String toString() {
        return "DetalleFactura{" + "cantidad=" + cantidad + ", producto=" + producto + '}';
    }
    
    
    
}
