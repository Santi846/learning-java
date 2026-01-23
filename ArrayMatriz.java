import java.util.Scanner;

public class ArrayMatriz {
    public static void main(String... args) {
    //define matrix, MULTIDIMENSIONAL array, row and column fix size
    int numeros [][] = new int[3][4];

    //User enters the values for the array
    System.out.println("Ingrese los valores la matríz: ");

    //suprimir warnings
    @SuppressWarnings("resource")
    Scanner teclado = new Scanner(System.in);

    for (int i=0; i<numeros.length; i++) {
        for (int j=0; j<numeros[0].length; j++) {
            System.out.print("Ingrese la fila: " + i + " columna: " + j + " : " );
            numeros[i][j] = teclado.nextInt();
        }
    }

    for (int i=0; i<numeros.length; i++) {
        for (int j=0; j<numeros[0].length; j++) {
            System.out.print("Fila " + i + " columna " + j + " : " + numeros[i][j] + "\n" );
        }
    }
    teclado.close();
}
}
