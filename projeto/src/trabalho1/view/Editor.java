/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1.view;

import trabalho1.controller.Flow;
import java.io.File;
import javax.swing.JOptionPane;
import trabalho1.model.*;

/**
 *
 * @author fabricio
 */
public class Editor extends javax.swing.JFrame {
    
    /**
     * Creates new form EditorTexto
     */
    public Editor() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        text_area = new javax.swing.JTextArea();
        label_vida = new javax.swing.JLabel();
        field_nome = new javax.swing.JTextField();
        field_tipo = new javax.swing.JTextField();
        field_nivel = new javax.swing.JTextField();
        field_vida = new javax.swing.JTextField();
        label_tipo = new javax.swing.JLabel();
        label_nome = new javax.swing.JLabel();
        label_nivel = new javax.swing.JLabel();
        button_update = new javax.swing.JButton();
        button_prev = new javax.swing.JButton();
        button_next = new javax.swing.JButton();
        button_add = new javax.swing.JButton();
        button_delete = new javax.swing.JButton();
        label_index = new javax.swing.JLabel();
        label_total = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_button_open = new javax.swing.JMenuItem();
        menu_button_save = new javax.swing.JMenuItem();
        menu_button_exit = new javax.swing.JMenuItem();
        menu_about = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de criaturas para RPG");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(null);

        text_area.setEditable(false);
        text_area.setColumns(20);
        text_area.setRows(5);
        text_area.setPreferredSize(new java.awt.Dimension(100, 50));
        jScrollPane1.setViewportView(text_area);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(190, 50, 259, 175);

        label_vida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_vida.setText("Vida: ");
        getContentPane().add(label_vida);
        label_vida.setBounds(20, 180, 27, 14);
        getContentPane().add(field_nome);
        field_nome.setBounds(70, 30, 70, 30);
        getContentPane().add(field_tipo);
        field_tipo.setBounds(70, 80, 70, 30);
        getContentPane().add(field_nivel);
        field_nivel.setBounds(70, 130, 70, 30);
        getContentPane().add(field_vida);
        field_vida.setBounds(70, 180, 70, 30);

        label_tipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_tipo.setText("Tipo: ");
        getContentPane().add(label_tipo);
        label_tipo.setBounds(20, 80, 27, 14);

        label_nome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_nome.setText("Nome: ");
        getContentPane().add(label_nome);
        label_nome.setBounds(20, 30, 34, 14);

        label_nivel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_nivel.setText("Nível: ");
        getContentPane().add(label_nivel);
        label_nivel.setBounds(20, 130, 30, 14);

