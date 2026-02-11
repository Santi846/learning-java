package ej_4_todo_code;
import java.util.Scanner;

public class ej_4_todo_code {
    public static void main (String... args){
        int sueldos [] = new int[12];
        System.out.println("A continuación, ingrese los sueldos...");

        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < sueldos.length; i++){
            System.out.println("Ingrese un sueldo: ");
            sueldos[i] = teclado.nextInt();
        }

        //Sum of elements of vector

        int sum = 0;
        //sum values
        for (int i : sueldos) {
            sum += i;
        }
        
        System.out.println("La suma de sueldos es: " + sum);

        //Average of value around elements of vector

        int average =  sum / sueldos.length;

        System.out.println("El promedio de sueldo fue de: " + average);

        teclado.close();
    }
}
