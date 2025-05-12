package Ejercicios._02_herencias.nivelintermedio.gestionacademica;

public class enunciado {
/*
Diseñar un sistema completo para una academia que gestione
alumnos, profesores, asignaturas y calificaciones. Se aplicará herencia,
abstracción, polimorfismo, composición y lógica de negocio.


Requisitos mínimos (CLASES):
- Persona (clase abstracta):
	- Atributos: nombre, dni, correo.
	- Métodos: mostrarDatos().

- Alumno (hereda de Persona):
	- Atributo: matricula, List<AsignaturaMatriculada>.
	- Métodos: calcularMedia(), listarAsignaturas(), mostrarEstado().

- Profesor (hereda de Persona):
	- Atributos: departamento, List<AsignaturaImpartida>.
	- Métodos: listarAsignaturas(), asignarNota().

- Administrador (hereda de Persona):
	- Métodos: matricularAlumnoEnAsignatura(Alumno, Asignatura).

- Asignatura (superclase):
	- Atributos: nombre, codigo, creditos.
	- Método: mostrarInformacion().

- AsignaturaTeorica (hereda de Asignatura)
	- Atributo extra: tieneExamenFinal (boolean)

- AsignaturaPractica (hereda de Asignatura)
	- Atributo extra: requiereProyectoFinal (boolean)

- AsignaturaMatriculada:
	- Atributos: asignatura, nota, profesorResponsable.

- AsignaturaImpartida:
	- Atributos: asignatura, horario.

- Universidad:
	- Atributos: List<Alumno>, List<Profesor>, List<Asignatura>.
	- Métodos: mostrarResumen(), buscarPersonaPorDni(), listarAsignaturas().

Una vez diseñadas las clases con los requisitos mínimos pon en funcionamiento
el programa. Crea varios alumnos, que estén haciendo diferentes asignaturas,
muestra las asignaturas que está haciendo cada alumno, las asignaturas
que oferta la universidad, localiza alumnos por DNI...

Implementa una solución para evaluaciones: los profesores pueden asignar una nota
a los alumnos. Esta nota tiene que quedarse registrada en algún lugar.
Se tiene que poder conultar la nota, desde el profesor, desde el alumno, desde
el departamento, desde la universidad... Pero todos harán consultas diferentes:
El profesor puede consultar las notas individuales de sus alumnos.
Los alumnos pueden consultar su nota de cada asignatura, y la media de todas sus notas.
Los departamentos tienen que poder ver la nota que tienen todos los alumnos,
y el profesor que las ha puesto.
La universidad puede ver todo lo anterior.*/

}
