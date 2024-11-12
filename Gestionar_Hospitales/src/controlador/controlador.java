package controlador;

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
import medico.Buscar_EnfermedadesVista;
import medico.MedicoVista;
import medico.Ver_PacientesVista;
import medico.VerHistorialPaciente;
/**
 *
 * @author Zakaria Abouhmmadi
 */
public class controlador {

    private modelo model;

    //LOGIN
    private LoginVista view;

    //ENFERMERA
    private EnfermeraVista enfermeraVista;
    private Buscar_Medicamentos_Vista enfermeraBuscar;
    private Administrar_Medicamentos_Vista enfermeraAdministrar;

    //MEDICO
    private MedicoVista medicoVista;
    private Ver_PacientesVista medicoPacientes;
    private Buscar_EnfermedadesVista medicoBuscar;
    private VerHistorialPaciente historialVista;
    
    public controlador(modelo model, LoginVista view, EnfermeraVista enfermeraVista, Buscar_Medicamentos_Vista enfermeraBuscar, Administrar_Medicamentos_Vista enfermeraAdministrar,
            MedicoVista medicoVista, Ver_PacientesVista medicoPacientes, Buscar_EnfermedadesVista medicoBuscar) {

        this.model = model;
        this.view = view;
        this.enfermeraVista = enfermeraVista;
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
        
        this.medicoPacientes.getTable().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 2) {
                int selectedRow = medicoPacientes.getTable().getSelectedRow();
                if (selectedRow != -1) {
                    
                    String nombrePaciente = (String) medicoPacientes.getTable().getValueAt(selectedRow, 0);

                    VerHistorialPaciente historialVista = new VerHistorialPaciente();
                    historialVista.setVisible(true);
                }
            }
        }
    });
    }
    
    
    class ControladorActionListener implements ActionListener {

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

                    }

                    break;

                //ENFERMERA   
                case "enfermeraAdministrar":
                    enfermeraVista.hide();
                    enfermeraAdministrar.setVisible(true);

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
    }
    
}
