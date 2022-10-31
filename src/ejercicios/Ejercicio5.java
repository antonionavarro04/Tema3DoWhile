package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;
import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {
        // ? Programa que el usuario piensa un numero entre el 1 al 100 y el programa lo adivina, el usuario le dira si el numero es mayor o menor que el numero introducido
        // ^ Creamos la variable rng
        Random rng = new Random();

        // ^ Creamos la variable menor y mayor
        int menor = 1, mayor = 100;

        // ^ Creamos las variables final menor, mayor o igual
        final int MAYOR = 1;
        final int MENOR = 2;
        final int IGUAL = 3;

        // ^ Creamos la variable userChoice para guardar la eleccion del usuario
        byte userChoice;

        // ^ Creamos la variable boolean haAdivinado
        boolean haAdivinado = false;

        // ! Generamos un numero int entre 1 y 100
        int num = rng.nextInt(0, 100);

        // ^ Creamos el Scanner en la variable read y cambiamos al formato de US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Bucle Do-While
        do{
            System.out.println("Es " + num + "tu número?");
            System.out.println("[1] Mayor al numero que estas pensando");
            System.out.println("[2] Menor al numero que estas pensando");
            System.out.println("[3] Igual al numero que estas pensando");
            userChoice = read.nextByte();

            if (userChoice == MAYOR){
                mayor = num;
                rng.nextInt(menor, mayor);
            } else if (userChoice == MENOR){
                menor = num;
                rng.nextInt(menor, mayor);
            } else if (userChoice == IGUAL){
                haAdivinado = true;
                System.out.println("Adivine tu Número");
            } else{
                haAdivinado = true;
                System.out.println("Se ha producido un error");
            }
        } while (haAdivinado);

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
