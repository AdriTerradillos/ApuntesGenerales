package _10_Colecciones;

import java.util.HashSet;
public class _0092_HashSet {
    public static void main(String[] args) {
        // Una estructura muy improtante dentro de las estructuras Hash
        // es el HashSet.
        // * Guarda valores únicos.
        // * No tiene un orden específico. 

        // Es ideal para verificar la pertenencia rápidamente.

        // Tenemos diferentes métodos para poder manipular un HashSet:
        // add() --> añade un valor.
        // remove() --> elimina un valor.
        // contains() --> comprueba si contiene un valor.
        // isEmpty() --> comprueba si está vacío.
        // size() --> devuelve cuántos elementos tiene.

        // Podemos tener una app que nos va agregando ingredientes a una lista de la compra.
        // Si la lista la hacemos con ArrayList podríamos introducir el mismo ingrediente
        // dos veces por error. 
        // Si la hacemos con un Set ya no va a permitir que haya ingredientes duplicados

        HashSet<String> listaCompra = new HashSet<>();
        listaCompra.add("huevos");
        listaCompra.add("cebolla");
        listaCompra.add("patata");
        listaCompra.add("calabaza");
        listaCompra.add("huevos");

        System.out.println("Tamaño del HashSet: " + listaCompra.size());

        for (String ingrediente : listaCompra) {
            System.out.println(ingrediente);
        }

        //INTERSECCION Y DIFERENCIA

        // INTERSECCION: Valores en común entre dos conjuntos
        HashSet<String> set1 = new HashSet<>();
        set1.add("manzana");
        set1.add("naranja");
        set1.add("plátano");

        HashSet<String> set2 = new HashSet<>();
        set2.add("naranja");
        set2.add("kiwi");
        set2.add("plátano");

        //Si no queremos alterar ninguno de los sets vamos a tener que crear
        //un nuevo set haciendo una copia de cualquiera de los anteriores
        //en el que tendremos la intersección:
        HashSet<String> interseccion = new HashSet<>(set1);
        interseccion.retainAll(set2);
        System.out.println("Intersección: " + interseccion); // [naranja, plátano]

        // DIFERENCIA: conjunto de elementos que está en un set pero no en el otro
        HashSet<String> diferencia = new HashSet<>(set1);
        diferencia.removeAll(set2);
        System.out.println("Intersección: " + diferencia); // [manzana]

        // Diferencia al revés entre set2 y set1
        HashSet<String> diferencia2 = new HashSet<>(set2);
        diferencia.removeAll(set1);
        System.out.println("Intersección: " + diferencia); // [kiwi]

    }
    
}