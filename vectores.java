package LOQSEA;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author SEBASTIAN
 */
public class vectores {
    public static void main(String[] args) {
        //lista vacia
        int vacia []={};
        System.out.println("la lista vacia es:"+ Arrays.toString(vacia));
        
        //lista con cinco elementos
        String cinco[]={"tigre","lobo","leon","cocodrilo","tiburon"};
        System.out.println("\n la lista con cinco elementos es igual a"+ Arrays.toString(cinco));
        
        //numero de elementos en la lista de cinco elementos
        System.out.println("\n el numero de elementos en la lista de cinco es:"+cinco.length);
        
        // Obtener el primer elemento, el elemento central y el último elemento de la lista.
        System.out.println("\n los elementos pedidos son: "+ cinco[0]+","+cinco[2]+","+cinco[4]);
        
        // Crear una lista llamada Datos_personales y agregar datos utilizando la función append()
        ArrayList<Object> datosPersonales = new ArrayList<>();
        datosPersonales.add("Nombre");
        datosPersonales.add("Edad");
        datosPersonales.add("Altura");
        datosPersonales.add("Estado Civil");
        datosPersonales.add("Direccion");
        System.out.println("la lista datos personales es: "+datosPersonales);
        
    
        // Crear lista de empresas de tecnología
        List<String> it_companies = new ArrayList<>();
        it_companies.add("Facebook");
        it_companies.add("Google");
        it_companies.add("Microsoft");
        it_companies.add("Apple");
        it_companies.add("IBM");
        it_companies.add("Oracle");
        it_companies.add("Amazon");

        // Imprimir lista inicial
        System.out.println("Lista inicial de empresas de tecnología:");
        imprimirLista(it_companies);

        // Añadir una empresa a la lista
        it_companies.add(1, "Twitter");
        System.out.println("\nDespués de agregar Twitter:");
        imprimirLista(it_companies);

        // Comprobar si una empresa existe en la lista
        String empresaABuscar = "Microsoft";
        if (it_companies.contains(empresaABuscar)) {
            System.out.println("\nLa empresa " + empresaABuscar + " existe en la lista.");
        } else {
            System.out.println("\nLa empresa " + empresaABuscar + " no existe en la lista.");
        }

        // Ordenar la lista
        Collections.sort(it_companies);
        System.out.println("\nDespués de ordenar la lista:");
        imprimirLista(it_companies);

        // Invertir la lista en orden descendente
        Collections.reverse(it_companies);
        System.out.println("\nDespués de invertir la lista en orden descendente:");
        imprimirLista(it_companies);

        // Eliminar la primera empresa de la lista
        String primeraEmpresa = it_companies.remove(0);
        System.out.println("\nSe ha eliminado la primera empresa: " + primeraEmpresa);
        System.out.println("Lista después de eliminar la primera empresa:");
        imprimirLista(it_companies);

        // Eliminar todas las empresas de la lista
        it_companies.clear();
        System.out.println("\nLista después de eliminar todas las empresas:");
        imprimirLista(it_companies);
    }

    // Método para imprimir una lista
    public static void imprimirLista(List<String> lista) {
        for (String empresa : lista) {
            System.out.println(empresa);
        }

    }
    }
    