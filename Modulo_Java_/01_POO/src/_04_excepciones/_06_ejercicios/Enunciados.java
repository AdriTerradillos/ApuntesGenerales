package _04_excepciones._06_ejercicios;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Enunciados {
	private static final String SEP = "===============================";
	//Ejercicios para practicar con las diferentes excepciones
	//Hay que investigar un poco para aprender a manejarse con ellas
	public static void main(String[] args) {
		
		String[] cosa = new String[-3];
		
		Scanner sc = new Scanner(System.in);
	/*
	// 1. Pide al usuario dos números y divide el primero entre el segundo. 
	// Usa try-catch para capturar la división por cero y mostrar un mensaje personalizado.
		System.out.println("Ejercicio 1");
		try {
			System.out.println(5/0);
		} catch (ArithmeticException ae) {
			System.out.println(ae); 
			ae.printStackTrace();
		}
		System.out.println(SEP+"\n");
	
		// 2. Solicita al usuario que introduzca su edad (entero). Captura la excepción si escribe letras o símbolos.
			System.out.println("Ejercicio 2");	
			boolean condicion = true;
			do {
				try {
					System.out.print("Introduzca su edad: ");
					int edad = sc.nextInt();
					condicion = false;
				} catch (InputMismatchException ime) {
					// TODO Auto-generated catch block
					sc.nextLine();
					System.out.println(ime);
					ime.printStackTrace();
				} 
			} while (condicion);
		System.out.println(SEP+"\n");
	
	// 3. Crea un array de 4 nombres. 
	// Pide al usuario un número del 0 al 3 para mostrar un nombre. 
	// Usa try-catch para evitar que acceda a posiciones no válidas.
		System.out.println("Ejercicio 3");
		condicion = true;
		String[] nombres = {"Lucia", "Paco", "Maria", "Ofelio"};
		System.out.println("Para escoger un nombre de la lista:");
		do {
			try {
				System.out.print("Introduzca un número del 0 al 3: ");
				int indice = sc.nextInt();
				System.out.println("Nombre seleccionado: " + nombres[indice]);
				condicion = false;
			} catch (InputMismatchException ime) {
				// TODO Auto-generated catch block
				sc.nextLine();
				System.out.println(ime);
				ime.printStackTrace();
			} catch (ArrayIndexOutOfBoundsException aioobe) {
				sc.nextLine();
				System.out.println(aioobe);
				aioobe.printStackTrace();
			}
		} while (condicion);
		
		System.out.println(SEP+"\n");
	// 4. Declara un String texto = null; e intenta acceder a texto.length().
	// Captura la excepción con try-catch y explica el error con un mensaje claro.
		System.out.println("Ejercicio 4");
		String texto = null;
		try {
			System.out.println(texto.length());
		} catch (NullPointerException npe) {
			// TODO Auto-generated catch block
			System.out.println(npe);
			npe.printStackTrace();
		}
		System.out.println(SEP+"\n");
	// 5. Pide al usuario un número en forma de String y convierte con Integer.parseInt(). 
	// Captura el error si el usuario introduce algo no numérico.
		System.out.println("Ejercicio 5");
		condicion = true;
		do {
			try {
				System.out.println("Introduzca un número entero.");
				int número = Integer.parseInt(sc.nextLine());
				condicion = false;
			} catch (NumberFormatException nfe) {
				condicion = true;
				System.out.println(nfe);
				nfe.printStackTrace();
			}
		} while (condicion);
			
		System.out.println(SEP+"\n");
	// 6. Pide al usuario un número que se usará como tamaño de un array.
	// Lanza y captura una excepción si el número es negativo.
		System.out.println("Ejercicio 6");
		condicion = true;
		do {
			try {
				System.out.print("Introduzca la cantidad de elementos que quiere para el array: ");
				int elementos = sc.nextInt();
				String[] arrayS = new String[elementos];
				condicion = false;
				sc.nextLine(); //limpia buffer
			} catch (NegativeArraySizeException nase) {
				condicion = true;
				sc.nextLine();
				nase.printStackTrace();
			}
		} while (condicion);
		System.out.println(SEP+"\n");
	// 7. Pide al usuario que escriba una palabra y luego una posición. 
	// Muestra el carácter en esa posición. Captura el error si el índice está fuera del rango del String.
		System.out.println("Ejercicio 7");
		condicion = true;
		do {
			try {
				System.out.print("Introduzca una palabra: ");
				String palabra = sc.nextLine();
				System.out.print("Introduzca la posición (en número) de la letra que quiere mostrar: ");
				int posicion = sc.nextInt();
				sc.nextLine(); //limpia buffer
				System.out.print("La letra es: " + palabra.charAt(posicion - 1));
				
				condicion = false;
			} catch (StringIndexOutOfBoundsException sioobe) {
				condicion = true;
				System.out.println(sioobe);
				sioobe.printStackTrace();
			}
		} while (condicion);
		System.out.println(SEP+"\n");
	// 8. Pide al usuario una temperatura en grados Celsius. Si la temperatura es menor que -273, 
	// lanza una IllegalArgumentException con un mensaje tipo "Temperatura imposible".
		System.out.println("Ejercicio 8");
		condicion = true;
		do {
		    try {
		        System.out.print("Introduce una temperatura en grados Celsius: ");
		        double temperatura = sc.nextDouble();
		        if (temperatura < -273) {
		            throw new IllegalArgumentException("Temperatura imposible: no puede ser menor de -273°C");
		        }
		        System.out.println("Temperatura registrada: " + temperatura + "°C");
		        condicion = false;
		    } catch (InputMismatchException ime) {
		        System.out.println("Error: debes introducir un número.");
		        sc.nextLine(); // limpiar el buffer
		    } catch (IllegalArgumentException iae) {
		        System.out.println(iae.getMessage()); // mostramos el mensaje personalizado
		        sc.nextLine(); // limpiar el buffer
		    }
		} while (condicion);
		System.out.println(SEP+"\n");
	// 9. Intenta abrir y leer un archivo de texto con FileReader. 
	// Usa try-catch para capturar la excepción si el archivo no existe.
		System.out.println("Ejercicio 9");
		try {
			FileReader fr = new FileReader("NoExiste.txt");
			System.out.println("Caracteres: " + fr.read());
			fr.close();
		} catch (IOException ioe) {
			System.out.println(ioe);
			ioe.printStackTrace();
		}
		System.out.println(SEP+"\n");
	// 10. Pide al usuario el nombre de un archivo. 
	// Intenta abrirlo con FileReader y captura la excepción para informar que no se ha encontrado.
		System.out.println("Ejercicio 10");
		condicion = true;
		do {
		    try {
		        System.out.print("Introduce el nombre del archivo (con extensión): ");
		        String nombreArchivo = sc.nextLine();
		        nombreArchivo = "src/" + nombreArchivo;
		        FileReader fr = new FileReader(nombreArchivo);
		        System.out.println("El archivo se ha abierto correctamente.");
		        fr.close(); // Cierra el archivo
		        condicion = false;
		    } catch (FileNotFoundException fnfe) {
		        System.out.println("El archivo no se ha encontrado. Verifica el nombre y vuelve a intentarlo.");
		    } catch (IOException ioe) {
		    	System.out.println("Error al cerrar el archivo: " + ioe.getMessage());
		    }
		} while (condicion);
		System.out.println(SEP+"\n");
	*/
	/*
	// 11. Crea una clase EdadNegativaException y lánzala si el usuario introduce una edad menor a 0.
		System.out.println("Ejercicio 11");
		condicion = false;
		do {
            try {
                System.out.print("Introduce tu edad: ");
                int edad = sc.nextInt();

                if (edad < 0) {
                    throw new EdadNegativaException("La edad no puede ser negativa.");
                }

                System.out.println("Edad registrada correctamente: " + edad);
                condicion = true;

            } catch (InputMismatchException ime) {
                System.out.println("Error: debes introducir un número entero."); 
                sc.nextLine(); // limpiar el buffer
                ime.printStackTrace();
            } catch (EdadNegativaException ene) {
                System.out.println(ene.getMessage());
            }
        } while (condicion);
		System.out.println(SEP+"\n");
		
	// 12. Crea una clase NotaInvalidaException que se lanza si un alumno introduce una nota que no está entre 0 y 10.
		System.out.println("Ejercicio 12");
		System.out.println("Introduce una nota del 0 al 10:");
		condicion = true;
        do {
            try {
                double nota = sc.nextDouble();
                if (nota < 0 || nota > 10) {
                    throw new NotaInvalidaException("Nota fuera de rango. Debe estar entre 0 y 10.");
                }
                System.out.println("Nota registrada correctamente: " + nota);
                condicion = false;
            } catch (InputMismatchException ime) {
                System.out.println("Error: Debes introducir un número.");
                sc.nextLine(); // limpiar buffer
            } catch (NotaInvalidaException nie) {
                System.out.println(nie.getMessage());
                sc.nextLine(); // limpiar buffer
            }
        } while (condicion);

		System.out.println(SEP+"\n");
		
	// 13. Pide al usuario su nombre. Si está vacío o contiene solo espacios, lanza una excepción personalizada NombreVacioException.
		System.out.println("Ejercicio 13");
		condicion = true;
		do {
            try {
                System.out.print("Introduce tu nombre: ");
                String nombre = sc.nextLine();
                if (nombre.trim().isEmpty()) { //nombre.isBlack() --> fusión de trim().isEmpty()
                    throw new NombreVacioException("El nombre no puede estar vacío ni contener solo espacios.");
                }
                System.out.println("Nombre registrado correctamente: " + nombre);
                condicion = false;
            } catch (NombreVacioException nve) {
                System.out.println(nve.getMessage());
            }
        } while (condicion);
		System.out.println(SEP+"\n");
		
	// 14. Simula una operación bancaria. Si el usuario intenta retirar más dinero del que tiene, lanza SaldoInsuficienteException.
		System.out.println("Ejercicio 14");
		double saldo = 500.0; // saldo inicial de la cuenta
        condicion = true;
        do {
            try {
                System.out.println("Saldo actual: " + saldo + "€.");
                System.out.print("¿Cuánto quieres retirar?: ");
                double cantidad = sc.nextDouble();
                if (cantidad < 0) {
                    throw new IllegalArgumentException("No puedes retirar una cantidad negativa.");
                }
                if (cantidad > saldo) {
                    throw new SaldoInsuficienteException("Saldo insuficiente. No puedes retirar más de " + saldo + "€.");
                }
                saldo -= cantidad;
                System.out.println("Has retirado " + cantidad + "€. Nuevo saldo: " + saldo + "€");
                condicion = false;
            } catch (InputMismatchException ime) {
                System.out.println("Debes introducir un número.");
                sc.nextLine(); // limpiar el buffer
                System.out.println(ime);
                ime.printStackTrace();
            } catch (IllegalArgumentException iae) {
            	sc.nextLine(); // limpiar el buffer
                System.out.println(iae.getMessage());
            } catch (SaldoInsuficienteException sie) {
            	sc.nextLine(); // limpiar el buffer
                System.out.println(sie.getMessage());
            }
        } while (condicion);
		System.out.println(SEP+"\n");
	*/
	// 15. Pide al usuario una contraseña. Lanza ContrasenaInseguraException si no cumple con:
			// mínimo 8 caracteres,
			// al menos una mayúscula,
			// al menos un número.

		System.out.println("Ejercicio 15");
		boolean condicion = true;
		do {
            try {
                System.out.print("Introduce una contraseña segura: ");
                String contrasena = sc.nextLine();
                if (contrasena.length() < 8) {
                    throw new PasswordInseguroException("La contraseña debe tener al menos 8 caracteres.");
                }
                if (!contrasena.matches(".*[A-Z].*")) {
                    throw new PasswordInseguroException("La contraseña debe contener al menos una letra mayúscula.");
                }
                if (!contrasena.matches(".*\\d.*")) {
                    throw new PasswordInseguroException("La contraseña debe contener al menos un número.");
                }
                System.out.println("Contraseña aceptada.");
                condicion = false;
            } catch (PasswordInseguroException pie) {
                System.out.println(pie.getMessage());
            }
        } while (condicion);
		System.out.println(SEP+"\n");
		
		sc.close();
	}

}
