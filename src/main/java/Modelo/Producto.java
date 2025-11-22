
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Objects;

public class Producto {

    private String nombre;
    private double precio;            
    private int cantidad;            
    private String sku;                
    private String categoria;          
    private boolean esActivo = true;    
    private boolean descuentoAplicable; 

    public Producto(String nombre,
                    double precio,
                    int cantidad,
                    String sku,
                    String categoria,
                    boolean esActivo,
                    boolean descuentoAplicable) {

        setNombre(nombre);
        setPrecio(precio);
        setCantidad(cantidad);
        setSku(sku);
        setCategoria(categoria);
        this.esActivo = esActivo;
        this.descuentoAplicable = descuentoAplicable;
    }

    public Producto(String nombre, double precio, int cantidad, String sku) {
        this(nombre, precio, cantidad, sku, null, true, false);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo/vacío.");
        }
        this.nombre = nombre.trim();
    }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio debe ser >= 0.");
        }
        this.precio = precio;
    }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad debe ser >= 0.");
        }
        this.cantidad = cantidad;
    }

    public String getSku() { return sku; }
    public void setSku(String sku) {
        if (sku == null || sku.trim().isEmpty()) {
            throw new IllegalArgumentException("El SKU no puede ser nulo/vacío.");
        }
        this.sku = sku.trim();
    }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) {
        this.categoria = (categoria == null) ? null : categoria.trim();
    }

    public boolean isEsActivo() { return esActivo; }
    public void setEsActivo(boolean esActivo) { this.esActivo = esActivo; }

    public boolean isDescuentoAplicable() { return descuentoAplicable; }
    public void setDescuentoAplicable(boolean descuentoAplicable) { this.descuentoAplicable = descuentoAplicable; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;
        Producto producto = (Producto) o;
        return Objects.equals(sku, producto.sku);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sku);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", sku='" + sku + '\'' +
                ", categoria='" + categoria + '\'' +
                ", esActivo=" + esActivo +
                ", descuentoAplicable=" + descuentoAplicable +
                '}';
    }
}
