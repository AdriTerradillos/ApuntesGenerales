package _12_Archivos;

//========================================
//COMPROBAR, CREAR Y ELIMINAR ARCHIVOS   =
//========================================
import java.io.File;
import java.io.IOException;

public class _0114_FicherosComprobar {
public static void main(String[] args) {
     File archivo = new File("demo.txt");

     if (archivo.exists()) {
         System.out.println("El archivo ya existe. Ruta: " + archivo.getAbsolutePath());
     } else {
         /*
         Java obliga a manejar el error porque pueden darse diferentes escenarios:
         - No hay permisos para escribir en esa carpeta.
         - No hay suficiente espacio en el disco de memoria.
         - No se permiten archivos con ese nombre.
         - Puede existir el archivo.

         try-catch nos permite controlar errores inesperados.
         */
         try {
             if (archivo.createNewFile()) { // createNewFile() lanza una excepción
                                            // y hay que capturarla.
                 System.out.println("Archivo creado: " + archivo.getName());
             }
         } catch (IOException e) {
             System.out.println("Error al crear el archivo.");
             // e.printStackTrace(); --> devuelve información detallada, opcional
         }
     }

     // Eliminar archivo
     // delete() únicamente devuelve true o false
     // No necesitamos capturar errores.
 
     if (archivo.delete()) {
         System.out.println("Archivo eliminado correctamente.");
     } else {
         System.out.println("No se pudo eliminar el archivo.");
     }
     
}
}