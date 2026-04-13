import java.util.Scanner;

public class CalculadoraDos {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cual es tu nombre? ");
        String nombre = scanner.nextLine();

        System.out.println("Dame tu primer número: ");
        double datoUno = scanner.nextDouble();
        
        System.out.println("Dame tu segundo número: ");
        double datoDos = scanner.nextDouble();
        
        System.out.println("Que operacion deseas? (+,-,*,/,%): ");
        char operacion = scanner.next().charAt(0);

        double resultado =  0;

        if (operacion == '+') resultado = datoUno + datoDos;
        else if (operacion == '-') resultado = datoUno - datoDos;
        else if (operacion == '*') resultado = datoUno * datoDos;
        else if (operacion == '/') resultado = datoUno / datoDos;
        else if (operacion == '%') resultado = datoUno % datoDos;
        else System.out.println( nombre + " Operacion no valida");

        System.out.println( nombre + ", el resultado de tu operacion es: " + resultado);
    
    scanner.close();

    }
}
