import java.util.Scanner;
public class Mayordedosnumeros {
    public static void main(String[] args) {
        Scanner tecladito = new Scanner(System.in);
        int num1,num2;
        System.out.print("DEME 2 NUMEROS: ");
        num1 = tecladito.nextInt();
        num2 = tecladito.nextInt();
        
        if (num1 > num2)
        {
            System.out.println(num1 + " es mayor que " + num2);
        }
        else if (num1 < num2){
            System.out.println(num1 + " es menor que " + num2);
        }
        else{
        System.out.println(+ num1 + " es igual a " + num2);
        }
    }
}
