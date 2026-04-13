import java.util.Scanner;

public class CalculadoraSw{
    public static void main(String[] args){

        Scanner calculadora = new Scanner(System.in);

        System.out.println("Hola user, ¿como te llamas?: ");
        String nombre = calculadora.nextLine();
       
        System.out.println("Digita el primer dato: ");
        int datoUno = calculadora.nextInt();
        
        System.out.println("Digita el segundo dato: ");
        int datoDos = calculadora.nextInt();

        System.out.println("Escoge tu operacion (1 = +, 2 = -, 3 = *, 4 = /, 5 = %) : ");
        int operador = calculadora.nextInt();

        int resultado = 0;

        switch (operador){
            case 1: resultado = datoUno + datoDos;
            System.out.println(nombre + ", el resultado de tu suma es: " + resultado);
            break;
            
            case 2: resultado = datoUno - datoDos;
            System.out.println(nombre + ", el resultado de tu resta es: " + resultado);
            break;
            
            case 3: resultado = datoUno * datoDos;
            System.out.println(nombre + ", el resultado de tu multiplicación es: " + resultado);
            break;
            
            case 4: resultado = datoUno / datoDos;
            System.out.println(nombre + ", el resultado de tu division es: " + resultado);
            break;
            
            case 5: resultado = datoUno % datoDos;
            System.out.println(nombre + ", el resultado de tu MOD es: " + resultado);
            break;

            default: System.out.println(nombre + ", Error, operador no reconocido, ingresa los datos indicados como operador (1-5).");

        }
    calculadora.close();
    }

}