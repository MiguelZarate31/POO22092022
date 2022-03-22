/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

import java.awt.Color;

/**
 *
 * @author Migue
 */
public class Automovil {
    private String Marca;  //Los atributos van en notacion lower camel case
    private String subMarca; //Lowe camer case todas en minusculas y apartir de la
                        //segunda palabra es mayuscula 
    private int Modelo;
    private Color color;

    public Automovil() {
    }

    public Automovil(String Marca, String subMarca, int Modelo, Color color) {
        this.Marca = Marca;
        this.subMarca = subMarca;
        this.Modelo = Modelo;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }

    @Override
    public String toString() {
        return "Automovil{" + "Marca=" + Marca + ", subMarca=" + subMarca + ", Modelo=" + Modelo + ", color=" + color + '}';
    }
    
    
}
