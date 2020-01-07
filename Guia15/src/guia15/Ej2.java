
package guia15;

import java.util.Scanner;

/**
 *
 * @author larr0
 */
public class Ej2 {
    public static void main(String[] args) {
        
        double total=0,cantidad=0;
        String respuesta;
        do {
            System.out.println("Ingrese valor del producto "+(cantidad+1));
            Scanner lector = new Scanner(System.in);
            double precio = lector.nextDouble();
            total+=precio; //total = total+precio;
            cantidad++; //cantidad = cantidad+ 1;
            System.out.println("Desea ingresar otro producto S/N");
            respuesta = lector.next();
        } while (respuesta.equalsIgnoreCase("s"));
        
        System.out.println("El total de la venta es: "+total);
        System.out.println("La cantidad de productos es: "+cantidad);
    }
}
