import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingresa la nota " + i + ": ");
            double nota = scanner.nextDouble();
            suma += nota;
    }
    
    double promedio = suma / 5;

    if (promedio > 10.5) {
        System.out.println("Promedio: " + promedio);
        System.out.println("¡Aprobado!");
    } else {
        System.out.println("Promedio: " + promedio);
        System.out.println("Desaprobado.");
     }

   }
}
