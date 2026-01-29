package ej_3_todo_code;
import java.util.Scanner;

public class ej_3_todo_code {
    public static void main (String... args){
        int numeros [] = new int[5];
        System.out.println("A continuación, ingrese los números...");

        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Ingrese un número: ");
            numeros[i] = teclado.nextInt();
        }

        //itero una primera vez sobre el array
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] == 3){
                for (int j = i + 1; j < numeros.length; j++) {
                int cantidad = 0;
                int total = cantidad + 1;
                if (numeros[i] == numeros[j]) {
                    cantidad++;
                    total++;
                    System.out.println("El número " + numeros[i] + " se repite " + cantidad + " veces en el array, con un total de " + total);   
                }
            }
            }
        }
        teclado.close();
    }
}
