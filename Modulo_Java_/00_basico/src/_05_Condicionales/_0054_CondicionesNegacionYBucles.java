package _05_Condicionales;


public class _0054_CondicionesNegacionYBucles {
    // Operador &&
    // Operador ||
    // Operador NOT --> !

    /*
     * =========
     * =   !   =
     * =========
     * 
     * Las condiciones devuelven boolean.
     * Booleano es o true o false.
     * 
     * if(true) {
     *      System.out.println("soy true");
     * }
     * 
     * if (!true) {
     *      System.out.println("soy un true negado --> false");
     * }
     * 
     * if (false) {
     *      System.out.println("soy false y no me imprimo");
     * }
     */
    public static void main(String[] args) {
        String text1 = "hola";
        String text2 = "VisualStudio";

        if (text1.length() > text2.length()) { // false
            System.out.println("No me imprimo porque es false, pero si me niegan sí.");
        }

        // text1.length() --> int
        // > --> es un operador
        // text2.length() --> int
        // (text1.length() > text2.length()) --> boolean
        //                                   --> en este caso es false

        // Podemos negar esa condición para que acceda, así vemos rápido
        // qué hace en caso contrario.
        // !(text1.length() > text2.length()) --> ahora está negada
        //                                    --> estando negada el valor true

        String nombre = "teresa";
        int edad = 20;
        int altura = 170;
        String tacones = "s";

        /*
         * ==========
         * =   &&   =
         * ==========
         * 
         * (condición 1) && (condición 2)
         * 
         * Necesita que cada condición sea true.
         * Si una de las condiciones es false con el operador && se anulará ese bloque
         * 
         */
        /* 
        System.out.println("====== SIN NEGAR CONDICIONES ======");
        if (nombre.length() > 5 && edad > 25) { //--> && pide que ambas sean true
            // nombre.length() > 5 --> hace una comparación y devuelve true o false
            // si quiero negar esto es darle el valor contrario a true o a false y
            // tengo que verlo en un mismo bloque
            // (condicion) --> lo que tengo dentro del paréntesis es el booleano
            // !(condicion) --> lo que tengo dentro del paréntesis es el booleano
            //              --> ahora ese booleano está negado, su valor es el contrario

            System.out.println("Puedes entrar.");
        } else {
            System.out.println("No puedes entrar.");
        }

        System.out.println("======NEGANDO CONDICIONES======");
        // Utilizando negación
        if (nombre.length() > 5 && !(edad > 25)) { //--> && pide que ambas sean true
            // nombre.length() > 5 --> hace una comparación y devuelve true o false
            // si quiero negar esto es darle el valor contrario a true o a false y
            // tengo que verlo en un mismo bloque
            // (condicion) --> lo que tengo dentro del paréntesis es el booleano
            // !(condicion) --> lo que tengo dentro del paréntesis es el booleano
            //              --> ahora ese booleano está negado, su valor es el contrario

            System.out.println("Puedes entrar.");
        } else {
            System.out.println("No puedes entrar.");
        }

        System.out.println("======OPERADOR OR======");
        if (nombre.length() > 5 || edad > 25) { //--> || pide que una de las dos sea true
            System.out.println(nombre + "SI CUMPLE");
        } 

        System.out.println("====AÑADIENDO VARIABLE ALTURA=====");
        if (nombre.length() > 5 || edad > 25 && altura > 160) {
            // true           OR     false   &&       true
            System.out.println("Casi...");
        }
            // añadiendo paréntesis cambiamos la jerarquía
        if ((nombre.length() > 5 || edad > 25) && altura > 160) {
                        //(true  OR   false)   AND     true
                        //       true          AND     true --> entro
            System.out.println("esta seguro, que entra.");
        } 
        if (nombre.length() > 5 || (edad > 25 && altura > 160)) {
            // true             OR  (false    AND      true)
            // true             OR          false --> entro 
            // (true OR false)

            System.out.println("Creo que entro porque tengo una true.");
        }

        if (nombre.length() > 5 && !(edad > 25 && altura > 160)) {
            // true             AND  (false    AND      true)
            // true             AND         false --> NO entro 
            // (true AND true)

            System.out.println("Creo que entro porque tengo una true.");
        }

        System.out.println("======SIN PARENTESIS========");
        System.out.println(nombre.length() > 5); // true 
        System.out.println(nombre.length() > 5 || !(edad > 25 && altura > 160) || !tacones.equals("s"));

        if (nombre.length() > 5 || !(edad > 25 && altura > 160) || !tacones.equals("s")) {
        // 1 condiciones    // true             OR      !(false  AND ...)
        // 2 resultados    // true             OR          !false     OR         true
        // 3 negaciones     // true             OR        true       
            System.out.println("¿Me lo compruebo secuencialmente de izquierda a derecha?");
        }

        System.out.println("======CON PARENTESIS======");

        if ((nombre.length() > 5 || edad > 25) && (altura > 160 || tacones.equals("s"))) {
            // true             OR  false    AND      true   OR        true
            //                  (true)       AND            (true) 
            System.out.println("¿Me lo compruebo secuencialmente de izquierda a derecha?");
        }
*/
        // FOR --> numero de repeticiones conocido
        // vamos a repetir lo mismo 10 veces
        // en las iteraciones par que imprima el nombre
        // en las iteraciones impar que imprima la edad
        /* 
        for (int i = 0; i < 10; i++) {
            System.out.println("estoy en la vuelta: " + (i += 1));
            System.out.println("i += 1 --> me está asignando a la i el valor: " + i);
            System.out.println("en el momento de hacer el incremento la i es " + i + " y pasa a ser " + (i+1));
            System.out.println();
            if (i % 2 == 0) {
                System.out.println("El nombre es: " + nombre);
            } else {
                System.out.println("La edad es: " + edad);
            }

            System.out.println("===================================");

        }
        */

        for (int i = 1; i < 5; i++) {
            //String nombre = "teresa"; // estas variables YA EXISTEN EN MAIN --> no puedo hacer que vuelvan a nacer
            // int edad = 20;
            edad = 25;

            edad += i; // edad está declara con valor 20
                       // a edad le sumo el valor de i (en la primera vuelta le sumo 0)
                       // también tengo un =, le sumo el valor y le asigno el resultado
                       // ahora edad tiene como valor el resultado
            if (i == 1) {
                System.out.println(nombre + " ha crecido " + i + " año.");    
            } else if (i > 1) {
                System.out.println(nombre + " ha crecido " + i + " años.");
            }
            System.out.println("Ahora tiene: " + edad);
            if (edad > 23) { // en la línea 166 hemos modificado el valor de la variable edad.
                             // la comprobación es con la variable ACTUALIZADA
                for (int j = 0; j < 25; j+=5) { // j = 25?
                    // j empieza en 0
                    // cuando acabo le sumo 5 a j
                    altura += j; // altura es 160
                                 // primera vuelta j es 0
                                 // altura se queda en 160
                    System.out.println("También ha crecido " + j + "cm.");
                    System.out.println("ahora mide: " + altura + "cm de altura.");
                }
            }
        }

        // PRIMERA VUELTA
        // edad = 20
        // i = 0
        // no entra en condición

        // SEGUNDA VUELTA
        // edad = 20 --> en la primera vuelta se ha sumado 0 y se queda igual
        // i = 1
        // edad += 1 --> edad = 21

        // TERCERA VUELTA
        // edad = 21
        // i = 2
        // edad += 2 --> edad = 23
        // condicion (edad > 23) --> false

        // CUARTA VUELTA
        // edad = 23
        // i = 3
        // edad += 3 --> edad = 26
        // condicón (edad > 23) --> true
        // entramos en el bucle for
                // PRIMERA VUELTA
                // j = 0
                // altura = 160
                // altura += j --> 160
                // prints
                // incremento de 5 a j --> j = 5

                // SEGUNDA VUELTA
                // j = 5
                // altura = 160
                // altura += j --> 165
                // prints
                // incremento de 5 --> j = 10

                // TERCERA VUELTA
                // j = 10
                // altura = 165
                // altura += j --> 175
                // prints
                // incremento de 5 --> j = 15

                // CUARTA VUELTA
                // j = 15
                // altura = 175
                // altura += 15 --> 190
                // prints
                // incremento de 5 --> j = 20

                // QUINTA VUELTA
                // j = 20
                // altura = 190
                // altura += j --> 210
                // prints
                // incremento de 5 --> j = 25 (condición: j < 25)
                
                // el bucle j ha terminado
        
        // QUINTA VUELTA
        // i = 4
        // edad = 26
        // edad += i --> edad = 30
        // condición --> true (edad > 23)
        // volvemos a entrar al bucle for
                // PRIMERA VUELTA
                // j = 0 --> el bucle ya había terminado
                             // la variable j había dejado de existir
                             // al volver a ejecutar el bucle desde el inicio
                             // la variable j vuelve a ser declarada con valor 0
                // altura = 210
                // altura += j --> 210
                //...

                // QUINTA VUELTA
                // j = 20
                // altura = 240
                // altura += j --> 260
                // ya no hay sexta vuelta
        // SEXTA VUELTA  --> no hay SEXTA VUELTA

        // RESULTADO
        // edad = 30
        // altura = 260



    
    
    
    }
}