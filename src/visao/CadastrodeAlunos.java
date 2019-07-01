/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Breno Lima
 */
public class CadastrodeAlunos extends javax.swing.JFrame {

    /**
     * Creates new form Modelo01
     */
    public CadastrodeAlunos() {
        initComponents();
    }

    public void alunos() {
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

        nome = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        emial = new javax.swing.JLabel();
        sexo = new javax.swing.JLabel();
        opt_masc = new javax.swing.JRadioButton();
        opt_fem = new javax.swing.JRadioButton();
        escolaridade = new javax.swing.JLabel();
        cbo_esco = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_cadastro = new javax.swing.JTable();
        btn_cadastrar = new javax.swing.JButton();
        observacao = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        text_info = new javax.swing.JTextArea();
        atv_dstv = new javax.swing.JCheckBox();
        endereco = new javax.swing.JLabel();
        txt_endereco = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela sem Título");

        nome.setText("nome");

        emial.setText("email");

        sexo.setText("sexo");

        opt_masc.setText("masculino");
        opt_masc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt_mascActionPerformed(evt);
            }
        });

        opt_fem.setText("feminino");
        opt_fem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt_femActionPerformed(evt);
            }
        });

        escolaridade.setText("escolaridade");

        cbo_esco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fundamental", "Médio", "Superior", "Pós Graduação" }));
        cbo_esco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_escoActionPerformed(evt);
            }
        });

        tbl_cadastro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "nome", "email", "endereço", "sexo", "escolaridade", "observação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_cadastro);

        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        observacao.setText("Observação");

        text_info.setColumns(20);
        text_info.setRows(5);
        jScrollPane2.setViewportView(text_info);

        atv_dstv.setText("ativar/ desativar");
        atv_dstv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atv_dstvActionPerformed(evt);
            }
        });

        endereco.setText("endereço");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sexo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(observacao)
                            .addComponent(escolaridade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(cbo_esco, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atv_dstv)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(nome)
                                            .addComponent(emial))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(opt_masc)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(opt_fem))
                                            .addComponent(txt_email))
                                        .addGap(87, 87, 87))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(endereco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nome)
                            .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emial)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_endereco)
                        .addComponent(endereco)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexo)
                    .addComponent(opt_masc)
                    .addComponent(opt_fem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_esco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escolaridade))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(observacao))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(atv_dstv)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed

        
        String nome = (String) txt_nome.getText();
        
         String email = (String) txt_email.getText();
                  String endereco = (String) txt_endereco.getText();
         
         String sexo ;
         
       
         
          if ( opt_fem.isSelected())  {
              
             
    sexo = opt_masc.getText();
    
 
        } else if ( opt_masc.isSelected()) {
                    
      sexo = opt_fem.getText();
        
     
            } else{
            
           sexo = "";
        }
         
          String esco = (String) cbo_esco.getSelectedItem();
          
            String obs = (String) text_info.getText();

           
           
             DefaultTableModel ModelCadastro = (DefaultTableModel) tbl_cadastro.getModel();
             
             Object[] informacoes ={nome, email, endereco, sexo, esco,obs};
             
             // adicionar as informações na tabela
             ModelCadastro.addRow(informacoes);
             
             // limpar os campos para inserir novo cadastro
            
             txt_nome.setText("");
             txt_email.setText("");
             txt_endereco.setText("");
             opt_fem.setSelected(false);
             opt_masc.setSelected(false);
             cbo_esco.setSelectedIndex(0);
             
      

// TODO add your handling code here:
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void atv_dstvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atv_dstvActionPerformed
if (atv_dstv.isSelected()){
        text_info.setEnabled(true);
    }
else {
text_info.setText("");
text_info.setEnabled(false);
}
     
      
      
    


// TODO add your handling code here:
    }//GEN-LAST:event_atv_dstvActionPerformed

    private void opt_mascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt_mascActionPerformed
  
           opt_fem.setSelected(false);
           
    }//GEN-LAST:event_opt_mascActionPerformed

    private void opt_femActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt_femActionPerformed

        
// TODO add your handling code here:
    }//GEN-LAST:event_opt_femActionPerformed

    private void cbo_escoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_escoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_escoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrodeAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrodeAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrodeAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrodeAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrodeAlunos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox atv_dstv;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JComboBox cbo_esco;
    private javax.swing.JLabel emial;
    private javax.swing.JLabel endereco;
    private javax.swing.JLabel escolaridade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel observacao;
    private javax.swing.JRadioButton opt_fem;
    private javax.swing.JRadioButton opt_masc;
    private javax.swing.JLabel sexo;
    private javax.swing.JTable tbl_cadastro;
    private javax.swing.JTextArea text_info;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_endereco;
    private javax.swing.JTextField txt_nome;
    // End of variables declaration//GEN-END:variables
}
