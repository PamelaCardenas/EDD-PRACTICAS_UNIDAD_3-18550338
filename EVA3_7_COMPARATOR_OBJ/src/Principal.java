
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/*
 * Empleo de comparator de acuerdo a los objetos 
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

        LinkedList<Persona> llObjetos = new LinkedList();

        //Agregar datos en la lista
        llObjetos.add(new Persona("Juan", "Perez", 20));
        llObjetos.add(new Persona("Mario", "Fernandez", 15));
        llObjetos.add(new Persona("Maria", "Hernandez", 35));
        llObjetos.add(new Persona("Karen", "Lopez", 46));
        llObjetos.add(new Persona("Esteban", "Fuentes", 78));
        llObjetos.add(new Persona("Sandra", "Fuentes", 18));
        llObjetos.add(new Persona("Alondra", "Fuentes", 56));
        

        //Recorrer los elementos de la lista
        for (Iterator<Persona> iterator = llObjetos.iterator(); iterator.hasNext();) {
            Persona next = iterator.next();

            System.out.println("Nombre: " + next.getNombre());
            System.out.println("Apellido " + next.getApellido());
            System.out.println("Edad " + next.getEdad());
            System.out.println("------------------------------");

        }
        //ORDENAMIENTO POR EDAD
        Comparator cEdad = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Persona pPer1 = (Persona) o1;
                Persona pPer2 = (Persona) o2;
                return pPer1.getEdad() - pPer2.getEdad();
            }
        };

        //Imprime los elementos de la lista ordenados de acuerdo a la edad
        llObjetos.sort(cEdad);
        System.out.println("\nLISTA ORDENADA POR EDAD");
        for (Iterator<Persona> iterator = llObjetos.iterator(); iterator.hasNext();) {
            Persona next = iterator.next();

            System.out.println("Nombre: " + next.getNombre());
            System.out.println("Apellido " + next.getApellido());
            System.out.println("Edad " + next.getEdad());
            System.out.println("------------------------------");

        }

        //ORDENAMIENTO POR APELLIDO Y NOMBRE
        Comparator cApeNom = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Persona pPer1 = (Persona) o1;
                Persona pPer2 = (Persona) o2;
                char cA1, cA2, a1, a2, d1, d2; //Variables para los caracteres
                //Variables para guardar la longitud de las palabras
                int lA1 = pPer1.getApellido().length();
                int lA2 = pPer2.getApellido().length();
                int lN1 = pPer1.getNombre().length();
                int lN2 = pPer2.getNombre().length();

                //Compara primer caracter del apellido
                cA1 = pPer1.getApellido().charAt(0);
                cA2 = pPer2.getApellido().charAt(0);
                int iResu = cA1 - cA2;

                //Si son iguales...
                if (iResu == 0) {
                    if (lA1 < lA2 || lA1 == lA2) { //Dependiendo de la longitud de la palabra
                        //Se recorre letra por letra hasta que se llegue al final de la palabra mas corta
                        for (int i = 1; i < lA1; i++) {
                            a1 = pPer1.getApellido().charAt(i);
                            a2 = pPer2.getApellido().charAt(i);
                            iResu = a1 - a2;
                        }

                        if (iResu == 0) { //si son iguales
                            //Se evalua de acuerdo al nombre
                            char Nom1, Nom2, n1, n2, nn1, nn2;
                            //Primer letra del nombre
                            Nom1 = pPer1.getNombre().charAt(0);
                            Nom2 = pPer2.getNombre().charAt(0);
                            iResu = Nom1 - Nom2;

                            if (iResu == 0) {  //Si son iguales
                                if (lN1 < lN2 || lN1 == lN2) { //Se ejecuta de acuerdo a la longitud de las palabras (La mas corta)
                                    for (int j = 1; j < lN1; j++) { //Se recorre cada letra y se compara
                                        n1 = pPer1.getNombre().charAt(j);
                                        n2 = pPer2.getNombre().charAt(j);
                                        iResu = n1 - n2;
                                    }
                                } else if (lN1 > lN2) {
                                    for (int j = 1; j < lN2; j++) { //Se recorre cada letra y se compara
                                        nn1 = pPer1.getNombre().charAt(j);
                                        nn2 = pPer2.getNombre().charAt(j);
                                        iResu = nn1 - nn2;
                                    }
                                }
                            }
                        }

                    } else if (lA1 > lA2) {
                        for (int i = 0; i < lA2; i++) { //Se recorre letra por letra del apellido
                            d1 = pPer1.getApellido().charAt(i);
                            d2 = pPer2.getApellido().charAt(i);
                            iResu = d1 - d2;
                        }

                        if (iResu == 0) { //Si son iguales se determina de acuerdo al nombre
                            char Nom1, Nom2, n1, n2, nn1, nn2;
                            //Primer letra del nombre
                            Nom1 = pPer1.getNombre().charAt(0);
                            Nom2 = pPer2.getNombre().charAt(0);
                            iResu = Nom1 - Nom2;

                            if (iResu == 0) { //Si son iguales
                                if (lN1 < lN2 || lN1 == lN2) { //Se ejecuta de acuerdo a la longitud de las palabras (La mas corta)
                                    for (int j = 1; j < lN1; j++) { //Compara letra por letra
                                        n1 = pPer1.getNombre().charAt(j);
                                        n2 = pPer2.getNombre().charAt(j);
                                        iResu = n1 - n2;
                                    }
                                } else if (lN1 > lN2) {
                                    for (int j = 1; j < Nom2; j++) { //Compara letra por letra
                                        nn1 = pPer1.getNombre().charAt(j);
                                        nn2 = pPer2.getNombre().charAt(j);
                                        iResu = nn1 - nn2;
                                    }
                                }
                            }
                        }
                    }
                }

                return iResu; //Regresa lo ordenado
            }
        };
        //Muestra los datos ordenados de acuerdo al apellido y nombre
        llObjetos.sort(cApeNom);
        System.out.println("\nLISTA ORDENADA");
        for (Iterator<Persona> iterator = llObjetos.iterator(); iterator.hasNext();) {
            Persona next = iterator.next();

            System.out.println("Nombre: " + next.getNombre());
            System.out.println("Apellido " + next.getApellido());
            System.out.println("Edad " + next.getEdad());
            System.out.println("------------------------------");

        }

    }

}

//Clase persona con atributos, y constructores para definir los datos
class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
