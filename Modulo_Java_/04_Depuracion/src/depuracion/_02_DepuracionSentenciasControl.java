package depuracion;

import java.util.Scanner;

public class _02_DepuracionSentenciasControl {
	public static void main(String[] args) {
		//Podemos depurar sentencias de control con la misma
		//metodología
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número:");
		int numero1 = sc.nextInt();
		if(numero1 == 0) {
			int numero2 = 56;
			System.out.println("El número es 0");
		}
		
		for(int i = 0; i<=100;i++) {
			System.out.println("La variable de control de bucle es: " + i);
			if(i == 10) {
				if(numero1 != 0) {
					System.out.println("valor de número1: " + numero1);
					System.out.println("valor de i: " + i);
					System.out.println(12 / numero1);
				} else {
					System.out.println("No se puede dividir por 0");
				}
				
			}
		}
		
		System.out.println("Fin de programa");
		sc.close();
		
	}
}
