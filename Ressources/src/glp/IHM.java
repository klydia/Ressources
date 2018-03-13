package glp;

public class IHM {

	public static class  newJFrame extends javax.swing.JFrame {

		public newJFrame() {
	        initComponents();
	    }

	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	    private void initComponents() {

	        jMenuItem4 = new javax.swing.JMenuItem();
	        jScrollPane1 = new javax.swing.JScrollPane();
	        jTable1 = new javax.swing.JTable();
	        Evenement = new javax.swing.JLabel();
	        Reunion = new javax.swing.JComboBox<>();
	        Materiel = new javax.swing.JLabel();
	        Pc = new javax.swing.JCheckBox();
	        Tableau = new javax.swing.JCheckBox();
	        Projecteur = new javax.swing.JCheckBox();
	        Micro = new javax.swing.JCheckBox();
	        Mon_Entreprise = new javax.swing.JToggleButton();
	        Employés = new javax.swing.JLabel();
	        jScrollPane2 = new javax.swing.JScrollPane();
	        jList1 = new javax.swing.JList<>();
	        jLabel4 = new javax.swing.JLabel();
	        textField1 = new java.awt.TextField();
	        textField2 = new java.awt.TextField();
	        Nombre_de_personne = new javax.swing.JLabel();
	        Effacer = new javax.swing.JButton();
	        Sauvegarder = new javax.swing.JButton();
	        textField3 = new java.awt.TextField();
	        textField4 = new java.awt.TextField();
	        textField5 = new java.awt.TextField();
	        textField6 = new java.awt.TextField();
	        Quitter = new javax.swing.JButton();
	        jMenuBar1 = new javax.swing.JMenuBar();
	        Mode = new javax.swing.JMenu();
	        jMenuItem1 = new javax.swing.JMenuItem();
	        jMenuItem2 = new javax.swing.JMenuItem();
	        jMenuItem3 = new javax.swing.JMenuItem();
	        jMenu2 = new javax.swing.JMenu();
	        jMenu1 = new javax.swing.JMenu();

	        jMenuItem4.setText("jMenuItem4");

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setBackground(java.awt.SystemColor.controlDkShadow);

	        jTable1.setAutoCreateRowSorter(true);
	        jTable1.setBackground(new java.awt.Color(254, 232, 232));
	        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
	        jTable1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
	        jTable1.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {
	                {"Lundi", null, null, null, null, null, null, null, null},
	                {"Mardi", null, null, null, null, null, null, null, null},
	                {"Mercredi", null, null, null, null, null, null, null, null},
	                {"Jeudi", null, null, null, null, null, null, null, null},
	                {"Vendredi", null, null, null, null, null, null, null, null}
	            },
	            new String [] {
	                "", "8h00-9h00", "9h00-10h00", "10h00-11h00", "11h00-12h00", "12h00-13h00", "13h00-14h00", "14h00-15h00", "15h00-16h00"
	            }
	        ) {
	            Class[] types = new Class [] {
	                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
	            };

	            public Class getColumnClass(int columnIndex) {
	                return types [columnIndex];
	            }
	        });
	        jTable1.setAlignmentX(5.0F);
	        jTable1.setAlignmentY(2.0F);
	        jTable1.setCellSelectionEnabled(true);
	        jTable1.setRowHeight(50);
	        jTable1.setRowMargin(10);
	        jScrollPane1.setViewportView(jTable1);

	        Evenement.setText("Evenement :");

