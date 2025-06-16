import java.util.Scanner;

public class LeeDatosScanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa 3 numeros (con decimales) separados por un espacio");

        double num1 = s.nextDouble();
        double num2 = s.nextDouble();
        double num3 = s.nextDouble();

        double promedio = (num1 + num2+ num3)/3;
        System.out.println("El promedio de estos 3 numeros es: "+promedio); 
    }
}
