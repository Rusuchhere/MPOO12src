/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop12;

/**
 * Clase Alumno que se implementara en main 
 * @author Duque Rafael
 */
public class Alumno {
    private String nombre,apPaterno,apMaterno;
    private int edad, numCuenta;

    /**
     * Constructor vacío
     */
    public Alumno() {
    }

    /**
     * Constructor inicializado
     * @param nombre
     * @param apPaterno
     * @param apMaterno
     * @param edad
     * @param numCuenta 
     */
    public Alumno(String nombre, String apPaterno, String apMaterno, int edad, int numCuenta) {
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.edad = edad;
        this.numCuenta = numCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
    
    
}
