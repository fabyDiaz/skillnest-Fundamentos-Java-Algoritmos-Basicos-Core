# Proyecto: Clase de Métodos Estáticos Algoritmos

Este proyecto consiste en la creación de una clase de utilidad llamada `Algoritmos` que contiene diversos métodos estáticos para realizar operaciones comunes sobre números y cadenas de texto. Además, se incluye una clase `Aplicacion` para demostrar su uso y verificar su correcto funcionamiento.

---

## Requerimientos del Proyecto

El proyecto se estructura en un paquete específico y una clase con métodos estáticos, junto con una clase de aplicación para pruebas.

### Paquete `clases` y Clase `Algoritmos.java`

Se debe crear un paquete llamado **`clases`**. Dentro de este paquete, se definirá la clase **`Algoritmos.java`**.

La clase `Algoritmos` debe estar compuesta **únicamente de métodos estáticos**.

### Métodos Estáticos de `Algoritmos`

La clase `Algoritmos` debe implementar los siguientes métodos estáticos:

* **`esPar(int numero)`**
    * **Propósito:** Determinar si un número entero es par.
    * **Retorna:** `true` si el número es par, `false` si es impar.

* **`esPrimo(int numero)`**
    * **Propósito:** Determinar si un número entero es primo.
    * **Definición:** Un número primo es aquel que tiene únicamente dos divisores: el número 1 y el mismo número.
    * **Retorna:** `true` si el número es primo, `false` de lo contrario.

* **`stringEnReversa(String texto)`**
    * **Propósito:** Retornar la cadena de texto recibida escrita de atrás hacia adelante (en reversa).
    * **Nota:** Se puede acceder a cada carácter de un `String` mediante un índice, lo cual puede ser útil para la implementación.
    * **Retorna:** El `String` invertido.

* **`esPalindromo(String texto)`**
    * **Propósito:** Determinar si la cadena de texto es un palíndromo.
    * **Definición:** Un palíndromo es un texto que se escribe igual de izquierda a derecha y de derecha a izquierda (ignorando mayúsculas, espacios, etc., según la implementación deseada).
    * **Retorna:** `true` si el `String` es un palíndromo, `false` de lo contrario.

* **`secuenciaFizzBuzz(int limite)`**
    * **Propósito:** Imprimir en la terminal la famosa secuencia FizzBuzz hasta el número límite dado como parámetro.
    * **Generación de la secuencia:**
        1.  Imprimir en terminal los números del 1 hasta el número dado (`limite`).
        2.  Reemplazar cada número **divisible por 3** por la palabra **`Fizz`**.
        3.  Reemplazar cada número **divisible por 5** por la palabra **`Buzz`**.
        4.  Reemplazar cada número **divisible por ambos (3 y 5)** por **`FizzBuzz`**.
    * **Ejemplo:** `secuenciaFizzBuzz(15)` debe imprimir: `1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz`

---

## Clase de Demostración: `Aplicacion.java`

Se debe crear una clase principal llamada **`Aplicacion.java`** que contenga el método `main`.

En esta clase, se debe **demostrar el uso** de todos los métodos estáticos definidos en `Algoritmos.java`. Es esencial mandar a ejecutar cada uno de los métodos y **verificar que su funcionamiento sea correcto** mediante salidas a la consola.