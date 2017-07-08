package view;

import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Venancio
 */
public class LoginHosp extends javax.swing.JFrame {

    /**
     * Creates new form TelaHospital
     */
    public LoginHosp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGerenciador = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnHosp = new javax.swing.JButton();
        btnClin = new javax.swing.JButton();
        lblSelect1 = new javax.swing.JLabel();
        lblPrincipal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblDigiteHosp = new javax.swing.JLabel();
        lblUserHosp = new javax.swing.JLabel();
        lblSenhaHosp = new javax.swing.JLabel();
        txtUserHosp = new javax.swing.JTextField();
        txtSenhaHosp = new javax.swing.JPasswordField();
        btnEntrarHosp = new javax.swing.JButton();
        lblHospital = new javax.swing.JLabel();
        btnVoltarHosp = new javax.swing.JButton();
        lblGereciador = new javax.swing.JLabel();

        lblGerenciador.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblGerenciador.setText("Gerenciador de Paciente®");

        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        btnHosp.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnHosp.setText("Hospital");

        btnClin.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnClin.setText("Paciente");
        btnClin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClinActionPerformed(evt);
            }
        });

        lblSelect1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblSelect1.setForeground(new java.awt.Color(204, 0, 0));
        lblSelect1.setText("Selecione seu tipo de usuário.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHosp, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClin, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSelect1)
                .addGap(98, 98, 98))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHosp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblSelect1)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        lblPrincipal.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        lblPrincipal.setForeground(new java.awt.Color(0, 102, 0));
        lblPrincipal.setText("Página Principal");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hospital User - GDP QRcode");
        setResizable(false);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));

        lblDigiteHosp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblDigiteHosp.setForeground(new java.awt.Color(102, 102, 102));
        lblDigiteHosp.setText("Digite seu usuário e senha para entrar.");

        lblUserHosp.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lblUserHosp.setText("Usuário");

        lblSenhaHosp.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lblSenhaHosp.setText("Senha");

        txtUserHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserHospActionPerformed(evt);
            }
        });

        txtSenhaHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaHospActionPerformed(evt);
            }
        });

        btnEntrarHosp.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnEntrarHosp.setText("Entrar");
        btnEntrarHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarHospActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserHosp)
                            .addComponent(lblSenhaHosp))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUserHosp, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenhaHosp, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(lblDigiteHosp)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEntrarHosp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserHosp)
                    .addComponent(txtUserHosp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenhaHosp)
                    .addComponent(txtSenhaHosp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(lblDigiteHosp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnEntrarHosp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        lblHospital.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        lblHospital.setForeground(new java.awt.Color(0, 102, 0));
        lblHospital.setText("Hospital User");

        btnVoltarHosp.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        btnVoltarHosp.setText("Voltar");
        btnVoltarHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarHospActionPerformed(evt);
            }
        });

        lblGereciador.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblGereciador.setText("Gerenciador de Paciente®");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltarHosp)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblGereciador))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(lblHospital)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltarHosp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHospital)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(lblGereciador)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClinActionPerformed

    private void txtUserHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserHospActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserHospActionPerformed

    private void txtSenhaHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaHospActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaHospActionPerformed

    private void btnEntrarHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarHospActionPerformed
        
        if(txtUserHosp.getText().equals("User")&&txtSenhaHosp.getText().equals("1234")){
            MainHosp janela = new MainHosp();
            janela.show();
            janela.setDefaultCloseOperation(janela.DISPOSE_ON_CLOSE);
            dispose();
            JOptionPane.showMessageDialog(null, "Bem Vindo!");
            
        }else if(txtUserHosp.getText().equals("Leonardo Venancio")&&txtSenhaHosp.getText().equals("12345")){
            MainHosp janela = new MainHosp();
            janela.show();
            janela.setDefaultCloseOperation(MainHosp.DISPOSE_ON_CLOSE);
            dispose();
            JOptionPane.showMessageDialog(null, "Bem Vindo!");
        }else if(txtUserHosp.getText().equals("Medico")&&txtSenhaHosp.getText().equals("12345")){
            MainHosp janela = new MainHosp();
            janela.show();
            janela.setDefaultCloseOperation(MainHosp.DISPOSE_ON_CLOSE);
            dispose();
            JOptionPane.showMessageDialog(null, "Bem Vindo!");
        }else{
            JOptionPane.showMessageDialog(null, "Usuário Inválido!");
        }
    }//GEN-LAST:event_btnEntrarHospActionPerformed

    private void btnVoltarHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarHospActionPerformed
        // TODO add your handling code here:
        MainTela janela = new MainTela();
        janela.show();
        janela.setDefaultCloseOperation(janela.DISPOSE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_btnVoltarHospActionPerformed

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
            java.util.logging.Logger.getLogger(LoginHosp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginHosp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginHosp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginHosp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginHosp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClin;
    private javax.swing.JButton btnEntrarHosp;
    private javax.swing.JButton btnHosp;
    private javax.swing.JButton btnVoltarHosp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDigiteHosp;
    private javax.swing.JLabel lblGereciador;
    private javax.swing.JLabel lblGerenciador;
    private javax.swing.JLabel lblHospital;
    private javax.swing.JLabel lblPrincipal;
    private javax.swing.JLabel lblSelect1;
    private javax.swing.JLabel lblSenhaHosp;
    private javax.swing.JLabel lblUserHosp;
    private javax.swing.JPasswordField txtSenhaHosp;
    private javax.swing.JTextField txtUserHosp;
    // End of variables declaration//GEN-END:variables
}
