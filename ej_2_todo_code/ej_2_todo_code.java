package ej_2_todo_code;
import java.util.Scanner;

public class ej_2_todo_code {
    public static void main (String... args){
        int numeros [] = new int[5];
        System.out.println("A continuación, ingrese los números...");

        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Ingrese un número: ");
            numeros[i] = teclado.nextInt();
        }

        //itero dos veces sobre el mismo array para comparar cada número con los demás
        for (int i = 0; i < numeros.length; i++) {
            
            for (int j = i + 1; j < numeros.length; j++) {
            //detectar el mayor y el menor del array
            System.out.println("El número en la posición " + i + " es: " + numeros[i]);
            //si la resta de numeros es positiva, es mayor, sino es menor
            //entonces
                if (numeros[i] - numeros [j] > 0) {
                    System.out.println(numeros[i] + " es mayor que " + numeros[j]);
                    //el mayor de todos del array es
                    int mayor = numeros[0];
                    for (int k = 1; k < numeros.length; k++) {
                        if (numeros[k] > mayor) {
                            mayor = numeros[k];
                        }
                    }
                    System.out.println("El número mayor del array es: " + mayor);
                } else if (numeros[i] - numeros [j] < 0) {
                    System.out.println(numeros[i] + " es menor que " + numeros[j]);
                     //el menor de todos del array es
                    int menor = numeros[0];
                    for (int k = 1; k < numeros.length; k++) {
                        if (numeros[k] < menor) {
                            menor = numeros[k];
                        }
                    }
                    System.out.println("El número menor del array es: " + menor);
                } else {
                    System.out.println(numeros[i] + " es igual que " + numeros[j]);
                }
            }
        }
        teclado.close();
    }
}
