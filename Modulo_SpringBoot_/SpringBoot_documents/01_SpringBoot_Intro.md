# Manual de Spring Boot: Introducción Teórico-Práctica

## ¿Qué es Spring Boot?
Imagina que construir una aplicación es como construir una casa. El **Spring Framework** tradicional te da todas las herramientas (ladrillos, cemento, planos), pero tú tienes que ensamblarlo todo manualmente y configurar cada detalle. **Spring Boot**, en cambio, te entrega una casa **prefabricada** que ya viene con la mayoría de las cosas listas para usar, y tú solo debes personalizar algunos detalles. En términos técnicos, **Spring Boot es un framework de desarrollo para Java** que facilita la creación de aplicaciones **stand-alone** (autónomas) de nivel producción con mínima configuración.

Spring Boot se basa en Spring Framework, pero agrega varias características clave para simplificar el trabajo del desarrollador:

* **Autoconfiguración**: Spring Boot es capaz de **configurarse solo**. Por ejemplo, si detecta que incluyes una base de datos en tu proyecto, automáticamente configura una conexión por ti (puedes pensar en esto como un auto que ajusta sus espejos y asiento en cuanto detecta quién lo conduce).
* **Starters** (dependencias de inicio): Proporciona conjuntos de **dependencias preconfiguradas** llamados starters. En lugar de buscar librerías una por una para añadir funcionalidad (como web, base de datos, seguridad, etc.), Spring Boot ofrece "paquetes" de librerías que ya vienen listas para usarse para ciertos propósitos. Es como si compraras un kit de cocina que ya trae ollas, sartenes y utensilios necesarios, en lugar de adquirir cada utensilio por separado.
* **Servidor embebido**: Las aplicaciones Spring Boot por defecto se ejecutan con un **servidor web embebido** (generalmente Tomcat). Esto significa que no necesitas instalar un servidor externo para desplegar tu aplicación; simplemente ejecutas la aplicación Java y esta arranca su propio servidor web interno. En la práctica, tu aplicación se ejecuta y queda escuchando peticiones web (por ejemplo, HTTP) por sí sola.

En resumen, Spring Boot nos permite crear aplicaciones Java de forma **rápida y sencilla**, con poca configuración manual, lo que lo hace ideal tanto para pequeñas APIs como para microservicios y aplicaciones empresariales más grandes.

## ¿Qué es una API REST y qué vamos a construir?

Antes de sumergirnos en Spring Boot, es importante entender qué es una **API REST**, ya que nuestro proyecto final será construir una. 

**API** significa _Application Programming Interface_, o interfaz de programación de aplicaciones. En términos sencillos, una API es un **conjunto de reglas y rutas que permiten a dos aplicaciones comunicarse**. Imagina que una API es como el menú de un restaurante: el menú (API) ofrece una lista de platillos (servicios o datos) que puedes pedir. Cuando haces un pedido, un camarero (la API) toma tu solicitud, la lleva a la cocina (el servidor) y luego te trae el platillo preparado (la respuesta con los datos). En esta analogía:

* Tú (cliente) pides "un plato específico" usando el menú – esto equivale a que una aplicación cliente (por ejemplo, tu navegador o una aplicación móvil) hace una petición a una ruta específica de la API.
* El camarero (la API) entiende tu pedido, va a la cocina y lo solicita – esto sería el API gestionando la petición, posiblemente consultando una base de datos o lógica interna.
* La cocina (servidor / lógica de negocio) prepara el pedido – los datos se obtienen o procesan.
* El camarero te trae el plato – la API responde con los datos solicitados en un formato entendible (por lo general JSON en las APIs REST).

