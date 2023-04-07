
package ejerciciosJavaIntroP2;

import java.util.Scanner;

public class JavaIntroEJ4P2 {
// Escriba un programa que pida una frase o palabra y valide si la primera
// letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se debera de
// imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
// contrario, se debera imprimir “INCORRECTO”. Nota: investigar la funcion
// Substring y equals() de Java.
    public static void main(String[] args) {
        System.out.println("Ingrese una frase:");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        
        if (frase.substring(0, 1 ).equalsIgnoreCase("a")) {
            System.out.println("Correcto");
        }else System.out.println("Incorrecto");
    }
}
