import java.util.Scanner;

public class VacacionesUno{
    public static void main(String[] args){

        Scanner vacaciones = new Scanner(System.in);

        System.out.println("Bienvenido al sistema vacacional de Coca-Cola Company");
        
        System.out.println("Por favor ingresa el nombre del empleado");
        String nombre = vacaciones.nextLine();

        System.out.println("Digite el número de Clave(1,2,3)");
        int clave = vacaciones.nextInt();

        System.out.println("Ingrese antiguedad en años");
        int antiguedad = vacaciones.nextInt();

        if (clave == 1 && antiguedad >= 1 && antiguedad < 2){
            System.out.println(nombre + " tiene derecho a 6 dias de vacaciones");
         }

        else if (clave == 1 && antiguedad >= 2 && antiguedad <= 6){
            System.out.println(nombre + " tiene derecho a 14 dias de vacaciones");    
         }
        
        else if (clave == 1 && antiguedad >= 7){
            System.out.println(nombre + " tiene derecho a 20 dias de vacaciones");
         }

        else if (clave == 2 && antiguedad >= 1 && antiguedad < 2){
            System.out.println(nombre + " tiene derecho a 7 dias de vacaciones");
        }

        else if (clave == 2 && antiguedad >= 2 && antiguedad <= 6){
            System.out.println(nombre + " tiene derecho a 15 dias de vacaciones");
        }

        else if (clave == 2 && antiguedad >= 7){
            System.out.println(nombre + " tiene derecho a 22 dias de vacaciones");
        }

        else if (clave == 3 && antiguedad >= 1 && antiguedad < 2){
            System.out.println(nombre + " tiene derecho a 10 dias de vacaciones");
        }

        else if (clave == 3 && antiguedad >= 2 && antiguedad <= 6){
            System.out.println(nombre + " tiene derecho a 20 dias de vacaciones");
        }

        else if (clave == 3 && antiguedad >= 7){
            System.out.println(nombre + " tiene derecho a 30 dias de vacaciones");
        }
        
        else if (clave != 1 && clave != 2 && clave != 3){
            System.out.println("Error, la clave de departamento no existe");
        }

        else if (antiguedad < 1){
            System.out.println(nombre + " aún no tiene derecho a vacaciones");
        }
    vacaciones.close();
    }
}