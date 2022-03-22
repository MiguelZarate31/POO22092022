/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

/**
 *
 * @author Migue
 */
public class Editorial {
    private String Nombre;
    private int AñoFundacion;

    public Editorial() {
    }

    public Editorial(String Nombre, int AñoFundacion) {
        this.Nombre = Nombre;
        this.AñoFundacion = AñoFundacion;
    }

    public int getAñoFundacion() {
        return AñoFundacion;
    }

    public void setAñoFundacion(int AñoFundacion) {
        this.AñoFundacion = AñoFundacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Editorial{" + "Nombre=" + Nombre + ", A\u00f1oFundacion=" + AñoFundacion + '}';
    }
    
    
    
    
}
