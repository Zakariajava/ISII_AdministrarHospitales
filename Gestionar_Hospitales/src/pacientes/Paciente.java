package pacientes;

/**
 *
 * @author Albercoque64
 */
public class Paciente {

    String nombre;
    String apellidos;
    String sintomas;

    public Paciente(String nombre, String apellidos, String sintomas) {

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sintomas = sintomas;

    }

    public String getNombre() {

        return nombre;
    }

    public String getApellidos() {

        return apellidos;
    }

    public String getSintomas() {

        return sintomas;
    }

}
