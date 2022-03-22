/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author Migue
 */
public class Foco {
    private String Color;
    private String Tipo;
    private int Tamano;

    public Foco() {
    }

    public Foco(String Color, String Tipo, int Tamano) {
        this.Color = Color;
        this.Tipo = Tipo;
        this.Tamano = Tamano;
    }

    public int getTamano() {
        return Tamano;
    }

    public void setTamano(int Tamano) {
        this.Tamano = Tamano;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return "Foco{" + "Color=" + Color + ", Tipo=" + Tipo + ", Tamano=" + Tamano + '}';
    }
    
    
    
}
