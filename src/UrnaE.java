
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class UrnaE extends javax.swing.JFrame {

    public UrnaE() {
        initComponents();
        jTnum.setDocument(new Doc());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jB1 = new javax.swing.JButton();
        jB3 = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();
        jB4 = new javax.swing.JButton();
        jB5 = new javax.swing.JButton();
        jB6 = new javax.swing.JButton();
        jB7 = new javax.swing.JButton();
        jB8 = new javax.swing.JButton();
        jB9 = new javax.swing.JButton();
        jB0 = new javax.swing.JButton();
        jBbranco = new javax.swing.JButton();
        jBconfirma = new javax.swing.JButton();
        jBcorrige = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLfoto = new javax.swing.JLabel();
        jLfotovice = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTnum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLnome = new javax.swing.JLabel();
        jLvice = new javax.swing.JLabel();
        jLpartido = new javax.swing.JLabel();

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("1");

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 204, 204));
        jButton5.setText("1");

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 204, 204));
        jButton6.setText("1");

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jButton7.setForeground(new java.awt.Color(204, 204, 204));
        jButton7.setText("1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ELEIÇÃO 2021 ::: Urna Eletrônica");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(204, 204, 204));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(16, 16, 16));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(206, 206, 206));

        jB1.setBackground(new java.awt.Color(0, 0, 0));
        jB1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jB1.setForeground(new java.awt.Color(255, 255, 255));
        jB1.setText("1");
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jB3.setBackground(new java.awt.Color(0, 0, 0));
        jB3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jB3.setForeground(new java.awt.Color(255, 255, 255));
        jB3.setText("3");
        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });

        jB2.setBackground(new java.awt.Color(0, 0, 0));
        jB2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jB2.setForeground(new java.awt.Color(255, 255, 255));
        jB2.setText("2");
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });

        jB4.setBackground(new java.awt.Color(0, 0, 0));
        jB4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jB4.setForeground(new java.awt.Color(255, 255, 255));
        jB4.setText("4");
        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4ActionPerformed(evt);
            }
        });

        jB5.setBackground(new java.awt.Color(0, 0, 0));
        jB5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jB5.setForeground(new java.awt.Color(255, 255, 255));
        jB5.setText("5");
        jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB5ActionPerformed(evt);
            }
        });

        jB6.setBackground(new java.awt.Color(0, 0, 0));
        jB6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jB6.setForeground(new java.awt.Color(255, 255, 255));
        jB6.setText("6");
        jB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });

        jB7.setBackground(new java.awt.Color(0, 0, 0));
        jB7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jB7.setForeground(new java.awt.Color(255, 255, 255));
        jB7.setText("7");
        jB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB7ActionPerformed(evt);
            }
        });

        jB8.setBackground(new java.awt.Color(0, 0, 0));
        jB8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jB8.setForeground(new java.awt.Color(255, 255, 255));
        jB8.setText("8");
        jB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB8ActionPerformed(evt);
            }
        });

        jB9.setBackground(new java.awt.Color(0, 0, 0));
        jB9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jB9.setForeground(new java.awt.Color(255, 255, 255));
        jB9.setText("9");
        jB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB9ActionPerformed(evt);
            }
        });

        jB0.setBackground(new java.awt.Color(0, 0, 0));
        jB0.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jB0.setForeground(new java.awt.Color(255, 255, 255));
        jB0.setText("0");
        jB0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB0ActionPerformed(evt);
            }
        });

        jBbranco.setBackground(new java.awt.Color(255, 255, 255));
        jBbranco.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBbranco.setForeground(new java.awt.Color(0, 0, 0));
        jBbranco.setText("BRANCO");
        jBbranco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbrancoActionPerformed(evt);
            }
        });

        jBconfirma.setBackground(new java.awt.Color(51, 153, 0));
        jBconfirma.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBconfirma.setForeground(new java.awt.Color(0, 0, 0));
        jBconfirma.setText("CONFIRMA");
        jBconfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBconfirmaActionPerformed(evt);
            }
        });

        jBcorrige.setBackground(new java.awt.Color(255, 51, 0));
        jBcorrige.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBcorrige.setForeground(new java.awt.Color(0, 0, 0));
        jBcorrige.setText("CORRIGE");
        jBcorrige.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcorrigeActionPerformed(evt);
            }
        });

        jPanel3.setBackground(java.awt.SystemColor.textHighlightText);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/l_jeleitoral.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jBbranco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBcorrige, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBconfirma))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jB0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jB8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jB9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jB6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(22, 22, 22))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB1)
                    .addComponent(jB3)
                    .addComponent(jB2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB4)
                    .addComponent(jB6)
                    .addComponent(jB5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB7)
                    .addComponent(jB9)
                    .addComponent(jB8))
                .addGap(18, 18, 18)
                .addComponent(jB0)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBbranco, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBconfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBcorrige, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("SEU VOTO PARA");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("CANDIDATO(A)");

        jLfoto.setForeground(new java.awt.Color(51, 51, 51));
        jLfoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLfoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLfoto.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLfotoComponentShown(evt);
            }
        });

        jLfotovice.setForeground(new java.awt.Color(51, 51, 51));
        jLfotovice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLfotovice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Número:");

        jTnum.setBackground(new java.awt.Color(204, 204, 204));
        jTnum.setFont(new java.awt.Font("Dialog", 1, 46)); // NOI18N
        jTnum.setForeground(new java.awt.Color(70, 70, 70));
        jTnum.setText("__");
        jTnum.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTnum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTnumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTnumFocusLost(evt);
            }
        });
        jTnum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTnumMouseClicked(evt);
            }
        });
        jTnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnumActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Nome:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Partido:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Vice:");

        jLnome.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLnome.setForeground(new java.awt.Color(51, 51, 51));
        jLnome.setText(" ");

        jLvice.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLvice.setForeground(new java.awt.Color(51, 51, 51));
        jLvice.setText(" ");
        jLvice.setToolTipText("");

        jLpartido.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLpartido.setForeground(new java.awt.Color(51, 51, 51));
        jLpartido.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLpartido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLnome, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(jTnum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jLvice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLfotovice, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jLfoto, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel3)
                .addContainerGap(188, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTnum, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLnome, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLpartido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLvice))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLfotovice, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void somUrna() {
        URL url = getClass().getResource("/som/fim.wav");
        AudioClip audio = Applet.newAudioClip(url);
        audio.play();
    }

    private void teclado(boolean num0, boolean num1, boolean num2, boolean num3, boolean num4, boolean num5, boolean num6, boolean num7, boolean num8, boolean num9) {
        jB0.setEnabled(num0);
        jB1.setEnabled(num1);
        jB2.setEnabled(num2);
        jB3.setEnabled(num3);
        jB4.setEnabled(num4);
        jB5.setEnabled(num5);
        jB6.setEnabled(num6);
        jB7.setEnabled(num7);
        jB8.setEnabled(num8);
        jB9.setEnabled(num9);
    }

    private void numCondicao() {
        if (jTnum.getText().length() < 2) {
            jTnum.getText();
        } else {
            teclado(false, false, false, false, false, false, false, false, false, false);

            CandidatoDAO dao = new CandidatoDAO();
            Candidato c = new Candidato();

            if (!"".equals(jTnum.getText())) {
                c = dao.consultaCan(jTnum.getText());

                if (c != null) {
                    carregarDados(c);
                } else {
                    JOptionPane.showMessageDialog(null, "Candidato não encontrado!\nPara votar NULO, digite 99.", "ELEIÇÃO 2021 ::: Sistema", 0);
                    jTnum.setText("");
                    teclado(true, true, true, true, true, true, true, true, true, true);
                }
            }
        }
    }

    private void carregarDados(Candidato c) {
        jLnome.setText(c.getNome());
        jLpartido.setText(c.getPartido());
        jLvice.setText(c.getVice());

        ImageIcon icone;
        icone = new ImageIcon(getClass().getResource("img/" + c.getFoto()));
        jLfoto.setIcon(icone);

        ImageIcon iconevice;
        iconevice = new ImageIcon(getClass().getResource("img/" + c.getFotovice()));
        jLfotovice.setIcon(iconevice);
    }

    private void limparCampos() {
        jTnum.setText("");
        jLnome.setText("");
        jLpartido.setText("");
        jLvice.setText("");
        jLfoto.setIcon(null);
        jLfotovice.setIcon(null);
    }

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
        jTnum.setText(jTnum.getText() + "2");
        numCondicao();
    }//GEN-LAST:event_jB2ActionPerformed

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
        jTnum.setText(jTnum.getText() + "1");
        numCondicao();
    }//GEN-LAST:event_jB1ActionPerformed

    private void jBconfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconfirmaActionPerformed
        CandidatoDAO dao = new CandidatoDAO();
        Candidato c = new Candidato();

        c.setVotos(Integer.parseInt(jTnum.getText()));
        dao.contarVotos(c);

        somUrna();
        JOptionPane.showMessageDialog(null, "|| F     I     M ||", "ELEIÇÃO 2021 ::: Sistema", 0);
        limparCampos();

        ValidaTitulo t = new ValidaTitulo();
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBconfirmaActionPerformed

    private void jB0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB0ActionPerformed
        jTnum.setText(jTnum.getText() + "0");
        numCondicao();
    }//GEN-LAST:event_jB0ActionPerformed

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB3ActionPerformed
        jTnum.setText(jTnum.getText() + "3");
        numCondicao();
    }//GEN-LAST:event_jB3ActionPerformed

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB4ActionPerformed
        jTnum.setText(jTnum.getText() + "4");
        numCondicao();
    }//GEN-LAST:event_jB4ActionPerformed

    private void jB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB5ActionPerformed
        jTnum.setText(jTnum.getText() + "5");
        numCondicao();
    }//GEN-LAST:event_jB5ActionPerformed

    private void jB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB6ActionPerformed
        jTnum.setText(jTnum.getText() + "6");
        numCondicao();
    }//GEN-LAST:event_jB6ActionPerformed

    private void jB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB7ActionPerformed
        jTnum.setText(jTnum.getText() + "7");
        numCondicao();
    }//GEN-LAST:event_jB7ActionPerformed

    private void jB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB8ActionPerformed
        jTnum.setText(jTnum.getText() + "8");
        numCondicao();
    }//GEN-LAST:event_jB8ActionPerformed

    private void jB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB9ActionPerformed
        jTnum.setText(jTnum.getText() + "9");
        numCondicao();
    }//GEN-LAST:event_jB9ActionPerformed

    private void jBcorrigeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcorrigeActionPerformed
        limparCampos();
        teclado(true, true, true, true, true, true, true, true, true, true);
        jTnum.requestFocus();
    }//GEN-LAST:event_jBcorrigeActionPerformed

    private void jTnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnumActionPerformed

    private void jTnumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTnumFocusLost
    }//GEN-LAST:event_jTnumFocusLost

    private void jTnumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTnumFocusGained
    }//GEN-LAST:event_jTnumFocusGained

    private void jTnumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTnumMouseClicked
    }//GEN-LAST:event_jTnumMouseClicked

    private void jBbrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbrancoActionPerformed
        jTnum.setText(jTnum.getText() + "00");
        numCondicao();
        
        CandidatoDAO dao = new CandidatoDAO();
        Candidato c = new Candidato();

        c.setVotos(Integer.parseInt(jTnum.getText()));
        dao.contarVotos(c);

        somUrna();
        JOptionPane.showMessageDialog(null, "|| F     I     M ||", "ELEIÇÃO 2021 ::: Sistema", 0);
        limparCampos();

        ValidaTitulo t = new ValidaTitulo();
        t.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jBbrancoActionPerformed

    private void jLfotoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLfotoComponentShown

    }//GEN-LAST:event_jLfotoComponentShown

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
            java.util.logging.Logger.getLogger(UrnaE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UrnaE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UrnaE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UrnaE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UrnaE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB0;
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB2;
    private javax.swing.JButton jB3;
    private javax.swing.JButton jB4;
    private javax.swing.JButton jB5;
    private javax.swing.JButton jB6;
    private javax.swing.JButton jB7;
    private javax.swing.JButton jB8;
    private javax.swing.JButton jB9;
    private javax.swing.JButton jBbranco;
    private javax.swing.JButton jBconfirma;
    private javax.swing.JButton jBcorrige;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLfoto;
    private javax.swing.JLabel jLfotovice;
    private javax.swing.JLabel jLnome;
    private javax.swing.JLabel jLpartido;
    private javax.swing.JLabel jLvice;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTnum;
    // End of variables declaration//GEN-END:variables
}

class Doc extends PlainDocument {

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        int tam = (this.getLength() + str.length());
        if (tam <= 2) {
            super.insertString(offs, str.replaceAll("[aA-zZ]", ""), a);
        } else {
            super.insertString(offs, str.replaceAll("[aA0-zZ9]", ""), a);
        }

    }

}
