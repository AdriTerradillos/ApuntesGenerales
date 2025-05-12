package bar;

import java.util.Scanner;

import model.*;
import enums.*;

public class appPedido {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Pedido<Producto> pedido = new Pedido<>();
		
		// Productos
		Bebida cocaCola = new Bebida("Cola", 2.5, 330, TipoBebida.REFRESCO);
		Bebida agua = new Bebida("Agua", 1.0, 500, TipoBebida.AGUA);
		Bebida cerveza = new Bebida("VollDamm", 3.5, 330, 7.2);
		Bebida doble = new Bebida("Mahou", 2.8, 330, 5.4);
		
		Comida pinchoTortilla = new Comida("Tortilla", 2.5, TipoComida.TAPA);
		Comida bocadilloCalamares = new Comida("B.Calamares", 4.5, TipoComida.BOCADILLO);
		Comida patatasBravas = new Comida("Bravas", 6.8, TipoComida.RACION);
		Comida flan = new Comida("Flan", 3.5, TipoComida.POSTRE);
		
		// Funcionamiento:
		// 1. Añadir cada producto a "pedido" con su cantidad.
		pedido.agregarProducto(cocaCola, 2);
		pedido.agregarProducto(agua);
		pedido.agregarProducto(cerveza, 3);
		pedido.agregarProducto(doble, 3);
		pedido.agregarProducto(patatasBravas);
		pedido.agregarProducto(pinchoTortilla, 3);
		pedido.agregarProducto(flan);
		pedido.agregarProducto(cerveza, 2);
		pedido.agregarProducto(doble);
		
		
		// 2. Pedir la cuenta
		pedido.imprimirTicket();
	}
	
	
	//TODO diferenciar alcohólica de NO alcohólica
	public static Bebida aniadirBebidaAlcoholica() {
		System.out.print("Nombre de la bebida: ");
		String nombre = sc.nextLine();
		System.out.print("Precio: ");
		double precio = sc.nextDouble();
		sc.nextLine();
		System.out.print("Mililitros: "); 
		int mililitros = sc.nextInt();
		sc.nextLine();
		System.out.print("Graduación: "); 
		double graduacion = sc.nextDouble();
		sc.nextLine();
		
		return new Bebida(nombre, precio, mililitros, graduacion);
		
	}
	
	public static Bebida aniadirBebida() {
		System.out.print("Nombre de la bebida: ");
		String nombre = sc.nextLine();
		System.out.print("Precio: ");
		double precio = sc.nextDouble();
		sc.nextLine();
		System.out.print("Mililitros: "); 
		int mililitros = sc.nextInt();
		sc.nextLine();
		System.out.print("Tipo de Bebida: "); 
		String tipo = sc.nextLine().toUpperCase();
		TipoBebida tipoBebida;
		
		switch(tipo) {
		case "AGUA":
			tipoBebida = TipoBebida.AGUA;
			break;
		case "CAFE":
			tipoBebida = TipoBebida.CAFE;
			break;
		case "REFRESCO":
			tipoBebida = TipoBebida.REFRESCO;
			break;
		case "INFUSION":
			tipoBebida = TipoBebida.INFUSION;
			break;
		case "ALCOHOL":
			tipoBebida = TipoBebida.ALCOHOL;
			break;
		default:
			tipoBebida = null;
		}
		return new Bebida(nombre, precio, mililitros, tipoBebida);
	}
	

}
