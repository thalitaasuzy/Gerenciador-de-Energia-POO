package form;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import login.*;
import swing.EventLogin;

public class Potencia extends PanelCustom {

    private EventLogin event; //Utilizado para definir comportamentos específicos.
    private double voltDouble, correnteDouble, resultado;
    

    public Potencia() {
        // Inicializa e configura a instância da classe Login
        initComponents();
        setAlpha(0);
    }

    public void setEventLogin(EventLogin event) {
        //Define o objeto EventLogin para o evento de login.
        this.event = event;
    }
    
    public double calcularPotencia() {
        //Calcula Potencia
        resultado = voltDouble * correnteDouble;
       return resultado;
    };
    
    public void testaVoltagem(){
        //Verifica se o valor digitado é do tipo double
        String input = voltagem.getText();
                try {
                    voltDouble = Double.parseDouble(input);
                    // Faça algo com o número recebido
                    System.out.println("Número recebido: " + voltDouble);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(Potencia.this, "Digite um número válido", "Erro", JOptionPane.ERROR_MESSAGE);
                }
    };
    
    public void testaCorrente(){
        //Verifica se o valor digitado é do tipo double
        String input = corrente.getText();
                try {
                    correnteDouble = Double.parseDouble(input);
                    // Faça algo com o número recebido
                    System.out.println("Número recebido: " + correnteDouble);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(Potencia.this, "Digite um número válido", "Erro", JOptionPane.ERROR_MESSAGE);
                }
    };
    
    public String convertDouble(){
        String resultString = Double.toString(calcularPotencia());
        return resultString;
    };
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel4 = new javax.swing.JLabel();
        button4 = new swing.Button();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        result_lbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        reloadButton = new swing.Button();
        voltagem = new swing.TextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        calcButton = new swing.Button();
        corrente = new swing.TextField();
        infoButton = new swing.Button();
        aboutButton = new swing.Button();
        backButton = new swing.Button();

        jMenuItem1.setText("jMenuItem1");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("EFEITO JOULE");

