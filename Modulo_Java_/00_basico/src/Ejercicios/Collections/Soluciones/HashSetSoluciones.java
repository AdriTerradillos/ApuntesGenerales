package Ejercicios.Collections.Soluciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSetSoluciones {
	
	public static void main(String[] args) {
		imprimeEjercicio(1);
		// 1. Agregar frutas a un HashSet y mostrarlos
	    HashSet<String> frutas = new HashSet<>();
	    frutas.add("Manzana");
	    frutas.add("Banana");
	    frutas.add("Pera");
	    frutas.add("Kiwi");
	    frutas.add("Mango");
	
	    System.out.println("Frutas: " + frutas);
	    
	    imprimeEjercicio(2);
	    // 2. Comprobar existencia de un elemento dentro de frutas
        String buscar = "Banana";
        if (frutas.contains(buscar)) {
            System.out.println(buscar + " está en el conjunto.");
        } else {
            System.out.println(buscar + " NO está en el conjunto.");
        }
        
        imprimeEjercicio(3);
        // 3. Eliminar un elemento de frutas
        frutas.remove("Kiwi");
        System.out.println("Después de eliminar Kiwi: " + frutas);

        imprimeEjercicio(4);
        // 4. Comprobar el tamaño del HashSet frutas
        System.out.println("Tamaño del conjunto frutas: " + frutas.size());

        imprimeEjercicio(5);
        // 5. Haz un HashSet nuevo llamado frutas2
        // Haz otro HashSet nuevo llamado union que contenga los elementos del HashSet frutas
        // Une ambos (union y frutas2)
        HashSet<String> frutas2 = new HashSet<>();
        frutas2.add("Melón");
        frutas2.add("Mango");
        frutas2.add("Papaya");

        HashSet<String> union = new HashSet<>(frutas); // copia de frutas
        union.addAll(frutas2);
        System.out.println("Unión de frutas y frutas2: " + union);

        imprimeEjercicio(6);
        // 6. Intersección de conjuntos entre frutas y frutas2
        HashSet<String> interseccion = new HashSet<>(frutas);
        interseccion.retainAll(frutas2);
        System.out.println("Intersección: " + interseccion);

        imprimeEjercicio(7);
        // 7. Diferencia entre conjuntos entre frutas y frutas2
        HashSet<String> diferencia = new HashSet<>(frutas);
        diferencia.removeAll(frutas2);
        System.out.println("Diferencia (frutas - frutas2): " + diferencia);
        
        imprimeEjercicio(8);
        // 8. Convertir a ArrayList y ordenar
        ArrayList<String> listaOrdenada = new ArrayList<>(frutas);
        Collections.sort(listaOrdenada);
        System.out.println("Frutas ordenadas: " + listaOrdenada);

        imprimeEjercicio(9);
        HashSet<String> copiaLength = new HashSet<>(frutas);
        for (String f : copiaLength) {
        	if (f.length() < 6) {
        		copiaLength.remove(f);
        	}
        }
        System.out.println("Solución con bucle, frutas con longitud >= 6: " + copiaLength);
        // 9. Eliminar elementos con condición (longitud < 6)
        frutas.removeIf(fruta -> fruta.length() < 6);
        System.out.println("Frutas con longitud >= 6: " + frutas);

	}
	
	private static void imprimeEjercicio(int ejercicio) {
		System.out.println();
		System.out.println("===================");
		System.out.println("=   EJERCICIO " + ejercicio + "   =");
		System.out.println("===================");
		System.out.println();
	}
}
