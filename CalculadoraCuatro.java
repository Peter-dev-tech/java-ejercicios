import java.util.Scanner;

public class CalculadoraCuatro {
    public static void main(String[] args) {

        Scanner calculadora = new Scanner(System.in);

        System.out.println("¿Cuál es tu nombre?:");
        String nombre = calculadora.nextLine();
        
        System.out.println("Dame el primer numero:");
        double datoUno = calculadora.nextDouble();

        System.out.println("Dame el segundo numero:");
        double datoDos = calculadora.nextDouble();

        System.out.println("Escoge tu operacion: (+,-,*,/,%)");
        char operador = calculadora.next().charAt(0);

        double resultado = 0;
        
        if (operador == '+') resultado = datoUno + datoDos;
        else if (operador == '-') resultado = datoUno - datoDos; 
        else if (operador == '*') resultado = datoUno * datoDos; 
        else if (operador == '/') resultado = datoUno / datoDos; 
        else if (operador == '%') resultado = datoUno % datoDos; 
        else System.out.println("Operador no reconocido, intenta nuevamente.");

        System.out.println(nombre + ", el resultado de tu operacion es: " + resultado);

    calculadora.close();    

    }
}