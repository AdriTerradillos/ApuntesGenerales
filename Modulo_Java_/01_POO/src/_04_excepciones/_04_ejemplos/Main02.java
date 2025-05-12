package _04_excepciones._04_ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

//mismo ejemplo pero de manera diferente, para capturar el nominador y el denominador
//por separado
public class Main02 {
	public static void main(String[] args) {
		boolean continuar = false;
		Scanner sc = new Scanner(System.in);
		
		int numerador = 0;
		do{
			try{				
				System.out.println("Introduzca dos numero a dividir");
				System.out.println("Introduzca el numerador");
				numerador = sc.nextInt();
				continuar = false;
			}catch(ArithmeticException ae){
				System.err.println("No se puede dividir por cero");
				continuar = true;
			}catch(InputMismatchException ime){
				System.err.println("Solo se adminten numeros");
				continuar = true;
			}catch(Exception e){
				System.err.println("Algun tipo de error ocurrido");
				continuar = true;
			}
		}while(continuar);
		
		continuar = false;
		do{
			try{
				System.out.println("Introduzca el denominador");
				int denominador = sc.nextInt();
				int resultado = numerador/denominador;
				System.out.println("El resultado es: " + resultado);
			}catch(ArithmeticException ae){
				System.err.println("No se puede dividir por cero");
				continuar = true;
			}catch(InputMismatchException ime){
				System.err.println("Solo se adminten numeros");
				continuar = true;
			}catch(Exception e){
				System.err.println("Algun tipo de error ocurrido");
				continuar = true;
			}
		}while(continuar);
		
		System.out.println("Programa terminado");
		sc.close();
	}
}