**REST** significa _Representational State Transfer_, que es un estilo de arquitectura para diseñar APIs web. Sin entrar en detalles teóricos profundos, las **APIs REST** suelen usar el protocolo HTTP y operan a través de métodos como GET, POST, PUT, DELETE, etc., para obtener, crear, actualizar o borrar datos respectivamente. Siguiendo la analogía del restaurante: GET sería "leer el menú u obtener un plato", POST "hacer un nuevo pedido", PUT "cambiar un pedido existente", DELETE "cancelar un pedido". Esto significa que crearemos una aplicación que expone ciertas rutas (URLs) a las cuales se les puede hacer peticiones (por ejemplo, desde un navegador o herramienta como Postman) y devolverá datos o realizará acciones. Por ejemplo, podríamos crear una API de gestión de tareas donde un cliente pueda obtener la lista de tareas, crear una nueva tarea, actualizar una tarea existente o eliminar una tarea. Todo esto paso a paso, aprendiendo los fundamentos teóricos a la vez que los aplicamos en ejercicios prácticos sencillos. Objetivo: Al final, tendrás una aplicación Spring Boot corriendo con un pequeño API REST funcional. Más importante aún, entenderás cómo llegamos allí, con conceptos claros sobre lo que es Spring Boot, cómo se configura el entorno, cómo se estructura el código (controladores, servicios, entidades) y cómo todo encaja.

## Preparación del entorno en Windows

Para empezar a desarrollar con Spring Boot, necesitamos preparar nuestro entorno de desarrollo. Como vamos a trabajar en Windows, los pasos incluyen la instalación de Java (JDK), la instalación de un IDE (usaremos **Eclipse**), y la configuración de algunas herramientas para Spring Boot (usaremos el plugin **Spring Tools** para Eclipse, también conocido como Spring Tools Suite).

### 1. Instalar Java JDK en Windows

Este paso se hace si no tienes Java instalado.

Spring Boot está basado en Java, así que lo primero es asegurarse de tener el JDK (Java Development Kit) instalado. El JDK es el kit de desarrollo de Java que nos permite compilar y ejecutar programas en este lenguaje. 

#### Paso 1: Descargar el JDK.

Este paso se hace si no tienes Java instalado.

Visita la página oficial de Oracle para descargar la versión más reciente del JDK (al momento de escribir este manual, Java 17 es una versión LTS - soporte a largo plazo). Puedes buscar "Download JDK 17 Windows" en tu navegador o ir directamente a la sección de descargas de Java en Oracle. Asegúrate de descargar el instalador para Windows (suele ser un archivo .exe).

#### Paso 2: Ejecutar el instalador.

Este paso se hace si no tienes Java instalado.

Una vez descargado el archivo (por ejemplo jdk-17_windows-x64_bin.exe), haz doble clic para ejecutarlo. Aparecerá un asistente de instalación.

* En la primera pantalla verás una bienvenida; haz clic en "Next" (Siguiente).
* Luego te preguntará la ubicación donde instalar Java. Puedes dejar la ubicación por defecto (usualmente C:\Program Files\Java\jdk-17.x.x) y presionar "Next".
* El instalador copiará los archivos. Espera a que finalice la barra de progreso.
* Al terminar, verás un mensaje de que la instalación fue exitosa. Presiona "Close" (Cerrar).

Con esto, Java ya estará instalado en tu sistema. 

#### Paso 3: Configurar variables de entorno.

Para poder usar Java desde la consola (y para que otras herramientas lo encuentren), es recomendable configurar las variables de entorno **JAVA_HOME** y ajustar la variable **PATH**. Esto permitirá, por ejemplo, que cuando ejecutes java o javac en una terminal, Windows sepa dónde buscar esos ejecutables.

* Abre el menú Inicio y busca "Variables de entorno" o "Editar las variables de entorno del sistema". Haz clic en esa opción.
* En la ventana de Propiedades del sistema, haz clic en el botón "Variables de entorno...".
* En la sección "Variables del sistema", haz clic en "Nueva..." para crear una nueva variable de entorno.
* Crea una variable llamada JAVA_HOME. En el campo "Valor de la variable", ingresa la ruta donde se instaló el JDK. Por ejemplo: C:\Program Files\Java\jdk-17.0.1 (asegúrate que coincida con tu versión instalada). Presiona Aceptar.
* Ahora, en la lista de variables del sistema, busca la variable llamada Path (o PATH) y selecciónala, luego haz clic en "Editar...".
* Se abrirá una lista de rutas. No borres nada que ya esté ahí. Simplemente haz clic en "Nuevo" y agrega una nueva entrada con el path al directorio bin del JDK. Siguiendo el ejemplo anterior, sería: C:\Program Files\Java\jdk-17.0.1\bin. Este paso le dice a Windows dónde encontrar el ejecutable de Java (java.exe y javac.exe).
* Acepta y cierra todas las ventanas de configuración.

