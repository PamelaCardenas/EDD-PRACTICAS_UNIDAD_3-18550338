
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Utilizando iterators en listas 
 */

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> alDatos = new ArrayList();
        alDatos.add(100);
        alDatos.add(200);
        alDatos.add(300);
        alDatos.add(400);
        alDatos.add(500);
        
        //IMPRIMIR CADA DATO
        for (int i = 0; i < alDatos.size(); i++) {
            System.out.print("[" + alDatos.get(i) + "]");
        }
        
        System.out.println("\nUSANDO ITERATOR");
        for (Iterator<Integer> iterator = alDatos.iterator(); iterator.hasNext();) {
            Integer next = iterator.next();
            System.out.print("[" + next + "]");
        }
        
        System.out.println("\nUSANDO ITERATOR");
        Iterator itMiItera = alDatos.iterator();
        while(itMiItera.hasNext()){
            System.out.print("[" + itMiItera.next() + "]");
        }
    }
    
}
