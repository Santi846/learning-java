import java.util.Scanner;

public class operators {
    public static void main(String... args) {
        //suprimir warnings
        @SuppressWarnings("resource")
        //nueva instancia de la clase
        //system.in toma la config de mi sisitema operativo, como idioma
        Scanner teclado = new Scanner(System.in);
        //sin un valor asinado, pueden compartir linea, y tipo de dato (entero numerico)
        //para valores con coma, muestra el entero y no el decimal
        int num1, num2;
        //permite decimales
        //siempre devuelve el decimal con ".", pero el ingreso va con "," o "." dependiendo del idioma del teclado
        double resultado;

       System.out.println("Ingrese el primer numero a sumar: ");
       //guardo solamente valores (enteros numericos) ingresados por teclado en  variable
       num1 = teclado.nextInt();

        System.out.println("Ingrese el segundo numero a sumar: ");
        num2 = teclado.nextInt();

        resultado = num1 + num2;
        System.out.println("El resultado es: " + resultado );
    }
}
