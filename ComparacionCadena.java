public class ComparacionCadena {
    public static void main(String[] args) {
    
        String miFruta;
        System.out.println("Ingrese la fruta de su preferencia:");
        miFruta = System.console().readLine();

        if ("manzana".equals(miFruta)) {
            System.out.println("iguales");
        } else {
            System.out.println("diferentes");
            
        }
        
    }
    
}
 