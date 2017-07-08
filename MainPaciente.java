/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Leonardo Venancio
 */
public class MainPaciente extends javax.swing.JFrame {

    /**
     * Creates new form PacienteMain
     */
    public MainPaciente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        lblDigiteHosp9 = new javax.swing.JLabel();
        btnVisHist = new javax.swing.JButton();
        btnMarcarConsulta = new javax.swing.JButton();
        lblHospital1 = new javax.swing.JLabel();
        lblGereciador = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.setForeground(new java.awt.Color(153, 153, 153));

        lblDigiteHosp9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblDigiteHosp9.setForeground(new java.awt.Color(102, 102, 102));
        lblDigiteHosp9.setText("Escolha a opção desejada.");

        btnVisHist.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnVisHist.setText("Visualizar Histórico");
        btnVisHist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisHistActionPerformed(evt);
            }
        });

        btnMarcarConsulta.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnMarcarConsulta.setText("Marcar Consulta");
        btnMarcarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcarConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDigiteHosp9)
                .addGap(113, 113, 113))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMarcarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisHist, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnVisHist, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnMarcarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(lblDigiteHosp9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblHospital1.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        lblHospital1.setForeground(new java.awt.Color(0, 102, 0));
        lblHospital1.setText("Main Paciente");

        lblGereciador.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblGereciador.setText("Gerenciador de Paciente®");

        jButton1.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 240, Short.MAX_VALUE)
                        .addComponent(lblGereciador)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHospital1)
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHospital1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblGereciador)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisHistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisHistActionPerformed
      Historico tela = new Historico();
      tela.show();
      tela.setDefaultCloseOperation(Historico.DISPOSE_ON_CLOSE);
      dispose();
      
    }//GEN-LAST:event_btnVisHistActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MainTela janela = new MainTela();
        janela.show();
        janela.setDefaultCloseOperation(MainTela.DISPOSE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnMarcarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcarConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMarcarConsultaActionPerformed

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
            java.util.logging.Logger.getLogger(MainPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrarHosp;
    private javax.swing.JButton btnEntrarHosp1;
    private javax.swing.JButton btnEntrarHosp2;
    private javax.swing.JButton btnEntrarHosp3;
    private javax.swing.JButton btnEntrarHosp4;
    private javax.swing.JButton btnEntrarHosp5;
    private javax.swing.JButton btnEntrarHosp6;
    private javax.swing.JButton btnEntrarHosp7;
    private javax.swing.JButton btnEntrarHosp8;
    private javax.swing.JButton btnMarcarConsulta;
    private javax.swing.JButton btnVisHist;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblDigiteHosp;
    private javax.swing.JLabel lblDigiteHosp1;
    private javax.swing.JLabel lblDigiteHosp2;
    private javax.swing.JLabel lblDigiteHosp3;
    private javax.swing.JLabel lblDigiteHosp4;
    private javax.swing.JLabel lblDigiteHosp5;
    private javax.swing.JLabel lblDigiteHosp6;
    private javax.swing.JLabel lblDigiteHosp7;
    private javax.swing.JLabel lblDigiteHosp8;
    private javax.swing.JLabel lblDigiteHosp9;
    private javax.swing.JLabel lblGereciador;
    private javax.swing.JLabel lblHospital1;
    private javax.swing.JLabel lblSenhaHosp;
    private javax.swing.JLabel lblSenhaHosp1;
    private javax.swing.JLabel lblSenhaHosp2;
    private javax.swing.JLabel lblSenhaHosp3;
    private javax.swing.JLabel lblSenhaHosp4;
    private javax.swing.JLabel lblSenhaHosp5;
    private javax.swing.JLabel lblSenhaHosp6;
    private javax.swing.JLabel lblSenhaHosp7;
    private javax.swing.JLabel lblSenhaHosp8;
    private javax.swing.JLabel lblUserHosp;
    private javax.swing.JLabel lblUserHosp1;
    private javax.swing.JLabel lblUserHosp2;
    private javax.swing.JLabel lblUserHosp3;
    private javax.swing.JLabel lblUserHosp4;
    private javax.swing.JLabel lblUserHosp5;
    private javax.swing.JLabel lblUserHosp6;
    private javax.swing.JLabel lblUserHosp7;
    private javax.swing.JLabel lblUserHosp8;
    private javax.swing.JPasswordField txtSenhaHosp;
    private javax.swing.JPasswordField txtSenhaHosp1;
    private javax.swing.JPasswordField txtSenhaHosp2;
    private javax.swing.JPasswordField txtSenhaHosp3;
    private javax.swing.JPasswordField txtSenhaHosp4;
    private javax.swing.JPasswordField txtSenhaHosp5;
    private javax.swing.JPasswordField txtSenhaHosp6;
    private javax.swing.JPasswordField txtSenhaHosp7;
    private javax.swing.JPasswordField txtSenhaHosp8;
    private javax.swing.JTextField txtUserHosp;
    private javax.swing.JTextField txtUserHosp1;
    private javax.swing.JTextField txtUserHosp2;
    private javax.swing.JTextField txtUserHosp3;
    private javax.swing.JTextField txtUserHosp4;
    private javax.swing.JTextField txtUserHosp5;
    private javax.swing.JTextField txtUserHosp6;
    private javax.swing.JTextField txtUserHosp7;
    private javax.swing.JTextField txtUserHosp8;
    // End of variables declaration//GEN-END:variables
}
