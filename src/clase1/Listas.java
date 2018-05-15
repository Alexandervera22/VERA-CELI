

// Alumnos Michael Vera  Celi y Nelson Vera Pita
package clase1;

import java.util.List;
import java.util.ArrayList;
import static java.util.Collections.list;




public class Listas {
    
    
public  static void main (String args[]){

    Persona pr1 = new  Persona(1, "alex","manta",48);
      Persona pr2 = new  Persona(2, "alex","loja",67);
            Persona pr3 = new  Persona(3, "alex", "Guayaquil",45);
        pr1.setEdad(18);
        pr1.setCodigo(1);
        pr1.setNombre("Alex");
        pr1.setLocalizacion("manta");
        

        List <Persona> personas = new ArrayList<>();
//list <Persona> personas = new Arraylist<>();

personas.add(pr1);
personas.add(pr2);
personas.add(pr3);
System.out.print("SIZE" + personas.size());


for (int i=0;1<personas.size();i++){

System.out.print(i+ ";"  +personas);
}


    System.out.println();
    int edades=0;
    for(Persona  persona :personas){
    edades += persona.getEdad();
        System.out.println(persona);
    
    }

    System.out.println("EDAD TOTAL" +edades);
}


}