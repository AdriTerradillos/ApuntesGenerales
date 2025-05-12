# Ejercicios nivel básico

## Diferencia entre start y run

Crea una clase holaHilo que se extienda de Thread. El método run() debe imprimir 10 veces en consola Hola Mundo.

En el main, instancia dos objetos de HolaHilo, asígnales nombres distintos con setName(), y arráncalos con start().

Cambia el método start() por el método run(). ¿Qué ocurre?

## Interfaz runnable

Crea una clase CuentaRegresiva que implemente Runnable.

En run(), pide por consola un número n (puede ser parámetro en el constructor) y luego imprime de n a 0, con Thread.sleep(500) entre cada número.

En main, crea y lanza un hilo con tu CuentaRegresiva(5) llamado “Contador”.

## Uso de join()

Crea una clase ContadorCompartido con un campo int valor = 0 y un método incrementar() que haga valor++.

Implementa una clase Incrementador implements Runnable que, en run(), llame 1.000 veces a cont.val++ y luego imprima el valor final.

En main, crea un único ContadorCompartido y lanza 5 hilos Incrementador sobre ese mismo contador. Después de arrancarlos, hazles join() y muestra en consola el valor final de contador.valor.

## synchronized

Parte del ejercicio 3, modifica ContadorCompartido así:

```
public class ContadorCompartido {
  private int valor = 0;

  public synchronized void incrementar() {
    valor++;
  }

  public int getValor() {
    return valor;
  }
}
```
Cambia en Incrementador todas las referencias directas a cont.valor++ por cont.incrementar().

Vuelve a lanzar 5 hilos y hazles join().

## wait() y notify()

Crea una clase Buffer con una lista interna List<Integer> datos y un límite de capacidad de 2.

Implementa dos métodos:

public synchronized void producir(int x) throws InterruptedException
– Si la lista está llena, llama a wait() dentro de un while.
– Añade x a la lista, imprime “Producido: x” y llama a notify().

public synchronized int consumir() throws InterruptedException
– Si la lista está vacía, llama a wait() dentro de un while.
– Quita y devuelve el primer elemento, imprime “Consumido: x” y llama a notify().

Crea Productor implements Runnable que en bucle produzca números enteros consecutivos y duerma 300 ms cada vez.

Crea Consumidor implements Runnable que consuma en bucle, duerma 500 ms tras procesar el valor.

En main, lanza un hilo productor y dos consumidores.

## sleep()

Crea una clase TareaPesada implements Runnable cuyo run() haga un bucle de 20 iteraciones:

Cada iteración llama a Thread.sleep(1000).

Tras despertarse imprime “Iteración X completada”.

Captura InterruptedException e imprime “Tarea interrumpida en iteración X” antes de terminar el run().

En main:

Lanza la tarea en un hilo llamado "Pesado".

Tras 3 segundos, llama a interrupt() sobre ese hilo.

## ordenar con join()

Crea tres clases TareaA, TareaB, TareaC, cada una implementando Runnable y cuyo run() simplemente imprima:

Tarea A completada
(o B, C respectivamente).

En main:

Crea tres hilos hA, hB, hC con esas tareas.

Arráncalos en orden A → B → C, pero sin join() el orden de impresión puede mezclarse.

Modifica el código para que:

hA.start();
hA.join();
hB.start();
hB.join();
hC.start();
hC.join();
System.out.println("Todas las tareas han finalizado");

## ping-pong wait() y notify()

Crea una clase Pelota con un método sincronizado golpear(String jugador) que:

Imprime <jugador> dice: ping o pong según corresponda.

Alterna internamente un estado booleano pingTurno.

Tras imprimir, llama a notify() y luego a wait() dentro de un while.

Implementa dos Runnable:

JugadorPing hace 10 veces pelota.golpear("Ping").

JugadorPong hace 10 veces pelota.golpear("Pong").

En main, crea una misma instancia de Pelota y lanza los dos hilos.

