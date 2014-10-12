package biblioteca;

import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author a110051
 */
public class CadastroLivroJFrame extends javax.swing.JFrame {

    Prateleira prateleira;
    
    public CadastroLivroJFrame(Prateleira p1) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }

        this.prateleira = p1;
        initComponents();
        this.setLocationRelativeTo(null);
        PrateleiraTabelaModelo ptm = new PrateleiraTabelaModelo(this.prateleira);
        this.tbLivros.setModel(ptm);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCadastroDeLivro = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        tfTitulo = new javax.swing.JTextField();
        lbAutores = new javax.swing.JLabel();
        tfAutores = new javax.swing.JTextField();
        lbEdicao = new javax.swing.JLabel();
        tfEdicao = new javax.swing.JTextField();
        lbEditora = new javax.swing.JLabel();
        tfEditora = new javax.swing.JTextField();
        lbAnoPublicacao = new javax.swing.JLabel();
        tfAnoPublicacao = new javax.swing.JTextField();
        lbIsbn = new javax.swing.JLabel();
        tfIsbn = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        spBarraRolagem = new javax.swing.JScrollPane();
        tbLivros = new javax.swing.JTable();
        lbLivrosCadastrados = new javax.swing.JLabel();
        btOrdenarPorTitulo = new javax.swing.JButton();
        btOrdenarPorIsbn = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Livros");

        lbCadastroDeLivro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbCadastroDeLivro.setText("Cadastro de Livro:");

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTitulo.setText("Título:");

        lbAutores.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbAutores.setText("Autores:");

        lbEdicao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbEdicao.setText("Edição:");

        lbEditora.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbEditora.setText("Editora:");

        lbAnoPublicacao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbAnoPublicacao.setText("Ano de Publicação: ");

        lbIsbn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbIsbn.setText("ISBN: ");

        btCadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        tbLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLivrosMouseClicked(evt);
            }
        });
        spBarraRolagem.setViewportView(tbLivros);

        lbLivrosCadastrados.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbLivrosCadastrados.setText("Livros cadastrados:");

        btOrdenarPorTitulo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btOrdenarPorTitulo.setText("Ordenar tabela por título");
        btOrdenarPorTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOrdenarPorTituloActionPerformed(evt);
            }
        });

        btOrdenarPorIsbn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btOrdenarPorIsbn.setText("Ordenar tabela por ISBN");
        btOrdenarPorIsbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOrdenarPorIsbnActionPerformed(evt);
            }
        });

        btRemover.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btRemover.setText("Remover");
        btRemover.setEnabled(false);
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
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
                        .addComponent(spBarraRolagem)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCadastroDeLivro)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbEdicao)
                                .addGap(18, 18, 18)
                                .addComponent(tfEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbAnoPublicacao)
                        .addGap(18, 18, 18)
                        .addComponent(tfAnoPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbAutores)
                        .addGap(18, 18, 18)
                        .addComponent(tfAutores)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbTitulo)
                                .addGap(18, 18, 18)
                                .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbEditora)
                                .addGap(18, 18, 18)
                                .addComponent(tfEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(lbIsbn)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfIsbn))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbLivrosCadastrados)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btOrdenarPorTitulo)
                                .addGap(18, 18, 18)
                                .addComponent(btOrdenarPorIsbn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btRemover)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCadastroDeLivro)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTitulo)
                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAutores)
                    .addComponent(tfAutores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEdicao)
                    .addComponent(tfEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAnoPublicacao)
                    .addComponent(tfAnoPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEditora)
                    .addComponent(tfEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIsbn)
                    .addComponent(tfIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btLimpar))
                .addGap(19, 19, 19)
                .addComponent(lbLivrosCadastrados)
                .addGap(18, 18, 18)
                .addComponent(spBarraRolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btOrdenarPorTitulo)
                    .addComponent(btOrdenarPorIsbn)
                    .addComponent(btRemover))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        try {
            
            String titulo = tfTitulo.getText();
            String autores = tfAutores.getText();
            String edicao = tfEdicao.getText();
            String editora = tfEditora.getText();

            
            if (titulo.equals("")){
                JOptionPane.showMessageDialog(this, "Campo Título está vazio! Preencha-o");
            } else if (autores.equals("")) {
                JOptionPane.showMessageDialog(this, "Campo Autores está vazio! Preencha-o");
            } else if (edicao.equals("")) {
                JOptionPane.showMessageDialog(this, "Campo Edição está vazio! Preencha-o");
            } else if (editora.equals("")) {
                JOptionPane.showMessageDialog(this, "Campo Editora está vazio! Preencha-o");
            } else if (tfAnoPublicacao.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Campo Ano Publicação está vazio! Preencha-o");
            } else if (tfIsbn.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Campo ISBN está vazio! Preencha-o");
            } else {
                
                int anoPublicacao = Integer.parseInt(tfAnoPublicacao.getText());
                int isbn = Integer.parseInt(tfIsbn.getText());
                
                Livro novoLivro = new Livro();
                novoLivro.setTitulo(titulo);
                novoLivro.setAutores(autores);
                novoLivro.setEdição(edicao);
                novoLivro.setEditora(editora);
                novoLivro.setAnoPublicacao(anoPublicacao);
                novoLivro.setIsbn(isbn);

                prateleira.add(novoLivro);

                JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!");
                this.tbLivros.revalidate();

                tfTitulo.setText("");
                tfAutores.setText("");
                tfEdicao.setText("");
                tfEditora.setText("");
                tfAnoPublicacao.setText("");
                tfIsbn.setText("");
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "Problema no cadastro do produto!");

        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        tfTitulo.setText("");
        tfAutores.setText("");
        tfEdicao.setText("");
        tfEditora.setText("");
        tfAnoPublicacao.setText("");
        tfIsbn.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        int linhaSelecionada = this.tbLivros.getSelectedRow();
        this.prateleira.remove(linhaSelecionada);
        this.tbLivros.revalidate();
        this.btRemover.setEnabled(false);
        JOptionPane.showMessageDialog(this, "Livro removido com sucesso");
    }//GEN-LAST:event_btRemoverActionPerformed

    private void tbLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLivrosMouseClicked
        if (this.tbLivros.getSelectedRow() >= 0) { 
            this.btRemover.setEnabled(true);
        } else {
            this.btRemover.setEnabled(false);
        }
    }//GEN-LAST:event_tbLivrosMouseClicked

    private void btOrdenarPorTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOrdenarPorTituloActionPerformed
        if (prateleira.size() == 0){
            JOptionPane.showMessageDialog(null, "Não há livros cadastrados", 
                                          "Erro!", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            ComparadorLivroPorTitulo clpt = new ComparadorLivroPorTitulo();
            Collections.sort(prateleira, clpt);
            this.tbLivros.revalidate();
            this.tbLivros.repaint();
        }
    }//GEN-LAST:event_btOrdenarPorTituloActionPerformed

    private void btOrdenarPorIsbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOrdenarPorIsbnActionPerformed
        if (prateleira.size() == 0){
            JOptionPane.showMessageDialog(null, "Não há livros cadastrados", 
                                          "Erro!", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            ComparadorLivroPorIsbn clpi = new ComparadorLivroPorIsbn();
            Collections.sort(prateleira, clpi);
            this.tbLivros.revalidate();
            this.tbLivros.repaint();
        }
    }//GEN-LAST:event_btOrdenarPorIsbnActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btOrdenarPorIsbn;
    private javax.swing.JButton btOrdenarPorTitulo;
    private javax.swing.JButton btRemover;
    private javax.swing.JLabel lbAnoPublicacao;
    private javax.swing.JLabel lbAutores;
    private javax.swing.JLabel lbCadastroDeLivro;
    private javax.swing.JLabel lbEdicao;
    private javax.swing.JLabel lbEditora;
    private javax.swing.JLabel lbIsbn;
    private javax.swing.JLabel lbLivrosCadastrados;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JScrollPane spBarraRolagem;
    private javax.swing.JTable tbLivros;
    private javax.swing.JTextField tfAnoPublicacao;
    private javax.swing.JTextField tfAutores;
    private javax.swing.JTextField tfEdicao;
    private javax.swing.JTextField tfEditora;
    private javax.swing.JTextField tfIsbn;
    private javax.swing.JTextField tfTitulo;
    // End of variables declaration//GEN-END:variables
}
