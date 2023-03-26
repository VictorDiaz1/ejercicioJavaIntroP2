package ejercicios;

import java.util.Scanner;

public class JavaIntroEJ6 {

    /*Realizar un programa que pida dos números enteros positivos por
      teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
      una opción y el programa deberá mostrar el resultado por pantalla y
      luego volver al menú. El programa deberá ejecutarse hasta que se elija la
      opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
      vez de salir del programa directamente, se debe mostrar el siguiente
      mensaje de confirmación: ¿Está seguro que desea salir del programa
      (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
      contrario se vuelve a mostrar el menú.*/
    public static void main(String[] args) {
        int num1;
        int num2;
        int resultado ;
        String menu;
        
        System.out.println("Ingrese dos numeros:");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        do {
        System.out.println("MENU:\n" + "1:sumar\n" + "2:restar\n" + "3:multiplicar\n" + "4:dividir:\n" + "5:salir\n");
        System.out.println("Eliga una opcion.");
        menu = sc.next();
        
        switch (menu) {
            case "1":
                resultado = num1 + num2;System.out.println("el resultado es:" + resultado);
                break;
            case "2":
                resultado = num1 - num2;System.out.println("el resultado es:" + resultado);
                break;
            case "3":
                resultado = num1 * num2;System.out.println("el resultado es:" + resultado);
                break;
            case "4":
                resultado = num1 / num2;System.out.println("el resultado es:" + resultado);
                break;
                
            case "5":
                System.out.println("Esta seguro que desea salir del programa? (S/N");
                
                menu = sc.next();          
        }                
        }while(!"s".equals(menu));
    }
}
