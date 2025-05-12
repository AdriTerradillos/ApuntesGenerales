# Las anotaciones en Java y Spring

Antes de avanzar más, detengámonos a hablar de anotaciones, ya que acabamos de ver `@SpringBootApplication` y usaremos muchas otras como `@RestController`, `@Autowired`, etc.

Una **anotación** en Java es como una **etiqueta o post-it** que pegamos sobre una clase, método o propiedad para dar información adicional al framework o al propio compilador. Por sí mismas, las anotaciones **no ejecutan código**, sino que sirven como _metadatos_. La analogía del post-it es útil: imagina que pones un post-it en una página de un libro que dice "importante". El post-it en sí no cambia el contenido de la página, pero le dice al lector (en nuestro caso, al framework o a alguna herramienta) que tome en cuenta algo especial en esa sección.

En Spring (y otros frameworks), las anotaciones se usan para reducir la configuración manual. Por ejemplo, en lugar de escribir en un archivo de configuración XML que cierta clase es un controlador web, simplemente marcamos la clase con `@RestController` y Spring Boot automáticamente la reconocerá y la tratará como tal. Internamente, Spring Boot escaneará el código, verá esa anotación y **registrará la clase como un controlador** que manejará peticiones HTTP.

Otro ejemplo común es `@Autowired`, que se usa para indicar a Spring que **inyecte una dependencia** en ese punto (lo explicaremos más adelante, pero básicamente es decir "Spring, cuando crees esta clase, por favor asigna aquí un objeto que necesito, no me hagas crearlo manualmente").

Las anotaciones hacen posible la llamada **configuración por convenciones**. Es decir, con solo marcar o decorar las clases con ciertas anotaciones, Spring Boot ya sabe qué hacer con ellas sin que tengamos que escribir código extra. Esto simplifica y hace más legible el código.

En resumen, **anotación = metadato/etiqueta** en el código que le indica algo al framework. Por sí mismas no hacen nada hasta que una herramienta lee esa marca y actúa en consecuencia. Es como poner placas identificativas a tus clases para que Spring las reconozca y les dé un tratamiento especial según la placa.

## Inversión de Control (IoC) e Inyección de Dependencias (DI)

Estos dos conceptos son pilares de cómo funciona Spring Boot por debajo, pero explicados de manera simple:
* **Inversión de Control (IoC)**: En un programa tradicional, tú (tu código) creas y controlas los objetos y sus interacciones. En Spring, gran parte de ese control lo delegas al **contenedor de Spring** (a veces llamado contexto de Spring). Inversión de Control significa que en lugar de que tú crees los objetos, configures dependencias, etc., dejas que Spring lo haga por ti. Tú solo defines qué componentes existen (por ejemplo, con anotaciones) y Spring se encarga de instanciarlos y vincularlos. Es como contratar un asistente: antes tú hacías todo, ahora le dices al asistente lo que necesitas y él se encarga de prepararlo.
* **Inyección de Dependencias (DI)**: Una **dependencia** es cuando una clase necesita a otra para funcionar (por ejemplo, un _Controlador_ puede necesitar usar un _Servicio_, por lo tanto el servicio es una dependencia del controlador). Con DI, en lugar de que el controlador cree una instancia del servicio, Spring **inyecta** (proporciona) la instancia adecuada en el controlador automáticamente. Esto se suele hacer usando anotaciones como `@Autowired` sobre atributos o sobre el constructor. Volviendo a la analogía de la cocina: si el chef (controlador) necesita ingredientes (servicios), no tiene por qué ir al mercado a comprarlos él mismo (instanciarlos); en su lugar, un asistente (Spring) le entrega los ingredientes ya listos cuando los necesita.

El beneficio de IoC y DI es que las clases están **más desacopladas** y son más fáciles de probar y mantener. Para nosotros, por ahora, basta saber que gracias a esta mecánica, no tendremos que instanciar manualmente muchos objetos; Spring hará el trabajo pesado, siempre y cuando hayamos anotado y declarado correctamente nuestras clases. Con estos conceptos teóricos cubiertos (¡y respiremos un poco si fue mucha información!), estamos listos para la acción: escribir código y crear nuestra primera funcionalidad con Spring Boot.

## Lista de las anotaciones más comunes

### `@SpringBootApplication`

Le dice a Spring Boot que esta es la clase principal que inicia la aplicación. Es como el botón de encendido del programa.

En la clase principal (la que contiene el método main).

```Java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiAplicacion {

    public static void main(String[] args) {
        SpringApplication.run(MiAplicacion.class, args);
    }
}
```

### `@RestController`

Le dice a Spring que esta clase es un controlador web que responde a peticiones (como cuando un navegador pide una página o datos).

Encima de una clase.

```Java
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MiControlador {

    @GetMapping("/")
    public String saludar() {
        return "¡Hola mundo!";
    }
}
```

### `@GetMapping, @PostMapping, @PutMapping, @DeleteMapping`

Indican qué método debe responder a cada tipo de petición HTTP:

* `@GetMapping` → Pedir datos.
* `@PostMapping` → Enviar nuevos datos.
* `@PutMapping` → Actualizar datos.
* `@DeleteMapping` → Borrar datos.

Encima de métodos dentro de un `@RestController`.

```Java
@GetMapping("/usuarios")
public String listarUsuarios() {
    return "Aquí van los usuarios";
}
```

### `@RequestParam`

Permite obtener parámetros que vienen en la URL, como en:
`http://localhost:8080/saludo?nombre=Ana`

En los parámetros de un método.

```Java
@GetMapping("/saludo")
public String saludar(@RequestParam String nombre) {
    return "¡Hola " + nombre + "!";
}
```

### `@PathVariable`

Recoge valores que están en la propia ruta de la URL, como en:
`http://localhost:8080/usuario/5`

En los parámetros de un método.

```Java
@GetMapping("/usuario/{id}")
public String obtenerUsuario(@PathVariable int id) {
    return "Usuario con ID: " + id;
}
```

### `@Autowired`

Spring "inyecta" automáticamente un objeto.
Es decir, crea una instancia por nosotros.

En atributos, constructores o métodos.

```Java
@Service
public class MiServicio {
    public String obtenerDato() {
        return "Dato desde el servicio";
    }
}

@RestController
public class MiControlador {

    @Autowired
    private MiServicio servicio;

    @GetMapping("/dato")
    public String mostrarDato() {
        return servicio.obtenerDato();
    }
}
```

### `@Service, @Repository, @Component`

Son etiquetas para decirle a Spring que debe gestionar estas clases automáticamente:

* `@Component` → Genérico (cualquier clase).
* `@Service` → Lógica de negocio.
* `@Repository` → Clases que acceden a la base de datos.

Encima de clases.

```Java
@Service
public class CalculadoraServicio {
    public int sumar(int a, int b) {
        return a + b;
    }
}
```

### `@RequestBody`

Convierte un JSON recibido en un objeto Java automáticamente.

En el parámetro de un método.

```Java
@PostMapping("/crear")
public String crearUsuario(@RequestBody Usuario usuario) {
    return "Usuario " + usuario.getNombre() + " creado.";
}
```

### `@Entity y @Id`

* `@Entity` indica que una clase representa una tabla en la base de datos.
* `@Id` marca cuál atributo es la clave primaria.

Encima de clases (@Entity) y atributos (@Id).

```Java
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuario {

    @Id
    private int id;
    private String nombre;

    // getters y setters
}
```