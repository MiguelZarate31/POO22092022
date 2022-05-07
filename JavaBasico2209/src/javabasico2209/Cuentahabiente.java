/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico2209;

/**
 *
 * @author Migue
 */
public class Cuentahabiente {
    
    private int idCliente;
    private String nombre;
    private int balance;

    public Cuentahabiente() {
    }

    public Cuentahabiente(int idCliente, String nombre, int balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cuentahabiente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", balance=" + balance + '}';
    }
    public void retitarDinero(float monto){
        /*Dependiendo el balance debe regresar un
        String con una de estas dos opciones:
            1."Cliente regular" si es menor o igual a 50
            2."Cliente premium" si es mayor a 50 mil
        */
        
    }  
}
    
    


