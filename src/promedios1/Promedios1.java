/*
 * Implementar un algoritmo que me permita calcular el promeio de 5 
calificaciones
 */
package promedios1;
import java.lang.*;
import java.io.*;
import java.util.*;
/**
 *
 * @author JESSICA MARIBEL VEGA MASAPANTA
 */
public class Promedios1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2,n3,n4,n5,suma=0,promedio=0;
        Scanner Teclado=new Scanner(System.in);
        
        System.out.println("Ingrese la primera calificacion");
        n1=Teclado.nextInt();
        System.out.println("Ingrese la segunda calificacion");
        n2=Teclado.nextInt();
        System.out.println("Ingrese la tercera calificacion");
        n3=Teclado.nextInt();
        System.out.println("Ingrese la cuarta calificacion");
        n4=Teclado.nextInt();
        System.out.println("Ingrese la quinta calificacion");
        n5=Teclado.nextInt();
        suma=n1+n2+n3+n4+n5;
        promedio=suma/5;
        System.out.println("El promedio de las calificaciones es"+promedio);
        
        // TODO code application logic here
    }
    
}
