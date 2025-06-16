public class NumeroPositivo {
    public static void main(String[] args) {
        int numero;

        System.out.println("Por favor, ingresa un numero entero");
        numero = Integer.parseInt(System.console().readLine());

        if (numero > 0)  {  
            System.out.println("El numero ingresado es Positivo");
        } else {
            System.out.println("El numero ingresado es Negativo");
        }
    }

}
