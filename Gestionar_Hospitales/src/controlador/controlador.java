
package controlador;
import modelo.modelo;
import vista_Principal.LoginVista;
/**
 *
 * @author Zakaria Abouhmmadi
 */

public class controlador {
    private final modelo model;
    private final LoginVista view;
    
    public controlador (modelo model, LoginVista view){
        this.model = model;
        this.view = view;
        
        view.setActionListener(new ControllerActionListener());
    }

    class ControllerActionListener implements ActionListener{
           @Override
           public void actionPerformed(ActionEvent ae){
               String command = ae.getActionCommand();
               switch (command){
               case "ItemLogIn":
                    usuario = view.getUsuario();
                    contrasenya = view.getContrasenya();
                    
                    if (usuario.isEmpty() || contrasenya.isEmpty()) {
                        // Mostrar aviso si algún campo está vacío
                        JOptionPane.showMessageDialog(view, "Todos los campos deben estar llenos", "Aviso", JOptionPane.WARNING_MESSAGE);
                        return; // Salir del método si hay campos vacíos
                    }
                    else if (usuario.equals("enfermera") && contrasenya.equals("enfermera")){
                        /// Si el usuario y la contraseña coinciden con "enfermera" y "enfermera", abre la ventana ventanaAdminVista
                    }
                    else {
                        // Si el usuario y la contraseña no coinciden con ninguna, abre la ventana ventanaClienteVista
                    }
                    break;                   
                case "ItemSalir":
                    System.exit(0);
                    break;
               }
           
           
           }
    }

    }
