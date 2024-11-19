package controlador;

import enfermera.AdministrarMedicamentos;
import enfermera.Buscar_Medicamentos_Vista;
import modelo.modelo;
import vista_Principal.LoginVista;
import enfermera.EnfermeraVista;
import enfermera.Administrar_Medicamentos_Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import main.GestionadorHospitales;
import medico.Buscar_EnfermedadesVista;
import medico.MedicoVista;
import medico.Ver_PacientesVista;
import medico.VerHistorialPaciente;
import pacientes.Paciente;

/**
 *
 * @author Zakaria Abouhmmadi
 */
public class controlador {

    private modelo model;

    //LOGIN
    private LoginVista view;

    //ENFERMERA
    private AdministrarMedicamentos enfermeraAdministrarMedicamentos;
    private EnfermeraVista enfermeraVista;
    private Buscar_Medicamentos_Vista enfermeraBuscar;
    private Administrar_Medicamentos_Vista enfermeraAdministrar;

    //MEDICO
    private MedicoVista medicoVista;
    private Ver_PacientesVista medicoPacientes;
    private Buscar_EnfermedadesVista medicoBuscar;
    private VerHistorialPaciente historialVista;

    public controlador(modelo model, LoginVista view, EnfermeraVista enfermeraVista, AdministrarMedicamentos enfermeraAdministrarMedicamentos, Buscar_Medicamentos_Vista enfermeraBuscar, Administrar_Medicamentos_Vista enfermeraAdministrar,
            MedicoVista medicoVista, Ver_PacientesVista medicoPacientes, Buscar_EnfermedadesVista medicoBuscar) {

        this.model = model;
        this.view = view;
        this.enfermeraVista = enfermeraVista;
        this.enfermeraAdministrarMedicamentos = enfermeraAdministrarMedicamentos;
        this.enfermeraBuscar = enfermeraBuscar;
        this.enfermeraAdministrar = enfermeraAdministrar;
        this.medicoVista = medicoVista;
        this.medicoPacientes = medicoPacientes;
        this.medicoBuscar = medicoBuscar;

        ControladorActionListener onlyModelActionListener = new ControladorActionListener();

        this.view.setActionListener(onlyModelActionListener);
        this.enfermeraVista.setActionListener(onlyModelActionListener);
        this.enfermeraBuscar.setActionListener(onlyModelActionListener);
        this.enfermeraAdministrar.setActionListener(onlyModelActionListener);
        this.medicoVista.setActionListener(onlyModelActionListener);
        this.medicoPacientes.setActionListener(onlyModelActionListener);
        this.medicoBuscar.setActionListener(onlyModelActionListener);
        this.enfermeraAdministrarMedicamentos.setActionListener(onlyModelActionListener);
        
        this.enfermeraAdministrarMedicamentos.setValueChangeListener(onlyModelActionListener);

        this.medicoPacientes.getTable().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 2) {
                int selectedRow = medicoPacientes.getTable().getSelectedRow();
                if (selectedRow != -1) {
                    // Obtener el nombre del paciente seleccionado de la tabla
                    String nombrePaciente = (String) medicoPacientes.getTable().getValueAt(selectedRow, 0);

                    // Buscar al paciente en el modelo
                    Paciente pacienteSeleccionado = model.getPacientePorNombre(nombrePaciente);

                    if (pacienteSeleccionado != null) {
                        // Crear la vista del historial
                        VerHistorialPaciente historialVista = new VerHistorialPaciente();

                        // Actualizar la tabla de la vista del historial con los datos del paciente
                        historialVista.actualizarTabla(pacienteSeleccionado.getHistorialMedico().getVisitas());

                        // Mostrar la ventana del historial
                        historialVista.setVisible(true);
                    } else {
                        // Mostrar un mensaje si no se encuentra el paciente (opcional)
                        JOptionPane.showMessageDialog(medicoPacientes,
                            "Paciente no encontrado",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
        });

    }

    class ControladorActionListener implements ActionListener, ListSelectionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            String command = ae.getActionCommand();
            System.out.print(command);

            switch (command) {

                //LOGIN
                case "cerrar":
                    System.exit(0);
                    break;

                case "iniciar":

                    if (view.getUsuario().isEmpty() || view.getContraseña().isEmpty()) {
                        // Mostrar aviso si algún campo está vacío
                        JOptionPane.showMessageDialog(view, "Todos los campos deben estar llenos", "Aviso", JOptionPane.WARNING_MESSAGE);
                        return; // Salir del método si hay campos vacíos
                    } else if (view.getUsuario().equals("enfermera") && view.getContraseña().equals("enfermera")) {
                        // Si el usuario y la contraseña coinciden con "enfermera" y "enfermera", abre la ventana ventanaAdminVista

                        view.hide();
                        enfermeraVista.setVisible(true);

                    } else if (view.getUsuario().equals("medico") && view.getContraseña().equals("medico")) {
                        // Si el usuario y la contraseña coinciden con "enfermera" y "enfermera", abre la ventana ventanaAdminVista

                        view.hide();
                        medicoVista.setVisible(true);

                    } else {
                        JOptionPane.showMessageDialog(view, "El nombre o la contraseña es incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                    break;

                //ENFERMERA   
                case "enfermeraInventario":
                    enfermeraVista.hide();
                    enfermeraAdministrar.setVisible(true);
                    enfermeraAdministrar.verificarStock(main.GestionadorHospitales.getMedicamentos());
                    break;

                case "enfermeraAdministrar":
                    enfermeraVista.hide();
                    enfermeraAdministrarMedicamentos.setLista(GestionadorHospitales.getPacientes());
                    enfermeraAdministrarMedicamentos.setVisible(true);

                    break;
                case "enfermeraAdministrarCerrar":

                    enfermeraAdministrarMedicamentos.hide();
                    enfermeraVista.setVisible(true);

                    break;

                case "enfermeraMedicamentosCerrar":
                    enfermeraAdministrar.hide();
                    enfermeraVista.setVisible(true);

                    break;

                case "enfermeraBuscar":
                    enfermeraVista.hide();
                    enfermeraBuscar.setVisible(true);

                    break;

                case "enfermeraBuscarCerrar":
                    enfermeraBuscar.hide();
                    enfermeraVista.setVisible(true);

                    break;

                case "enfermeraCerrar":
                    enfermeraVista.hide();
                    view.setVisible(true);

                    break;

                //MEDICO
                case "medicoBuscar":
                    medicoVista.hide();
                    medicoBuscar.setVisible(true);

                    break;

                case "medicoBuscarCerrar":
                    medicoBuscar.hide();
                    medicoVista.setVisible(true);

                    break;
                case "medicoPacientes":
                    medicoPacientes.setVisible(true);
                    medicoVista.hide();

                    break;

                case "medicoPacientesCerrar":
                    medicoPacientes.hide();
                    medicoVista.setVisible(true);

                    break;

                case "medicoCerrar":
                    medicoVista.hide();
                    view.setVisible(true);

            }
        }

        @Override
        public void valueChanged(ListSelectionEvent e) {
            System.out.println("lista");
            enfermeraAdministrarMedicamentos.setDescripcion(GestionadorHospitales.getPacientes(), enfermeraAdministrarMedicamentos.getPaciente());
        }
    }
}