        button_update.setText("Atualizar");
        button_update.setEnabled(false);
        button_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_updateActionPerformed(evt);
            }
        });
        getContentPane().add(button_update);
        button_update.setBounds(270, 20, 100, 23);

        button_prev.setText("<");
        button_prev.setEnabled(false);
        button_prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_prevActionPerformed(evt);
            }
        });
        getContentPane().add(button_prev);
        button_prev.setBounds(190, 20, 50, 23);

        button_next.setText(">");
        button_next.setEnabled(false);
        button_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_nextActionPerformed(evt);
            }
        });
        getContentPane().add(button_next);
        button_next.setBounds(400, 20, 50, 23);

        button_add.setText("Adicionar");
        button_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addActionPerformed(evt);
            }
        });
        getContentPane().add(button_add);
        button_add.setBounds(60, 240, 90, 23);

        button_delete.setText("Deletar");
        button_delete.setEnabled(false);
        button_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(button_delete);
        button_delete.setBounds(270, 240, 100, 23);

        label_index.setText("Nº: ");
        getContentPane().add(label_index);
        label_index.setBounds(190, 240, 40, 14);

        label_total.setText("Total: ");
        getContentPane().add(label_total);
        label_total.setBounds(410, 240, 60, 14);

        jMenu1.setText("Arquivo");

        menu_button_open.setText("Abrir");
        menu_button_open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_button_openActionPerformed(evt);
            }
        });
        jMenu1.add(menu_button_open);

        menu_button_save.setText("Salvar");
        menu_button_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_button_saveActionPerformed(evt);
            }
        });
        jMenu1.add(menu_button_save);

        menu_button_exit.setText("Sair");
        menu_button_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_button_exitActionPerformed(evt);
            }
        });
        jMenu1.add(menu_button_exit);

        jMenuBar1.add(jMenu1);

        menu_about.setText("Sobre");
        menu_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_aboutActionPerformed(evt);
            }
        });
        jMenuBar1.add(menu_about);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 508, 373);
    }// </editor-fold>//GEN-END:initComponents

    private void menu_button_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_button_exitActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_menu_button_exitActionPerformed

    private void menu_button_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_button_saveActionPerformed
        //Faz o encode dos registros pra forma certa pra poder ser aberto corretamente na proxima vez
        String str = Flow.encodeString();
        File arquivo = Flow.escolherArquivo(1);
        if (arquivo != null) {
            if (Flow.escreverTexto(arquivo, str)) {
                JOptionPane.showMessageDialog(
                        this, "Texto Escrito com sucesso!");
            } else {
                JOptionPane.showMessageDialog(
                        this, "Erro ao escrever Texto!");
            }
        } else {
            JOptionPane.showMessageDialog(
                    this, "Erro ao selecionar arquivo para escrita!");
        }
    }//GEN-LAST:event_menu_button_saveActionPerformed

    private void menu_button_openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_button_openActionPerformed
        File arquivo = Flow.escolherArquivo(0);
        String str = Flow.lerTexto(arquivo);
        
        //Reseta os registros ja existentes, se houverem, e as variaveis de controle
        Flow.registros = null;
        Flow.numRegistros = 0;
        Flow.currentIndex = 0;
        
        //Decodifica a string e guarda em Flow.registros[]
        Flow.decodeString(str);
        
        //Mostra o primeiro registro, se houver
        if(Flow.registros != null)
        {
            text_area.setText(Flow.registros.get(0).toString());
            UpdateUI();
        }
        
    }//GEN-LAST:event_menu_button_openActionPerformed

    private void button_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_nextActionPerformed
        if(Flow.currentIndex < Flow.numRegistros - 1)
        {
            Flow.currentIndex++;
            button_prev.setEnabled(true);
            text_area.setText(Flow.registros.get(Flow.currentIndex).toString());
        }
        
        //Ativa e desativa botões quando esta no começo/final da lista e atualiza o label
        UpdateUI();
        
    }//GEN-LAST:event_button_nextActionPerformed

    private void button_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_addActionPerformed
        String nome, tipo, nivel, vida, criatura_dados;
        
        nome  = field_nome.getText();
        tipo = field_tipo.getText();
        nivel = field_nivel.getText();
        vida = field_vida.getText();
        
        //Cria uma nova criatura
        Criatura criatura = new Criatura(nome, tipo, nivel, vida);
        
        //Pega as substrings dos campos da criatura
        String[] subs = {nome, tipo, nivel, vida};
        
        //Adiciona a nova criatura ao registro
        Flow.numRegistros++;
        Flow.addRegistro(new Registro(subs, Flow.numRegistros));
        
        //Mostra na tela o novo registro
        text_area.setText(Flow.registros.get(Flow.numRegistros - 1).toString());
        
        //Coloca o novo index como sendo o novo registro
        Flow.currentIndex = Flow.numRegistros - 1;
        
        //Atualiza os botões e labels
        UpdateUI();
        
        //Debug
        criatura_dados = criatura.getStringDados();
        
    }//GEN-LAST:event_button_addActionPerformed

    private void button_prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_prevActionPerformed
        if(Flow.currentIndex > 0)
        {
            Flow.currentIndex--;
            button_next.setEnabled(true);
            text_area.setText(Flow.registros.get(Flow.currentIndex).toString());
        }
        
        //Ativa e desativa botões quando esta no começo/final da lista e atualiza o label
        UpdateUI();
    }//GEN-LAST:event_button_prevActionPerformed

    private void button_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_deleteActionPerformed
        //Remove o registro
        Flow.removeRegistro();
        
        //Se não possuir registros, mostrar um texto em branco
        if(Flow.registros.size() > 0)
            text_area.setText(Flow.registros.get(Flow.currentIndex).toString());
        else
            text_area.setText("");
        
        //Faz o update do UI para ver quais botões serão deixados ativos ou não e atualiza os labels
        UpdateUI();
    }//GEN-LAST:event_button_deleteActionPerformed

    private void button_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_updateActionPerformed
        //Cria um novo array de strings para atualizar nos registros
        String[] field_str = new String[4];
        
        field_str[0] = field_nome.getText();
        field_str[1] = field_tipo.getText();
        field_str[2] = field_nivel.getText();
        field_str[3] = field_vida.getText();
        
        //Atualiza o registro no Flow
        Flow.registros.get(Flow.currentIndex).setField_str(field_str);
        
        //Depois do registro atualizado, imprime na tela o registro alterado
        text_area.setText(Flow.registros.get(Flow.currentIndex).toString());
        
        //Faz o update do UI
        UpdateUI();
    }//GEN-LAST:event_button_updateActionPerformed

    private void menu_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_aboutActionPerformed
        JOptionPane.showMessageDialog(null,"isso é teste","Janela", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menu_aboutActionPerformed

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
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_add;
    private javax.swing.JButton button_delete;
    private javax.swing.JButton button_next;
    private javax.swing.JButton button_prev;
    private javax.swing.JButton button_update;
    private javax.swing.JTextField field_nivel;
    private javax.swing.JTextField field_nome;
    private javax.swing.JTextField field_tipo;
    private javax.swing.JTextField field_vida;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_index;
    private javax.swing.JLabel label_nivel;
    private javax.swing.JLabel label_nome;
    private javax.swing.JLabel label_tipo;
    private javax.swing.JLabel label_total;
    private javax.swing.JLabel label_vida;
    private javax.swing.JMenu menu_about;
    private javax.swing.JMenuItem menu_button_exit;
    private javax.swing.JMenuItem menu_button_open;
    private javax.swing.JMenuItem menu_button_save;
    private javax.swing.JTextArea text_area;
    // End of variables declaration//GEN-END:variables

    public void CheckButtons()
    {
        //Checa as condições para o botão PROXIMO
        if(Flow.currentIndex == Flow.numRegistros - 1 || Flow.registros.size() == 0)
            button_next.setEnabled(false);
        else
            button_next.setEnabled(true);
        
        //Checa as condições para o botão ANTERIOR
        if(Flow.currentIndex == 0)
            button_prev.setEnabled(false);
        else
            button_prev.setEnabled(true);
        
        //Checa as condições para o botão DELETE e UPDATE
        if(Flow.numRegistros > 0 )
        {
            button_delete.setEnabled(true);
            button_update.setEnabled(true);
        }
        else
        {
            button_delete.setEnabled(false);
            button_update.setEnabled(false);
        }
    }
    
    public void UpdateLabels()
    {
        label_index.setText("Nº: " + (Flow.currentIndex + 1));
        label_total.setText("Total: " + Flow.numRegistros);
    }
    
    public void UpdateUI()
    {
        CheckButtons();
        UpdateLabels();
    }
}