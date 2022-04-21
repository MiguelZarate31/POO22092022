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
    private String paisOrigen;

    public Editorial() {
    }

    public Editorial(String Nombre, String paisOrigen) {
        this.Nombre = Nombre;
        this.paisOrigen = paisOrigen;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Editorial{" + "Nombre=" + Nombre + ", paisOrigen=" + paisOrigen + '}';
    }
    
    
    
    
}
