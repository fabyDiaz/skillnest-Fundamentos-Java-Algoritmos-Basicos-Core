import clases.Algoritmos;
public class Aplicacion {
    public static void main(String[] args) {
        System.out.println("El numero es par?: "+ Algoritmos.esPar(6));
        System.out.println("El número es primo?: " + Algoritmos.esPrimo(5));
        System.out.println("La palabra en reversa: " + Algoritmos.stringEnReversa("Hola"));
        System.out.println("La palabra es palindromo? " + Algoritmos.esPalindromo("reconocer"));
        System.out.println("Secuencia FizzBuzz: " + Algoritmos.secuenciaFizzBuzz(15));
    }
}
