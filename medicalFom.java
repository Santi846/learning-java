import java.time.LocalDateTime;

public class medicalFom {
    public static void main(String... args) {
        //contact pacient
       String tipoAtencion = "telefonica";
       String numeroTelefono = "000099999";
       String fax = "EJemplo de fax";
       String correo_electronico = "ejemplo@gmail.com.uy";

       //logs
       String usuarioRegistrador = "Root";
       String telefonoRegistrador = "99990000";
       LocalDateTime fechaRegistro = LocalDateTime.now();
        
        //data pacient
        String[] genero = {"Femenino", "Masculino"};

        boolean requierePrescripcion = false;

        //concatenacion
        System.out.println("Datos de contacto del paciente: " + " "+ tipoAtencion + " " + numeroTelefono + " vía: "  + fax + " " + correo_electronico + "\n");
        System.out.println("Datos del registro: " + usuarioRegistrador + " " + telefonoRegistrador + " " + fechaRegistro + "\n");
        System.out.println("Data paciente: " + genero[1] + " " + requierePrescripcion);
        
    }
}
