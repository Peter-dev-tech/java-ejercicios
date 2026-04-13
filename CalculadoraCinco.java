import java.util.Scanner;

public class CalculadoraCinco {
    public static void main(String[] args) {

        Scanner calculadora = new Scanner(System.in);

        System.out.println("¿Human@ cual es tu nombre?");
        String nombre = calculadora.nextLine();

        System.out.println("Dame el primer numero");
        double datoUno = calculadora.nextDouble();

        System.out.println("dame el segundo numero");
        double datoDos = calculadora.nextDouble();

        System.out.println("Que operacion deseas (+,-,/,*,%)");
        char operacion = calculadora.next().charAt(0);

        double resultado = 0;

        if (operacion == '+') resultado = datoUno + datoDos;
        else if (operacion == '-') resultado = datoUno - datoDos;
        else if (operacion == '*') resultado = datoUno * datoDos;
        else if (operacion == '/') resultado = datoUno / datoDos;
        else if (operacion == '%') resultado = datoUno % datoDos;
        else System.out.println("Operador no reconocido, intenta nuevamente");
        
        System.out.println(nombre +  " el resultado de tu operacion es: " +  resultado);
    
    calculadora.close();
    }
}