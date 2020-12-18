/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojadino;

import Conexão.SQL;
import java.sql.SQLException;
import java.util.ArrayList;

import lojadino.Classes.Produtos;
import lojadino.Classes.Cliente;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import lojadino.Classes.ModeloTabela;

import lojadino.Classes.venda;

/**
 *
 * @author Paulo
 */
public class DetalhesVenda extends javax.swing.JFrame {
    Cliente novoCliente = new Cliente();
    Produtos novoProduto = new Produtos();
    venda novaVenda = new venda();
    SQL conectar = new SQL();
    public DetalhesVenda() {
        initComponents();
       
    }
     private void buscarCliente(Cliente novoCliente){
        this.conectar.conectaBanco();
        
        String cpfcliente = (String) this.cpfcliente.getText();
                
        try {
            this.conectar.executarSQL(
                   "SELECT "
                    + "nome"
                 + " FROM"
                     + " cadastrocliente"
                 + " WHERE"
                     + " cpf = '" + cpfcliente + "'"
                + ";"
            );
            
            while(this.conectar.getResultSet().next()){
                novoCliente.setNome(this.conectar.getResultSet().getString(1));
           }
            
           
           
           
        } catch (Exception e) {            
            System.out.println("Erro ao consultar cliente " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar cliente");
            
        }finally{
            txtcliente.setText(novoCliente.getNome());
            this.conectar.fechaBanco();   
        }               
        if(novoCliente.getNome()==""){
                JOptionPane.showMessageDialog(null, "Cliente não encontrado!");}
    };
       private void buscarProduto(Produtos novoProduto){
        this.conectar.conectaBanco();
        
        String cdproduto = (String) this.cdproduto.getText();
                
        try {
            this.conectar.executarSQL(
                   "SELECT "
                    + "nome_prd,"
                    + "valor_prd"
                 + " FROM"
                     + " cadastroproduto"
                 + " WHERE"
                     + " id_prd = '" + cdproduto + "'"
                + ";"
            );
            
            while(this.conectar.getResultSet().next()){
                novoProduto.setNome(this.conectar.getResultSet().getString(1));
                novoProduto.setValor(this.conectar.getResultSet().getString(2));
           }
            
           
           
           
        } catch (Exception e) {            
            System.out.println("Erro ao consultar produto " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar produto");
            
        }finally{
            txtproduto.setText(novoProduto.getNome());
            txtvalor.setText(novoProduto.getValor());
            this.conectar.fechaBanco();   
        }               
        if(novoProduto.getNome()==""){
                JOptionPane.showMessageDialog(null, "produto não encontrado!");}
    };
       private void efetuarVenda(venda novaVenda){
        this.conectar.conectaBanco(); 
        
        
        novaVenda.setNome_cliente(txtcliente.getText());
        novaVenda.setNome_prd(txtproduto.getText());
        novaVenda.setValor_prd(txtvalor.getText());
        novaVenda.setData_venda(txtdata.getText());
        
      
        

        
        try {
                        
            this.conectar.insertSQL("INSERT INTO venda ("
                    + "cliente_nome,"
                    + "prd_nome,"
                    + "prd_valor,"
                    + "data_atual"
                + ") VALUES ("
                    + ""
                    + "'" + novaVenda.getNome_cliente()+ "',"
                    + "'" + novaVenda.getNome_prd()+ "',"
                    + "'" + novaVenda.getValor_prd()+ "',"
                    + "'" + novaVenda.getData_venda()+ "'"
                + ");");
            
        } catch (Exception e) {
            
            System.out.println("Erro ao efetuar venda " +  e.getMessage());
            
        } finally{            
            this.conectar.fechaBanco();
           
            //novoCliente.limpaCliente();
            //limparCamposCadastro();
        }                
    }
     
           
          private void LimparCampo(){
           
            txtcliente.setText("");
            txtdata.setText("");
            txtpagamento.setSelectedItem("");
            txtproduto.setText("");
            txtvalor.setText("");
            cpfcliente.setText("");
            cdproduto.setText("");
          }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("dinostore?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        vendaQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT v FROM Venda v");
        vendaList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : vendaQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cdproduto = new javax.swing.JTextField();
        cpfcliente = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtcliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtdata = new javax.swing.JFormattedTextField();
        txtproduto = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtpagamento = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        txtvalor = new javax.swing.JFormattedTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtfuncionario = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Venda");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setText("Pagamento");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/ancient-scroll.png"))); // NOI18N
        jButton5.setText("Historico ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(228, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(83, 83, 83)
                .addComponent(jButton5)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da Venda"));

        jLabel3.setText("CPF Cliente");

        jLabel4.setText("Produto");

        jLabel6.setText("Cod Produto");

        try {
            cpfcliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setText("Cliente");

        txtcliente.setEnabled(false);
        txtcliente.setOpaque(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/lupa.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/lupa.png"))); // NOI18N
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Data");

        try {
            txtdata.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtproduto.setEnabled(false);
        txtproduto.setOpaque(false);
        txtproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprodutoActionPerformed(evt);
            }
        });

        jLabel20.setText("Valor");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/logo_telas_cadastro_consulta.png"))); // NOI18N

        txtpagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Debito", "Credito", "Dinheiro" }));

        jLabel19.setText("Pagamento");

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/broom.png"))); // NOI18N
        jButton16.setText("Limpar");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        try {
            txtvalor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtvalor.setEnabled(false);
        txtvalor.setFocusable(false);
        txtvalor.setOpaque(false);

        jButton3.setText("Adicionar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, vendaList, jtfuncionario);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${clienteNome}"));
        columnBinding.setColumnName("Nome Cliente");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${prdNome}"));
        columnBinding.setColumnName("Produto");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${prdValor}"));
        columnBinding.setColumnName("Valor");
        columnBinding.setColumnClass(java.math.BigDecimal.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataAtual}"));
        columnBinding.setColumnName("Data");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jtfuncionario);
        if (jtfuncionario.getColumnModel().getColumnCount() > 0) {
            jtfuncionario.getColumnModel().getColumn(0).setResizable(false);
            jtfuncionario.getColumnModel().getColumn(1).setResizable(false);
            jtfuncionario.getColumnModel().getColumn(2).setResizable(false);
            jtfuncionario.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton6.setText("Excluir");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(cpfcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtcliente)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(cdproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton2))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(txtproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel20)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(jButton3)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(txtpagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(cpfcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)
                        .addComponent(jLabel7)
                        .addComponent(jButton16)))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cdproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtvalor)
                    .addComponent(jLabel20)
                    .addComponent(jButton3)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtpagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)))
                .addGap(334, 334, 334))
        );

        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Finalizar Venda");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(14, 14, 14))
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        buscarCliente(novoCliente);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        buscarProduto(novoProduto);     // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
          new HistoricoVenda().setVisible(true);    
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprodutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprodutoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
         if (cpfcliente.getText().equals("") 
                 || cdproduto.getText().equals("")
                    || txtdata.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos");
         }else {efetuarVenda(novaVenda);   
        LimparCampo();
         }// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
    LimparCampo();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        efetuarVenda(novaVenda);
        
    }//GEN-LAST:event_jButton3ActionPerformed
   public void preencherTabela(String Sql){
      ArrayList dados = new ArrayList();
      String [] colunas = new String[] {"Nome Cliente","Produto","Valor","Data"}; 
      conectar.conectaBanco();
      conectar.executarSQL(Sql);
      try {
          conectar.resultSet.first();
          do {              
              dados.add(new Object[]{conectar.resultSet.getString("cliente_nome"),
                                    conectar.resultSet.getString("prd_nome"),
                                    conectar.resultSet.getString("prd_valor"),
                                    conectar.resultSet.getString("data_atual")});
              
          } while (conectar.resultSet.next());
      } catch (SQLException ex) {
          JOptionPane.showMessageDialog(rootPane,"Nenhum Funcionario cadastrado!");
         
      }
      ModeloTabela modelo = new ModeloTabela(dados, colunas);
      jtfuncionario.setModel(modelo);
      jtfuncionario.getColumnModel().getColumn(0).setPreferredWidth(100);
      jtfuncionario.getColumnModel().getColumn(0).setResizable(false);
      
      jtfuncionario.getColumnModel().getColumn(1).setPreferredWidth(100);
      jtfuncionario.getColumnModel().getColumn(1).setResizable(false);
      
      jtfuncionario.getColumnModel().getColumn(2).setPreferredWidth(156);
      jtfuncionario.getColumnModel().getColumn(2).setResizable(false);
      
      jtfuncionario.getColumnModel().getColumn(3).setPreferredWidth(100);
      jtfuncionario.getColumnModel().getColumn(3).setResizable(false);
      
    
     
      jtfuncionario.getTableHeader().setReorderingAllowed(false);
      jtfuncionario.setAutoResizeMode(jtfuncionario.AUTO_RESIZE_OFF);
      jtfuncionario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      conectar.fechaBanco();
  };
 
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalhesVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cdproduto;
    private javax.swing.JFormattedTextField cpfcliente;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtfuncionario;
    private javax.swing.JTextField txtcliente;
    private javax.swing.JFormattedTextField txtdata;
    private javax.swing.JComboBox<String> txtpagamento;
    private javax.swing.JTextField txtproduto;
    private javax.swing.JFormattedTextField txtvalor;
    private java.util.List<lojadino.Venda> vendaList;
    private javax.persistence.Query vendaQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
