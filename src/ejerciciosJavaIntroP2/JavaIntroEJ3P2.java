package ejerciciosJavaIntroP2;

import java.util.Scanner;

public class JavaIntroEJ3P2 {

//  Realizar un programa que solo permita introducir solo frases o palabras
//  de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
//  debera de imprimir un mensaje por pantalla que diga “CORRECTO”, en
//  caso contrario, se debera imprimir “INCORRECTO”. Nota: investigar la
//  funcion Lenght() en Java.

    public static void main(String[] args) {
        System.out.println("Ingrese una frase de 8 caracteres:");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();

        if (frase.length() == 8) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        
    }
}
