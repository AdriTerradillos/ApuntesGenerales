package _10_Colecciones;

/*
 * ===============
 * =   WRAPPER   =
 * ===============
 * 
 * En este ejemplo vamos a ver como utilizar el wrapper
 * de int, Integer, en una Collection.
 * 
 * Supongamos que queremos almacenar números enteros en una lista dinámica,
 * pero recordemos que ArrayList solo acepta objetos:
 */

import java.util.ArrayList;
import java.util.List;

class _0090_Wrapper {
    public static void main(String[] args) {
        // Creación de una lista de Integer (wrapper de int)
        List<Integer> numeros = new ArrayList<>();
        
        // Agregamos números a la lista; 
        // gracias al AUTOBOXING, 
        // podemos escribir directamente números primitivos.
        numeros.add(10);  // 10 se convierte en un objeto Integer automáticamente
        numeros.add(20);
        numeros.add(30);
        
        // Recorrer la lista
        for (Integer num : numeros) {
            // UNBOXING: el objeto Integer se convierte 
            // automáticamente a int para la operación
            System.out.println("Número: " + num);
        }

        // Otro ejemplo de UNBOXING
        // Cuando un objeto wrapper se utiliza donde se espera
        // un objeto primitivo.
        Integer numero = 10;
        int n = numero; // El objeto Integer se convierte automáticamente en un int.

    }
}
/*
 * ==================
 * =   ACLARACION   =
 * ==================
 * Al declarar la lista como List<Integer>, 
 * especificamos que trabajaremos con objetos de 
 * tipo Integer en lugar de int.
 * 
 * La conversión automática (autoboxing) 
 * convierte los literales 10, 20, 30 en objetos Integer.
 * 
 * Esto es esencial porque sin wrappers, 
 * no podríamos almacenar números primitivos en una ArrayList.
 * 
 * El programador no tiene que preocuparse por las conversiones manuales,
 * Java las gestiona de forma automática.
 */