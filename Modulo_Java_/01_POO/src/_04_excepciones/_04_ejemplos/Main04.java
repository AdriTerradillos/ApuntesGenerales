package _04_excepciones._04_ejemplos;

import java.util.Scanner;

public class Main04 {
	public static void main(String[] args) {
		boolean continuar = false;
		Scanner sc = new Scanner(System.in);
		do{
			try{
				System.out.println("Introduzca dos numero a dividir.");				
				System.out.println("Introduzca el numerador:");
				int numerador = sc.nextInt();
				System.out.println("Introduzca el denominador:");
				int denominador = sc.nextInt();
				int resultado = numerador/denominador;
				System.out.println("El resultado es: " + resultado);
				continuar = false;
			}catch(Exception e){
				//gracias a la herencia y la jerarquía de las excepciones
				//podemos agrupar todas las excepciones en una sola
				//pero perdemos precisión
				System.err.println("Algún tipo de error ha ocurrido.");
				continuar = true;
			}finally {
				//el boque finally se ejecuta SIEMPRE tanto si hemos
				//pasado por el try como por el catch
				//suelen ir cierre de conexiones, ficheros, etc
			}
		}while(continuar);

		
		System.out.println("Programa terminado");
		sc.close();
	}
}