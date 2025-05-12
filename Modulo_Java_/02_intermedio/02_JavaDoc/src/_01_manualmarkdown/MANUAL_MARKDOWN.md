
# Manual de uso Markdown

## Indice

* [1. Básico](#1)
  * [Encabezados](#2)
    * [Sintaxis alternativa](#3)
    * [Buenas prácticas](#4)
  * [Párrafos](#5)
    * [Buenas prácticas](#6)
  * [Saltos de línea](#7)
    * [Buenas prácticas](#8)
  * [Émfasis](#9)
    * [Negrita (bold)](#10)
    * [Buenas prácticas](#11)
    * [Cursiva (italic)](#12)
      * [Buenas prácticas](#13)
    * [Negrita y Cursiva (bold & italic)](#14)
      * [Buenas prácticas](#15)
  * [Blockquotes](#16)
    * [Blockquotes con párrafos múltiples](#17)
    * [Blockquotes anidados](#18)
    * [Blockquotes con otros elementos](#19)
      * [Buenas prácticas](#20)
  * [Listas](#21)
    * [Lista ordenada](#22)
      * [Buenas prácticas](#23)
    * [Lista desordenada](#24)
    * [Empezar con número en lista desordenada](#25)
    * [Añadir elementos a una lista](#26)
      * [Párrafos](#27)
      * [Blockquote](#28)
      * [Bloque de código](#29)
      * [Imagen](#30)
      * [Lista](#31)
  * [Código](#32)
    * [Escapes](#33)
    * [Bloques de código](#34)
  * [Separadores horizontales](#35)
    * [Buenas prácticas](#36)
  * [Enlaces](#37)
    * [Añadir título](#38)
    * [URL y email](#39)
    * [Formato de enlaces](#40)
    * [Estilo de las referencias](#41)
      * [Formato de la primera parte del enlace](#42)
      * [Formato de la segunda parte del enlace](#43)
    * [Buenas prácticas](#44)
  * [Imágenes](#45)
  * [Escapando caracteres](#47)
  * [HTML](#48)
* [2. Avanzado](#49)
  * [Tablas](#50)
    * [Alineación de texto](#51)
    * [Formato de texto](#52)
    * [Escapar `|` en una tabla](#53)
  * [Pie de página](#54)
  * [Identificar títulos](#55)
    * [Enlazar títulos](#56)
  * [Lista de definiciones](#57)
  * [Texto tachado](#58)
  * [Listas de tareas](#59)
  * [Emoji](#60)
    * [Copiar y pegar](#61)
    * [Atajos de emoji](#62)
  * [Resaltado de texto](#63)
  * [Subíndice y superíndice](#64)


---

<h2 id="1">1. Básico</h2>

Casi todas las aplicaciones soportan la sintáxis básica de Markdown. No obstante, hay algunas ligeras discrepancias entre los diferentes procesadores.

<h3 id="2">Encabezados</h3>

Para generar diferentes niveles de título hay que añadir difernte número de `#` antes. Hay seis niveles de título:

<table>
  <thead>
    <tr>
      <th>Markdown</th>
      <th>HTML</th>
      <th>Output</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><code># Heading level 1</code></td>
      <td><code>&lt;h1&gt;Heading level 1&lt;/h1&gt;</code></td>
      <td><h1>Heading level 1</h1></td>
    </tr>
    <tr>
      <td><code>## Heading level 2</code></td>
      <td><code>&lt;h2&gt;Heading level 2&lt;/h2&gt;</code></td>
      <td><h2>Heading level 2</h2></td>
    </tr>
    <tr>
      <td><code>### Heading level 3</code></td>
      <td><code>&lt;h3&gt;Heading level 3&lt;/h3&gt;</code></td>
      <td><h3>Heading level 3</h3></td>
    </tr>
    <tr>
      <td><code>#### Heading level 4</code></td>
      <td><code>&lt;h4&gt;Heading level  4&lt;/h4&gt;</code></td>
      <td><h4>Heading level 4</h4></td>
    </tr>
    <tr>
      <td><code>##### Heading level 5</code></td>
      <td><code>&lt;h5&gt;Heading level 5&lt;/h5&gt;</code></td>
      <td><h5>Heading level 5</h5></td>
    </tr>
    <tr>
      <td><code>###### Heading level 6</code></td>
      <td><code>&lt;h6&gt;Heading level 6&lt;/h6&gt;</code></td>
      <td><h6>Heading level 6</h6></td>
    </tr>
  </tbody>
</table>

<h4 id="3">Sintaxis alternativa</h4>

Para el **nivel 1** se puede utilizar un separador `=` en la línea inmediatamente inferior. Para el **nivel 2** se puede utilizar un separador `-` en la línea inmediatamente inferior.

    Titulo 1
    ========

    Titulo 2
    --------

<h4 id="4">Buenas prácticas</h4>

* Antes y después de un título de cualquier nivel hay que dejar una línea en blanco.

* Después del o de los `#` hay que dejar un espacio.

Ejemplo:

    1 
    2 # Titulo 1
    3
    4 Texto que va debajo de Titulo 1
    5 
    6 ## Titulo 2
    7
    8 Texto que va debajo de Titulo 2

<h3 id="5">Párrafos</h3>

Para separar párrafos utiliza una línea en blanco entre ambos.

    1 Esto es el primer párrafo.
    2
    3 Esto es el segundo párrafo.
    4
    5 Esto es el tercer párrafo.

<h4 id="6">Buenas prácticas</h4>

No hay que indentar párrafos con espacios o tabulaciones. Si queres iniciar un párrafo con varios espacios iniciales [consulta cómo indentar correctamente](#).

<table>
  <thead>
    <tr>
      <th>Haz esto</th>
      <th>Evita esto</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>
        <code>
          Don't put tabs or spaces in front of your paragraphs.<br><br>
          Keep lines left-aligned like this.
        </code>
      </td>
      <td>
        <code>
        &nbsp;&nbsp;&nbsp;&nbsp;This can result in unexpected
        formatting problems.<br><br>
        &nbsp;&nbsp;&nbsp;&nbsp;Don't add tabs or spaces in front of paragraphs.
        </code>
      </td>
    </tr>
  </tbody>
</table>

<h3 id="7">Saltos de línea</h3>

Para hacer un salto de línea. Hay que hacer dos espacios al final de la línea antes de pulsar `enter`. Se pueden añadir saltos de línea con la etiqueta `HTML` `<br>`.

<table>
  <thead>
    <tr>
      <th>Markdown</th>
      <th>HTML</th>
      <th>Output</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>
        <code>
          This is the first line.
          And this is the second line.
        </code>
      </td>
      <td>
        <code>
          &lt;p&gt;This is the first line.&lt;br&gt;<br>
          And this is the second line.&lt;/p&gt;
        </code>
      </td>
      <td>
        <p>This is the first line.<br>   
        And this is the second line.</p>
      </td>
    </tr>
  </tbody>
</table>

<h4 id="8">Buenas prácticas</h4>

Aunque hay otras formas lo mejor es utilizar `<br>`, o los dos espacios al final de la línea.

<h3 id="9">Énfasis</h3>

<h4 id="10">Negrita (bold)</h4>

Se puede utilizar `**` antes y después, `__` antes y después y `<strong>` ó `<b>`.

<table>
  <thead>
    <tr>
      <th>Markdown</th>
      <th>HTML</th>
      <th>Output</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><code>I just love **bold text**.</code></td>
      <td><code>I just love &lt;strong&gt;bold text&lt;/strong&gt;.</code></td>
      <td>I just love <strong>bold text</strong>.</td>
    </tr>
    <tr>
      <td><code>I just love __bold text__.</code></td>
      <td><code>I just love &lt;strong&gt;bold text&lt;/strong&gt;.</code></td>
      <td>I just love <strong>bold text</strong>.</td>
    </tr>
    <tr>
      <td><code>Love**is**bold</code></td> <td><code>Love&lt;strong&gt;is&lt;/strong&gt;bold</code></td>
      <td>Love<strong>is</strong>bold</td>
    </tr>
  </tbody>
</table>

<h5 id="11">Buenas prácticas</h5>

Siempre es mejor utilizar `**` cuando estemos trabajando en `Markdown`.

<h4 id="12">Cursiva (italic)</h4>

Se puede utilizar `*` antes y después, `_` antes y después y `<em>` ó `<i>`.

<table>
  <thead>
    <tr>
      <th>Markdown</th>
      <th>HTML</th>
      <th>Output</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><code>Italicized text is the *cat's meow*.</code></td>
      <td><code>Italicized text is the &lt;em&gt;cat's meow&lt;/em&gt;.</code></td>
      <td>Italicized text is the <em>cat’s meow</em>.</td>
    </tr>
    <tr>
      <td><code>Italicized text is the _cat's meow_.</code></td>
      <td><code>Italicized text is the &lt;em&gt;cat's meow&lt;/em&gt;.</code></td>
      <td>Italicized text is the <em>cat’s meow</em>.</td>
    </tr>
    <tr>
      <td><code>A*cat*meow</code></td>
      <td><code>A&lt;i&gt;cat&lt;/i&gt;meow</code></td>
      <td>A<i>cat</i>meow</td>
    </tr>
  </tbody>
</table>

<h5 id="13">Buenas prácticas</h5>

Siempre es mejor utilizar `_` cuando estemos trabajando en `Markdown`.

<h4 id="14">Negrita y Cursiva (bold & italic)</h4>

Es la combinación de las anteriores:

* `***` delante y detrás.
* `***` delante y detrás.
* `**_` delante y detrás.
* `__*` delante y detrás.
* `<em><strong>`
* `<i><b>`

<h5 id="15">Buenas prácticas</h5>

Siempre es mejor utilizar `***` cuando estemos trabajando en `Markdown`.

<h3 id="16">Blockquotes</h3>

Para crear un bloque de citación usa el símbolo `>` antes del párrafo.

    > Así haces el bloque para una cita.

> Así se ve el Blockquote.

<h4 id="17">Blockquotes con párrafos múltiples</h4>

Para crear un bloque de citación usa el símbolo `>`, delante de cada línea del bloque tienes que añadirlo, sea o no una línea con texto. En algunos editores se añade sólo simplemente pulsando `enter`.

    > Esto es la primera línea.
    >
    > Esto el segun párrafo, dejando la línea de separación.

> Así es como se ve el bloque.
>
> Con más de un párrafo.

<h4 id="18">Blockquotes anidados</h4>

Para crear un bloque de citación usa el símbolo `>` antes del párrafo. Si quieres añadir otro bloque dentro usa `>>` en la línea que empieza ese bloque.

    > Esto es del primer bloque.
    >
    >> Esto es del segundo bloque.

> Esto es del primer bloque.
>> Esto es del segundo bloque.
>>> Esto es del tercer bloque.
>>>> ...

<h4 id="19">Blockquotes con otros elementos</h4>

Se pueden usar otros elementos, como la jerarquía de títulos (`#`, `##`, `###`, ...), las listas (`-`), letra en negrita y cursiva (`**`, `*`)... y más.

    > ### Esto es un bloque
    >
    > - Puedo utilizar otros elementos.
    > - Anidarlos entre ellos.
    >
    > Usar *cursiva* y también **negrita**.
    > Y más cosas...

> ### Esto es un bloque
>
> - Puedo utilizar otros elmentos.
> - Anidarlos entre ellos.
>
> Usar *cursiva* y también **negrita**.
> Y más cosas...

<h5 id="20">Buenas prácticas</h5>

Deja una línea en blanco antes y después del bloque.

<h3 id="21">Listas</h3>

Se pueden crear y organizar listas ordenadas y desordenadas.

<h4 id="22">Lista ordenada</h4>

Una lista ordenada empieza con `1. ` (uno, punto, espacio) seguido de aquello que deba contener. No hace falta que los números estén ordenados. Si utilizas `HTML` dentro de `Markdown` utiliza las etiquetas `<ol>` y `<li>`. 

<table>
  <thead>
    <tr>
      <th>Markdown</th>
      <th>HTML</th>
      <th>Output</th>
    </tr>
  </thead>
  <tbody>
  <tr>
    <td>
      <code>
        1. First item<br>
        2. Second item<br>
        3. Third item<br>
        4. Fourth item
      </code>
    </td>
    <td>
      <code>
        &lt;ol&gt;<br>
          &nbsp;&nbsp;&lt;li&gt;First item&lt;/li&gt;<br>
          &nbsp;&nbsp;&lt;li&gt;Second item&lt;/li&gt;<br>
          &nbsp;&nbsp;&lt;li&gt;Third item&lt;/li&gt;<br>
          &nbsp;&nbsp;&lt;li&gt;Fourth item&lt;/li&gt;<br>
        &lt;/ol&gt;
      </code>
    </td>
    <td>
      <ol>
        <li>First item</li>
        <li>Second item</li>
        <li>Third item</li>
        <li>Fourth item</li>
      </ol>
    </td>
    </tr>
    <tr>
      <td>
        <code>
          1. First item<br>
          2. Second item<br>
          3. Third item<br>
          4. Fourth item
        </code>
      </td>
      <td>
        <code>
          &lt;ol&gt;<br>
            &nbsp;&nbsp;&lt;li&gt;First item&lt;/li&gt;<br>
            &nbsp;&nbsp;&lt;li&gt;Second item&lt;/li&gt;<br>
            &nbsp;&nbsp;&lt;li&gt;Third item&lt;/li&gt;<br>
            &nbsp;&nbsp;&lt;li&gt;Fourth item&lt;/li&gt;<br>
          &lt;/ol&gt;
        </code>
      </td>
      <td>
        <ol>
          <li>First item</li>
          <li>Second item</li>
          <li>Third item</li>
          <li>Fourth item</li>
        </ol>
      </td>
    </tr>
    <tr>
      <td>
        <code>
          5. First item<br>
          6. Second item<br>
          7. Third item<br>
          8. Fourth item
        </code>
      </td>
      <td>
        <code>
          &lt;ol&gt;<br>
            &nbsp;&nbsp;&lt;li&gt;First item&lt;/li&gt;<br>
            &nbsp;&nbsp;&lt;li&gt;Second item&lt;/li&gt;<br>
            &nbsp;&nbsp;&lt;li&gt;Third item&lt;/li&gt;<br>
            &nbsp;&nbsp;&lt;li&gt;Fourth item&lt;/li&gt;<br>
          &lt;/ol&gt;
        </code>
      </td>
      <td>
        <ol>
          <li>First item</li>
          <li>Second item</li>
          <li>Third item</li>
          <li>Fourth item</li>
        </ol>
      </td>
    </tr>
    <tr>
      <td>
        <code>
          9. First item<br>
          10. Second item<br>
          11. Third item<br>
          &nbsp;&nbsp;&nbsp;&nbsp;1. Indented item<br>
          &nbsp;&nbsp;&nbsp;&nbsp;2. Indented item<br>
          12. Fourth item
        </code>
      </td>
      <td>
        <code>
          &lt;ol&gt;<br>
            &nbsp;&nbsp;&lt;li&gt;First item&lt;/li&gt;<br>
            &nbsp;&nbsp;&lt;li&gt;Second item&lt;/li&gt;<br>
            &nbsp;&nbsp;&lt;li&gt;Third item<br>
              &nbsp;&nbsp;&nbsp;&nbsp;&lt;ol&gt;<br>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;li&gt;Indented item&lt;/li&gt;<br>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;li&gt;Indented item&lt;/li&gt;<br>
              &nbsp;&nbsp;&nbsp;&nbsp;&lt;/ol&gt;<br>
            &nbsp;&nbsp;&lt;/li&gt;<br>
            &nbsp;&nbsp;&lt;li&gt;Fourth item&lt;/li&gt;<br>
          &lt;/ol&gt;
        </code>
      </td>
      <td>
        <ol>
          <li>First item</li>
          <li>Second item</li>
          <li>Third item
            <ol>
              <li>Indented item</li>
              <li>Indented item</li>
            </ol>
          </li>
          <li>Fourth item</li>
        </ol>
      </td>
    </tr>
  </tbody>
</table>

También existe la posibilidad de utilizar jerarquía de hasta tres niveles:

    1. Primer nivel, ítem 1.
    2. Primer nivel, ítem 2.
       1. Segundo nivel, ítem 1.
       2. Segundo nivel, ítem 2.
          1. Tercer nivel, ítem 1.
       3. Segundo nivel, ítem 3.
          1. Tercer nivel, ítem 2.
    3. Primer nivel, item 3.

1. Primer nivel, ítem 1.
2. Primer nivel, ítem 2.
   1. Segundo nivel, ítem 1.
   2. Segundo nivel, ítem 2.
      1. Tercer nivel, ítem 1.
      2. Tercer nivel, ítem 2.
         1. Cuarto nivel, ítem 1. 
   3. Segundo nivel, ítem 3.
      1. Tercer nivel, ítem 1.
3. Primer nivel, ítem 3.

<h5 id=23">Buenas prácticas</h5>

Aunque se puede utilizar el paréntesis (`)`) como delimitador para la numeración de la lista no todos los editores lo son compatibles. Siempre será mejor utilizar `1. `, `2. `, `3. `...

<h4 id="24">Lista desordenada</h4>

Para una lista desordenada se puede utilizar tanto guiones (`-`), como asteriscos (`*`), como el signo sumar (`+`) al principio de las líneas. 

<table>
  <thead>
    <tr>
      <th>Markdown</th>
      <th>HTML</th>
      <th>Output</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>
        <code>
          - First item<br>
          - Second item<br>
          - Third item<br>
          - Fourth item
        </code>
      </td>
      <td>
        <code>
          &lt;ul&gt;<br>
            &nbsp;&nbsp;&lt;li&gt;First item&lt;/li&gt;<br>
            &nbsp;&nbsp;&lt;li&gt;Second item&lt;/li&gt;<br>
            &nbsp;&nbsp;&lt;li&gt;Third item&lt;/li&gt;<br>
            &nbsp;&nbsp;&lt;li&gt;Fourth item&lt;/li&gt;<br>
          &lt;/ul&gt;
        </code>
      </td>
      <td>
        <ul>
          <li>First item</li>
          <li>Second item</li>
          <li>Third item</li>
          <li>Fourth item</li>
        </ul>
      </td>
    </tr>
    <tr>
      <td>
        <code>
          * First item<br>
          * Second item<br>
          * Third item<br>
          * Fourth item
        </code>
      </td>
      <td>
        <code>
          &lt;ul&gt;<br>
            &nbsp;&nbsp;&lt;li&gt;First item&lt;/li&gt;<br>
            &nbsp;&nbsp;&lt;li&gt;Second item&lt;/li&gt;<br>
            &nbsp;&nbsp;&lt;li&gt;Third item&lt;/li&gt;<br>
            &nbsp;&nbsp;&lt;li&gt;Fourth item&lt;/li&gt;<br>
          &lt;/ul&gt;
        </code>
      </td>
      <td>
        <ul>
          <li>First item</li>
          <li>Second item</li>
          <li>Third item</li>
          <li>Fourth item</li>
        </ul>
      </td>
    </tr>
    <tr>
      <td>
        <code>
          + First item<br>
          + Second item<br>
          + Third item<br>
          + Fourth item
        </code>
      </td>
      <td>
        <code>
          &lt;ul&gt;<br>
            &nbsp;&nbsp;&lt;li&gt;First item&lt;/li&gt;<br>
            &nbsp;&nbsp;&lt;li&gt;Second item&lt;/li&gt;<br>
            &nbsp;&nbsp;&lt;li&gt;Third item&lt;/li&gt;<br>
            &nbsp;&nbsp;&lt;li&gt;Fourth item&lt;/li&gt;<br>
          &lt;/ul&gt;
        </code>
      </td>
      <td>
        <ul>
          <li>First item</li>
          <li>Second item</li>
          <li>Third item</li>
          <li>Fourth item</li>
        </ul>
      </td>
    </tr>
    <tr>
      <td>
        <code>
          - First item<br>
          - Second item<br>
          - Third item<br>
          &nbsp;&nbsp;&nbsp;&nbsp;- Indented item<br>
          &nbsp;&nbsp;&nbsp;&nbsp;- Indented item<br>
          - Fourth item
        </code>
      </td>
      <td>
        <code>
          &lt;ul&gt;<br>
            &nbsp;&nbsp;&lt;li&gt;First item&lt;/li&gt;<br>
            &nbsp;&nbsp;&lt;li&gt;Second item&lt;/li&gt;<br>
            &nbsp;&nbsp;&lt;li&gt;Third item<br>
              &nbsp;&nbsp;&nbsp;&nbsp;&lt;ul&gt;<br>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;li&gt;Indented item&lt;/li&gt;<br>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;li&gt;Indented item&lt;/li&gt;<br>
              &nbsp;&nbsp;&nbsp;&nbsp;&lt;/ul&gt;<br>
            &nbsp;&nbsp;&lt;/li&gt;<br>
            &nbsp;&nbsp;&lt;li&gt;Fourth item&lt;/li&gt;<br>
          &lt;/ul&gt;
        </code>
      </td>
      <td>
        <ul>
          <li>First item</li>
          <li>Second item</li>
          <li>Third item
            <ul>
              <li>Indented item</li>
              <li>Indented item</li>
            </ul>
          </li>
          <li>Fourth item</li>
        </ul>
      </td>
    </tr>
  </tbody>
</table>

Al igual que las listas ordenadas también tienen hasta tres niveles de jerarquía. Se puede utilizar cualquiera de los símbolos indistintamente.

    * Nivel 1
    * Nivel 1
      * Nivel 2
      * Nivel 2
        * Nivel 3
        * Nivel 3
      * Nivel 2
    * Nivel 1

* Nivel 1
* Nivel 1
  * Nivel 2
  * Nivel 2
    * Nivel 3
    * Nivel 3
  * Nivel 2
* Nivel 1

<h5 id=25">Empezar con número en lista desordenada</h5>

Se tiene que utilizar backslash (`\`) para hacer un escape. 

<table>
  <thead>
    <tr>
      <th>Markdown</th>
      <th>HTML</th>
      <th>Output</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>
        <code>
          - 1968\. A great year!<br>
          - I think 1969 was second best.
        </code>
      </td>
      <td>
        <code>
          &lt;ul&gt;<br>
            &nbsp;&nbsp;&lt;li&gt;1968. A great year!&lt;/li&gt;<br>
            &nbsp;&nbsp;&lt;li&gt;I think 1969 was second best.&lt;/li&gt;<br>
          &lt;/ul&gt;
        </code>
      </td>
      <td>
        <ul>
          <li>1968. A great year!</li>
          <li>I think 1969 was second best.</li>
        </ul>
      </td>
    </tr>
  </tbody>
</table>

<h5 id="26">Buenas prácticas</h5>

Siempre hay que utilizar el mismo signo para una lista. ¡No los combines!

<h4 id="26">Añadir elementos a una lista</h4>

Se puede añadir cualquier elemento dentro de una lista utilizando la indentanción. Cuatro espacios o un tabulador, en el caso de abrir un bloque de código serán ocho espacios o un tabulador.

<h5 id="27">Párrafos</h5>

    * Item
    * Item
  
        Esto es un párrafo.
    
    * Item

* Item
* Item
  
    Esto es un párrafo.

* Item
  
<h5 id="28">Blockquote</h5>

    * Item
    * Item
  
        > Esto es un blockquote.
    
    * Item

* Item
* Item
  
    > Esto es un blockquote.

* Item

<h5 id="29">Bloque de código</h5>

    * Item
    * Item

        ```Java
        String saludo = "Hola";
        System.out.println(saludo + " Mundo");
        ```
    
    * Item

* Item
* Item

    ```Java
    String saludo = "Hola";
    System.out.println(saludo + " Mundo");
    ```

* Item

<h5 id="30">Imagen</h5>

Se añaden imágenes como cualquier otro enlace, salvo que en el caso de las imágenes hay que añadir un signo de admiración (`!`) al principio. La sintaxis es la siguiente:

    ![lo que quieres ver en el texto](ruta o enlace)

Se hará del mismo modo que en el caso de añadir un bloque de código.

<h5 id="31">Lista</h5>

Se puede anidar una lista ordenada con una lista desordenada y viceversa.

1. Item ordenado 1
2. Item ordenado 2
    - Item desordenado 1
      - Item desordenado 1
    - Item desordenado 2
- Item desordenado 3
  1. Item ordenado 1
  2. Item ordenado 2 

<h3 id="32">Código</h3>

Se utiliza el acento grave (`` ` ``) a principio y final de texto para marcar esa palabra como código.
    
    Esto es `codigo` y lo demás no.

Esto es `codigo` y lo demás no.

Se puede combinar con el uso de **negrita**, *cursiva* y ambas: siempre el acento debe estar en última posición antes de la palabra, es lo último en abrir y lo primero en cerrar.

<h4 id="33">Escapes</h4>

Si lo que queremos destacar como código incluye alguna tilde grave se puede escapar abriendo y cerrando con doble tilde (` `` `).

<h4 id="34">Bloques de código</h4>

Se pueden hacer bloques de código simplemente dejando una línea en blanco e indentando con cuatro espacios o una tabulación.

    //Quiero hacer una condición
    if (condicion) {
        //Bloque que se ejecutará
    } else {
        //Bloque que se ejecutará
    }

Después del bloque hay que dejar una línea en blanco.  
También se puede hacer un bloque de código sin necesidad de tener que indentar un nivel. Se hace abriendo y cerrando el código con **tres** tildes graves (` ``` `). También se puede añadir el lenguaje en el que se está haciendo ese bloque de código (` ```Java ` ` ```Python ` ` ```sql `)

```Python
# Esto es un comentario

# Print de una cadena de texto

saludo = "Hola"
print(saludo, "Mundo")
```

Ejemplo de Java:

```Java
int numero = 6;
System.out.println(numero);
```

Ejemplo con SQL:

```sql
SELECT
    alumno,
    nota
FROM alumnos;
```

<h3 id="35">Separadores horizontales</h3>

En una linea individual:

* Tres asteriscos `***`
* Tres guiones `---`
* Tres guiones bajos `___`

El separador se ve así:

***

<h4 id="36">Buenas prácticas</h4>

Siempre hay que dejar una línea en blanco antes y otra después del separador.

<h3 id="37">Enlaces</h3>

Para generar un enlace debes cerrar el texto que hará de link entre corchetes `[]` y, sin espacio que los separe, la URL entre paréntesis `()`.

    Aquí tenéis el [manual oficial](https://www.markdownguide.org)

Aquí tenéis el [manual oficial](https://www.markdownguide.org).

<h4 id="38">Añadir título</h4>

Se puede añadir un título para que cuando se deje el cursor sobre el enlace se muestre. Después de la URL, separado por un espacio, pero dentro de los paréntesis se añade el título entre comillas dobles (`"`).

    Aquí tenéis el [manual oficial](https://www.markdownguide.org "Lugar para consultar")

Aquí tenéis el [manual oficial](https://www.markdownguide.org "Lugar pra consultar")

<h4 id="39">URL y email</h4>

Para hacer que una URL o un email sean rápidamente enlazables se pueden encerrar entre `<>`.

    <https://www.markdownguide.org>
    <alex.bometon@gammatech.school>

<https://www.markdownguide.org>
<alex.bometon@gammatech.school>

<h4 id="40">Formato de enlaces</h4>

Se puede dar formato a los enlaces con **negrita** y con *cursiva*, para ello hay que utilizar `**` o `*` antes y después del enlace completo:

    En negrita
    **[manual oficial](https://www.markdownguide.org)**

    En cursiva
    *[manual oficial](https://www.markdownguide.org)*

Esta sección está:  
**[manual oficial](https://www.markdownguide.org)**  
En la sección *[basic-syntax](https://www.markdownguide.org/basic-syntax)*

<h4 id="41">Estilo de las referencias</h4>

Se le puede dar estilo a un enlace y así es mucho más fácil de leer. Se pueden partir en dos partes, así `Markdown` es más legible.

<h5 id="42">Formato de la primera parte del enlace</h5>

La primera parte está formada por dos bloques de corchetes `[]`.

1. Primero: nombre.
2. Segundo: referencia.

Se pueden separar por un espacio. El segundo bloque de corchetes no es *case sensitive* y puede incluir letras, números, símbolos y signos de puntuación.

    [manual oficial][1]

`[manual oficial]` es la parte clicable.
`[1]` es la parte referencial, en cualquier lugar del documento podemos tener esta referencia en la que se incluirá la segunda parte, el enlace.

<h5 id="43">Formato de la segunda parte del enlace</h5>

La segunda parte, la de la sreferencia, tiene que enlazarse con la etiqueta. Asímismo tendrá la siguiente estructura:

1. Misma etiqueta que la primera parte seguida de dos puntos (`:`) y un espacio.
2. URL, sin paréntesis, que puede estar entre `<>`.
3. Título opcional del enlace que puede estar entre comillas dobles, simples o paréntesis (`"`, `'`, `()`).

Siguiendo el ejemplo anterior:

    [1]: https://www.markdownguide.org
    [1]: https://www.markdownguide.org "Lugar para consultar"
    [1]: https://www.markdownguide.org 'Lugar para consultar'
    [1]: https://www.markdownguide.org (Lugar para consultar)
    [1]: <https://www.markdownguide.org>

Esta segunda parte del enlace se puede colocar en cualquier parte del documento. Algunas personas lo hacen en después del párrafo en el que aparecen, otras lo hacen al final del todo del documento.

<h4 id="44">Buenas prácticas</h4>

**CUIDADO CON LOS PARÉNTESIS**, encontrárselos dentro de un enlace da problemas. En ese caso se puede utilizar `HTML`:

    Link: https://en.wikipedia.org/wiki/The_Milagro_Beanfield_War_(novel)

    <a href="https://en.wikipedia.org/wiki/The_Milagro_Beanfield_War_(novel)>A novel</a>

O se puede sustituir por:

* `%28` --> paréntesis que abre `(`.
* `%29` --> paréntesis que cierra `)`.

        Link: https://en.wikipedia.org/wiki/The_Milagro_Beanfield_War_(novel)

        [A novel](https://en.wikipedia.org/wiki/The_Milagro_Beanfield_War_%28novel%29)

Otro problema que te puedes encontrar es la presencia de **ESPACIOS**. Estos se pueden sustituir por `%20`.

    Link: https://www.ejemplo.com/mi%20gran%20pagina
    [Enlace](https://www.ejemplo.com/mi%20gran%20pagina)

    <a href="https://www.ejemplo.com/mi gran pagina">Enlace</a>

<h3 id="45">Imágenes</h3>

Las imágenes funcionan del mismo modo que los enlaces a una URL. La diferencia es que delante del link tiene que haber un signo de admiración `!`.

    ![imagen](directorio_de_la_imagen_o_URL "titulo (opcional)")

También se puede modificar el [tamaño](#) y que aparezcan [pies de imagen](#)

<h3 id="47">Escapando caracteres</h3>

Igual que en una cadena de texto puedes utilizar backslash `\` para escapar ciertos caracteres o símbolos y que sean mostrados.

<table>
  <thead>
    <tr>
      <th>Caracter</th>
      <th>Nombre</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>\</td>
      <td>backslash</td>
    </tr>
    <tr>
      <td>`</td>
      <td>tilde grave</td>
    </tr>
    <tr>
      <td>*</td>
      <td>asterisco</td>
    </tr>
    <tr>
      <td>_</td>
      <td>guion bajo</td>
    </tr>
    <tr>
      <td>{ }</td>
      <td>llaves</td>
    </tr>
    <tr>
      <td>[ ]</td>
      <td>corchetes</td>
    </tr>
    <tr>
      <td>&lt; &gt;</td>
      <td>angle brackets</td>
    </tr>
    <tr>
      <td>( )</td>
      <td>paréntesis</td>
    </tr>
    <tr>
      <td>#</td>
      <td>almohadilla</td>
    </tr>
    <tr>
      <td>+</td>
      <td>suma</td>
    </tr>
    <tr>
      <td>-</td>
      <td>resta (guion)</td>
    </tr>
    <tr>
      <td>.</td>
      <td>punto</td>
    </tr>
    <tr>
      <td>!</td>
      <td>exclamación</td>
    </tr>
    <tr>
      <td>|</td>
      <td>pipe</td>
    </tr>
  </tbody>
</table>

<h3 id="48">HTML</h3>

Se puede utilizar `HTML` para enriquecer el texto, [cambiar el tamaño de una imagen](#), también se puede modificar el [color del texto](#), hacer tablas...

<h2 id="49">2. Avanzado</h2>

Con la sintaxis básica no todo el mundo tiene suficiente. Pero no todas las aplicaciones `Markdown` soportan su uso avanzado.

<h3 id="50">Tablas</h3>

Utiliza guion (`-`) para separar encabezados de filas y pipe (`|`) para separar columnas.

    | Syntax      | Description |
    | ----------- | ----------- |
    | Header      | Title       |
    | Paragraph   | Text        |

| Syntax      | Description |
| ----------- | ----------- |
| Header      | Title       |
| Paragraph   | Text        |

Se pueden generar tablas automáticamente [desde este enlace][1]
También existe esta [aplicación online][2] para hacer las tablas.

<h4 id="51">Alineación de texto</h4>

Se puede alinear el texto utilizando dos puntos (`:`):

* `:---`: texto a la **derecha**.
* `:---:`: texto **centrado**.
* `---:`: texto a la **izquierda**.

        | Syntax      | Description | Test Text     |
        | :---        |    :----:   |          ---: |
        | Header      | Title       | Here's this   |
        | Paragraph   | Text        | And more      |

| Syntax      | Description | Test Text     |
| :---        |    :----:   |          ---: |
| Header      | Title       | Here's this   |
| Paragraph   | Text        | And more      |

<h4 id="52">Formato de texto</h4>

Se puede dar formato al texto dentro y fuera de las tablas, pero de forma limitada:

* Links
* Código (pero **no** bloques de código)
* Negrita y cursiva
* Puedes utilizar también `HTML` para:
  * Listas dentro de una celda (ordenada y desordenada)
  * Saltos de línea con `<br>`

<h5 id="53">Escapar `|` En una tabla</h5>

Pipe (`|`) es el símbolo que se utiliza para separar columnas. No obstante también se puede mostrar dentro de una tabla utilizando su código. Ese códgo es el de `HTML` --> **`&#124;`**

Puedes [consultar los códigos de todos los símbolos y letras][3] aquí.

<h3 id="54">Pie de página</h3>

Se pueden hacer anotaciones al pie de página. Eso genera un link que, al clicar sobre él, te lleva directamente a esa nota al pie.

Para generar una nota al pie de página se tiene que rodear entre corchetes `[]` y precedida de una tilde circumfleja `^`. Esto sería una nota al pie `[^1]` con la referencia 1, esto otro `[^nota]` con la referencia nota.

Para vincularlo, al pie se añaden estas notas, al igual que se hace con los [enlaces en dos partes](#43). 

Prueba en ir a ver qué pone en esta nota al pie [^troll].

Aunque **Visual Studio Code** tiene muy buen soporte para `Markdown` hay ciertas cosas que no puede soportarlas. Una de ellas son las notas al pie. Requieren de la instalación de una extensión para poder renderizarlas correctamente.

**Markdown preview enhaced** va a permitir poder renderizar correctamente funcionalidades avanzadas, como pueden ser los diagramas, notas al pie, exportar a PDF...

> Desde Visual Studio Code:
>
> 1. Ctrl+P
> 2. escribe: ext install shd101wyy.markdown-preview-enhanced

<h3 id="55">Identificar títulos</h3>

Se pueden añadir identificadores a los títulos, algunos procesadores `Markdown` los añaden directamente. Se hace utilizando el título del nivel que sea (`#`) y a continuación, entre llaves `{}` el identificador `#identificador`.

|     Markdown        |             HTML           |
| ----–-------------- | -------------------------- |
| `### titulo {#id1}` | `<h3 id="id1">titulo</h3>` |

<h4 id="56">Enlazar títulos</h4>

También se pueden enlazar los títulos igual que se hace con los links. `[]` dentro de los corchetes va el texto que se quiere ver y a continuación, dentro de los paréntesis `()`, el identificador de ese título.

Quiero volver al [bloque de las tablas](#50).

<h3 id="57">Lista de definiciones</h3>

Se pueden definir términos específicos destacándolos utilizando una lista de definiciones, como si fuera un diccionario.

La sintaxis para ello es **concepto a definir** y en la siguiente línea: dos puntos `:` seguido de espacio con la definición de ese concepto.

    Primer término
    : este es el espacio en el que va su definición.

    Segundo concepto
    : este es el espacio en el que va su definición.
    : incluso si tiene que seguir...

Primer término
: este es el espacio en el que va su definición.

Segundo concepto
: este es el espacio en el que va su definición.
: incluso si tiene que seguir...

<h3 id="58">Texto tachado</h3>

No todos los renderizadores de `Markdown` muestran correctamente el texto tachado. La manera de hacerlo es con una doble virgulilla (`~~`) al principio y al final del texto que se tacha para que pueda ~~verse de este modo~~.

<h3 id="59">Listas de tareas</h3>

Las listas de tareas van a ser muy útiles para mostrar aplicaciones que estamos desarrollando y que queremos mostrar esa idea de futuras implementaciones. Bueno, cualquier otra aplicación que requiera de un TO-DO list...

    [x] Esto es una tarea completada.
    [ ] Esto todavía no se ha completado.

[x] Esto es una tarea completada.
[ ] Esto todavía no se ha completado. 

<h3 id="60">Emoji</h3>

Hay dos maneras: **copiar-pegar**, utilizando el **código**.

<h4 id="61">Copiar y pegar</h4>

Se pueden copiar y pegar. Desde casi cualquier renderizador vas a poder visualizarlos correctamente. 

Desde la [emojipedia][5] puedes ver los diferentes emoji para copiarlos.

<h4 id="62">Atajos de emoji</h4>

Puedes consultar aquí todos los [atajos de emoji][4].  
Ten en cuenta que de una aplicación a otra los códigos podrían variar. Mira la documentación de qué `Markdown` estás utilizando.

<h3 id="63">Resaltado de texto</h3>

Se puede resaltar texto utilizando un marcador ==como aquí== y para ello necesitas doble igual (`==`) antes y después del texto a remarcar.

También se puede conseguir el mismo efecto mediante `HTML` con la etiqueta `<mark>`.

<h3 id="64">Subíndice y súperindice</h3>

* Subíndice:
  * Markdown:
    * `~` delante y detrás de lo que se quiera convertir en subíndice: `H~2~O` --> H~2~O
  * HTML:
    * `<sub>` de apertura y cierre en el caracter a convertir: `H<sub>2>/sub>O` --> H<sub>2</sub>O
* Superíndice:
  * Markdown:
    * `^` delante y detrás de lo que se quiera convertir en subíndice: `X^2^` --> X^2^
  * HTML:
    * `<sup>` de apertura y cierre en el caracter a convertir: `X<sup>2>/sup>` --> X<sup>2</sup>

---

Falta añadir aquí información complementaria sobre:

* Subrayado
* Indentación
* Alineación
* Color
* Comentarios
* Advertencias
* Videos

[1]: https://www.tablesgenerator.com/markdown_tables (Generador de tablas en Markdown)
[2]: https://anywaydata.com/app# (Aplicación para tablas Markdown)
[3]: https://www.toptal.com/designers/htmlarrows/ (Símbolos, signos y letras en HTML)
[4]: https://gist.github.com/rxaviers/7360908 (Códigos de atajos emoji)
[5]: https://emojipedia.org/ (Emojipedia, para obtener cualquier emoji y poder utilizarlo)


[^troll]: Jajaja, le has dado clic. ¡La curiosidad mató al gato!