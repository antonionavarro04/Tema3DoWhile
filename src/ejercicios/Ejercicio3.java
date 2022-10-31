package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio3 {
    public static void main(String[] args) {
        // ? Realiza in programa que sume los numeros desde el 1 hasta un numero N introducido por el usuario.
        // ^ Creamos las variables num para el entero introducido por el usuario y suma para el resultado de sumar los numeros.
        int num, suma = 0;
        int numWhile; // * Creamos esta variable extra para poder guardar el contenido introducido por el usuario

        // ^ Creamos el Scanner en la variable read y cambiamos al formato de US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos el numero al usuario
        System.out.print("Introduce un numero: ");
        num = read.nextInt();

        // ! Igualamos las variables
        numWhile = num;

        // ! Bucle Do-While
        do {
            suma += numWhile;
            numWhile--;
        } while (num > 0);

        // ! Mostramos el resultado final al usuario
        System.out.println("La suma de los numeros desde el 1 hasta el numero " + num + " es: " + suma);

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
