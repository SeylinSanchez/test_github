/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.Date;

/**
 *
 * @author seylinsanchez
 */
public class Factura {
    
    int id;
    String descripcion;
    Date fecha;
    Cliente cliente;
    DetalleFactura[] detFact;
    int indiceProdcutos;
    int MAX_ITEMS;
    int ultimoProducto;

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public DetalleFactura[] getDetFact() {
        return detFact;
    }

    public int getIndiceProdcutos() {
        return indiceProdcutos;
    }

    public int getMAX_ITEMS() {
        return MAX_ITEMS;
    }

    public int getUltimoProducto() {
        return ultimoProducto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setDetFact(DetalleFactura[] detFact) {
        this.detFact = detFact;
    }

    public void setIndiceProdcutos(int indiceProdcutos) {
        this.indiceProdcutos = indiceProdcutos;
    }

    public void setMAX_ITEMS(int MAX_ITEMS) {
        this.MAX_ITEMS = MAX_ITEMS;
    }

    public void setUltimoProducto(int ultimoProducto) {
        this.ultimoProducto = ultimoProducto;
    }
    
    public void nuevoItemFactura(){
    int count=0;
    
    
    }
    
    public void calcularTotal(){
    
    
    }
    
    public void generarFactura(){
    
    
    }
    
}
