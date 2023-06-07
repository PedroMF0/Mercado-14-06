/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ProdutoVO;
import servicos.ProdutoServicos;
import servicos.ServicosFactory;

/**
 *
 * @author 182210051
 */
public class GUIManuProduto extends javax.swing.JInternalFrame {
    
    
    DefaultTableModel dtm = new DefaultTableModel(
        new Object[][]{},
        new Object[]{"Código", "Nome", "Quantidade", "Valor Custo", "Data Validade", "Tipo Produto"}
    );

    /**
     * Creates new form GUIManuProduto
     */
    public GUIManuProduto() {
        initComponents();
        preencherTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipos = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProduto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jtfPesquisaPro = new javax.swing.JTextField();
        jcbPesquisaPro = new javax.swing.JComboBox<>();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jbtnPreencher = new javax.swing.JButton();
        jbtnLimpar = new javax.swing.JButton();
        jbtnAlterar = new javax.swing.JButton();
        jbtnDeletar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jtfNomePro = new javax.swing.JTextField();
        jtfQuantidade = new javax.swing.JTextField();
        jtfValorCusto = new javax.swing.JTextField();
        jtfDataValidade = new javax.swing.JTextField();
        jbtnConfirmarAlteracao = new javax.swing.JButton();
        jcbAlimento = new javax.swing.JRadioButton();
        jcbLimpeza = new javax.swing.JRadioButton();
        jrbHigiene = new javax.swing.JRadioButton();
        jrbEletrodomestico = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Manutenção Produto");
        setToolTipText("");

        jtProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Valor Custo", "Quantidade", "Data Validade", "Tipo Produto"
            }
        ));
        jScrollPane1.setViewportView(jtProduto);

        jLabel1.setText("Pesquisa: ");

        jtfPesquisaPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfPesquisaProKeyReleased(evt);
            }
        });

        jcbPesquisaPro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome", "Quantidade", "Valor Custo", "Data validade", "Tipo" }));

        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfPesquisaPro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcbPesquisaPro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfPesquisaPro, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jcbPesquisaPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfPesquisaPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbPesquisaPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbtnPreencher.setText("Preencher");
        jbtnPreencher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPreencherActionPerformed(evt);
            }
        });

        jbtnLimpar.setText("Limpar");
        jbtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimparActionPerformed(evt);
            }
        });

        jbtnAlterar.setText("Alterar");
        jbtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAlterarActionPerformed(evt);
            }
        });
        jbtnAlterar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnAlterarKeyPressed(evt);
            }
        });

        jbtnDeletar.setText("Deletar");
        jbtnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeletarActionPerformed(evt);
            }
        });

        jLabel2.setText("Código: ");

        jLabel3.setText("Nome: ");

        jLabel4.setText("Quantidade");

        jLabel5.setText("Valor Custo: ");

        jLabel6.setText("Data Validade: ");

        jLabel7.setText("Tipo Produto: ");

        jtfCodigo.setEditable(false);

        jtfValorCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValorCustoActionPerformed(evt);
            }
        });

        jbtnConfirmarAlteracao.setText("Confirmar Alteração");
        jbtnConfirmarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConfirmarAlteracaoActionPerformed(evt);
            }
        });

        tipos.add(jcbAlimento);
        jcbAlimento.setText("Alimento");
        jcbAlimento.setToolTipText("Alimento");

        tipos.add(jcbLimpeza);
        jcbLimpeza.setText("Limpeza");
        jcbLimpeza.setToolTipText("Limpeza");

        tipos.add(jrbHigiene);
        jrbHigiene.setText("Higiene Pessoal");
        jrbHigiene.setToolTipText("Higiene");

        tipos.add(jrbEletrodomestico);
        jrbEletrodomestico.setText("Eletrodoméstico");
        jrbEletrodomestico.setToolTipText("Eletrodoméstico");

        jLayeredPane2.setLayer(jbtnPreencher, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbtnLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbtnAlterar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbtnDeletar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfNomePro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfQuantidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfValorCusto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfDataValidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbtnConfirmarAlteracao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jcbAlimento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jcbLimpeza, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jrbHigiene, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jrbEletrodomestico, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jbtnPreencher)
                        .addGap(27, 27, 27)
                        .addComponent(jbtnLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnDeletar))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfNomePro, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfCodigo))
                                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtfQuantidade)
                                            .addComponent(jtfValorCusto)
                                            .addComponent(jtfDataValidade))))
                                .addGap(86, 86, 86)
                                .addComponent(jbtnConfirmarAlteracao))
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                        .addComponent(jrbHigiene)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jrbEletrodomestico))
                                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                        .addComponent(jcbAlimento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcbLimpeza)))))))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnPreencher)
                    .addComponent(jbtnLimpar)
                    .addComponent(jbtnAlterar)
                    .addComponent(jbtnDeletar))
                .addGap(39, 39, 39)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfNomePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnConfirmarAlteracao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfValorCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jtfDataValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jcbAlimento)
                    .addComponent(jcbLimpeza))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbHigiene)
                    .addComponent(jrbEletrodomestico))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void preencherTabela(){
        try{
            //Buscando objeto na ProdutoServicos
            ProdutoServicos ps = ServicosFactory.getProdutoServicos();

            //Criando um ArrayList<ProdutoVO> vazio para receber o ArrayList com os dados
            ArrayList<ProdutoVO> prod = new ArrayList<>();
                    
            //Recebendo o ArrayList cheio em produtos
            prod = ps.buscarProduto();
            
            
            for( int i=0; i<prod.size(); i++){
                dtm.addRow(new String[]{
                    String.valueOf(prod.get(i).getIdproduto()),
                    String.valueOf(prod.get(i).getNomepro()),
                    String.valueOf(prod.get(i).getQuantidade()),
                    String.valueOf(prod.get(i).getValorcusto()),
                    String.valueOf(prod.get(i).getDatavalidade()),
                    String.valueOf(prod.get(i).getTipoproduto())
                    
                });
            }//fecha o laço for

            //Adicionando o modelo de tabela com os dados na tabela produto
            jtProduto.setModel(dtm);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(
                    this,
                    "Erro! " + e.getMessage());
        }//fecha o catch
    }//fecha o método preencherTabela
     
     private void limparTabela() {
        
        /*  Para limpar a tabela temos que setar o número de
            linhas para zero no default table model        
        */
        dtm.setNumRows(0);
    }//fecha o método limpar
     
     private void deletarProduto(){
        try{
            int linha = jtProduto.getSelectedRow();
            if(linha == -1){
                JOptionPane.showMessageDialog(this, "Por favor selecione uma linha!");
            }else{
                ProdutoServicos ps = ServicosFactory.getProdutoServicos();
                String codProduto = (String) jtProduto.getValueAt(linha, 0 );
                ps.deletarProduto(Integer.parseInt(codProduto));
                
                //Mensagem de sucesso para o usuário!
                JOptionPane.showMessageDialog(this, 
                        "Produto excluído com sucesso!");
                preencherTabela();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, 
                    "Erro ao deletar produto! " + e.getMessage());
        }//fim do try catch
        
    }//fim do métoso deletarProduto
     
     
     private void filtrar(){
        try{
            if(jtfPesquisaPro.getText().isEmpty()){
                preencherTabela();
            }else{
                ProdutoServicos ps = ServicosFactory.getProdutoServicos();
                String pesquisa = (String) jcbPesquisaPro.getSelectedItem();
                String query;
                if(!pesquisa.equals("Código") )if(!pesquisa.equals("Nome") ) if(!pesquisa.equals("Valor Custo") )if(pesquisa.equals("Quantidade") )if(!pesquisa.equals("Data Validade")) {
                    query = "where tipoproduto like '%" + jtfPesquisaPro.getText() + "%'";
                }else{
                    query = "where datavalidade like '%" + jtfPesquisaPro.getText() + "%'";
                }else {
                    query = "where quantidade = " + jtfPesquisaPro.getText();
                }else {
                    query = "where valorcusto = " + jtfPesquisaPro.getText();
                }else {
                    query = "where nomepro like '%" + jtfPesquisaPro.getText() + "%' ";
                }else {
                    query = "where idproduto = " + jtfPesquisaPro.getText();
                }
            //fim do else
                
                ArrayList<ProdutoVO> pro = new ArrayList();
                pro = ps.filtrarProduto(query);
                
                for(int i=0; i < pro.size(); i++ ){
                    dtm.addRow(new String[] {
                        String.valueOf(pro.get(i).getIdproduto()),
                        String.valueOf(pro.get(i).getNomepro()),
                        String.valueOf(pro.get(i).getQuantidade()),
                        String.valueOf(pro.get(i).getValorcusto()),
                        String.valueOf(pro.get(i).getDatavalidade()),
                        pro.get(i).getTipoproduto()
                });
                }//fecha o laço for
                jtProduto.setModel(dtm);
                
            }//fim do else
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,
                    "Erro ao filtrar produto! " + e.getMessage() );
        }//fim do catch        
    }//fecha o método filtrar
     
     
    private void alterarProduto(){
      try{  
        int linha = jtProduto.getSelectedRow();
        
        jbtnDeletar.setEnabled(false);
        
        if(linha != -1){
            jtfCodigo.setText ( (String) jtProduto.getValueAt(linha, 0) );
            jtfNomePro.setText ( (String) jtProduto.getValueAt(linha, 1) );
            jtfQuantidade.setText ( (String) jtProduto.getValueAt(linha, 2) );
            jtfValorCusto.setText((String) jtProduto.getValueAt(linha, 3) );
            jtfDataValidade.setText((String) jtProduto.getValueAt(linha, 4));
            if(jcbAlimento.isSelected()){
                jcbAlimento.setToolTipText((String) jtProduto.getValueAt(linha, 5));
            }if(jcbLimpeza.isSelected()){
                jcbLimpeza.setToolTipText((String) jtProduto.getValueAt(linha, 5));
            }else if(jrbHigiene.isSelected()){
                jrbHigiene.setToolTipText((String) jtProduto.getValueAt(linha, 5));
            }else if(jrbEletrodomestico.isSelected()){
                jrbEletrodomestico.setToolTipText((String) jtProduto.getValueAt(linha, 5));
            }
           
           
        }else{
            JOptionPane.showMessageDialog(
                    this,
                    "Você não selecionou nenhuma linha!");            
        }//fim do else
      }catch(Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao selecionar uma linha! " + e.getMessage());
        }//fecha catch  
        
    }//fecha o método alterar produto 
    
    private void confirmarAlteracao(){
        try{
            ProdutoVO  pVO = new ProdutoVO();
            if( jtfNomePro.getText().isEmpty() || jtfQuantidade.getText().isEmpty()|| jtfValorCusto.getText().isEmpty() || jtfDataValidade.getText().isEmpty() || jcbAlimento.getToolTipText().isEmpty()||jcbLimpeza.getToolTipText().isEmpty()||jrbHigiene.getToolTipText().isEmpty()||jrbEletrodomestico.getToolTipText().isEmpty()) {
                JOptionPane.showMessageDialog(
                        rootPane, 
                        "Erro! Pro favor insira as informações corretamente!", 
                        "Erro!" , 
                        JOptionPane.ERROR_MESSAGE);
            }else{
                pVO.setIdproduto(Integer.parseInt(jtfCodigo.getText()));
                pVO.setNomepro(jtfNomePro.getText());
                pVO.setQuantidade(Integer.parseInt(jtfQuantidade.getText()));
                pVO.setValorcusto(Double.parseDouble(jtfValorCusto.getText()));
                pVO.setDatavalidade(jtfDataValidade.getText());
                 if(jcbAlimento.isSelected()){
                        pVO.setTipoproduto(jcbAlimento.getToolTipText());
                         }if(jcbLimpeza.isSelected()){
                        pVO.setTipoproduto(jcbLimpeza.getToolTipText());
                         }else if(jrbHigiene.isSelected()){
                          pVO.setTipoproduto(jrbHigiene.getToolTipText());
                         }else if(jrbEletrodomestico.isSelected()){
                          pVO.setTipoproduto(jrbEletrodomestico.getToolTipText());
                      }
                
                
                
                ProdutoServicos ps = ServicosFactory.getProdutoServicos();
                ps.alterarProduto(pVO);
                
                JOptionPane.showMessageDialog(this, "Produto alterado com sucesso!");
            }//fim do else
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Erro! " + e.getMessage());
        }//fim do catch
        
        jbtnDeletar.setEnabled(true);
        limparTabela();
        preencherTabela();
    }//fecha o método confirmarAlteracao
    
     private void limparAlteracao(){
        jtfCodigo.setText(null);
        jtfNomePro.setText(null);
        jtfValorCusto.setText(null);
        jtfQuantidade.setText(null);
        jtfDataValidade.setText(null);
      
    }//fim do método limparAlteracao
     
    private void jtfPesquisaProKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisaProKeyReleased
        // TODO add your handling code here:
        limparTabela();
        filtrar();
    }//GEN-LAST:event_jtfPesquisaProKeyReleased

    private void jtfValorCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValorCustoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtfValorCustoActionPerformed

    private void jbtnPreencherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPreencherActionPerformed
        // TODO add your handling code here:
        limparTabela();
        preencherTabela();
       
    }//GEN-LAST:event_jbtnPreencherActionPerformed

    private void jbtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimparActionPerformed
        // TODO add your handling code here:
        limparTabela();
    }//GEN-LAST:event_jbtnLimparActionPerformed

    private void jbtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAlterarActionPerformed
        // TODO add your handling code here:
        alterarProduto();
    }//GEN-LAST:event_jbtnAlterarActionPerformed

    private void jbtnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeletarActionPerformed
        // TODO add your handling code here:
        deletarProduto();
    }//GEN-LAST:event_jbtnDeletarActionPerformed

    private void jbtnConfirmarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConfirmarAlteracaoActionPerformed
        // TODO add your handling code here:
        confirmarAlteracao();
        limparAlteracao();
    }//GEN-LAST:event_jbtnConfirmarAlteracaoActionPerformed

    private void jbtnAlterarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnAlterarKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            alterarProduto();
        }
    }//GEN-LAST:event_jbtnAlterarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAlterar;
    private javax.swing.JButton jbtnConfirmarAlteracao;
    private javax.swing.JButton jbtnDeletar;
    private javax.swing.JButton jbtnLimpar;
    private javax.swing.JButton jbtnPreencher;
    private javax.swing.JRadioButton jcbAlimento;
    private javax.swing.JRadioButton jcbLimpeza;
    private javax.swing.JComboBox<String> jcbPesquisaPro;
    private javax.swing.JRadioButton jrbEletrodomestico;
    private javax.swing.JRadioButton jrbHigiene;
    private javax.swing.JTable jtProduto;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfDataValidade;
    private javax.swing.JTextField jtfNomePro;
    private javax.swing.JTextField jtfPesquisaPro;
    private javax.swing.JTextField jtfQuantidade;
    private javax.swing.JTextField jtfValorCusto;
    private javax.swing.ButtonGroup tipos;
    // End of variables declaration//GEN-END:variables
}