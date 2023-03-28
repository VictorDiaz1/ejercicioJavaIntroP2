package ejercicios;

import java.util.Scanner;

public class JavaIntroEJ1 {
//Crear un programa que dado un número determine si es par o impar.
    public static void main(String[] args) {
        System.out.println("Ingrese un numero: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }
    }
}
