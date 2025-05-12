package _12_Archivos;

//=   Leer      = 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _0113_FicherosLeer {
 public static void main(String[] args) {
     try {
         // Aquí todavía no estamos leyendo ni creando el archivo
         // simplemente hace referencia.
         File archivo = new File("saludo.txt");
         // Con el Scanner intentamos leer el archivo.
         // Si no se puede se lanza una excepción FileNotFoundException.
         // Java obliga a capturarla, o no compila. Necesario el uso de try-catch.
         Scanner lector = new Scanner(archivo); 
         while (lector.hasNextLine()) { // mientras haya más líneas ejecútate.
             String linea = lector.nextLine(); // Lee la siguiente línea.
             System.out.println(linea); // Print de esa línea.
         }
         lector.close();
     } catch (FileNotFoundException e) {
         System.out.println("Archivo no encontrado.");
         // e.printStackTrace(); --> devuelve información detallada, opcional
     }
 }
}
/*
- Se crea un objeto File con el nombre del archivo.
- Scanner nos permite leerlo línea a línea.
- hasNextLine() comprueba si hay más líneas.
*/