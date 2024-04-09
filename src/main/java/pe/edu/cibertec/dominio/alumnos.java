package pe.edu.cibertec.dominio;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
@Entity
@Table (name = "alumnos")

public class alumnos {

    @Id
    private String DNI;
    private String Nombres;
    private String Apellidos;
    private Date Nacimiento;
    private String Correo;
    private String Direccion;

    public alumnos() {

    }

    public alumnos(String DNI) {
        this.DNI = DNI;
    }

    public alumnos(String DNI, String nombres, String apellidos, Date nacimiento, String correo, String direccion) {
    public alumnos(String DNI, String nombres, String apellidos, Date nacimiento, String correo, String direccion) {
        this.DNI = DNI;
        Nombres = nombres;
        Apellidos = apellidos;
        Nacimiento = nacimiento;
        Correo = correo;
        Direccion = direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public Date getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        Nacimiento = nacimiento;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    @Override
    public String toString() {
        return "alumnos{" +
                "DNI='" + DNI + '\'' +
                ", Nombres='" + Nombres + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", Nacimiento=" + Nacimiento +
                ", Correo='" + Correo + '\'' +
                ", Direccion=" + Direccion +
                '}';
    }
}
