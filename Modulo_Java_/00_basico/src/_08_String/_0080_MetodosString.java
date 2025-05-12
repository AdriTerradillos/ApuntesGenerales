package _08_String;

//Voy a usar array y necesito importar para usar ss métodos
import java.util.Arrays;
public class _0080_MetodosString {
 
	public static void main(String[] args) {
	     // declaro una constante como separador
	     final String SEPARADOR = "------------------------";
	
	     String texto = "  Hola Mundo  ";
	     String texto2 = "hola mundo";
	     String texto3 = "Bienvenido al curso de Java";
	
	     // length()
	     System.out.println(".length()");
	     System.out.println(SEPARADOR);
	     System.out.println("Longitud: " + texto.length());
	     System.out.println();
	
	     // charAt(int index)
	     System.out.println(".charAt()");
	     System.out.println(SEPARADOR);
	     System.out.println("Carácter en la posición 1: " + texto.charAt(1));
	     System.out.println();
	
	     // substring(int beginIndex, int endIndex)
	     System.out.println(".substring()");
	     System.out.println(SEPARADOR);
	     System.out.println("Substring (0, 4): " + texto.substring(0, 4));
	     System.out.println();
	
	     // toUpperCase() / toLowerCase()
	     System.out.println(".toUpperCase()");
	     System.out.println(SEPARADOR);
	     System.out.println("Mayúsculas: " + texto.toUpperCase());
	     System.out.println(".toLowerCase()");
	     System.out.println(SEPARADOR);
	     System.out.println("Minúsculas: " + texto.toLowerCase());
	     System.out.println();
	
	     // equals(Object anObject)
	     System.out.println(".equals()");
	     System.out.println(SEPARADOR);
	     System.out.println("¿texto == texto2?: " + texto.equals(texto2));
	     System.out.println();
	
	     // equalsIgnoreCase(String anotherString)
	     System.out.println(".equalsIgnoreCase()");
	     System.out.println(SEPARADOR);
	     System.out.println("¿texto == texto2 (ignorando mayúsculas)?: " 
	                         + texto.trim().equalsIgnoreCase(texto2));
	     System.out.println();
	
	     // contains(CharSequence s)
	     System.out.println(".contains()");
	     System.out.println(SEPARADOR);
	     System.out.println("¿Contiene 'Mundo'?: " + texto.contains("Mundo"));
	     System.out.println();
	
	     // indexOf(String str)
	     System.out.println(".indexOf()");
	     System.out.println(SEPARADOR);
	     System.out.println("Índice de 'Mundo': " + texto.indexOf("Mundo"));
	     System.out.println();
	     // con una única letra dará la primera coincidencia
	     // texto = "  Hola Mundo  "
	     System.out.println(texto.indexOf("n")); // 9
	     System.out.println("nada nace".indexOf("n")); // 0
	
	
	     // replace(CharSequence target, CharSequence replacement)
	     System.out.println(".replace()");
	     System.out.println(SEPARADOR);
	     System.out.println("Reemplazar 'Hola' por 'Adiós': " 
	                         + texto.replace("Hola", "Adiós"));
	     System.out.println();
	
	     // trim()
	     System.out.println(".trim()");
	     System.out.println(SEPARADOR);
	     // "  Hola mundo  "
	     System.out.println("Sin espacios al principio y final: '" + texto.trim() + "'"); //"Hola mundo"
	     System.out.println();
	
	
	     // split(String regex)
	     System.out.println(".split()");
	     System.out.println(SEPARADOR);
	     String[] partes = texto3.split(" ");
	     System.out.println("Dividir por espacios: " + Arrays.toString(partes));
	     System.out.println();
	     /* String texto = "Hoy he ido a comprar";
	      * split() --> parte el texto en distintos elementos (por defecto lo hace por el espacio)
	      * System.out.println(Arrays.toString(texto.split()));
	      * ["Hoy", "he", "ido", "a", "comprar"]
	      */
	
	     // concat(String str)
	     System.out.println(".concat()");
	     System.out.println(SEPARADOR);
	     System.out.println("Concatenación: " + texto.concat("!!!"));
	     System.out.println("Recuerda: puedes hacerlo también con el operador \"+\"");
	     System.out.println("texto + texto: esto dará una nueva String de ambos\ntextos unidos.");
	     System.out.println();
	
	     // isEmpty()
	     System.out.println(".isEmpty()");
	     System.out.println(SEPARADOR);
	     String vacía = "";
	     System.out.println("¿Cadena vacía?: " + vacía.isEmpty());
	     System.out.println();
	
	     // startsWith(String prefix)
	     System.out.println(".startsWith()");
	     System.out.println(SEPARADOR);
	     System.out.println("¿Empieza por '  Hola'?: " + texto.startsWith("  Hola"));
	     System.out.println();
	
	     // endsWith(String suffix)
	     System.out.println(".endsWith()");
	     System.out.println(SEPARADOR);
	     System.out.println("¿Termina en 'Mundo  '?: " + texto.endsWith("Mundo  "));
	     System.out.println("¿Termina en 'o   '?: " + texto.endsWith("o   "));
	     System.out.println("¿Termina en 'o'?: " + texto.endsWith("o"));
	     System.out.println();
	
	     // BONUS: Recordatorio de inmutabilidad
	     System.out.println("Texto original (no modificado): '" + texto + "'");
	     System.out.println("Para \"guardar\" los cambios que hemos hecho en");
	     System.out.println("una variable String: tenemos que reasignar la misma variable");
	     System.out.println("o crear una variable nueva, si queremos conservar la original.");
	     System.out.println("Cualquier cambio sobre una String genera una String nueva.");
	}
}