        button4.setBackground(new java.awt.Color(158, 85, 255));
        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setText("CALCULAR");
        button4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button4MouseClicked(evt);
            }
        });
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(14, 6, 19));
        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 242, 242));
        jLabel6.setText("Resultado:");

        result_lbl.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        result_lbl.setForeground(new java.awt.Color(242, 242, 242));
        result_lbl.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setText("Watts");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 73, Short.MAX_VALUE)
                .addComponent(result_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(result_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.ipadx = 73;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 23, 96, 0);
        add(jPanel1, gridBagConstraints);

        reloadButton.setBackground(new java.awt.Color(158, 85, 255));
        reloadButton.setForeground(new java.awt.Color(255, 255, 255));
        reloadButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Reload-icon(16).png"))); // NOI18N
        reloadButton.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        reloadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reloadButtonMouseClicked(evt);
            }
        });
        reloadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloadButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = -10;
        gridBagConstraints.ipady = -9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 6, 0, 0);
        add(reloadButton, gridBagConstraints);

        voltagem.setForeground(new java.awt.Color(242, 242, 242));
        voltagem.setCaretColor(new java.awt.Color(61, 56, 56));
        voltagem.setDisabledTextColor(new java.awt.Color(187, 105, 253));
        voltagem.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        voltagem.setHint("VOLTAGEM (V)");
        voltagem.setSelectedTextColor(new java.awt.Color(176, 148, 189));
        voltagem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                voltagemFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                voltagemFocusLost(evt);
            }
        });
        voltagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltagemMouseClicked(evt);
            }
        });
        voltagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltagemActionPerformed(evt);
            }
        });
        voltagem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                voltagemKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 242;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 19, 0, 0);
        add(voltagem, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(242, 242, 242));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("POTÊNCIA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 154;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 39, 0, 0);
        add(jLabel7, gridBagConstraints);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Bateria-icon(50).png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 144, 0, 0);
        add(jLabel8, gridBagConstraints);

        calcButton.setBackground(new java.awt.Color(158, 85, 255));
        calcButton.setForeground(new java.awt.Color(255, 255, 255));
        calcButton.setText("CALCULAR");
        calcButton.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        calcButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcButtonMouseClicked(evt);
            }
        });
        calcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 212;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 19, 0, 0);
        add(calcButton, gridBagConstraints);

        corrente.setForeground(new java.awt.Color(242, 242, 242));
        corrente.setCaretColor(new java.awt.Color(61, 56, 56));
        corrente.setDisabledTextColor(new java.awt.Color(187, 105, 253));
        corrente.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        corrente.setHint("CORRENTE (A)");
        corrente.setSelectedTextColor(new java.awt.Color(176, 148, 189));
        corrente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                correnteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                correnteFocusLost(evt);
            }
        });
        corrente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                correnteMouseClicked(evt);
            }
        });
        corrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correnteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 242;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 19, 0, 0);
        add(corrente, gridBagConstraints);

        infoButton.setBackground(new java.awt.Color(14, 6, 19));
        infoButton.setForeground(new java.awt.Color(204, 204, 204));
        infoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Prancheta-icon(20).png"))); // NOI18N
        infoButton.setText("Info");
        infoButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        infoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 258, 0, 0);
        add(infoButton, gridBagConstraints);

        aboutButton.setBackground(new java.awt.Color(14, 6, 19));
        aboutButton.setForeground(new java.awt.Color(204, 204, 204));
        aboutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Info-icon(20).png"))); // NOI18N
        aboutButton.setText("Sobre");
        aboutButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 5, 0, 20);
        add(aboutButton, gridBagConstraints);

        backButton.setBackground(new java.awt.Color(14, 6, 19));
        backButton.setForeground(new java.awt.Color(204, 204, 204));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Voltar-icon(20).png"))); // NOI18N
        backButton.setText("Voltar");
        backButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 0, 0);
        add(backButton, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void reloadButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reloadButtonMouseClicked
        //Limpa a tela para calcular novamente
        voltagem.setText("");
        corrente.setText("");
        voltagem.setHint("VOLTAGEM(V)");
        corrente.setHint("CORRENTE(A)");
        result_lbl.setText(" ");
        
        
    }//GEN-LAST:event_reloadButtonMouseClicked

    private void reloadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reloadButtonActionPerformed

    private void voltagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltagemMouseClicked
         // TODO add your handling code here:
    }//GEN-LAST:event_voltagemMouseClicked

    private void voltagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltagemActionPerformed
         // TODO add your handling code here:
        
        
    }//GEN-LAST:event_voltagemActionPerformed

    private void calcButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_calcButtonMouseClicked

    private void calcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButtonActionPerformed
        //Chama os metódos eretorna valor na tela
        testaCorrente();
        testaVoltagem();
        calcularPotencia();
        result_lbl.setText(convertDouble());
    }//GEN-LAST:event_calcButtonActionPerformed

    private void button4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_button4MouseClicked

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button4ActionPerformed

    private void correnteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correnteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_correnteMouseClicked

    private void correnteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correnteActionPerformed
        // TODO add your handling code here:
      
        
    }//GEN-LAST:event_correnteActionPerformed

    private void voltagemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_voltagemFocusGained
        // Ajusta o foco, limpa a dica
        if (voltagem.getHint().equals("VOLTAGEM(V)")) {
                    voltagem.setHint("");
            }  
        
    }//GEN-LAST:event_voltagemFocusGained

    private void voltagemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_voltagemFocusLost
        // Restaura a dica se não tiver nada
            if (voltagem.getHint().isEmpty()) {
                    voltagem.setHint("VOLTAGEM(V)");
            }
    }//GEN-LAST:event_voltagemFocusLost

    private void correnteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_correnteFocusGained
        // Ajusta o foco, limpa a dica
        if (corrente.getHint().equals("CORRENTE(A)")) {
                    corrente.setHint("");
            }  
    }//GEN-LAST:event_correnteFocusGained

    private void correnteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_correnteFocusLost
        // Restaura a dica se não tiver nada
            if (corrente.getHint().isEmpty()) {
                    corrente.setHint("CORRENTE(A)");
            }
    }//GEN-LAST:event_correnteFocusLost

    private void voltagemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_voltagemKeyPressed
        //Ajustar foco ao pressionar Enter
        voltagem.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    corrente.requestFocus();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }//GEN-LAST:event_voltagemKeyPressed

    private void infoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoButtonActionPerformed
       //Executa quando o usuário quer ir a tela Info
        event.infoEvent();
    }//GEN-LAST:event_infoButtonActionPerformed

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        //Instancia tela Sobre
        event.sobreEvent();
    }//GEN-LAST:event_aboutButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
       //Executa quando o usuário quer voltar a tela Home 
        event.loginDone();
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button aboutButton;
    private swing.Button backButton;
    private swing.Button button4;
    private swing.Button calcButton;
    private swing.TextField corrente;
    private swing.Button infoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private swing.Button reloadButton;
    private javax.swing.JLabel result_lbl;
    private swing.TextField voltagem;
    // End of variables declaration//GEN-END:variables
}
