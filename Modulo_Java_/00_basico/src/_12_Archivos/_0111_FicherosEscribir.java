package _12_Archivos;

//================================
//=   LEER Y ESCRIBIR ARCHIVOS   =
//================================
/*
Esto es muy importante para que los programas puedan:
- Guardar datos de forma permanente.
- Leer información que ya existe (como registros, configuraciones, etc).

Hasta ahora, todo lo que hacíamos desaparecía al cerrar el programa.
Con archivos, podemos hacer que los datos "sobrevivan".
*/
//===============
//=   IMPORTS   =
//===============
//=   Escribir  =
import java.io.FileWriter;
import java.io.IOException;


public class _0111_FicherosEscribir {
 /*
  * Ruta para ubicar un fichero:
  * 
  * ======RUTA RELATIVA======
  * Cuando estoy en un nivel y quiero acceder a subniveles.
  * 
  * Documentos --> quiero acceder a la carpeta materiales y dentro de materiales a bloque01
  * materiales/bloque01/archivo.txt
  * 
  * materiales --> quiero poner el archivo en la carpeta Documentos que está en el nivel
  *                superior.
  * 
  * ../archivo.txt
  * 
  * ======RUTA ABSOLUTA======
  * Es la ruta completa. Necesita toda la dirección exacta.
  * c:\carpeta\carpeta\carpeta\...\archivo.txt
  * 
  */
 
 public static void main(String[] args) {
     try {
         FileWriter escritor = new FileWriter("saludo.txt"); // crea o sobrescribe
         escritor.write("Hola mundo desde Java!\n");
         escritor.write("Esta línea también se guarda en el archivo.");
         //escritor.close(); // es muy importante cerrar. Si no se cierra podrían no guardarse los cambios.
         System.out.println("Archivo escrito correctamente.");
     /*
     Podemos encontrarnos con múltiples problemas:
     - No hay permisos de escritura.
     - No hay permisos de acceso.
     - No hay suficiente espacio en el disco.
     - ...

     Java obliga a controlar este tipo de excepciones (checked exceptions).
     Uso de try-catch obligatorio.
     */
     
     } catch (IOException e) {
         System.out.println("Ocurrió un error al escribir el archivo.");
         // e.printStackTrace(); --> devuelve información detallada, opcional
     } finally {
    	 // escritor.close(); --> cuidado con la vida de una variable.
    	 // escritor únicamente vive dentro del try {...} en este caso.
    	 // para cerrarlo aquí se tendría que declarar el escritor antes del try
     }
     
                 /*
                 try {
                     FileWriter escritor = new FileWriter("Prueba.java"); // crea o sobrescribe
                     escritor.write("public class Prueba {\n");
                     escritor.write("    public static void main(String[] args) {\n");
                     escritor.write("        System.out.println(\"Hola, Hola\");\n");
                     escritor.write("    }\n");
                     escritor.write("}");
                     escritor.close(); // es muy importante cerrar. Si no se cierra podrían no guardarse los cambios.
                     System.out.println("Archivo escrito correctamente.");
                 /*
                 Podemos encontrarnos con múltiples problemas:
                 - No hay permisos de escritura.
                 - No hay permisos de acceso.
                 - No hay suficiente espacio en el disco.
                 - ...

                 Java obliga a controlar este tipo de excepciones (checked exceptions).
                 Uso de try-catch obligatorio.
                 
                 
                 } catch (IOException e) {
                     System.out.println("Ocurrió un error al escribir el archivo.");
                     // e.printStackTrace(); --> devuelve información detallada, opcional
                 }
                 */
 }
}
/*
- FileWriter crea un archivo nuevo o sobrescribe si ya existe.
- .write() escribe texto.
- .close() es obligatorio para guardar bien los datos.
- Siempre usamos try-catch porque puede haber errores.
*/