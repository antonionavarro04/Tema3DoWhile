package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio5 {
    public static void main(String[] args) {
        // ? Programa que el usuario piensa un numero entre el 1 al 100 y el programa lo adivina, el usuario le dira si el numero es mayor o menor que el numero introducido
        // ^ Creamos las variables num, mayor y menor
        int num, mayor = 100, menor = 1;

        // ! Generamos un primer numero aleatorio entre el 1 y el 100
        num = (int) (Math.random() * (100 - 1)) + 1;

        // ^ Creamos las variables finales, MAYOR, MENOR e IGUAL para ayudarnos a comparar los numeros
        final int MAYOR = 1;
        final int MENOR = 2;
        final int IGUAL = 3;

        // ^ Creamos la variable userChoice para guardar la eleccion del usuario
        byte userChoice = 0;

        // ^ Creamos la variable boolean haAdivinado, empezará siendo false y será true cuando el usuario diga que el numero es igual
        boolean haAdivinado = false;

        // ^ Creamos el Scanner en la variable read y cambiamos al formato de US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Bucle Do-While
        do{
            System.out.println("Es " + num + ":");
            System.out.println("[1] Mayor al numero que estas pensando?");
            System.out.println("[2] Menor al numero que estas pensando?");
            System.out.println("[3] Igual al numero que estas pensando?");
            System.out.print("-> ");
            userChoice = read.nextByte();

            // ? Salto de Linea Triple
            System.out.println();System.out.println("-------------------------------");System.out.println();

            if (userChoice == MAYOR){
                mayor = num;
                num = (int) (Math.random() * (mayor - menor)) + menor;
            } else if (userChoice == MENOR){
                menor = num;
                num = (int) (Math.random() * (mayor - menor)) + menor;
            } else if (userChoice == IGUAL){
                haAdivinado = true;
                System.out.println("Adiviné tu Número");
            } else{
                haAdivinado = true;
                System.out.println("Se ha producido un error");
            }
        } while (haAdivinado == false);

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
