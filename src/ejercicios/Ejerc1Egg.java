package ejercicios;

import java.util.Scanner;

public class Ejerc1Egg {

    public static void main(String[] args) {

        int num1 = 30;
        int num2 = 5;
        int suma = num1 + num2;
        int resta = num2 - num1;
        int multiplicacion = num1 * num2;
        double division = num1 / num2;
        boolean logico = num1 < num2;
        System.out.println("suma= " + suma);
        System.out.println("resta= " + resta);
        System.out.println("multiplicacion= " + multiplicacion);
        System.out.println("division= " + division);
        System.out.println("boolean= " + logico);
        System.out.print("Hola");
        System.out.println("Mundo");

        int numEntero = 4;
        String numCadena = String.valueOf(numEntero);
        System.out.println("numCadena= " + numCadena);
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num = leer.nextInt();

        if (num % 2 == 0) {
            System.out.println("el numero es par");
        } else {
            System.out.println("el numero es impar");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese una frase:");
        String frase = sc.nextLine();

        if (frase.length() == 8) {
            System.out.println("correcto");
        } else {
            System.out.println("incorrecto");
        }
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
}
