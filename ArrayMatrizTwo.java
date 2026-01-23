import java.util.Scanner;

public class ArrayMatrizTwo {
    public static void main(String... args) {
    //define matrix, MULTIDIMENSIONAL array, just row size, for column flexible size
    int numeros [][] = new int[3][];

    // define each row size
    numeros[0] = new int[2];  
    numeros[1] = new int[3];  
    numeros[2] = new int[4];

    //User enters the values for the array
    System.out.println("Ingrese los valores la matríz: ");

    //suprimir warnings
    @SuppressWarnings("resource")
    Scanner teclado = new Scanner(System.in);

    for (int i=0; i<numeros.length; i++) {
        for (int j=0; j<numeros[i].length; j++) {
            System.out.print("Ingrese la fila: " + i + " columna: " + j + " : " );
            numeros[i][j] = teclado.nextInt();
        }
    }

    for (int i=0; i<numeros.length; i++) {
        for (int j=0; j<numeros[i].length; j++) {
            System.out.print("Fila " + i + " columna " + j + " : " + numeros[i][j] + "\n" );
        }
    }
    teclado.close();
}
}
