package clases;
public class Algoritmos{
    /*
     * Crea el método estático esPar() el cual recibe como parámetro un número entero. 
     * Este método se encarga de retornar true si el número es par, false si el número es impar.
     */
    public static boolean esPar(int numero){
        return numero % 2 == 0 ? true : false;
    }

    /**
     * Crea el método estático esPrimo() el cual recibe como parámetro un número entero. 
     * Este método se encarga de retornar true si el número es primo, false de lo contrario. 
     * Un número primo es aquel que tiene únicamente dos divisores, el número 1 y el mismo número.
     */
    public static boolean esPrimo(int numero){
        for(int i = 2; i<numero; i++){
            if(numero % i == 0)
                return false;
        }
        return true;
    }

    /**
     * Crea el método estático stringEnReversa el cual recibe como parámetro un String. 
     * Este método se encarga de retornar el String recibido escrito de atrás hacia adelante. 
     * Recuerda que un String puede accederse con un índice, cada caracter representa una posición del String.
     */

    public static String stringEnReversa(String palabra){
        char[]arreglo = palabra.toCharArray();
        char[]arregloInvertido = new char[palabra.length()];
        int j = palabra.length()-1;
        for(int i = 0; i<palabra.length(); i++){
            arregloInvertido[i] = arreglo[j]; 
            j--;
        }
        return new String(arregloInvertido);
    }

    /**
     * Crea el método estático esPalindromo el cual recibe como parámetro un String. 
     * Este método se encarga de retornar true si el String es un palíndromo, false de lo contrario. 
     * Un palíndromo es aquel texto que se escribe igual de izquierda a derecha y de derecha a izquierda.
     */
    public static boolean esPalindromo(String frase){
        String fraseSinEspacios = frase.replace(" ", "");
        int j = fraseSinEspacios.length()-1;
        int contador = 0;
        for(int i = 0; i < fraseSinEspacios.length()/2; i++){
            if(fraseSinEspacios.charAt(i)==fraseSinEspacios.charAt(j)){
                contador++;
            }
            j--;
        }
        return contador == fraseSinEspacios.length()/2 ? true : false;
    }

    /**
     * Crea el método estático secuenciaFizzBuzz el cual recibe como parámetro un número entero. 
     * Este método se encarga de imprimir en terminal la secuencia FizzBuzz la cual se genera de la siguiente forma:
    Imprime en terminal del número 1 hasta el número dado como parámetro.
    Reemplazar cada número divisible por 3 por la palabra Fizz.
    Reemplazar cada número divisible por 5 por la palabra Buzz.
    Reemplazar cada número divisible por ambos 3 y 5 por FizzBuzz Ejemplo: secuenciaFizzBuzz(15) 
    1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz
     */

     public static String secuenciaFizzBuzz(int numero){
        String secuencia = "";
        for(int i = 1; i <= numero; i++){
             if(i % 15 == 0){
                secuencia+= "FizzBuzz ";
             }else if(i % 3 == 0){
                secuencia+= "Fizz ";
             }else if(i % 5 == 0){
                secuencia+= "Buzz ";
             }else{
                secuencia+= i + " ";
             }
        }
        return secuencia;
     }

}