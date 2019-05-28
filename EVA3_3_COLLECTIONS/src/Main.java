
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

/*
 * Usando collections para pilas, colas y conjuntos
 */

/**
 *
 * @author Karla Pamela cardenas Leyva 18550338
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Stack<Integer> stPila = new Stack();
        stPila.push(100);
        stPila.push(200);
        stPila.push(300);
        stPila.push(400);
        stPila.push(500);
        System.out.println("-------STACK------");
        System.out.println(stPila);
        System.out.println(stPila.peek());
        System.out.println(stPila);
        System.out.println(stPila.pop());
        System.out.println(stPila);
        
        
        
        //COLAS - QUEUE
        Queue<Integer> qCola = new LinkedList();
        qCola.add(100);
        qCola.add(200);
        qCola.add(300);
        qCola.add(400);
        qCola.add(500);
        System.out.println("--------QUEUE---------");
        System.out.println(qCola);
        System.out.println(qCola.peek());
        System.out.println(qCola);
        System.out.println(qCola.poll());
        System.out.println(qCola);
        
        
        //SETS - CONJUNTOS  --> NO HAY ELEMENTOS REPETIDOS
        Set<Integer> stMiConjunto = new LinkedHashSet<>();
        stMiConjunto.add(100);
        stMiConjunto.add(200);
        stMiConjunto.add(300);
        stMiConjunto.add(400);
        stMiConjunto.add(100);
        stMiConjunto.add(200);
        System.out.println("------- SET---------");
        System.out.println(stMiConjunto);
    }
    
}
