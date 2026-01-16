import java.util.Scanner;

public class Arrays {
    public static void main(String... args) {
    //define vector, ONEDIMENSIONAL array, and it's size
       int numeros [] = new int[8];

    //assign values to each position of the array
    /*
        numeros[0] = 5;
        numeros[1] = 10;
        numeros[2] = 15;
        numeros[3] = 20;
        numeros[4] = 25;
        numeros[5] = 30;
        numeros[6] = 35;
        numeros[7] = 40;
    */
    //User enters the values for the array
    System.out.println("Ingrese los valores del vector: ");

    //suprimir warnings
    @SuppressWarnings("resource")
    Scanner teclado = new Scanner(System.in);

    //print a particular position of the array
    // System.out.println("Value at position 4, index 3:" + numeros[3]);

    for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = teclado.nextInt();
    }

    for (int i = 0; i < numeros.length; i++) {
            System.out.println("El valor en la posición " + i + " es: " + numeros[i]);
    }
    teclado.close();
}
}
