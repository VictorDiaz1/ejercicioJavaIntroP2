package ejercicios;

import java.util.Scanner;

public class JavaIntroEJ8 {

    /* Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
       Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
       lo siguiente:*/

    public static void main(String[] args) {
        int num;
        int i;
        int j;
        System.out.println("Ingrese la cantidad de elementos:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (i = 0; i < num; i++) {
            for (j = 0; j < num; j++) {
                if (i == 0 || i == num - 1 || j == 0 || j == num - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}
