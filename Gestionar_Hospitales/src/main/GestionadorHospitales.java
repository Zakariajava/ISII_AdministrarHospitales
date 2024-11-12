package main;

import modelo.modelo;
import vista_Principal.LoginVista;
import controlador.controlador;
import enfermera.Buscar_Medicamentos_Vista;
import modelo.modelo;
import vista_Principal.LoginVista;
import enfermera.EnfermeraVista;
import enfermera.Administrar_Medicamentos_Vista;
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
    public static void main(String[] args) {

        //MOEDLO
        modelo model = new modelo();

        //LOGIN
        LoginVista vista = new LoginVista();

        //ENFERMERA
        Administrar_Medicamentos_Vista enfermeraAdministrar = new Administrar_Medicamentos_Vista();
        Buscar_Medicamentos_Vista enfermeraBuscar = new Buscar_Medicamentos_Vista();
        EnfermeraVista enfermeraVista = new EnfermeraVista();

        //MEDICO
        Buscar_EnfermedadesVista medicoBuscar = new Buscar_EnfermedadesVista();
        MedicoVista medicoVista = new MedicoVista();
        Ver_PacientesVista medicoPacientes = new Ver_PacientesVista();
        //CONTROLLER
        controlador controller = new controlador(model, vista, enfermeraVista, enfermeraBuscar, enfermeraAdministrar, medicoVista, medicoPacientes, medicoBuscar);

        vista.setVisible(true);

        //BD
        //PACIENTES
        Paciente paciente1 = new Paciente("Pepe", "Gonzalez Martinez", "Dolor de cabeza", 4);
        Paciente paciente2 = new Paciente("Marcos", "Juarez Alcanyiz", "Dolor de garganta", 5);
        Paciente paciente3 = new Paciente("Camilo", "Restrepo Messa", "Tos seca", 9);
        Paciente paciente4 = new Paciente("Jose", "Pascal Gomez", "Dolor de barriga", 15);
        Paciente paciente5 = new Paciente("Pedro", "De la Mesa Redondo", "Dolor de cabeza", 19);
        Paciente paciente6 = new Paciente("Maria", "Pascal Gomez", "Vista muy cansada", 0);
        //MEDICAMENTOS
        Medicamentos paracetamol = new Medicamentos("Paracetamol", 100);
        Medicamentos ibuprofeno = new Medicamentos("Ibuprofeno", 49);

    }

}
