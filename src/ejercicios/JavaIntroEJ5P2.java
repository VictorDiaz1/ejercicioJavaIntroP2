package ejercicios;

import java.util.Scanner;

public class JavaIntroEJ5P2 {

// Escriba un programa en el cual se ingrese un valor limite positivo, y a
// continuacion solicite numeros al usuario hasta que la suma de los
// numeros introducidos supere el limite inicial
    public static void main(String[] args) {

        int numeroLimite;
        int cont = 0;
        int num;
        System.out.println("Ingrese el numero limite:");
        Scanner sc = new Scanner(System.in);
        numeroLimite = sc.nextInt();
        while (numeroLimite > cont) {
            System.out.println("ingrese un numero:");
            num = sc.nextInt();
            cont += num; //cont = cont + num;
        }
        System.out.println("cont:" + cont);
    }
}
