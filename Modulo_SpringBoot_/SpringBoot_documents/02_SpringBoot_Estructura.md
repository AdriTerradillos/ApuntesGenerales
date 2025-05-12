# Estructura de un proyecto Spring Boot

Antes de entrar de lleno a programar funcionalidades, es importante entender la estructura y componentes que acabamos de crear con el proyecto Spring Boot. Esto nos ayudará a saber **dónde escribir nuestro código** y cómo Spring Boot organiza las cosas.

## El archivo pom.xml y las dependencias

El **pom.xml** es el archivo de configuración de Maven. Maven es una **herramienta de gestión de dependencias y construcción** de proyectos Java. Piensa en Maven como el administrador de bibliotecas de tu proyecto: en el pom.xml le dices qué librerías (dependencias) necesitas, y Maven se encargará de descargarlas de internet (de repositorios centrales) y agregarlas a tu proyecto automáticamente. Esto evita tener que ir uno por uno buscando archivos .jar por la web. Abre el pom.xml del proyecto. Verás algo como:

```xml
<project ... xmlns="http://maven.apache.org/POM/4.0.0" ...>
  <modelVersion>4.0.0</modelVersion>
  
  <groupId>com.ejemplo</groupId>
  <artifactId>demo-api</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <packaging>jar</packaging>
  
  <parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>3.0.5</version>
    <relativePath/> <!-- lookup parent from repository -->
  </parent>
  
  <dependencies>
    <!-- Dependencia Starter Web -->
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    
    <!-- (Opcional) Dependencia Spring Data JPA -->
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    
    <!-- (Opcional) Dependencia H2 para base de datos en memoria -->
    <dependency>
      <groupId>com.h2database</groupId>
      <artifactId>h2</artifactId>
      <scope>runtime</scope>
    </dependency>

    <!-- Dependencia para pruebas (JUnit) omitida por brevedad -->
    
  </dependencies>
  
  <!-- ... otras configuraciones ... -->
</project>
```

Observa que en la sección `<dependencies>` aparecen los _starters_ que seleccionamos. Por ejemplo, `spring-boot-starter-web` es una dependencia clave que **incluye** varias librerías necesarias para crear una aplicación web: el servidor Tomcat, Spring MVC (modelo-vista-controlador), Jackson (para manejar JSON), entre otras. Del mismo modo,  `spring-boot-starter-data-jpa` incluye librerías para trabajar con JPA (Hibernate, etc.), y la dependencia H2 trae el controlador de base de datos en memoria.

Cuando decimos que nuestro proyecto tiene una **dependencia**, significa que nuestro código **depende de código externo** (librerías) para funcionar. La analogía de la receta y los ingredientes viene bien: si tu aplicación es un plato de cocina, las dependencias son los ingredientes que necesitas. En lugar de producir tú mismo cada ingrediente (lo cual sería imposible o muy tardado), simplemente los listas en tu "receta" (pom.xml) y Maven se encarga de traerlos de la despensa (internet) para ti. Sin esos ingredientes, tu plato no estaría completo.

## La clase principal y la anotación @SpringBootApplication

Busca en `src/main/java` la clase Java que termina con `Application` (cuando creaste el proyecto, seguramente la nombraste algo como `DemoApiApplication` o similar). Esta clase es el punto de entrada de la aplicación, y debe verse como:

```Java
package com.ejemplo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApiApplication.class, args);
    }
}
```

Veamos esto en detalle:

* La anotación `@SpringBootApplication` es una **anotación compuesta** que incluye a su vez otras anotaciones como  `@SpringBootConfiguration`, `@EnableAutoConfiguration` y `@ComponentScan`. En resumen, marcamos esta clase para que Spring Boot:
  * Sepa que aquí inicia la configuración de Spring (es la clase principal de configuración).
  * Habilite la autoconfiguración (Spring Boot escaneará el classpath y configurará muchos valores predeterminados por nosotros).
  * Haga un scan de componentes en el paquete base y subpaquetes (es decir, buscará automáticamente clases anotadas como controladores, servicios, etc., dentro de com.ejemplo.demo y los registrará como beans de Spring).

Piensa en `@SpringBootApplication` como el "banderazo de salida": le dice a Spring Boot "Esta es la aplicación, configúralo todo a partir de aquí".

* El método `main`: Este es un método estándar en Java (punto de entrada de cualquier aplicación Java). Dentro, llamamos a  `SpringApplication.run(...)` pasándole la clase principal y los argumentos. Esto le indica a Spring Boot que inicie la aplicación. Al ejecutarse, Spring Boot arranca su motor interno, configura el servidor embebido (Tomcat por defecto) y deja la aplicación lista para recibir solicitudes.

Cuando _ejecutaste_ la aplicación en la sección anterior, fue este método `main` el que se corrió. Esto levantó el servidor web en el puerto 8080 sin que tú tuvieras que escribir una sola línea de configuración para ese servidor; eso es la magia de Spring Boot y su autoconfiguración.
