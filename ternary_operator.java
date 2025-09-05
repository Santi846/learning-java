import java.util.Scanner;

public class ternary_operator {
    public static void main(String[] args) {
        //programa que dependiendo de la nota de un alumno, nos diga si aprobo o no una materia

        int nota;
        int suficienteParaAprobar = 6;
        
        System.out.println("Ingrese la nota del alumno: ");

         //suprimir warnings
        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);

        nota = teclado.nextInt();

        String evaluacion = (nota >= suficienteParaAprobar) ? "aprobado" : "desaprobado";

        System.out.println("El estudiante está: " + evaluacion);

    }
}
