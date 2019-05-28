
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/*
 * Empleo de comparator de acuerdo a cadenas 
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
        
        LinkedList<String> llCadenas = new LinkedList();
        
        llCadenas.add("Hola");
        llCadenas.add("Mundo");
        llCadenas.add("Cruel");
        llCadenas.add("De");
        llCadenas.add("Estructura");
        llCadenas.add("Datos");
        llCadenas.add("Dar");
        llCadenas.add("Cal");
        llCadenas.add("Datos");
        
        System.out.println(llCadenas);
        
        Comparator cOrdenCadenas = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                String cCade1 = (String) o1;
                String cCade2 = (String) o2;
                int iResu = 0;
                int lc1 = cCade1.length();
                int lc2 = cCade2.length();
                
                //COMPARAR
                char c1, c2, a1, a2, d1, d2;
                //HAY QUE VALIDAR QUE LA CADENA NO ESTE VACIA 
                
                c1 = cCade1.charAt(0);
                c2 = cCade2.charAt(0);
                iResu = c1 - c2;
                
                if(iResu == 0){
                    if(lc1 < lc2 || lc1 == lc2){
                        for (int i = 1; i < lc1; i++) {
                            a1 = cCade1.charAt(i);
                            a2 = cCade2.charAt(i);
                            iResu = a1 - a2;
                        }
                    }
                    else if(lc1 > lc2){
                        for (int i = 1; i < lc2; i++) {
                            d1 = cCade1.charAt(i);
                            d2 = cCade2.charAt(i);
                            iResu = d1 - d2;
                        }
                    }
                }
                return iResu;
            }
        };
        
        llCadenas.sort(cOrdenCadenas);
        System.out.println(llCadenas);
        
    }
    
}
