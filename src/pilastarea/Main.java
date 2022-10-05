/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilastarea;

/**
 *
 * @author David Alfaro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
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
        
        
        
        /*System.out.println("PILA ANTES DEL POP");
        miPila.listar();
        
        miPila.pop();
        
        System.out.println("PILA DESPUES DE UN POP");
        miPila.listar();
        
        
        //miPila.popModificado(89);
        System.out.println("PILA DESPUES DE UN DELETE A LA REFERENCIA 89");
        miPila.listar();
        */
    }
    
}
