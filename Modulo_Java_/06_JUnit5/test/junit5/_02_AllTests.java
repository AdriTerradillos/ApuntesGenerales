package junit5;

import org.junit.platform.suite.api.SelectClasses;
//import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

/*
 * Si tenemos varias clases con test que queremos ejecutar, podemos crear
 * una clase "Suite" que sea la encargada de ejecutar todas las clases
 * con test que queramos.
 */

@Suite
//Aqui podemos poner todas las clases con test que tengamos
@SelectClasses({
        _01_Asserciones.class,
        _00_Anotaciones.class})
public class _02_AllTests {

}

/*
@SelectPackages("junit5.programa")

Anotación que sirve para incluir todas las clases de un mismo paquete.
Así no hace falta anotarlas de forma individual.

Se pueden combinar @SelectClasses y @SelectPackages
*/