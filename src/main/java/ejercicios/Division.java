
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Division {
    // TODO: Coloca aquí el código del ejercicio 3: Division
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Dividendo: ");
        int dividendo = scanner.nextInt();
        
        System.out.print("Divisor: ");
        int divisor = scanner.nextInt();
        
        String resultado = evaluar(dividendo, divisor);
        System.out.println(resultado);
    }

    public static String evaluar(int dividendo, int divisor) {
        int cociente = dividendo / divisor;
        int residuo = dividendo % divisor;
        String respuesta;

        if (residuo == 0) {
            respuesta = "La división es exacta. \n";
        } else {
            respuesta = "La división no es exacta. \n";
        }

        respuesta += "Cociente: " + cociente + "\n";
        respuesta += "Residuo: " + residuo;

        return respuesta;
    }
}