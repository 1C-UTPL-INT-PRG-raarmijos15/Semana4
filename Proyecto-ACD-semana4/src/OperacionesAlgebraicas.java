/**
 *
 * @author Raul Armijos
 * @version 1.0
 */
import java.util.Scanner;

public class OperacionesAlgebraicas {
    public static void main(String[] args) {
        Scanner tecladito = new Scanner(System.in);
        double num1, respuesta, respuesta2;
        int num2;
        System.out.print("Deme el numero para calcularle la raiz cuadrada: ");
        num1 = tecladito.nextDouble();
        respuesta = Math.sqrt(num1);
       // System.out.println("la raiz cuadrada de: {" +num1 + "} es:" );
        //System.out.print(respuesta);
       
        //printf ("formatoValores", valor1, {valor2}, {valorN}
        System.out.printf("%s %.2f %s %.2f \n", 
                            "la raiz de:", 
                            num1, 
                            "es:",
                            respuesta);
        
        System.out.print("DEME EL NUMERO ENTERO");
        num2 = tecladito.nextInt();
        respuesta = Math.pow(num1, num2);
        System.out.println(num1 + " elevado a la " + num2 + " potencia es: " +respuesta);
        /**
         * RUN
         * 
         */
    }
}
