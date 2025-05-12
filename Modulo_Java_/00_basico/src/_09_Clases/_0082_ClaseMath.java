package _09_Clases;


public class _0082_ClaseMath {

	public static void main(String[] args) {
        /*
		// La clase Math nos va a servir para realizar operaciones matemáticas
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html
		
		// Esta clase todos sus métodos son ESTATICOS, es decir, NO es necesario
		// crear objetos de la clase MATH para invocar sus métodos.
		
		// Ejemplo
		// Si queremos usar la clase RANDOM tenemos que crear un objeto de la
		// clase, y eso se hace con la palabra reservada "new"
		Random rd = new Random();
		rd.nextDouble(1, 100);
		
		// En la clase MATH al ser sus métodos ESTÁTICOS debemos invocarlos
		// directamente desde la clase
		// Ejemplo para obtener una potencia
		double potencia = Math.pow(2, 3);
		// NÓTESE como no hago NEW de la clase MATH
		
		// Podemos obtener el número PI o el número E
		final double constantePI = Math.PI;
		System.out.println(Math.PI);
		
		
		// Devuelve el mayor (cercano al infinito positivo) double
		// que sea mayor igual al argumento y devuelve un int 
		System.out.println(Math.floor(4.99));
		System.out.println(Math.floor(4.01));
		
		// Devuelve el menor (cercano al infinito negativo) double 
		// menor que o igual al argumento y éste es igual a un int.
		System.out.println(Math.ceil(4.99));
		System.out.println(Math.ceil(4.01));
		
		//Devuelve el long más cercano, con redondeo 
		//para una energía positiva
		System.out.println(Math.round(4.99));
		System.out.println(Math.round(4.51));
		System.out.println(Math.round(4.5));
		System.out.println(Math.round(4.49));
		System.out.println(Math.round(4.01));
		
		System.out.println(Math.abs(3));
		System.out.println(Math.abs(-3));
		
		//Otra manera de calcular aleatorios.
		//En este caso te devuelve un número aleatorio entre el 0 y el 1
		System.out.println(Math.random());
		
		//Donde N es el valor máximo. Esto nos genera un número aleatorio
		//entre el 1 y N
		//int numeroAletorio = (int) (Math.random() * n) + 1;
		int numeroAletorio = (int) (Math.random() * 10) + 1;
		System.out.println(numeroAletorio);
		
		//Raiz cuadrada
		System.out.println(Math.sqrt(49));
		
		//Si queremos quedarnos con un número de decimales
		//debemos usar la clase DecimalFormat --> ¡Primero tienes que importarla!
		DecimalFormat df = new DecimalFormat("0.000");
		System.out.println(df.format(Math.PI)); // 3.142
		
		//Podemos convertir cadenas a numeros
		//MUY IMPORTANTE cuando leemos datos de ficheros, bases de datos, etc.
		int numero = Integer.parseInt("50");
		double numero2 = Double.parseDouble("50.67");
		System.out.println(numero);
		System.out.println(numero2);

        */
        // Operación entre dos números aleatorios

		System.out.println(Math.random()); // 0.0 a 1.0

		// (MAX - MIN +1) + 1

		System.out.println(Math.random() * (12-1+1) + 1); // 1 a 12 (12 - 1 + 1) + 1


		// (20 - 10 +1) +10
		int aleatorio10a20 = (int) (Math.random() * (20 - 10 + 1) + 10);
		System.out.println(aleatorio10a20); // cada vez que se ejecute dará un número
											// distinto entre 10 y 20
	}

}