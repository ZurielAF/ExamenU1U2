
package examenu1u2;
import java.util.Scanner;
/**
 *
 * @author Zuriel
 */
public class ExamenU1U2 {

  
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
    
        System.out.println("Ingresa el nombre del primer producto ");
         String N1 = scanner.nextLine();
        
        System.out.println("Ingresa el precio del primer producto");
        double P1 = scanner.nextDouble();
        
        scanner.nextLine();
        
        System.out.println("Ingresa el nombre del segundo producto");
         String N2 = scanner.nextLine();
        
         System.out.println("Ingrese el precio del segundo producto");
         double P2 = scanner.nextDouble();
         
         scanner.nextLine();

        System.out.println("Ingresa el nombre del tercer producto");
         String N3 = scanner.nextLine();
         
        System.out.println("Ingrese el precio del tercer producto");
        double P3 = scanner.nextDouble();
              
      double Producto1 = (P1 * 30) / 100;
      double Producto2 = (P2 * 65) /100;
      double Producto3 = (P3 * 15) / 100;
      
      scanner.close();
      
        System.out.println("El primer producto es: " + N1 + " y su descuento es: " + Producto1);
        System.out.println("El segundo producto es: " + N2 + " y su descuento es: " + Producto2);
        System.out.println("El segundo producto es: " + N3 + " y su descuento es: " + Producto3);

    }
    
}
