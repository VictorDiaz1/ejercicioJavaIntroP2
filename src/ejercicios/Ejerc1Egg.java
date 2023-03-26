package ejercicios;

import java.util.Scanner;

public class Ejerc1Egg {

    public static void main(String[] args) {

        /* int numero = 5;
        String nombre = "Hugo";
        char letra = 'h';
        double temperatura = 38.5;
        boolean siONo = false;
        long largo = 123456789;
        //"DETECCIÓN DE ERRORES"
        String nombre;
        boolean bandera;
        char character;*/
 /* int num1 = 3;
        int num2 = 6;
        int suma = num1+num2;
        int resta = num2-num1;
        int multiplicacion = num1*num2;
        double division = num1/num2;
        boolean logico = num1<num2;
        System.out.println("suma= " + suma);
        System.out.println("resta= " + resta);
        System.out.println("multiplicacion= " + multiplicacion);
        System.out.println("division= " + division);
        System.out.println("boolean= " + logico);
       String nombre = "Hugo";
       int edad = 45;
    
	System.out.println("Mi nombre es " + nombre);
        System.out.println("Tengo " + edad + " años.");
    
	System.out.print("Hola");
	System.out.println("Mundo");
       
       int numEntero = 4;	
       String numCadena = String.valueOf(numEntero);
        System.out.println("numCadena= " + numCadena);*/
        Scanner leer = new Scanner(System.in);
        /*System.out.println("ingrese un numero");
        int num = leer.nextInt();

        if (num % 2 == 0) {
            System.out.println("el numero es par");
        } else {
            System.out.println("el numero es impar");
        }*/
        /*Crear un programa que pida una frase y 
          si esa frase es igual a “eureka” el programa 
          pondrá un mensaje de Correcto,
          sino mostrará un mensaje de Incorrecto.
          Nota: investigar la función equals() en Java.*/
        
        System.out.println("ingrese una frase:");
        String frase = leer.nextLine();
        
       /* if (frase.length()== 8){
            System.out.println("correcto");
            
        }else {
            System.out.println("incorrecto");
       
       
        }*/
       
        System.out.println(frase.toUpperCase() );
        System.out.println(frase.toLowerCase());
    }
}
