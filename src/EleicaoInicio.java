import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EleicaoInicio extends javax.swing.JFrame {

    public EleicaoInicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPpass = new javax.swing.JPasswordField();
        jBvalida = new javax.swing.JButton();
        jBvotar = new javax.swing.JButton();
        jBsair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jBlimparvotos = new javax.swing.JButton();
        jBresetarstatus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ELEIÇÃO 2021 ::: Autorizar Votação");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ELEIÇÃO 2021");

        jPpass.setBackground(new java.awt.Color(204, 204, 204));
        jPpass.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPpass.setForeground(new java.awt.Color(51, 51, 51));
        jPpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPpassActionPerformed(evt);
            }
        });

        jBvalida.setBackground(new java.awt.Color(51, 51, 51));
        jBvalida.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBvalida.setForeground(new java.awt.Color(204, 204, 204));
        jBvalida.setText("Validar");
        jBvalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvalidaActionPerformed(evt);
            }
        });

        jBvotar.setBackground(new java.awt.Color(51, 51, 51));
        jBvotar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBvotar.setForeground(new java.awt.Color(204, 204, 204));
        jBvotar.setText("Iniciar Votação");
        jBvotar.setEnabled(false);
        jBvotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvotarActionPerformed(evt);
            }
        });

        jBsair.setBackground(new java.awt.Color(51, 51, 51));
        jBsair.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBsair.setForeground(new java.awt.Color(204, 204, 204));
        jBsair.setText("Sair");
        jBsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsairActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Senha: 12345");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBvalida)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBvotar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBsair))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPpass)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(jPpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBvotar)
                    .addComponent(jBvalida)
                    .addComponent(jBsair))
                .addGap(30, 30, 30))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Número", "Candidato", "Votos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setEnabled(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("VOTAÇÃO");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("ELEITORES");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Votou?"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setEnabled(false);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        jBlimparvotos.setBackground(new java.awt.Color(51, 51, 51));
        jBlimparvotos.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jBlimparvotos.setForeground(new java.awt.Color(204, 204, 204));
        jBlimparvotos.setText("Limpar Votos");
        jBlimparvotos.setEnabled(false);
        jBlimparvotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimparvotosActionPerformed(evt);
            }
        });

        jBresetarstatus.setBackground(new java.awt.Color(51, 51, 51));
        jBresetarstatus.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jBresetarstatus.setForeground(new java.awt.Color(204, 204, 204));
        jBresetarstatus.setText("Reiniciar Status Eleitor");
        jBresetarstatus.setEnabled(false);
        jBresetarstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBresetarstatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(149, 149, 149))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBlimparvotos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBresetarstatus))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBlimparvotos)
                    .addComponent(jBresetarstatus))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lerJTable1() {
        DefaultTableModel mod = (DefaultTableModel) jTable1.getModel();
        mod.setNumRows(0);

        CandidatoDAO cdao = new CandidatoDAO();

        for (Candidato c : cdao.listarCan()) {
            mod.addRow(new Object[]{
                c.getNumero(),
                c.getNome(),
                c.getVotos()
            });
        }
    }
    
    private void lerJTable2() {
        DefaultTableModel mod = (DefaultTableModel) jTable2.getModel();
        mod.setNumRows(0);

        EleitorDAO edao = new EleitorDAO();

        for (Eleitor e : edao.listarEle()) {
            mod.addRow(new Object[]{
                e.getNome(),
                e.getVotou()
            });
        }
    }
    
    private void jPpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPpassActionPerformed

    private void jBvalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvalidaActionPerformed
        if (!jPpass.getText().equals("12345")) {
            JOptionPane.showMessageDialog(null, "Senha inválida!", "ELEIÇÃO 2021 ::: Sistema", 0);
            jPpass.requestFocus();
            jPpass.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Logado com sucesso!", "ELEIÇÃO 2021 ::: Sistema", 1);
            jBvotar.setEnabled(true);
            jBlimparvotos.setEnabled(true);
            jBresetarstatus.setEnabled(true);
            
            lerJTable1();
            lerJTable2();
        }
    }//GEN-LAST:event_jBvalidaActionPerformed

    private void jBvotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvotarActionPerformed
        ValidaTitulo t = new ValidaTitulo();
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBvotarActionPerformed

    private void jBlimparvotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimparvotosActionPerformed
        CandidatoDAO dao = new CandidatoDAO();
        Candidato c = new Candidato();
        dao.resetVotos(c);
        
        lerJTable1();
        lerJTable2();
    }//GEN-LAST:event_jBlimparvotosActionPerformed

    private void jBresetarstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBresetarstatusActionPerformed
        EleitorDAO dao = new EleitorDAO();
        Eleitor e = new Eleitor();
        dao.resetEleVotou(e);
        
        lerJTable1();
        lerJTable2();
    }//GEN-LAST:event_jBresetarstatusActionPerformed

    private void jBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsairActionPerformed
        dispose();
    }//GEN-LAST:event_jBsairActionPerformed

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
            java.util.logging.Logger.getLogger(EleicaoInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EleicaoInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EleicaoInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EleicaoInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EleicaoInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBlimparvotos;
    private javax.swing.JButton jBresetarstatus;
    private javax.swing.JButton jBsair;
    private javax.swing.JButton jBvalida;
    private javax.swing.JButton jBvotar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPpass;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
