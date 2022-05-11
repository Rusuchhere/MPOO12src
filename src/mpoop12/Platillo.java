/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop12;

/**
 *Clase platillo para implemenrtar los datos
 * de nombre precio e ingredientes en la clase main
 * @author Duque Rafael
 */
public class Platillo {
    /**
     * Atributos de la clase
     */
    private String nombre;
    private double precio;
    private String ingredientes;
    /**
     * Constructor vacío
     */
    public Platillo() {
    }
    
    /**
     * Constructor inicializado con las variables
     * @param nombre
     * @param precio
     * @param ingredientes 
     */
    public Platillo(String nombre, double precio, String ingredientes) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    
    
    
}
