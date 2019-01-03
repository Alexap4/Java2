
package ejercicio3;

import java.util.Scanner;


public class Ejercicio3 {

    public static void main(String[] args) {
        int dato;
        boolean correcto;
        Scanner teclado = new Scanner(System.in);
        
        do
        {
            System.out.print("Ingrese un valor entero del 0 al 10:");  
            dato = teclado.nextInt();
            correcto = true;
            if (dato < 0)
                correcto = false;
            if (dato > 10)
                correcto = false;
            if(! correcto)
                System.out.println("Valor con Error ");
        }
        while (! correcto);
        System.out.println("Terminó el Programa");
    }
    
}