#### Paso 4: Verificar la instalación de Java.

Abre una terminal o símbolo del sistema (puedes buscar "Símbolo del sistema" en Inicio). Escribe el comando:

```bash
java -version
```

y presiona Enter. Deberías ver un mensaje indicando la versión de Java instalada, por ejemplo: `java version "17.x.x" ...` confirmando que Java está listo para usarse.

### 2. Instalar Eclipse IDE

Ya lo tenéis instalado.

#### Paso 2: Ejecutar Eclipse.
Una vez instalado o extraído, ejecuta el archivo `eclipse.exe`. La primera vez te preguntará por un "workspace" (espacio de trabajo), que es la carpeta donde Eclipse almacenará tus proyectos. Puedes dejar la carpeta por defecto o elegir otra ruta (por ejemplo, C:\Users\<TuUsuario>\eclipse-workspace). Haz clic en "Launch" para iniciar Eclipse.

### 3. Instalar Spring Tools (STS) en Eclipse

Para facilitar la creación de proyectos Spring Boot, instalaremos el plugin **Spring Tools 4** en Eclipse. Este plugin añade asistentes y facilidades para trabajar con Spring Boot (como crear proyectos Spring Starter, autocompletado de propiedades, etc.). 

#### Paso 1: Abrir el Marketplace de Eclipse.

En Eclipse, ve al menú **Help** (Ayuda) y selecciona **Eclipse Marketplace**.... 

#### Paso 2: Buscar Spring Tools.

En la caja de búsqueda del Marketplace, escribe "Spring Tools 4" o simplemente "Spring". Entre los resultados deberías ver **"Spring Tools (aka Spring Tools 4) for Eclipse"**. Haz clic en el botón **Install** (Instalar) asociado a ese resultado. 

#### Paso 3: Instalar el plugin.

Se abrirá un asistente de instalación. Selecciona los componentes a instalar (usualmente todos los asociados a Spring Tools) y sigue adelante con "Confirm". Acepta los términos de licencia si te lo solicita y continúa. Eclipse descargará e instalará el plugin. Es posible que tarde unos minutos. Si aparece alguna advertencia de seguridad acerca de contenido no firmado, puedes aceptarlo (dado que es un plugin confiable de la comunidad Eclipse). 

#### Paso 4: Reiniciar Eclipse.

Tras la instalación, Eclipse probablemente te pedirá que se reinicie para completar los cambios. Acepta reiniciar. 

**Verificación**: Una vez reiniciado Eclipse, puedes verificar que el plugin está activo tratando de crear un nuevo proyecto Spring (en el siguiente paso lo haremos) o buscando en el menú File -> New si aparece la opción de Spring Starter Project. Si ves esa opción, ¡ya tienes todo lo necesario instalado!

Hasta aquí, tu entorno está listo: Java configurado, Eclipse funcionando con el plugin de Spring Boot. En la próxima sección, crearemos nuestro primer proyecto Spring Boot.

### Creación de un proyecto Spring Boot en Eclipse

Ahora entraremos en la práctica. Vamos a crear un **proyecto Spring Boot** utilizando Eclipse con el plugin Spring Tools que instalamos. Este proyecto será la base de lo que iremos construyendo a lo largo del manual. 

#### Paso 1: Crear nuevo proyecto Spring Starter.

En Eclipse, ve al menú **File (Archivo) -> New (Nuevo) -> Spring Starter Project**. (Si no aparece directamente, puedes intentar **File -> New -> Other...** y buscar "Spring Starter Project" en la lista de tipos de proyecto). 

