package _12_Archivos;

//====================
//=   AÑADIR TEXTO   =
//====================
/* 
Una cosa es poder abrir un archivo, o crearlo en caso de que no exista,
y escribir lo que sea que se necesite en él. Otra cosa es añadir texto
a un archivo ya existente. En este caso el proceso es algo distinto.
*/


//===============
//=   IMPORTS   =
//===============
//=   Escribir  =
import java.io.FileWriter;
import java.io.IOException;

public class _0112_FicherosEscribirContinuar {
 public static void main(String[] args) {
     try {
         FileWriter escritor = new FileWriter("saludo.txt", true); // true = append
         escritor.write("\nNueva línea añadida sin borrar las anteriores.");
         escritor.close();
         System.out.println("Texto añadido correctamente.");
     } catch (IOException e) {
         System.out.println("Error al añadir texto.");
         // e.printStackTrace(); --> devuelve información detallada, opcional
     }
 }
}

/*
- Si pasamos "true" como segundo argumento, se añade contenido sin borrar lo anterior.
*/