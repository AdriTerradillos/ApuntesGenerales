## Diferencia entre un Proyecto Java y un Proyecto Maven

Este documento está pensado para **nuevos programadores** que aún no tienen mucha experiencia y necesitan entender de forma clara y sencilla las diferencias fundamentales entre un **proyecto Java tradicional** y un **proyecto Maven**.

---

### 1. Introducción

* **Objetivo**: Comprender cómo se organiza, compila y gestiona un proyecto en Java "a mano" frente a uno que usa Maven.
* **Estructura del documento**:

  1. Definición de proyecto Java tradicional
  2. Definición de proyecto Maven
  3. Estructuras de carpetas y archivos clave
  4. Proceso de compilación y ejecución
  5. Gestión de dependencias
  6. Ventajas y desventajas
  7. Ejemplos prácticos con comandos y fragmentos de código

---

### 2. ¿Qué es un proyecto Java tradicional?

1. **Estructura mínima**:

   ```
   MiProyectoJava/
   ├─ src/
   │  └─ paquete/ClasePrincipal.java
   └─ lib/ (opcional para librerías externas)
   ```
2. **Compilación manual**:

   * Para compilar:

     ```bash
     javac -d bin src/paquete/ClasePrincipal.java
     ```
   * Para ejecutar:

     ```bash
     java -cp bin paquete.ClasePrincipal
     ```
3. **Gestión de librerías externas**:

   * Hay que descargar manualmente los *JARs* y colocarlos en `lib/`.
   * Al compilar y ejecutar, incluirlos en el *classpath*:

     ```bash
     javac -cp "lib/*:bin" -d bin src/paquete/*.java
     java -cp "lib/*:bin" paquete.ClasePrincipal
     ```
4. **Limitaciones**:

   * Nulo soporte de versiones: tú decides manualmente qué versión de cada librería bajar.
   * Sin ciclo de vida estandarizado.
   * Escalable solo a proyectos muy pequeños.

---

### 3. ¿Qué es un proyecto Maven?

1. **Herramienta de construcción y gestión de proyectos**:

   * Estándar de facto en el mundo Java.
   * Define un **ciclo de vida** (compilar, test, empaquetar, instalar, desplegar).
   * Maneja **dependencias** automáticamente.
   * Usa un archivo **`pom.xml`** (Project Object Model) para configurar todo.
2. **Estructura mínima**:

   ```
   MiProyectoMaven/
   ├─ pom.xml
   └─ src/
      ├─ main/
      │  ├─ java/
      │  │  └─ paquete/ClasePrincipal.java
      │  └─ resources/
      └─ test/
         └─ java/
            └─ paquete/TestClasePrincipal.java
   ```
3. **`pom.xml`**:

   * Define metadatos del proyecto (grupo, nombre, versión).
   * Declara dependencias (Maven las descarga de forma transitiva).
   * Configura plugins (por ejemplo, `maven-compiler-plugin`).

---

### 4. Estructura de carpetas y archivos clave

| Elemento                 | Proyecto Java      | Proyecto Maven                       |
| ------------------------ | ------------------ | ------------------------------------ |
| Raíz                     | Proyecto/          | ProyectoMaven/                       |
| Código fuente            | `src/paquete/`     | `src/main/java/paquete/`             |
| Recursos                 | (misma carpeta)    | `src/main/resources/`                |
| Tests                    | (manual)           | `src/test/java/`                     |
| Dependencias externas    | Carpeta `lib/`     | Declaradas en `pom.xml` (Maven Repo) |
| Archivo de configuración | Ninguno (o propio) | `pom.xml`                            |

---

### 5. Proceso de compilación y ejecución

#### 5.1 Proyecto Java tradicional

1. **Compilar**:

   ```bash
   javac -d bin src/paquete/*.java
   ```
2. **Ejecutar**:

   ```bash
   java -cp "bin" paquete.ClasePrincipal
   ```
3. **Añadir librerías**:

   ```bash
   javac -cp "lib/*:bin" -d bin src/paquete/*.java
   java  -cp "lib/*:bin" paquete.ClasePrincipal
   ```

#### 5.2 Proyecto Maven

1. **Compilar y empaquetar**:

   ```bash
   mvn clean package
   ```

   * Limpia (`clean`), compila (`compile`), ejecuta tests (`test`), empaqueta JAR (`package`).
2. **Ejecutar**:

   ```bash
   mvn exec:java -Dexec.mainClass="paquete.ClasePrincipal"
   ```

---

### 6. Gestión de dependencias

* **Java tradicional**: tú buscas y descargas cada JAR.
* **Maven**: solo declaras en `pom.xml`:

  ```xml
  <dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>5.3.27</version>
  </dependency>
  ```

  * Maven descarga esa librería y también todas sus dependencias (transitivas).

---

### 7. Ventajas y desventajas

| Ventajas                     | Proyecto Java | Proyecto Maven                          |
| ---------------------------- | ------------- | --------------------------------------- |
| Facilidad de inicio          | Muy bajo      | Muy alto (plantillas y arquetipos)      |
| Escalabilidad                | Mala          | Excelente (ciclos y dependencias)       |
| Gestión de versiones         | Manual        | Automática (repositorios centralizados) |
| Uniformidad en equipos       | Nula          | Estándar compartido (`pom.xml`)         |
| Curva de aprendizaje inicial | Baja          | Media                                   |

---

### 8. Ejemplos prácticos

#### 8.1 Crear proyecto Java tradicional

```bash
mkdir MiProyectoJava && cd MiProyectoJava
mkdir src bin
# Escribir src/paquete/ClasePrincipal.java
javac -d bin src/paquete/ClasePrincipal.java
java -cp bin paquete.ClasePrincipal
```

#### 8.2 Crear proyecto Maven usando arquetipo

```bash
mvn archetype:generate \
  -DgroupId=com.ejemplo \
  -DartifactId=MiProyectoMaven \
  -DarchetypeArtifactId=maven-archetype-quickstart \
  -DinteractiveMode=false
cd MiProyectoMaven
# Estructura ya creada automáticamente
mvn clean package
mvn exec:java -Dexec.mainClass="com.ejemplo.App"
```

---

### 9. Resumen final

> **Proyecto Java tradicional**: te da control absoluto, pero gestionas todo a mano.—útil para aprender conceptos básicos.
>
> **Proyecto Maven**: automatiza compilación, tests y dependencias; ideal para proyectos reales y trabajo en equipo.

---
