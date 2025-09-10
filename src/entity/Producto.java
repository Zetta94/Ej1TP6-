/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Manuel Zuniga
 */
public class Producto {

    private final int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    private String rubro;

    public Producto(int codigo, String descripcion, double precio, int stock, String rubro) {
        if (codigo <= 0) {
            throw new IllegalArgumentException("El código debe ser > 0");
        }
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }
    
    @Override
    public String toString() {
        return "Product{"
                + "codigo=" + codigo
                + ", descripcion='" + descripcion + '\''
                + ", precio=" + precio
                + ", stock=" + stock
                + ", rubro='" + rubro + '\''
                + '}';
    }
    
    
}
