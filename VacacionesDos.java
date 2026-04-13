import java.util.Scanner;

public class VacacionesDos{

    public static void main(String[] args){

        Scanner sistema = new Scanner(System.in);

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("  Bienvenido al Sistema vacacional de Coca-Cola Company");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        System.out.println("Por favor ingresa el nombre del empleado");
        String nombre = sistema.nextLine();

        System.out.println("Digita el numero de Clave del empleado (1,2,3)");
        int clave = sistema.nextInt();

        System.out.println("Ingresa antiguedad en años");
        int antiguedad = sistema.nextInt();

        int dias = 0;

        if (antiguedad < 1) {
            System.out.println(nombre + " aún no tiene derecho a vacaciones");
        } else if (clave == 1){
            if (antiguedad == 1)      dias = 6;
            else if (antiguedad <= 6) dias = 14;
            else                      dias = 20;
            System.out.println(nombre + " tiene derecho a " + dias + " dias de vacaciones");
        } else if (clave == 2){
            if (antiguedad == 1)      dias = 7;
            else if (antiguedad <= 6) dias = 15;
            else                      dias = 22;
            System.out.println(nombre + " tiene derecho a " + dias + " dias de vacaciones");           
        } else if (clave == 3){
            if (antiguedad == 1)      dias = 10;
            else if (antiguedad <= 6) dias = 20;
            else                      dias = 30;
            System.out.println(nombre + " tiene derecho a " + dias + " dias de vacaciones");
        } else {
            System.out.println("Error, la clave de departamento no existe");
        }
    sistema.close();
    }
}