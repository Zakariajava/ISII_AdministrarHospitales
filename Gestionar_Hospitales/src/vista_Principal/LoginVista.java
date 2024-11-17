package vista_Principal;

import java.awt.event.ActionListener;

/**
 *
 * @author Zakaria
 */
public class LoginVista extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public LoginVista() {
        initComponents();

        b_cerrar.setActionCommand("cerrar");
        b_iniciar_sesion.setActionCommand("iniciar");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_inicio = new javax.swing.JPanel();
        l_is = new javax.swing.JLabel();
        l_gr = new javax.swing.JLabel();
        l_uv = new javax.swing.JLabel();
        panel_login = new javax.swing.JPanel();
        l_salir = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        sep_name = new javax.swing.JSeparator();
        l_password = new javax.swing.JLabel();
        tf_password = new javax.swing.JPasswordField();
        b_cerrar = new java.awt.Button();
        b_iniciar_sesion = new java.awt.Button();
        l_nombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(57, 113, 177));
        setUndecorated(true);

        panel_inicio.setBackground(new java.awt.Color(0, 0, 0));
        panel_inicio.setPreferredSize(new java.awt.Dimension(515, 580));

        l_is.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l_is.setForeground(new java.awt.Color(57, 113, 177));
        l_is.setText(" Ingenieria de Software II");

        l_gr.setBackground(new java.awt.Color(240, 240, 240));
        l_gr.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        l_gr.setForeground(new java.awt.Color(51, 52, 54));
        l_gr.setText(" Grupo 03");

        l_uv.setBackground(new java.awt.Color(240, 240, 240));
        l_uv.setForeground(new java.awt.Color(51, 52, 54));
        l_uv.setText("Universitat de Valencia");

        javax.swing.GroupLayout panel_inicioLayout = new javax.swing.GroupLayout(panel_inicio);
        panel_inicio.setLayout(panel_inicioLayout);
        panel_inicioLayout.setHorizontalGroup(
            panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inicioLayout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addGroup(panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_inicioLayout.createSequentialGroup()
                        .addGroup(panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(l_gr, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_is, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_inicioLayout.createSequentialGroup()
                        .addComponent(l_uv)
                        .addContainerGap())))
        );
        panel_inicioLayout.setVerticalGroup(
            panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inicioLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(l_is, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l_gr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 460, Short.MAX_VALUE)
                .addComponent(l_uv)
                .addContainerGap())
        );

        panel_login.setBackground(new java.awt.Color(32, 35, 35));
        panel_login.setForeground(new java.awt.Color(0, 0, 0));
        panel_login.setPreferredSize(new java.awt.Dimension(515, 580));
        panel_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_salir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l_salir.setForeground(new java.awt.Color(57, 113, 177));
        l_salir.setText("X");
        panel_login.add(l_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 20, 30));

        tf_name.setBackground(new java.awt.Color(32, 33, 35));
        tf_name.setForeground(new java.awt.Color(57, 113, 177));
        tf_name.setBorder(null);
        tf_name.setCaretColor(new java.awt.Color(255, 255, 255));
        tf_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nameActionPerformed(evt);
            }
        });
        panel_login.add(tf_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 330, 20));
        panel_login.add(sep_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 330, 10));

        l_password.setBackground(new java.awt.Color(240, 240, 240));
        l_password.setForeground(new java.awt.Color(51, 52, 54));
        l_password.setText("Contraseña");
        panel_login.add(l_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 70, -1));

        tf_password.setBackground(new java.awt.Color(32, 33, 35));
        tf_password.setForeground(new java.awt.Color(57, 113, 177));
        tf_password.setBorder(null);
        panel_login.add(tf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 226, 330, 20));

        b_cerrar.setBackground(new java.awt.Color(126, 87, 194));
        b_cerrar.setFont(new java.awt.Font("Century Gothic", 0, 12));
        b_cerrar.setForeground(new java.awt.Color(255, 255, 255));
        b_cerrar.setLabel("Cerrar");
        panel_login.add(b_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 340, 50));

        b_iniciar_sesion.setBackground(new java.awt.Color(126, 87, 194));
        b_iniciar_sesion.setFont(new java.awt.Font("Century Gothic", 0, 12));
        b_iniciar_sesion.setForeground(new java.awt.Color(255, 255, 255));
        b_iniciar_sesion.setLabel("Iniciar sesión");
        panel_login.add(b_iniciar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 340, 50));

        l_nombre.setForeground(new java.awt.Color(57, 113, 177));
        l_nombre.setText("Nombre ");
        l_nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l_nombreMouseClicked(evt);
            }
        });
        panel_login.add(l_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 50, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void l_nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_nombreMouseClicked

    }//GEN-LAST:event_l_nombreMouseClicked

    private void tf_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button b_cerrar;
    private java.awt.Button b_iniciar_sesion;
    private javax.swing.JLabel l_gr;
    private javax.swing.JLabel l_is;
    private javax.swing.JLabel l_nombre;
    private javax.swing.JLabel l_password;
    private javax.swing.JLabel l_salir;
    private javax.swing.JLabel l_uv;
    private javax.swing.JPanel panel_inicio;
    private javax.swing.JPanel panel_login;
    private javax.swing.JSeparator sep_name;
    private javax.swing.JTextField tf_name;
    private javax.swing.JPasswordField tf_password;
    // End of variables declaration//GEN-END:variables

    public String getUsuario() {

        return tf_name.getText();

    }

    public String getContraseña() {

        return tf_password.getText();

    }

    public void setActionListener(ActionListener actionListener) {

        b_cerrar.addActionListener(actionListener);
        b_iniciar_sesion.addActionListener(actionListener);

    }

}
