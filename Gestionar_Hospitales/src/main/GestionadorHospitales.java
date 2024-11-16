package main;

import modelo.modelo;
import vista_Principal.LoginVista;
import controlador.controlador;
import enfermera.AdministrarMedicamentos;
import enfermera.Buscar_Medicamentos_Vista;
import modelo.modelo;
import vista_Principal.LoginVista;
import enfermera.EnfermeraVista;
import enfermera.Administrar_Medicamentos_Vista;
import java.util.ArrayList;
import java.util.List;
import medicamentos.Medicamentos;
import medico.Buscar_EnfermedadesVista;
import medico.MedicoVista;
import medico.Ver_PacientesVista;
import medico.VerHistorialPaciente;
import pacientes.Paciente;

/**
 *
 * @author Zakaria Abouhammadi
 */
public class GestionadorHospitales {

    /**
     * @param args the command line arguments
     */
    private static List<Medicamentos> medicamentos = new ArrayList<>();
    private static List<Paciente> pacientes = new ArrayList<>();

    public static void main(String[] args) {

        //MOEDLO
        modelo model = new modelo();

        //LOGIN
        LoginVista vista = new LoginVista();

        //ENFERMERA
        AdministrarMedicamentos enfermeraAdministrarMedicamentos = new AdministrarMedicamentos();
        Administrar_Medicamentos_Vista enfermeraAdministrar = new Administrar_Medicamentos_Vista();
        Buscar_Medicamentos_Vista enfermeraBuscar = new Buscar_Medicamentos_Vista();
        EnfermeraVista enfermeraVista = new EnfermeraVista();

        //MEDICO
        Buscar_EnfermedadesVista medicoBuscar = new Buscar_EnfermedadesVista();
        MedicoVista medicoVista = new MedicoVista();
        Ver_PacientesVista medicoPacientes = new Ver_PacientesVista();
        //CONTROLLER
        controlador controller = new controlador(model, vista, enfermeraVista, enfermeraAdministrarMedicamentos, enfermeraBuscar, enfermeraAdministrar, medicoVista, medicoPacientes, medicoBuscar);

        vista.setVisible(true);

        //BD
        //PACIENTES
        Paciente paciente1 = new Paciente("Pepe", "Gonzalez Martinez", "Dolor de cabeza", 4, "Paracetamol", "200g", "Cada 8 horas");
        Paciente paciente2 = new Paciente("Marcos", "Juarez Alcanyiz", "Dolor de garganta", 5, "Miel", "200g", "Despues de cada comida");
        Paciente paciente3 = new Paciente("Camilo", "Restrepo Messa", "Tos seca", 9, "Frenadol", "150g", "Cada 12h");
        Paciente paciente4 = new Paciente("Jose", "Pascal Gomez", "Dolor de barriga", 15, "Salvacolina", "175ml", "Una vez al dia");
        Paciente paciente5 = new Paciente("Pedro", "De la Mesa Redondo", "Dolor de cabeza", 19, "Paracetamol", "500g", "Cada 8 horas");
        Paciente paciente6 = new Paciente("Maria", "Pascal Gomez", "Vista muy cansada", 0, "Lagrimas artificiales", "3 Gotitas", "Al notar irritacion");
        //MEDICAMENTOS
        Medicamentos paracetamol = new Medicamentos("Paracetamol", 100);
        Medicamentos ibuprofeno = new Medicamentos("Ibuprofeno", 49);

        //List<Medicamentos> medicamentos = new ArrayList<>();
        medicamentos.add(paracetamol);
        medicamentos.add(ibuprofeno);

        pacientes.add(paciente1);
        pacientes.add(paciente2);
        pacientes.add(paciente3);
        pacientes.add(paciente4);
        pacientes.add(paciente5);
        pacientes.add(paciente6);

        medicoPacientes.mostrarPacientes(pacientes);
        enfermeraAdministrar.mostrarMedicamentos(medicamentos);

    }

    public static List<Paciente> getPacientes() {
        return pacientes;
    }

    public static List<Medicamentos> getMedicamentos() {
        return medicamentos;
    }
}
