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
import historial.HistorialMedico;
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
        VerHistorialPaciente verHistorialPaciente = new VerHistorialPaciente();
        //CONTROLLER
        controlador controller = new controlador(model, vista, enfermeraVista, enfermeraAdministrarMedicamentos, enfermeraBuscar, enfermeraAdministrar, medicoVista, medicoPacientes, medicoBuscar, verHistorialPaciente);

        vista.setVisible(true);

        //BD
        //PACIENTES
        Paciente paciente1 = new Paciente("Pepe", "Gonzalez Martinez", "Dolor de cabeza", 4, "Paracetamol", "200g", "Cada 8 horas");
        Paciente paciente2 = new Paciente("Marcos", "Juarez Alcanyiz", "Dolor de garganta", 5, "Miel", "200g", "Despues de cada comida");
        Paciente paciente3 = new Paciente("Camilo", "Restrepo Messa", "Tos seca", 9, "Frenadol", "150g", "Cada 12h");
        Paciente paciente4 = new Paciente("Jose", "Pascal Gomez", "Dolor de barriga", 15, "Salvacolina", "175ml", "Una vez al dia");
        Paciente paciente5 = new Paciente("Pedro", "De la Mesa Redondo", "Dolor de cabeza", 19, "Paracetamol", "500g", "Cada 8 horas");
        Paciente paciente6 = new Paciente("Maria", "Pascal Gomez", "Vista muy cansada", 0, "Lagrimas", "3 Gotitas", "Al notar irritacion");
        //MEDICAMENTOS
        Medicamentos paracetamol = new Medicamentos("Paracetamol", 100, "Dolor", "Alivia el dolor leve a moderado y reduce la fiebre.");
        Medicamentos ibuprofeno = new Medicamentos("Ibuprofeno", 49, "Inflamación", "Eficaz para reducir la inflamación y aliviar el dolor.");
        Medicamentos frenadol = new Medicamentos("Frenadol", 100, "Garganta", "Tratamiento para síntomas de resfriado y dolor de garganta.");
        Medicamentos salvacolina = new Medicamentos("Salvacolina", 33, "Estómago", "Ayuda en el alivio de problemas estomacales como diarrea.");
        Medicamentos lagrimas = new Medicamentos("Lagrimas", 18, "Ojos", "Hidratación para ojos secos y alivio de irritaciones.");
        Medicamentos amoxicilina = new Medicamentos("Amoxicilina", 120, "Infección", "Antibiótico para tratar infecciones bacterianas.");
        Medicamentos loratadina = new Medicamentos("Loratadina", 50, "Alérgia", "Antihistamínico para el alivio de alergias estacionales.");
        Medicamentos naproxeno = new Medicamentos("Naproxeno", 80, "Inflamación", "Alivia dolores e inflamaciones en articulaciones y músculos.");
        Medicamentos omeprazol = new Medicamentos("Omeprazol", 70, "Estómago", "Reduce la acidez estomacal y trata problemas de reflujo.");
        Medicamentos simeticona = new Medicamentos("Simeticona", 35, "Estómago", "Alivia los gases y la hinchazón estomacal.");
        Medicamentos salbutamol = new Medicamentos("Salbutamol", 150, "Respiración", "Broncodilatador que facilita la respiración en casos de asma.");
        Medicamentos diazepam = new Medicamentos("Diazepam", 95, "Ansiedad", "Tranquilizante para el tratamiento de ansiedad y estrés.");
        Medicamentos azitromicina = new Medicamentos("Azitromicina", 140, "Infección", "Antibiótico para infecciones respiratorias y de piel.");
        Medicamentos hidrocortisona = new Medicamentos("Hidrocortisona", 60, "Inflamación", "Reduce la inflamación y alivia las irritaciones cutáneas.");
        Medicamentos metformina = new Medicamentos("Metformina", 130, "Diabetes", "Ayuda a controlar los niveles de azúcar en la sangre.");

        medicamentos.add(paracetamol);
        medicamentos.add(ibuprofeno);
        medicamentos.add(frenadol);
        medicamentos.add(salvacolina);
        medicamentos.add(lagrimas);
        medicamentos.add(amoxicilina);
        medicamentos.add(loratadina);
        medicamentos.add(naproxeno);
        medicamentos.add(omeprazol);
        medicamentos.add(simeticona);
        medicamentos.add(salbutamol);
        medicamentos.add(diazepam);
        medicamentos.add(azitromicina);
        medicamentos.add(hidrocortisona);
        medicamentos.add(metformina);
        //HISTORIALES
        HistorialMedico historialPepe = new HistorialMedico();
        historialPepe.agregarVisita("2024-01-15", "Revisión general", "Todo normal");
        historialPepe.agregarVisita("2024-03-10", "Dolor de cabeza", "Migraña tratada con ibuprofeno");

        HistorialMedico historialMarcos = new HistorialMedico();
        historialMarcos.agregarVisita("2024-02-22", "Dolor abdominal", "Gastritis");
        historialMarcos.agregarVisita("2024-05-05", "Revisión post-quirúrgica", "Recuperación favorable");

        paciente1.setHistorialMedico(historialPepe);
        paciente2.setHistorialMedico(historialMarcos);
        pacientes.add(paciente1);
        pacientes.add(paciente2);
        pacientes.add(paciente3);
        pacientes.add(paciente4);
        pacientes.add(paciente5);
        pacientes.add(paciente6);

        medicoPacientes.mostrarPacientes(pacientes);
        enfermeraAdministrar.mostrarMedicamentos(medicamentos);

        model.agregarPaciente(pacientes);
    }

    public static List<Paciente> getPacientes() {
        return pacientes;
    }

    public static List<Medicamentos> getMedicamentos() {
        return medicamentos;
    }
}
