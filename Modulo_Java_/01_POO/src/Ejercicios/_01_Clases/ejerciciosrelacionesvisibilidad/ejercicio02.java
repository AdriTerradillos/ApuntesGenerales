package Ejercicios._01_Clases.ejerciciosrelacionesvisibilidad;

/*
====================
=   ENUNCIADO 02   =
====================


Ejercicio 2: Registro de Estudiantes y Cursos

====Enunciado:====

Un sistema necesita llevar un registro de estudiantes y los cursos en los que están inscritos.
Cada estudiante tiene un nombre, un identificador único y una lista de cursos en los que está inscrito.
Cada curso tiene un nombre, un código único y un número máximo de estudiantes.
El sistema debe permitir inscribir un estudiante en un curso (si hay espacio disponible),
dar de baja a un estudiante de un curso y mostrar la lista de estudiantes inscritos en un curso específico.

====Clases:====

***Estudiante:
	- Atributos: nombre (String), identificador (String), cursosInscritos (ArrayList de Curso).
	- Métodos: inscribirCurso(Curso curso), darDeBajaCurso(Curso curso), obtenerNombre(), obtenerIdentificador(), obtenerCursosInscritos().
***Curso:
	- Atributos: nombre (String), codigo (String), maxEstudiantes (int), estudiantesInscritos (ArrayList de Estudiante).
	- Métodos: inscribirEstudiante(Estudiante estudiante), darDeBajaEstudiante(Estudiante estudiante), obtenerNombre(), obtenerCodigo(), obtenerEstudiantesInscritos(), tieneEspacio().
***RegistroAcademico: (Clase principal)
	- Atributo: listaCursos (ArrayList de Curso), listaEstudiantes (ArrayList de Estudiante).
	- Métodos: agregarCurso(Curso curso), agregarEstudiante(Estudiante estudiante), inscribirEstudianteEnCurso(String idEstudiante, String codigoCurso), darDeBajaEstudianteDeCurso(String idEstudiante, String codigoCurso), mostrarEstudiantesPorCurso(String codigoCurso).
***UsuarioRegistro: (Clase principal para interactuar)
	- Método: main() que permita realizar las acciones mencionadas en el enunciado.

====Paquetes:====

entidades: Contendrá las clases Estudiante y Curso.
gestion: Contendrá la clase RegistroAcademico.
aplicacion: Contendrá la clase UsuarioRegistro.
 */

public class ejercicio02 {

}
