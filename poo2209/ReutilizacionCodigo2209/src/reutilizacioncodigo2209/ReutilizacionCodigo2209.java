/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizacioncodigo2209;

import asus.com.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;
import ico.fes.herencia.Alumno;
import javax.swing.JFrame;

/**
 *
 * @author Migue
 */
public class ReutilizacionCodigo2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre=new String("José José");
        System.out.println( nombre );
        System.out.println( nombre.charAt(5));
        System.out.println(nombre.toUpperCase());
        
        
        Computadora miCompu=new Computadora();
        miCompu.setMarca("Asus");
        System.out.println( miCompu);
        miCompu.setCpu(new Procesador("Intel", 2.6f));
        System.out.println(miCompu);
        miCompu.getCpu().setMarca("AMD");
        System.out.println(miCompu);
        //Ejercicio: Establecer un mouse marca logitech del tipo optico
        miCompu.setRaton(new Mouse("Logitech", "Óptico"));
        System.out.println( miCompu );
        
        Computadora compu2=new Computadora("Apple", "MacBook pro",
                new Monitor("Toshiba", 14.3f),
                new Mouse("Acteck", "optico"),
                new Teclado("Apple", 101),
                new Procesador("M1", 3.4f));
        
        System.out.println(compu2);
        
        compu2.setRaton(new Mouse("apple", "Tocuh"));
        System.out.println(compu2);
        
        System.out.println("---------------");
        Alumno alu1=new Alumno();
        alu1.setNombre("Jose");
        System.out.println(alu1);
        
        Alumno alu2=new Alumno("123456", "ICO", "Jose Perez", 19);
        System.out.println(alu2);
        
        
    }
    
}