
import java.util.Scanner;

/*
 * Empleo de busquedas en listas, pero usando la busqueda binaria para mas rapicez
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
        int[] aiDatos = new int[20];
        
         for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int) (Math.random() * 100) + 1;
        }
         
        imprimir(aiDatos);
        selectionSort(aiDatos);
        System.out.println("");
        imprimir(aiDatos);
        Scanner sInput = new Scanner(System.in);
        System.out.println("\nIntroduce un valor");
        int iVal = sInput.nextInt();
        
        int iPos = busquedaBinaria(aiDatos, iVal);
        if(iPos == -1){
            System.out.println("EL ELEMENTO NO SE ENCUENTRA");
        }else{
            System.out.println("EL ELEMENTO ESTA EN LA POSICION " + iPos);
        }
    }
    
    public static int busquedaBinaria(int aiDatos[], int iValor){
        return recursivaBusBinaria(aiDatos, iValor, 0, aiDatos.length-1);
    }
    
    private static int recursivaBusBinaria(int aiDatos[], int iValor, int lo, int hi){
        int iMid = lo + ((hi - lo) / 2);
        int iResu = -1;
        if(aiDatos[iMid] == iValor){//VALOR ENCONTRADO
            iResu = iMid;
        }else{ //NO LO ENCONTRAMOS, REPETIMOS
            if(iValor < aiDatos[iMid]){
                iResu = recursivaBusBinaria(aiDatos, iValor, lo, iMid-1);
            }else{
                iResu = recursivaBusBinaria(aiDatos, iValor, iMid + 1, hi);
            }
        }
        return iResu;
    }
    
    
    public static void imprimir(int[] aiDatos) {
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.print("[" + aiDatos[i] + "]");

        }
    }
    
    //Eficiencia es o(n^2) --> Comparaciones
    //Eficiencia es o(n) --> Intercambio
    public static void selectionSort(int[] aiDatos) {
        for (int i = 0; i < aiDatos.length - 1; i++) {
            int iMin = i;
            for (int j = i + 1; j < aiDatos.length; j++) {
                if (aiDatos[iMin] > aiDatos[j]) {
                    iMin = j;
                }

            }
            if (iMin != i) {
                int iTemp = aiDatos[i];
                aiDatos[i] = aiDatos[iMin];
                aiDatos[iMin] = iTemp;
            }

        }
    }
}
