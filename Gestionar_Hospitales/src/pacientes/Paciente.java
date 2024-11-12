package pacientes;

/**
 *
 * @author Albercoque64
 */
public class Paciente {

    String nombre;
    String apellidos;
    String sintomas;
    int habitacion;

    public Paciente(String nombre, String apellidos, String sintomas, int habitacion) {

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sintomas = sintomas;
        this.habitacion = habitacion;

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
