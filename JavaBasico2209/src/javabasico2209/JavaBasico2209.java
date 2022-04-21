/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209;

import javax.swing.JOptionPane;

/**
 *
 * @author Migue
 */
public class JavaBasico2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad=20;
        System.out.println("Edad= " + edad);
        Integer edad2=new Integer(22);
        System.out.println(edad2);
        double x=edad2.doubleValue();
        System.out.println(x);
        System.out.println(edad2.shortValue());
        System.out.println("-----------");
        String cadena= "99";
        int altura= Integer.parseInt(cadena);
        altura +=1;
        System.out.println("Altura= " + altura);
        
        float y= Float.parseFloat(cadena);
        y=y + 0.5f;
        System.out.println("Altura = " + y );
        
        Arbol tree1 = new Arbol(2.4f, 15);
        System.out.println(tree1);
        
        System.out.println ("Troncos de un arbol = " + Arbol.tronco );
        /*
        JOptionPane.showMessageDialog(null, "Hola Mundo", "Aqui va el titulo", JOptionPane.INFORMATION_MESSAGE);
        */
       
    
        int val1=1;
        int val2=2;
        
        System.out.println(val1 | val2);
        
        int val3=1;
        int val4 = 0;
        val4 = val3 << 1;
        
        System.out.println(val4);
        
        System.out.println("----Arreglos----");
        int[] edades;
        edades = new int[5];
        System.out.println(edades);
        edades[0]=10;
        System.out.println("La primer edad es:" + edades[0]);
        
        int [] estaturas = new int [5];
        
        int [] pesos = {86,99,56,76,77};
        
        System.out.println( pesos[0] );
        System.out.println( pesos[1] );
        System.out.println( pesos[2] );
        System.out.println( pesos[3] );
        System.out.println( pesos[4] );
        
        System.out.println("---con FOR---");
        for(int i = 0; i < pesos.length; i++){
            System.out.println( pesos[i]);
            
            System.out.println("---Inversamente---");
        
       
            System.out.println("Arreglo de alumnos");
            Alumno[] lista = new Alumno[5];//5 alumnos
            lista[0] = new Alumno("9999", 2, 9.0f);
            lista[1] = new Alumno("7777", 2, 7.0f);
            lista[2] = new Alumno("5555", 2, 7.0f);
            lista[3] = new Alumno("8888", 2, 8.0f);
            lista[4] = new Alumno("6666", 2, 6.0f);
            
            for (int j = 0; j < lista.length; j++) {
                Alumno alumno = lista[j];
                System.out.println(alumno.evaluarDesempeño());
                /*For each es un FOR especial, introducido en
                la version 2 de java, esa version sufrio
                cambios muy grandes
                */
            }
       
        }
    }
        
        
                
        
                
    }        
       
        
                
    

