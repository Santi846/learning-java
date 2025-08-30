import java.util.Scanner;

public class switchClass {
    public static void main(String... args) {

        int dia;
        String nombreDia;

         //suprimir warnings
        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);

        dia = teclado.nextInt();

        switch (dia) {
            case 0:
                nombreDia = "Domingo";
                break;
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miercoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            default:
                nombreDia = "incorrecto";
                break;
        }

        System.out.println("En base al día ingresado: " + dia + " el día es: " + nombreDia);
        
    }
}