	        Reunion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Réunion", "Conférence", "Autre..." }));
	        Reunion.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                ReunionActionPerformed(evt);
	            }
	        });

	        Materiel.setText("Materiel :");

	        Pc.setText("Pc");
	        Pc.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                PcActionPerformed(evt);
	            }
	        });

	        Tableau.setText("Tableau");
	        Tableau.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                TableauActionPerformed(evt);
	            }
	        });

	        Projecteur.setText("Projecteur");

	        Micro.setText("Micro");
	        Micro.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                MicroActionPerformed(evt);
	            }
	        });

	        Mon_Entreprise.setText("Mon Entreprise");
	        Mon_Entreprise.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                Mon_EntrepriseActionPerformed(evt);
	            }
	        });

	        Employés.setText("Employés :");

	        jList1.setModel(new javax.swing.AbstractListModel<String>() {
	            String[] strings = { "contact 1", "contact 2", "contact 3", "Item 4", "Item 5" };
	            public int getSize() { return strings.length; }
	            public String getElementAt(int i) { return strings[i]; }
	        });
	        jScrollPane2.setViewportView(jList1);

	        jLabel4.setText("Durée de l'événement :");

	        textField1.setText("en heure...");
	        textField1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                textField1ActionPerformed(evt);
	            }
	        });

	        textField2.setText("textField2");
	        textField2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                textField2ActionPerformed(evt);
	            }
	        });

	        Nombre_de_personne.setText("Nombre de personne :");

	        Effacer.setText("Effacer");
	        Effacer.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                EffacerActionPerformed(evt);
	            }
	        });

	        Sauvegarder.setText("Sauvegarder");
	        Sauvegarder.setToolTipText("");

	        textField3.setText("Quantité");
	        textField3.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                textField3ActionPerformed(evt);
	            }
	        });

	        textField4.setText("Quantité");

	        textField5.setText("Quantité");

	        textField6.setText("Quantité");

	        Quitter.setText("Quitter");
	        Quitter.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                QuitterActionPerformed(evt);
	            }
	        });

	        Mode.setText("Mode");

	        jMenuItem1.setText("Manuel");
	        Mode.add(jMenuItem1);

	        jMenuItem2.setText("Semi-automatique");
	        Mode.add(jMenuItem2);

	        jMenuItem3.setText("Automatique");
	        Mode.add(jMenuItem3);

	        jMenuBar1.add(Mode);

	        jMenu2.setText("Aide");
	        jMenuBar1.add(jMenu2);

	        jMenu1.setText("Quitter");
	        jMenuBar1.add(jMenu1);

	        setJMenuBar(jMenuBar1);

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(92, 92, 92)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                            .addComponent(Evenement, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(Materiel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(layout.createSequentialGroup()
	                                .addGap(78, 78, 78)
	                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                                    .addGroup(layout.createSequentialGroup()
	                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                            .addComponent(Reunion, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                            .addGroup(layout.createSequentialGroup()
	                                                .addComponent(Projecteur)
	                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                                .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                            .addGroup(layout.createSequentialGroup()
	                                                .addComponent(Pc)
	                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                                .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                                    .addComponent(Tableau)
	                                                    .addComponent(Micro))
	                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                                    .addComponent(textField4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                                    .addComponent(textField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
	                                        .addGap(139, 139, 139)
	                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                            .addComponent(jLabel4)
	                                            .addComponent(Nombre_de_personne))
	                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                            .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
	                                            .addComponent(textField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
	                                    .addGroup(layout.createSequentialGroup()
	                                        .addComponent(Mon_Entreprise, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                        .addGap(126, 126, 126)))
	                                .addGap(236, 236, 236))
	                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addComponent(Employés)
	                                .addGap(44, 44, 44)))
	                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(427, 427, 427)
	                        .addComponent(Effacer, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(45, 45, 45)
	                        .addComponent(Sauvegarder)
	                        .addGap(46, 46, 46)
	                        .addComponent(Quitter, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(220, 220, 220)
	                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addContainerGap(83, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(Mon_Entreprise, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(38, 38, 38)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                            .addGroup(layout.createSequentialGroup()
	                                .addGap(5, 5, 5)
	                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                                        .addComponent(jLabel4)
	                                        .addComponent(Evenement, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                        .addComponent(Reunion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
	                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(textField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(textField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                            .addGroup(layout.createSequentialGroup()
	                                .addGap(59, 59, 59)
	                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                                    .addComponent(Nombre_de_personne)
	                                    .addComponent(Materiel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(Tableau))))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(Micro))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(Projecteur)
	                            .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                            .addComponent(Pc)
	                            .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                    .addComponent(Employés)
	                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
	                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(Sauvegarder)
	                    .addComponent(Effacer)
	                    .addComponent(Quitter))
	                .addGap(25, 25, 25))
	        );

	        pack();
	    }// </editor-fold>                        

	    private void ReunionActionPerformed(java.awt.event.ActionEvent evt) {                                        
	        // TODO add your handling code here:
	    }                                       

	    private void PcActionPerformed(java.awt.event.ActionEvent evt) {                                   
	        // TODO add your handling code here:
	    }                                  

	    private void TableauActionPerformed(java.awt.event.ActionEvent evt) {                                        
	        // TODO add your handling code here:
	    }                                       

	    private void Mon_EntrepriseActionPerformed(java.awt.event.ActionEvent evt) {                                               
	        // TODO add your handling code here:
	    }                                              

	    private void MicroActionPerformed(java.awt.event.ActionEvent evt) {                                      
	        // TODO add your handling code here:
	    }                                     

	    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
	        // TODO add your handling code here:
	    }                                          

	    private void EffacerActionPerformed(java.awt.event.ActionEvent evt) {                                        
	        // TODO add your handling code here:
	    }                                       

	    private void textField3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
	        // TODO add your handling code here:
	    }                                          

	    private void textField2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
	        // TODO add your handling code here:
	    }                                          

	    private void QuitterActionPerformed(java.awt.event.ActionEvent evt) {                                        
	        // TODO add your handling code here:
	    }                                       

	    public static void main(String args[]) {
	       
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(newJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(newJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(newJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(newJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new newJFrame().setVisible(true);
	            }
	        });
	    }

	    // Variables declaration - do not modify                     
	    private javax.swing.JButton Effacer;
	    private javax.swing.JLabel Employés;
	    private javax.swing.JLabel Evenement;
	    private javax.swing.JLabel Materiel;
	    private javax.swing.JCheckBox Micro;
	    private javax.swing.JMenu Mode;
	    private javax.swing.JToggleButton Mon_Entreprise;
	    private javax.swing.JLabel Nombre_de_personne;
	    private javax.swing.JCheckBox Pc;
	    private javax.swing.JCheckBox Projecteur;
	    private javax.swing.JButton Quitter;
	    private javax.swing.JComboBox<String> Reunion;
	    private javax.swing.JButton Sauvegarder;
	    private javax.swing.JCheckBox Tableau;
	    private javax.swing.JLabel jLabel4;
	    private javax.swing.JList<String> jList1;
	    private javax.swing.JMenu jMenu1;
	    private javax.swing.JMenu jMenu2;
	    private javax.swing.JMenuBar jMenuBar1;
	    private javax.swing.JMenuItem jMenuItem1;
	    private javax.swing.JMenuItem jMenuItem2;
	    private javax.swing.JMenuItem jMenuItem3;
	    private javax.swing.JMenuItem jMenuItem4;
	    private javax.swing.JScrollPane jScrollPane1;
	    private javax.swing.JScrollPane jScrollPane2;
	    private javax.swing.JTable jTable1;
	    private java.awt.TextField textField1;
	    private java.awt.TextField textField2;
	    private java.awt.TextField textField3;
	    private java.awt.TextField textField4;
	    private java.awt.TextField textField5;
	    private java.awt.TextField textField6;
	    // End of variables declaration                   
	}}