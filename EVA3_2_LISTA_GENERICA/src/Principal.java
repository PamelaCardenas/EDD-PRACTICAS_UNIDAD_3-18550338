/*
 * Aprender a usar datos genericos en listas
 */

/**
 *
 * @author Karla Pamela Cardenas Leyva 18550338
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Lista<String> miLista = new Lista();
        
        miLista.agregarNodo("Hola");
        miLista.agregarNodo(" ");
        miLista.agregarNodo("Mundo");
        miLista.agregarNodo(" ");
        miLista.agregarNodo("Cruel");
        miLista.agregarNodo("!!");
        
        miLista.imprimir();
    }
    
}

//TIPOS DE DATOS GENERICOS
class Nodo <T>{
    
    private T dato;
    //ATRIBUTO PARA CREAR LA LISTA (REFERENCIAS)
    private Nodo sig;

    public Nodo() {
        this.sig = null;
    }
  

    public Nodo(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}

class Lista <T>{
    
    private Nodo inicio;
    private Nodo fin;
    private int iContNodos = 0;

    
    public Lista() {
        inicio = null;
        fin = null;
    }
    
    
    public void agregarNodo(T dato){
        Nodo<T> nNuevo = new Nodo(dato);
        //VERIFICAR EL ESTADO DE LA LISTA
        //ESTA VACIA?
        if(inicio == null){
            inicio = nNuevo;
            fin = nNuevo; //MODIFICADO --> EFICIENCIA
        }
        
        //LISTA CON UN NODO
        else{
            //LLEVAR nTemp AL FINAL DE LA LISTA
            /*Nodo nTemp = inicio;
            while(nTemp.getSig() != null){
                nTemp = nTemp.getSig();
                
            }
            //CONECTAMOS NTEMP.SG --> NUEVO
            nTemp.setSig(nNuevo);
                    */
            fin.setSig(nNuevo);
            fin = nNuevo;
            iContNodos++;
            
            
        }
    }
        
        //EFICIENCIA O(N)
    public void imprimir(){
        //LLEVAR AL FINAL DE LA LISTA
        Nodo nTemp = inicio;
            while(nTemp != null){
                System.out.print("[" + nTemp.getDato() + "]");
                nTemp = nTemp.getSig();
            }
            System.out.println("");
    }
}