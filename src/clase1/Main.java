
package clase1;

import java.awt.Component;



public class Main {
    
    public static void SUMAREDAD(Persona persona){
    persona.setEdad(persona.getEdad() +1);
    
    }  
    
    public static void main(String[] args) {
        
            
    Persona pr1 = new  Persona(1, "alex","El Oro",40);
    
        pr1.setCodigo(1);
        pr1.setEdad(25);
        pr1.setNombre("Alex");
        pr1.setLocalizacion("machala");

  Persona pr2  = new Persona(2, "mercedes", "Quito", 67);
  
  Persona pr3  = new Persona(23, 3
  );
  
  
  Persona pr4 = pr1;
  pr2=pr4;
  pr4.setEdad(16);
  
  
  
        SUMAREDAD(pr1);
        SUMAREDAD(pr4);
        SUMAREDAD(pr2);
        
        System.out.println("Los datos son " +pr1);


     
     Persona [] personas = new Persona[3];
     personas[1] = pr2;
     personas[2] =pr1;
     personas[0]= pr2;
     
     personas [2].setEdad(12);
     for (int i=0;i<personas.length;i++){
         System.out.println(personas [i]);
     }
             

    }
    
}
