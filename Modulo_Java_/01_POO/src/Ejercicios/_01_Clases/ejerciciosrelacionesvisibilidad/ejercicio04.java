package Ejercicios._01_Clases.ejerciciosrelacionesvisibilidad;

/*
====================
=   ENUNCIADO 04   =
====================


Ejercicio 4: Simulación de un Cajero Automático

====Enunciado:====

Un programa simula un cajero automático.
Cada cuenta bancaria tiene un número de cuenta y un saldo.
Los clientes (identificados por un número de cliente y un PIN) pueden consultar su saldo,
depositar dinero y retirar dinero de sus cuentas.
El cajero automático gestiona una colección de cuentas bancarias.
Para realizar cualquier operación, el cliente debe autenticarse ingresando su número de cliente y PIN.

====Clases:====

***CuentaBancaria:
	- Atributos: numeroCuenta (String), saldo (double).
	- Métodos: depositar(double cantidad), retirar(double cantidad), obtenerNumeroCuenta(), obtenerSaldo().
***Cliente:
	- Atributos: numeroCliente (String), pin (String), cuentaAsociada (CuentaBancaria).
	- Métodos: obtenerNumeroCliente(), verificarPin(String pin), obtenerCuentaAsociada().
***CajeroAutomatico: (Clase principal)
	- Atributo: listaClientes (ArrayList de Cliente).
	- Métodos: agregarCliente(Cliente cliente), autenticarCliente(String numeroCliente, String pin), consultarSaldo(Cliente cliente), depositar(Cliente cliente, double cantidad), retirar(Cliente cliente, double cantidad).
***UsuarioCajero: (Clase principal para interactuar)
	- Método: main() que permita realizar las acciones mencionadas en el enunciado.

====Paquetes:====

banco: Contendrá las clases CuentaBancaria y Cliente.
atm: Contendrá la clase CajeroAutomatico.
interfaz: Contendrá la clase UsuarioCajero.
 */

public class ejercicio04 {

}
