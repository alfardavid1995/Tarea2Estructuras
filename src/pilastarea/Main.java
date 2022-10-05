package pilastarea;
/*David Alfaro
  Alejandro Méndez
  Mariana Alvarez
  Gustavo Marin
*/

public class Main {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Pila miPila = new Pila();
        Traste trastecito = new Traste();
        
        trastecito = new Traste("vaso", 3);  
        miPila.push(trastecito);
        System.out.println("AGREGA EL PRIMER ELEMENTO");
        miPila.listar();
        
        trastecito = new Traste("plato", 2);  
        miPila.push(trastecito);
        System.out.println("AGREGA EL SEGUNDO ELEMENTO");
        miPila.listar();
        
        
        trastecito = new Traste("plato", 0);  
        miPila.push(trastecito);
        System.out.println("AGREGA EL TERCER ELEMENTO");
        miPila.listar();
        
    }
    
}
