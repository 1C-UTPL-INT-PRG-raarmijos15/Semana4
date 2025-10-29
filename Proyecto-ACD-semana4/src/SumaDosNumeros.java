/**
 * Ejercicio01: dada la lectura de dos numeros ingresados por teclado presentar la suma de los mismos
 * @author Raul Armijos
 * @version 1.0
 */
import java.util.Scanner;
public class SumaDosNumeros {
    public static void main(String[] args) {
        //sentencias para lectura de datos
        //[Nombre-clase-API-JDK:Scanner] [Nombre-variable] [=] [Nombre-variable(tipo de entrada de datos)]
        Scanner tecladin = new Scanner(System.in);
        int num1,num2,respuesta;
        System.out.println("Dame el numero 1"); //carpinteria = TUNEAR
        
       num1= tecladin.nextInt(); //ENTRADA
       System.out.println("Dame el segundo numero"); //carpinteria = TUNEAR
       num2= tecladin.nextInt(); //ENTRADA
       respuesta = num1 + num2;
        System.out.println("La respuesta es: ");
        System.out.println(respuesta);
        
        //sentencias para escritura de resultados: "Sout"+ TAB
        System.out.println("");
    }
}

/**
 * RUN:
 * 
 */