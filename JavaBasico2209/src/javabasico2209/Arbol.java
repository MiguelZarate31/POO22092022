/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico2209;

/**
 *
 * @author Migue
 */
public class Arbol {
    private float Altura;
    private int edad;
    public static final int tronco = 1;

    public Arbol() {
    }

    public Arbol(float Altura, int edad) {
        this.Altura = Altura;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }

    @Override
    public String toString() {
        return "Arbol{" + "Altura=" + Altura + ", edad=" + edad + '}';
    }
    public void crecer(float crecimiento){
        System.out.println("altura actual" + this.Altura);
        this.Altura += crecimiento;
        System.out.println("altura posterior" + this.Altura);
    }
    }

