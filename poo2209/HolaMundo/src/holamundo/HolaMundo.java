/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.awt.Color;
import poo.conceptos.basicos.Automovil;

/**
 *
 * @author Migue
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo java");
        Persona per1= new Persona();
        per1.setNombre("Miguel ZM");
        System.out.println("nombre:"+ per1.getNombre() );
           per1.comer("Hamburguesa doble");
        Persona per2= new Persona();
            per2.setNombre("Felipe");
            System.out.println("Nombre per 2:" + per2.getNombre());
            per2.comer("Pizza de tres carnes"); 
            
            
             
            Automovil bocho=new Automovil();
            System.out.println("El automovil es un bocho");
            bocho.setMarca("VW");
            System.out.println("Marca: " + bocho.getMarca() );
            bocho.setSubMarca("Sedan");
            System.out.println("SubMarca: " + bocho.getSubMarca());
            bocho.setModelo(1970);
            System.out.println("Modelo: " + bocho.getModelo());
            bocho.setColor(Color.blue);
            System.out.println("Color:" + bocho.getColor());
            
            Automovil miAkuma=new Automovil();
            System.out.println("El automovil es un Akura");
            miAkuma.setMarca("Akura");
            System.out.println("Marca: " + miAkuma.getMarca());
            miAkuma.setSubMarca("NSX");
            System.out.println("SubMarca: " + miAkuma.getSubMarca());
            miAkuma.setModelo(2013);
            System.out.println("Modelo: " + miAkuma.getModelo());
            miAkuma.setColor(Color.GRAY);
            System.out.println("Color: " + miAkuma.getColor());
            
            Automovil miMustang=new Automovil();
            System.out.println("El automovil es un Mustang");
            miMustang.setMarca("Ford");
            System.out.println("Marca: " + miMustang.getMarca());
            miMustang.setSubMarca("Mustang");
            System.out.println("SubMarca: " +miMustang);
            miMustang.setModelo(2010);
            System.out.println("Modelo: " + miMustang.getMarca());
            miMustang.setColor(Color.yellow);
            System.out.println("Color: " + miMustang.getColor());
            
            
            
            
            
            
            
            
            
                   
            
            
       
}
        }
