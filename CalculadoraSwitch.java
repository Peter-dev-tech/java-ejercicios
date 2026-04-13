import java.util.Scanner;

public class CalculadoraSwitch{
    public static void main(String[] args){

        Scanner calculadora = new Scanner(System.in);

        int resultado = 0;
        
        System.out.println("ingresa el primer dato:");
        int datoUno = calculadora.nextInt();

        System.out.println("ingresa el segundo dato:");
        int datoDos = calculadora.nextInt();

        System.out.println("Escoge el numero de parametro para tu operacion (1 = +), (2 = -), (3 = *), (4 = /), (5 = %):");
        int parametro = calculadora.nextInt();

        switch (parametro){
            case 1: resultado = datoUno + datoDos;
            System.out.println("El resultado de tu suma es: " + resultado);
            break;

            case 2: resultado = datoUno - datoDos;
            System.out.println("El resultado de tu resta es: " + resultado);
            break;

            case 3: resultado = datoUno * datoDos;
            System.out.println("El resultado de tu multiplicación es: " + resultado);
            break;

            case 4: resultado = datoUno / datoDos;
            System.out.println("El resultado de tu división es: " + resultado);
            break;

            case 5: resultado = datoUno % datoDos;
            System.out.println("El resultado de tu MOD es: " + resultado);
            break;

            default: System.out.println("Error, parametro no existe");
            break;
        }

    calculadora.close();    
    }
}
