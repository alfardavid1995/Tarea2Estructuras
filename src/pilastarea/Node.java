package pilastarea;

public class Node {
    private Traste trasteNodo;
    private Node siguiente;
    
    //constructor para inicializar

    public Node() {
        this.trasteNodo = null;
        this.siguiente = null;
    }

    public Traste getTrasteNodo() {
        return trasteNodo;
    }

    public void setTrasteNodo(Traste trastecitoNodo) {
        this.trasteNodo = trastecitoNodo;
    }

    public Node getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Node siguiente) {
        this.siguiente = siguiente;
    }
}
