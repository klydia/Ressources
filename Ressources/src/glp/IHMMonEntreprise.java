package glp;

public class IHMMonEntreprise {
	
	public static class MonEntreprise extends javax.swing.JFrame {

		    public MonEntreprise() {
		        initComponents();
		    }

		                
		    private void initComponents() {

		        jLabel1 = new javax.swing.JLabel();
		        jLabel2 = new javax.swing.JLabel();
		        jButton1 = new javax.swing.JButton();
		        jLabel3 = new javax.swing.JLabel();
		        jCheckBox1 = new javax.swing.JCheckBox();
		        jCheckBox2 = new javax.swing.JCheckBox();
		        jCheckBox3 = new javax.swing.JCheckBox();
		        jTextField1 = new javax.swing.JTextField();
		        jCheckBox4 = new javax.swing.JCheckBox();
		        jCheckBox5 = new javax.swing.JCheckBox();
		        jCheckBox6 = new javax.swing.JCheckBox();
		        jCheckBox7 = new javax.swing.JCheckBox();
		        jTextField2 = new javax.swing.JTextField();
		        jTextField3 = new javax.swing.JTextField();
		        jTextField4 = new javax.swing.JTextField();
		        jTextField5 = new javax.swing.JTextField();
		        jLabel4 = new javax.swing.JLabel();
		        jButton2 = new javax.swing.JButton();
		        jButton3 = new javax.swing.JButton();
		        jLabel5 = new javax.swing.JLabel();
		        jLabel7 = new javax.swing.JLabel();
		        jLabel8 = new javax.swing.JLabel();
		        jLabel9 = new javax.swing.JLabel();
		        jTextField6 = new javax.swing.JTextField();
		        jTextField7 = new javax.swing.JTextField();
		        jTextField8 = new javax.swing.JTextField();
		        jTextField9 = new javax.swing.JTextField();
		        jLabel6 = new javax.swing.JLabel();
		        jTextField10 = new javax.swing.JTextField();
		        jTextField11 = new javax.swing.JTextField();
		        jMenuBar1 = new javax.swing.JMenuBar();
		        jMenu1 = new javax.swing.JMenu();
		        jMenu2 = new javax.swing.JMenu();

		        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		        jLabel1.setText("Evenement :");

		        jLabel2.setText("Mat�riel :");

		        jButton1.setText("Organiser un �v�nement");
		        jButton1.setToolTipText("");
		        jButton1.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jButton1ActionPerformed(evt);
		            }
		        });

		        jLabel3.setBackground(new java.awt.Color(249, 249, 249));
		        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
		        jLabel3.setForeground(new java.awt.Color(48, 6, 6));
		        jLabel3.setText("Mon entreprise");

		        jCheckBox1.setSelected(true);
		        jCheckBox1.setText("R�union");
		        jCheckBox1.setToolTipText("");

		        jCheckBox2.setText("Conf�rence");

		        jCheckBox3.setText("Autre...");

		        jTextField1.setText("...");
		        jTextField1.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jTextField1ActionPerformed(evt);
		            }
		        });

		        jCheckBox4.setText("Pc");

		        jCheckBox5.setText("Projecteur");
		        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jCheckBox5ActionPerformed(evt);
		            }
		        });

		        jCheckBox6.setText("Micro");

		        jCheckBox7.setText("Tableau");

		        jTextField2.setText("Quantit�");
		        jTextField2.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jTextField2ActionPerformed(evt);
		            }
		        });

		        jTextField3.setText("Quantit�");

		        jTextField4.setText("Quantit�");

		        jTextField5.setText("Quantit�");

		        jLabel4.setText("Employ� :");

		        jButton2.setText("Ajouter");

		        jButton3.setText("Effacer");

		        jLabel5.setText("Nom :");

		        jLabel7.setText("Responsabilit� :");

		        jLabel8.setText("Num�ro :");

		        jLabel9.setText("E-mail :");

		        jTextField6.setText("...");

		        jTextField7.setText("...");

		        jTextField8.setText("...");

		        jTextField9.setText("...");

		        jLabel6.setText("Salle :");

		        jTextField10.setText("Capacit�...");
		        jTextField10.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jTextField10ActionPerformed(evt);
		            }
		        });

		        jTextField11.setText("Nombre de salle");
		        jTextField11.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jTextField11ActionPerformed(evt);
		            }
		        });

		        jMenu1.setText("File");
		        jMenuBar1.add(jMenu1);

		        jMenu2.setText("Aide");
		        jMenuBar1.add(jMenu2);

		        setJMenuBar(jMenuBar1);

		        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		        getContentPane().setLayout(layout);
		        layout.setHorizontalGroup(
		            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                    .addGroup(layout.createSequentialGroup()
		                        .addGap(61, 61, 61)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addComponent(jLabel1)
		                            .addComponent(jLabel2)
		                            .addComponent(jLabel6))
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addGroup(layout.createSequentialGroup()
		                                .addGap(41, 41, 41)
		                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                                    .addComponent(jCheckBox1)
		                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
		                                        .addGroup(layout.createSequentialGroup()
		                                            .addComponent(jCheckBox7)
		                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                                        .addGroup(layout.createSequentialGroup()
		                                            .addComponent(jCheckBox6)
		                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                                        .addGroup(layout.createSequentialGroup()
		                                            .addComponent(jCheckBox4)
		                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                                        .addGroup(layout.createSequentialGroup()
		                                            .addComponent(jCheckBox5)
		                                            .addGap(18, 18, 18)
		                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
		                                    .addComponent(jCheckBox2)
		                                    .addGroup(layout.createSequentialGroup()
		                                        .addComponent(jCheckBox3)
		                                        .addGap(31, 31, 31)
		                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 261, Short.MAX_VALUE)
		                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                    .addGroup(layout.createSequentialGroup()
		                                        .addComponent(jLabel4)
		                                        .addGap(33, 33, 33)
		                                        .addComponent(jLabel5))
		                                    .addGroup(layout.createSequentialGroup()
		                                        .addGap(90, 90, 90)
		                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                                            .addComponent(jLabel9)
		                                            .addComponent(jLabel8)
		                                            .addComponent(jLabel7)))))
		                            .addGroup(layout.createSequentialGroup()
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                                .addGap(0, 0, Short.MAX_VALUE))))
		                    .addGroup(layout.createSequentialGroup()
		                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                        .addComponent(jLabel3)
		                        .addGap(57, 57, 57)))
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
		                            .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
		                            .addComponent(jTextField9))
		                        .addGap(92, 92, 92))
		                    .addGroup(layout.createSequentialGroup()
		                        .addGap(9, 9, 9)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                                .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
		                        .addGap(83, 83, 83))))
		            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
		                .addGap(0, 0, Short.MAX_VALUE)
		                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addGap(308, 308, 308))
		        );
		        layout.setVerticalGroup(
		            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(layout.createSequentialGroup()
		                .addContainerGap()
		                .addComponent(jLabel3)
		                .addGap(36, 36, 36)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jLabel1)
		                    .addComponent(jCheckBox1)
		                    .addComponent(jLabel4)
		                    .addComponent(jLabel5)
		                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jCheckBox2)
		                    .addComponent(jLabel9)
		                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                    .addGroup(layout.createSequentialGroup()
		                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addGap(35, 35, 35))
		                    .addGroup(layout.createSequentialGroup()
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                            .addGroup(layout.createSequentialGroup()
		                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                                    .addComponent(jCheckBox3)
		                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                                .addGap(29, 29, 29))
		                            .addGroup(layout.createSequentialGroup()
		                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                    .addComponent(jLabel8))
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                                    .addComponent(jLabel7)
		                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                                .addGap(15, 15, 15)))
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addComponent(jLabel2)
		                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                                .addComponent(jCheckBox4)
		                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                            .addComponent(jCheckBox5)
		                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jButton2)
		                            .addComponent(jButton3))
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                        .addComponent(jCheckBox6)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                            .addComponent(jCheckBox7)
		                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jLabel6)
		                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addGap(30, 30, 30)
		                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addGap(38, 38, 38))
		        );

		        pack();
		    }// </editor-fold>                        

		    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
		        // TODO add your handling code here:
		    }                                        

		    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
		        // TODO add your handling code here:
		    }                                           

		    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {                                           
		        // TODO add your handling code here:
		    }                                          

		    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
		        // TODO add your handling code here:
		    }                                           

		    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {                                             
		        // TODO add your handling code here:
		    }                                            

		    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {                                             
		        // TODO add your handling code here:
		    }                                            

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
		            java.util.logging.Logger.getLogger(MonEntreprise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (InstantiationException ex) {
		            java.util.logging.Logger.getLogger(MonEntreprise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (IllegalAccessException ex) {
		            java.util.logging.Logger.getLogger(MonEntreprise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
		            java.util.logging.Logger.getLogger(MonEntreprise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        }
		        //</editor-fold>

		        /* Create and display the form */
		        java.awt.EventQueue.invokeLater(new Runnable() {
		            public void run() {
		                new MonEntreprise().setVisible(true);
		            }
		        });
		    }

		    // Variables declaration - do not modify                     
		    private javax.swing.JButton jButton1;
		    private javax.swing.JButton jButton2;
		    private javax.swing.JButton jButton3;
		    private javax.swing.JCheckBox jCheckBox1;
		    private javax.swing.JCheckBox jCheckBox2;
		    private javax.swing.JCheckBox jCheckBox3;
		    private javax.swing.JCheckBox jCheckBox4;
		    private javax.swing.JCheckBox jCheckBox5;
		    private javax.swing.JCheckBox jCheckBox6;
		    private javax.swing.JCheckBox jCheckBox7;
		    private javax.swing.JLabel jLabel1;
		    private javax.swing.JLabel jLabel2;
		    private javax.swing.JLabel jLabel3;
		    private javax.swing.JLabel jLabel4;
		    private javax.swing.JLabel jLabel5;
		    private javax.swing.JLabel jLabel6;
		    private javax.swing.JLabel jLabel7;
		    private javax.swing.JLabel jLabel8;
		    private javax.swing.JLabel jLabel9;
		    private javax.swing.JMenu jMenu1;
		    private javax.swing.JMenu jMenu2;
		    private javax.swing.JMenuBar jMenuBar1;
		    private javax.swing.JTextField jTextField1;
		    private javax.swing.JTextField jTextField10;
		    private javax.swing.JTextField jTextField11;
		    private javax.swing.JTextField jTextField2;
		    private javax.swing.JTextField jTextField3;
		    private javax.swing.JTextField jTextField4;
		    private javax.swing.JTextField jTextField5;
		    private javax.swing.JTextField jTextField6;
		    private javax.swing.JTextField jTextField7;
		    private javax.swing.JTextField jTextField8;
		    private javax.swing.JTextField jTextField9;
		    // End of variables declaration                   
		}

	}
