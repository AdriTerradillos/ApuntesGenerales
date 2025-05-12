package Ejercicios.Collections.Soluciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayListSoluciones {

    public static ArrayList<String> nombres = new ArrayList<>();

    public static void ejercicio1() {
        //Crea un ArrayList de String de 5 elementos
        //Muéstralos 1 a 1
        ArrayList<String> elementos = new ArrayList<>();
        elementos.add("primero");
        elementos.add("segundo");
        elementos.add("tercero");
        elementos.add("cuarto");
        elementos.add("quinto");
        //le puedo añadir más

        //el más fácil
        for (String e : elementos) {
            System.out.println(e);
        }

        //con un bucle for...
        for(int i = 0; i < elementos.size(); i++) {
            System.out.println(elementos.get(i));
        }

        // con un bucle while...
        int control = 0;
        while(control < elementos.size()) {
            System.out.println(elementos.get(control));
            control++;
        } 
    }

    public static void ejercicio2() {
        //Añade varios nombres al array nombres.
        //Comprueba si existe dentro del ArrayList "Alberto".
    	nombres.add("Carlos");
    	nombres.add("Pedro");
    	if (nombres.contains("Alberto")) {
    		System.out.println("Alberto encontrado.");
    	} else {
    		System.out.println("No se encuentra.");
    	}
    	
    	//Otra manera de hacerlo...
    	boolean estaAlberto = false;
    	for (String n : nombres) {
    		if (n.equals("Alberto")) {
    			estaAlberto = true;
    		}
    	}
    	System.out.println("Está Alberto: " + estaAlberto);
    }

    public static void ejercicio3() {
        //Elimina un nombre del ArrayList nombres
    	nombres.remove("Carlos"); // devuelve boolean
    	/*
    	Hay más métodos para eliminar elementos de una lista...
    	Por ejemplo se pueden eliminar todas las coincidencias con:
    	nombres.removeAll("Raquel"); --> devuelve boolean
    	nombres.remove(índice) --> devuelve elemento eliminado
    	*/
    	

    }

    public static void ejercicio4() {
        //Ordena alfabéticamente los nombres del ArrayList nombres
        
    	//Collections.sort(nombres);
        
    	//Collections.reverse(nombres);

        //nombres.sort(String::compareTo);
    	
    	for (int i = 0; i < nombres.size() - 1; i++) { // no quiero llegar hasta el último elemento
            for (int j = i + 1; j < nombres.size(); j++) { // quiero comparar un elemento con el siguiente

                String a = nombres.get(i).toLowerCase();
                String b = nombres.get(j).toLowerCase();
                int minLength = Math.min(a.length(), b.length()); // comparo la longitud más corta
                boolean aEsMayor = false;

                for (int k = 0; k < minLength; k++) {
                    if (a.charAt(k) > b.charAt(k)) { // compara el equivalente al valor numérico
                        aEsMayor = true;
                        break;
                    } else if (a.charAt(k) < b.charAt(k)) {
                        aEsMayor = false;
                        break;
                    }
                    // si son iguales, continúa
                }

                // Si son iguales hasta el final del más corto, el más largo es mayor
                if (!aEsMayor && a.length() > b.length()) { // solo si aEsMayor se ha quedado en false seguirá comprobando
                    aEsMayor = true;
                }

                // Intercambiar si está mal ordenado
                if (aEsMayor) {
                    String temp = nombres.get(i); // guarda la palabra del primer bucle
                    nombres.set(i, nombres.get(j)); // en esa posición pone la del segundo bucle
                    nombres.set(j, temp); // pone la del primer bucle en la posición del segundo
                }
            }
        }

        // Mostrar nombres ordenados
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    	


    }

    public static void ejercicio5() {
        //Añade en la posición 4 un nombre a nombres.
    	
    	nombres.add(4, "Sonia");
    }

    public static void ejercicio6() {
        //Crea una copia de ArrayList y comprueba que son objetos distintos.
        // crear copia y con == vemos que son objetos diferentes
        // con equals() vemos que el contenido de ambos es igual
    	
    	ArrayList<String> copiaNombres = new ArrayList<>(nombres);
    	System.out.println("Son el mismo objeto: " + (nombres == copiaNombres));
    	System.out.println("Tienen el mismo contenido: " + nombres.equals(copiaNombres));
    }

    public static void ejercicio7() {
        //Comprueba cuántas veces aparece cada nombre en ArrayList

        for (String n : nombres) {
            int contador = 0;
            for (String no : nombres) {
                if (no.equals(n)) {
                    contador++;
                }
            }

            System.out.println("El nombre: " + n + " --> " + contador + " veces.");
        }

        //----------------------------------------------------------------------
        
        // Alberto lo hace para contar un nombre concreto
        /*
        String nombre = "Pedro";
        int contador = 0;
        for (String n : nombres) {
        	if (n.equals(nombre)) {
        		contador++;
        	}
        }
        switch (contador) {
        case 0:
        	System.out.println("El nombre '" + nombre + "' no aparece.");
        	break;
        case 1:
        	System.out.println("El nombre '" + nombre + "' aparece " + contador + " vez.");
        	break;
        default:
        	System.out.println("El nombre '" + nombre + "' aparece " + contador + " veces.");
        }
        */
        
        //----------------------------------------------------------------------
        
        // Maria lo hace recorriendo array generando un contador y con un segundo bucle
        // que elimina los elementos que ya están contados
        /*
        for (int i = 0; i < nombres.size(); i++) {
            String actual = nombres.get(i);
            int contador = 1; // contamos al menos 1 vez (el actual)

            // Empezamos desde i+1 para comparar con el resto
            for (int j = i + 1; j < nombres.size(); ) {
                if (nombres.get(j).equals(actual)) {
                    contador++;
                    nombres.remove(j); // eliminamos y no incrementamos j
                } else {
                    j++; // solo incrementamos si no eliminamos
                }
            }
        */
        
        //----------------------------------------------------------------------
        
        // también se puede resolver con set
        /*
        HashSet<String> paraContar = new HashSet<>(nombres);
        for (String n : paraContar) {
        	int contador = 1;
        	for (String nombre : nombres) {
        		if (n.equals(nombre)) {
        			contador++;
        		}
        	}
        	if (contador < 1) {
        		System.out.println("El nombre: " + n + " está --> " + contador + " veces.");
        	} else {
        		System.out.println("El nombre: " + n + " está --> " + contador + " vez.");
        	}
        }
        */
        
        //----------------------------------------------------------------------
        
        // Lola lo resuelve con HashMap
        /*
        HashMap<String, Integer> contador = new HashMap<>();

        // Recorremos el ArrayList
        for (String nombre : nombres) {
            // Si ya está en el mapa, incrementamos en 1
            if (contador.containsKey(nombre)) {
                contador.put(nombre, contador.get(nombre) + 1);
            } else {
                // Si no está, lo añadimos con valor 1
                contador.put(nombre, 1);
            }
        }

        // Mostrar los resultados
        for (Map.Entry<String, Integer> entrada : contador.entrySet()) {
            System.out.println(entrada.getKey() + " aparece " + entrada.getValue() + " veces.");
        }
        */
    }

    public static void ejercicio8() {
        //Invierte el orden de ArrayList nombres
        // Collections.reverse();
        // Alberto hace un bucle invertido para darle la vuelta respetando el orden
    	ArrayList<String> invertida = new ArrayList<>();
    	for (int i = nombres.size() -1; i > -1; i--) {
    		String nombre = nombres.get(i);
    		invertida.add(nombre);
    	}

    }

    public static void main(String[] args) {
        nombres.add("Christian");
        nombres.add("Raquel");
        nombres.add("Natalia");
        nombres.add("Hugo");
        nombres.add("Alex");
        nombres.add("Pedro");
        nombres.add("Mario");
        nombres.add("Maria");
        nombres.add("Rita");
        nombres.add("Carlos");
        nombres.add("Mario");
        nombres.add("Raquel");
        
        // descomentad la solución que querráis ver

        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();

    }

}