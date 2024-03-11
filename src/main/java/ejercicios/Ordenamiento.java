
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Ordenamiento {
    // TODO: Coloca aquí el código del ejercicio 5: Ordenamiento
    public static String evaluar(int numero1, int numero2, int numero3, int numero4) {
        int[] numeros = {numero1, numero2, numero3, numero4};

        // Ordenar los números de forma ascendente
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[i]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }

        // Construir la respuesta con los números ordenados
        String respuesta = ": ";
        for (int i = 0; i < numeros.length; i++) {
            respuesta += numeros[i] + " ";
        }

        return respuesta;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Número 1: ");
        int numero1 = lector.nextInt();
        System.out.print("Número 2: ");
        int numero2 = lector.nextInt();
        System.out.print("Número 3: ");
        int numero3 = lector.nextInt();
        System.out.print("Número 4: ");
        int numero4 = lector.nextInt();

        String respuesta = evaluar(numero1, numero2, numero3, numero4);
        System.out.println(respuesta);
    }
}