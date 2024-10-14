/**
 * Archivo a modificar.
 * Modifica el código ASCII que representa a un camello y agrega una cola.
 * @author Fuentes Esquivel Elian Andrea 
 * @author Campos Mendoza Edgar Felipe       
 * @version 1.0                 
 * @date 9 oct
 *  2024.           
 */
import java.util.Arrays;

public class Numeros {
    public static void main(String[] args) {
        // Verificar que haya al menos 4 argumentos (la opción + 3 números)
        if (args.length != 4) {
            System.out.println("Cantidad incorrecta de datos!!!");
            return;
        }

        // Leer la opción (args[0]) y los tres números
        String opcion = args[0];
        int num1, num2, num3;

        try {
            num1 = Integer.parseInt(args[1]);
            num2 = Integer.parseInt(args[2]);
            num3 = Integer.parseInt(args[3]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Los argumentos deben ser números enteros.");
            return;
        }

        // Realizar la operación según la opción
        switch (opcion) {
            case "-M":
                // Determinar el valor mayor
                int max = Math.max(num1, Math.max(num2, num3));
                System.out.printf("El mayor de %d, %d y %d es %d\n", num1, num2, num3, max);
                break;

            case "-m":
                // Determinar el valor menor
                int min = Math.min(num1, Math.min(num2, num3));
                System.out.printf("El menor de %d, %d y %d es %d\n", num1, num2, num3, min);
                break;

            case "-p":
                // Calcular el promedio
                int promedio = (num1 + num2 + num3) / 3;
                System.out.printf("El promedio de %d, %d y %d es %d\n", num1, num2, num3, promedio);
                break;

            case "-o":
                // Mostrar los números en orden descendente
                int[] numeros = {num1, num2, num3};
                Arrays.sort(numeros);
                System.out.printf("Los números ordenados son %d, %d, %d\n", numeros[2], numeros[1], numeros[0]);
                break;

            case "-t":
                // Realizar todas las funciones
                max = Math.max(num1, Math.max(num2, num3));
                min = Math.min(num1, Math.min(num2, num3));
                promedio = (num1 + num2 + num3) / 3;
                numeros = new int[]{num1, num2, num3};
                Arrays.sort(numeros);

                System.out.printf("El mayor de %d, %d y %d es %d\n", num1, num2, num3, max);
                System.out.printf("El menor de %d, %d y %d es %d\n", num1, num2, num3, min);
                System.out.printf("El promedio de %d, %d y %d es %d\n", num1, num2, num3, promedio);
                System.out.printf("Los números ordenados son %d, %d, %d\n", numeros[2], numeros[1], numeros[0]);
                break;

            default:
                // Opción incorrecta
                System.out.println("Opción incorrecta !!!");
                break;
        }
    }
}
