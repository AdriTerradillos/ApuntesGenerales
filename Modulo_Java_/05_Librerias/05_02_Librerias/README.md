# Librerías 02

En este ejemplo vamos a importar las librerías que hemos hecho en el proyecto **"Ed_02_Librerias"**.

Para importar librerías en Java podemos hacer los siguientes pasos:

1. Crear un proyecto y crear la carpeta **"lib"** en la raíz.
2. Copiar el `".jar"` que queramos en la carpeta lib.
3. Debemos modificar el `"classpath"` del proyecto Java para que se puedan usar las clases que están en el fichero `".jar"`. El `classpath` es fundamental en todos los proyectos Java. Es un fichero donde decimos al proyecto donde tiene que ir a buscar todos los `".class"` para que puedan ser usados.
4. Modificamos el `classpath`, para ello botón derecho sobre el proyeco y elegimos "build path" -> "configure build path".
5. Vamos a la pestaña `libraries` y pulsamos `classpath`. Se nos debería habilitar el botón de **"add JARs"**.
6. Una vez habilitado el botón, lo pulsamos y buscamos el fichero `".jar"` que queremos añadir a nuestro proyecto. Pulsamos "OK" y luego "Apply and Close".
7. Ya deberiamos poder usar las librerías en nuestro proyecto, podemos crear una clase "main" e importar las clases para poder usarlas.