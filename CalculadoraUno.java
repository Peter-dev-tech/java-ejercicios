import java.util.Scanner;

public class CalculadoraUno {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numUno = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numDos = scanner.nextDouble();

        System.out.println("Ingrese la operación a realizar (+,-,*,/,%): ");
        char Operación = scanner.next().charAt(0);
        
        double resultado = 0;
        
        if (Operación == '+') resultado = numUno + numDos;
        else if (Operación == '-') resultado = numUno - numDos;
        else if (Operación == '*') resultado = numUno * numDos;
        else if (Operación == '/') resultado = numUno / numDos;
        else if (Operación == '%') resultado = numUno % numDos;
        else System.out.println("Operación no valida");

        System.out.println("El resultado es: " + resultado);
    
    scanner.close();
    }
}
