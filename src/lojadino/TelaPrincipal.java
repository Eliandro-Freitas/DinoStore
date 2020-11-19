/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojadino;

import Conexão.SQL;


/**
 *
 * @author Dell
 */
public class TelaPrincipal extends javax.swing.JFrame {

    SQL conectar = new SQL();
    public TelaPrincipal() {
  
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

        internalFrame = new javax.swing.JInternalFrame();
        painelinterno = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        telafundo = new javax.swing.JLabel();
        sistemagerenciamento = new javax.swing.JLabel();
        btexit = new javax.swing.JButton();
        fundoLogin = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mncadastrar = new javax.swing.JMenu();
        btclientes = new javax.swing.JMenuItem();
        btprodutos = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        mdvender = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnferramentas = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        mnsair = new javax.swing.JMenu();
        btSair = new javax.swing.JMenuItem();
        btrelogar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Gerenciamento");
        setResizable(false);
        getContentPane().setLayout(null);

        internalFrame.setForeground(new java.awt.Color(255, 255, 255));
        internalFrame.setTitle("Bem-Vindo");
        internalFrame.setVisible(true);
        internalFrame.getContentPane().setLayout(null);

        painelinterno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        painelinterno.setLayout(null);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/func24px.png"))); // NOI18N
        jButton4.setToolTipText("Dinossauros");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        painelinterno.add(jButton4);
        jButton4.setBounds(260, 60, 90, 70);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/supermarket-cart (1).png"))); // NOI18N
        jButton3.setToolTipText("Produto - Dinossauro");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        painelinterno.add(jButton3);
        jButton3.setBounds(20, 190, 90, 70);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Venda - ");
        painelinterno.add(jLabel1);
        jLabel1.setBounds(30, 160, 80, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Cadastros -");
        painelinterno.add(jLabel2);
        jLabel2.setBounds(30, 20, 100, 20);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/stegosaurus.png"))); // NOI18N
        jButton1.setToolTipText("Dinossauros");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        painelinterno.add(jButton1);
        jButton1.setBounds(140, 60, 90, 70);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/cadastrar.png"))); // NOI18N
        jButton2.setToolTipText("Clientes");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        painelinterno.add(jButton2);
        jButton2.setBounds(20, 60, 90, 70);

        telafundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/internalframe.png"))); // NOI18N
        telafundo.setText("jLabel1");
        painelinterno.add(telafundo);
        telafundo.setBounds(-150, -240, 1321, 810);

        internalFrame.getContentPane().add(painelinterno);
        painelinterno.setBounds(10, 70, 810, 270);

        sistemagerenciamento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sistemagerenciamento.setText("Sistema de Gerenciamento");
        internalFrame.getContentPane().add(sistemagerenciamento);
        sistemagerenciamento.setBounds(10, 10, 280, 25);

        btexit.setBackground(new java.awt.Color(204, 204, 204));
        btexit.setForeground(new java.awt.Color(255, 255, 255));
        btexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/close.png"))); // NOI18N
        btexit.setToolTipText("Fechar Tela Bem-Vindo");
        btexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexitActionPerformed(evt);
            }
        });
        internalFrame.getContentPane().add(btexit);
        btexit.setBounds(770, 10, 40, 40);

        getContentPane().add(internalFrame);
        internalFrame.setBounds(10, 60, 840, 380);

        fundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/fundo-login.jpg"))); // NOI18N
        getContentPane().add(fundoLogin);
        fundoLogin.setBounds(0, 0, 1900, 1267);

        mncadastrar.setBackground(new java.awt.Color(255, 255, 255));
        mncadastrar.setText("Cadastrar");
        mncadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mncadastrarActionPerformed(evt);
            }
        });

        btclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/cadastrar.png"))); // NOI18N
        btclientes.setText("Clientes");
        btclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btclientesActionPerformed(evt);
            }
        });
        mncadastrar.add(btclientes);

        btprodutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/stegosaurus.png"))); // NOI18N
        btprodutos.setText("Produtos");
        btprodutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btprodutosActionPerformed(evt);
            }
        });
        mncadastrar.add(btprodutos);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/func.png"))); // NOI18N
        jMenuItem3.setText("Funcionários");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mncadastrar.add(jMenuItem3);

        jMenuBar1.add(mncadastrar);

        mdvender.setText("Vender");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/supermarket-cart.png"))); // NOI18N
        jMenuItem2.setText("Vender");
        mdvender.add(jMenuItem2);

        jMenuBar1.add(mdvender);

        mnferramentas.setText("Ferramentas");

        jMenuItem1.setText("Tela Bem Vindo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnferramentas.add(jMenuItem1);

        jMenuBar1.add(mnferramentas);

        jMenu1.setText("Consultar");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/cadastrar.png"))); // NOI18N
        jMenuItem4.setText("Clientes");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/stegosaurus.png"))); // NOI18N
        jMenuItem6.setText("Produtos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/func.png"))); // NOI18N
        jMenuItem5.setText("Funcionários");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        mnsair.setText("Sair");
        mnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnsairActionPerformed(evt);
            }
        });

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/close1.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        mnsair.add(btSair);

        btrelogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/refresh.png"))); // NOI18N
        btrelogar.setText("Relogar");
        btrelogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrelogarActionPerformed(evt);
            }
        });
        mnsair.add(btrelogar);

        jMenuBar1.add(mnsair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(873, 527));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mncadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mncadastrarActionPerformed
        new CadastroClientes().setVisible(true);
    }//GEN-LAST:event_mncadastrarActionPerformed

    private void btclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btclientesActionPerformed
        new CadastroClientes().setVisible(true);
    }//GEN-LAST:event_btclientesActionPerformed

    private void btprodutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btprodutosActionPerformed
       new CadastroProdutos().setVisible(true);
    }//GEN-LAST:event_btprodutosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            new CadastroProdutos().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexitActionPerformed
          internalFrame.dispose();      // TODO add your handling code here:
    }//GEN-LAST:event_btexitActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        internalFrame.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnsairActionPerformed
            new TelaDeAcesso().setVisible(true);
           
    }//GEN-LAST:event_mnsairActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
       dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_btSairActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new CadastroClientes().setVisible(true);                   // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btrelogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrelogarActionPerformed
        new TelaDeAcesso().setVisible(true);
            dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_btrelogarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
                // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new CadastroFuncionarios().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new CadastroFuncionarios().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        new ConsultaDino().setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       new ConsultaClientes().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btSair;
    private javax.swing.JMenuItem btclientes;
    private javax.swing.JButton btexit;
    private javax.swing.JMenuItem btprodutos;
    private javax.swing.JMenuItem btrelogar;
    private javax.swing.JLabel fundoLogin;
    private javax.swing.JInternalFrame internalFrame;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenu mdvender;
    private javax.swing.JMenu mncadastrar;
    private javax.swing.JMenu mnferramentas;
    private javax.swing.JMenu mnsair;
    private javax.swing.JPanel painelinterno;
    private javax.swing.JLabel sistemagerenciamento;
    private javax.swing.JLabel telafundo;
    // End of variables declaration//GEN-END:variables
}