Se abrirá un asistente llamado **"New Spring Starter Project"**. Este asistente en realidad se conecta a un servicio llamado _Spring Initializr_, el cual genera la estructura base de un proyecto Spring Boot con las dependencias que necesitemos. 

#### Paso 2: Configurar los detalles del proyecto.

En la primera pantalla, verás campos como:

* Name (Nombre del proyecto): Elige un nombre para tu proyecto, por ejemplo demo-api o mi-primer-api.
* Type (Tipo de proyecto): Asegúrate que esté seleccionado Maven Project (Maven es la herramienta de gestión de dependencias que usaremos, la veremos más adelante).
* Language (Lenguaje): Java.
* Spring Boot version: Elige la versión estable más reciente (por ejemplo, 3.x.x si está disponible).
* Packaging (Empaquetado): Selecciona Jar (ya que usaremos el servidor embebido, empaquetaremos la aplicación como un JAR ejecutable).
* Java version: Selecciona 17 (o la versión del JDK que instalaste).

Haz clic en **Next** (Siguiente). 

#### Paso 3: Elegir dependencias iniciales.

La siguiente pantalla te permite buscar y agregar **dependencias** (starters) al proyecto. Para nuestro proyecto básico, seleccionaremos al menos:

* **Spring Web**: Es el starter que incluye Spring MVC y el servidor Tomcat embebido, lo necesitamos para crear nuestra API web.
* (Opcional) **Spring Data JPA**: Si planeamos interactuar con una base de datos usando JPA (persistencia de datos), agregaremos este starter.
* (Opcional) **H2 Database**: Si vamos a usar una base de datos en memoria para pruebas (lo cual es útil para no instalar una base de datos real), selecciona H2.

> Nota: Puedes agregar dependencias más adelante también, no es obligatorio agregarlas todas ahora. Pero Spring Web sí es esencial para cualquier API REST.

Después de seleccionar las dependencias (al menos Spring Web), haz clic en **Finish** (Finalizar). 

#### Paso 4: Estructura inicial del proyecto.

Eclipse generará el proyecto con la estructura básica. Deberías ver en el Explorador de Proyectos algo así:

* Un directorio **src/main/java** donde estará el código fuente Java.
* Un paquete base (basado en el Group Id que definiste, por ejemplo `com.ejemplo.demo`) con una clase principal, algo como DemoApiApplication.java (el nombre varía según lo que ingresaste en Artifact/Name).
* Esta clase principal tendrá una anotación  `@SpringBootApplication` y un método `main`. En un momento explicaremos su significado.
* Un directorio **src/main/resources** con recursos, donde destaca un archivo `application.properties` (inicialmente vacío), que sirve para configurar la aplicación.
* El archivo **pom.xml** en la raíz del proyecto, que es la configuración de Maven con las dependencias y propiedades del proyecto.

¡Felicidades! Ya tienes un proyecto Spring Boot listo para ejecutarse. De hecho, podrías ejecutarlo ahora mismo aunque no haga nada útil todavía, solo para comprobar que todo esté bien:

* Haz clic derecho sobre el proyecto en Eclipse, selecciona **Run As -> Spring Boot App** (o **Run As -> Java Application**, el resultado será el mismo dado que el plugin reconoce la clase principal con `@SpringBootApplication`).
* Mira la consola de Eclipse; debería verse cómo Spring Boot arranca. Verás mensajes de logging en color, y al final algo como "Started DemoApiApplication in X seconds (JVM running for Y)" sin errores.
* Si todo arrancó bien, significa que tu entorno y tu proyecto están correctamente configurados. La aplicación está corriendo en un servidor Tomcat embebido en el puerto 8080 por defecto. Puedes comprobar abriendo un navegador e ingresando la URL `http://localhost:8080`. Probablemente veas un error o página vacía (porque aún no hemos definido ninguna ruta/controlador), pero al menos debe responder (incluso podría decir Whitelabel Error Page, indicando que el servidor está activo pero no hay contenido en esa ruta).

No te preocupes, a continuación empezaremos a agregar funcionalidad a esta aplicación.