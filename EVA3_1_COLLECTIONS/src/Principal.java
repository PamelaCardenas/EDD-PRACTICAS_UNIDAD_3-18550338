
import java.util.ArrayList;
import java.util.LinkedList;

/*
 * Aprendiendo a usar Collections  
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
        int iVal = 0;
        Integer iValObj = 10;
        iValObj = iValObj + iVal;
        
        ArrayList <Double> alMiArrayList = new ArrayList();
        
        alMiArrayList.add(7.0);
        alMiArrayList.add(3.1416);
        alMiArrayList.add(46.23);
        alMiArrayList.add(344.34);
        //alMiArrayList.add("");
        
        for (int i = 0; i < alMiArrayList.size(); i++) {
            System.out.println("[" + alMiArrayList.get(i) + "]");
        }
        
        
        /*
        alMiArrayList.add("Hola mundo");
        alMiArrayList.add(7.0);
        alMiArrayList.add(true);
        alMiArrayList.get(0);
        */
        
        LinkedList<Integer> MiListaEnlazada = new LinkedList();
        
        MiListaEnlazada.add(10);
        MiListaEnlazada.add(20);
        MiListaEnlazada.add(30);
        MiListaEnlazada.add(40);
        MiListaEnlazada.add(50);
        System.out.println("Mi lista enlazada: ");
        System.out.println(MiListaEnlazada);
        
        for (int i = 0; i < MiListaEnlazada.size(); i++) {
            System.out.println(MiListaEnlazada.get(i));
        }
        
        MiListaEnlazada.remove(3);
        System.out.println(MiListaEnlazada);
    }
    
}
