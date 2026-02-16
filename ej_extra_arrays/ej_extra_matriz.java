package ej_extra_arrays;

import java.util.Scanner;

public class ej_extra_matriz {
    public static void main(String[] args) {
        int notas [][] = new int[4][3];

        //User enters the values for the array
        System.out.println("Ingrese los valores de las notas de los alumnos: ");

        //suprimir warnings
        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);

        //Full the matrix of values
        for (int i=0; i<notas.length; i++) {
            for (int j=0; j<notas[i].length; j++) {
                System.out.print("Ingrese la fila: " + i + " columna: " + j + " : " );
                notas[i][j] = teclado.nextInt();
            }
        }
        
        //close user entry
        teclado.close();

        //declare where averages will be put
        int promedioNota [] = new int[4];

        //iterate matrix rows
        for (int i = 0; i < notas.length; i++) {
            //declare variables
            int sum = 0;
            int promedioIndividual = 0;
            int cantidadColumnasAlumno = 0;
            //iterate each row columns
            for (int j=0; j<notas[i].length; j++) {
                //declare a comparative of index to ubicate the last column row
                cantidadColumnasAlumno += 1;
                //print each entered value
                System.out.println("Las notas de los alumnos son: " + notas[i][j]);
                sum += notas[i][j];
                //once at the last column of each row
                if (cantidadColumnasAlumno == notas[i].length) {
                    System.out.println("Suma de cada fila, por alumno: " + sum);
                    //calculare average of row values
                    promedioIndividual = sum / notas[i].length;
                    System.out.println("El promedio de nota, por alumno: " + promedioIndividual);
                    //Assign average row value to averages vector, same matrix rows index
                    promedioNota[i] = promedioIndividual;
                };
            }
        }
        
        //iterate vector for printing values
        for (int i = 0; i < promedioNota.length; i++) {
            System.out.println("Los promedios de notas son: " + promedioNota[i]);
        }
    };
};
