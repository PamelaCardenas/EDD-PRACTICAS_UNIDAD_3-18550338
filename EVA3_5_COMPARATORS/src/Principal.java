
import java.util.Comparator;
import java.util.LinkedList;

/*
 * Empleo de comparator usando enteros
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
        
        //COMPARATOR --> MECANISMO DE ORDENAMIENTO
        //Devuelve un valor para establecer la comparacion
        //A vs B
        //Entero --> Positivo cero negativo
        /*
        A VS B > 0 -->  A > B   +
        A VS B = 0 -->  A = B   0
        A VS B < 0 -->  A < B   -
        return obj1 - obj2;
        */
        LinkedList<Integer> llDatos = new LinkedList();
        
        llDatos.add(100);
        llDatos.add(800);
        llDatos.add(600);
        llDatos.add(300);
        llDatos.add(700);
        llDatos.add(900);
        
        System.out.println(llDatos);
        
        Comparator cmOrdena = new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                /*HAY QUE REGRESAR 
                POSITIVO --> o1 > o2 (se debe hacer cambio)
                CERO     --> o1 = o2 (son iguales)
                NEGATIVO --> o1 < o2 (no hay cambios)
                */
                int iVal1 = (int) o1;
                int iVal2 = (int) o2;
                return iVal1 - iVal2;
            }
            
        };
        
        llDatos.sort(cmOrdena);
        System.out.println(llDatos);
        
    }
    
}
