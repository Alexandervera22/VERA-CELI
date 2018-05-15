
package clase1;

import java.awt.Component;
import javax.swing.JOptionPane;


public class Persona {
 private int Codigo;
private String Nombre;
private String Localizacion;
private int edad;


    public Persona() {
    }

    public Persona(int edad) {
        this.edad = edad;
    }

    public Persona(int edad, int Codigo) {
        this.edad = edad;
        this.Codigo = Codigo;
    }

    public Persona(int Codigo, String Nombre, String Localizacion, int edad) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Localizacion = Localizacion;
        this.edad = edad;
    }

    
    
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getLocalizacion() {
        return Localizacion;
    }

    public void setLocalizacion(String Localizacion) {
        this.Localizacion = Localizacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "Codigo=" + Codigo + ", Nombre=" + Nombre + ", Localizacion=" + Localizacion + ", edad=" + edad + '}';
    }

                                                                 
    

}
