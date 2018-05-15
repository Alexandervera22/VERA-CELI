
package clase1;

import java.util.List;
import java.util.Scanner;
public class MainRepositorio {
  
    public static void main(String[] args) {
        PersonaRepository repository = new PersonaRepository();
    
    int op;
    
  
        System.out.println("MENU DE OPCIONES ");
        System.out.println("1.- Agregar Persona");
        System.out.println("2.- Mostrar Lista");
        System.out.println("3.- Buscar por codigo");
        System.out.println("4.- BUuscar por Rango de Edades");
        System.out.println("5.- Buscar por Filtro");
        System.out.println("Salir");
        
        do {
        Scanner lectura = new Scanner(System.in);
        
        op=lectura.nextInt();
        
            switch (op ){
                case 1:
                    System.out.println("Agregar Persona");
                    Persona pr4 = new Persona(4, "juan", "milagro", 29);
                    repository.Agregar(pr4);
                    break;
                case 2:
                    System.out.println("Mostrar Lista");
                  
                    for(Persona personas :repository.getPersonas()){
                        System.out.println("" +personas);}
                      
                    break ;
                    
                case 3: 
                    System.out.println("Buscar Por Codigo");
                    System.out.println();
                    Persona result = repository.getPersona(4);
                    System.out.println(result);
                    break;
                case 4:
                    System.out.println("Buscar Por rango");
                    for (Persona personas: repository.getPorRangoEdad(2, 40))
                        System.out.println("" +personas);
                    
                    break;
                case 5:
                    System.out.println("Buscar Por filtro");
                    String Filtro="e";
                    System.out.println("");
                    List<Persona> ListFilter= repository.getPorNombre(Filtro);
                    System.out.println(ListFilter);
                    break;
                case 6:
                    System.out.println("Salir");
                    
                            }
        } while (op <6);//DOWHILE PRINCIPAL
    
}
}