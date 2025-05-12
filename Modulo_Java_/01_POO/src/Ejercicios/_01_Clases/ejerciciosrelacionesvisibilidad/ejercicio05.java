package Ejercicios._01_Clases.ejerciciosrelacionesvisibilidad;

/*
====================
=   ENUNCIADO 05   =
====================


Ejercicio 5: Gestión de Tareas Pendientes (To-Do List)

====Enunciado:====

Un programa permite gestionar una lista de tareas pendientes.
Cada tarea tiene una descripción, una fecha de vencimiento y un estado (pendiente, en progreso, completada).
Los usuarios pueden agregar nuevas tareas, marcar una tarea como completada, listar todas las tareas y mostrar las tareas pendientes.
El programa también debe permitir guardar las tareas en un archivo y cargar las tareas desde un archivo.

====Clases:====

***Tarea:
	- Atributos: descripcion (String), fechaVencimiento (String), estado (Enum: PENDIENTE, EN_PROGRESO, COMPLETADA).
	- Métodos: marcarComoCompletada(), obtenerDescripcion(), obtenerFechaVencimiento(), obtenerEstado().
***ListaTareas: (Clase principal)
	- Atributo: tareas (ArrayList de Tarea).
	- Métodos: agregarTarea(Tarea tarea), marcarTareaCompletada(String descripcion), listarTareas(), mostrarTareasPendientes(), guardarTareas(String nombreArchivo), cargarTareas(String nombreArchivo).
***UsuarioTareas: (Clase principal para interactuar)
	- Método: main() que utilice Scanner y File, FileWriter para la persistencia.

====Paquetes:====

tareas: Contendrá la clase Tarea y el Enum para el estado.
gestionlista: Contendrá la clase ListaTareas.
aplicacionlista: Contendrá la clase UsuarioTareas.
 */

public class ejercicio05 {

}
