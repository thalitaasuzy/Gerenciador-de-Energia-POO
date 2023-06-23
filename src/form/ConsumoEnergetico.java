package form;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import login.*;
import swing.EventLogin;
import javax.swing.JOptionPane;

public class ConsumoEnergetico extends PanelCustom {

    private EventLogin event; //Utilizado para definir comportamentos específicos que ocorrem durante o processo de login
    private double potenciaDouble, tempoDouble, resultado;
    
    public ConsumoEnergetico() {
        // Inicializa e configura a instância da classe Login
        initComponents();
        setAlpha(0);
    }

    public void setEventLogin(EventLogin event) {
        //Define o objeto EventLogin para o evento de login.
        this.event = event;
    }
    
     public double calcularConsumoEnergetico() {
        //Calcula ConsumoEnergetioc
        resultado = potenciaDouble * tempoDouble;
        return resultado;
     }
     
     public void testaPotencia(){
        //Verifica se o valor digitado é do tipo double
        String input = potencia.getText();
                try {
                    potenciaDouble = Double.parseDouble(input);
                    // Faça algo com o número recebido
                    System.out.println("Número recebido: " + potenciaDouble);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(ConsumoEnergetico.this, "Digite um número válido", "Erro", JOptionPane.ERROR_MESSAGE);
                }
    };
     
     public void testaTempo(){
        //Verifica se o valor digitado é do tipo double
        String input = tempo.getText();
                try {
                    tempoDouble = Double.parseDouble(input);
                    // Faça algo com o número recebido
                    System.out.println("Número recebido: " + tempoDouble);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(ConsumoEnergetico.this, "Digite um número válido", "Erro", JOptionPane.ERROR_MESSAGE);
                }
    };
     
      public String convertDouble(){
        String resultString = Double.toString(calcularConsumoEnergetico());
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
        jLabel9 = new javax.swing.JLabel();
        result_lbl = new javax.swing.JLabel();
        reloadButton = new swing.Button();
        tempo = new swing.TextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        calcButton = new swing.Button();
        potencia = new swing.TextField();
        backButton = new swing.Button();
        aboutButton = new swing.Button();
        infoButton = new swing.Button();

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

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(242, 242, 242));
        jLabel9.setText("KWh/h");

        result_lbl.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        result_lbl.setForeground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(result_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(78, 78, 78)
                .addComponent(result_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.ipadx = 113;
        gridBagConstraints.ipady = 124;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 53, 142, 0);
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
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = -10;
        gridBagConstraints.ipady = -9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 6, 0, 46);
        add(reloadButton, gridBagConstraints);

        tempo.setForeground(new java.awt.Color(242, 242, 242));
        tempo.setCaretColor(new java.awt.Color(61, 56, 56));
        tempo.setDisabledTextColor(new java.awt.Color(187, 105, 253));
        tempo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tempo.setHint("TEMPO (H)");
        tempo.setSelectedTextColor(new java.awt.Color(176, 148, 189));
        tempo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tempoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tempoFocusLost(evt);
            }
        });
        tempo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tempoMouseClicked(evt);
            }
        });
        tempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 214;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 81, 0, 0);
        add(tempo, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(242, 242, 242));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CONSUMO ENERGÉTICO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 81, 0, 0);
        add(jLabel7, gridBagConstraints);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Lamp&Config-icon(50).png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 185, 0, 0);
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
        gridBagConstraints.ipadx = 184;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 81, 0, 0);
        add(calcButton, gridBagConstraints);

        potencia.setForeground(new java.awt.Color(242, 242, 242));
        potencia.setCaretColor(new java.awt.Color(61, 56, 56));
        potencia.setDisabledTextColor(new java.awt.Color(187, 105, 253));
        potencia.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        potencia.setHint("POTÊNCIA (W)");
        potencia.setSelectedTextColor(new java.awt.Color(176, 148, 189));
        potencia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                potenciaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                potenciaFocusLost(evt);
            }
        });
        potencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                potenciaMouseClicked(evt);
            }
        });
        potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potenciaActionPerformed(evt);
            }
        });
        potencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                potenciaKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 213;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(38, 82, 0, 0);
        add(potencia, gridBagConstraints);

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
        gridBagConstraints.insets = new java.awt.Insets(44, 27, 0, 0);
        add(backButton, gridBagConstraints);

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
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(44, 6, 0, 0);
        add(aboutButton, gridBagConstraints);

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
        gridBagConstraints.insets = new java.awt.Insets(44, 225, 0, 0);
        add(infoButton, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void reloadButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reloadButtonMouseClicked
        //TODO add your handling code here:
    }//GEN-LAST:event_reloadButtonMouseClicked

    private void reloadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadButtonActionPerformed
        //Limpa a tela para calcular novamente
        potencia.setText("");
        tempo.setText("");
        potencia.setHint("POTÊNCIA (W)");
        tempo.setHint("TEMPO(MIN)");
        result_lbl.setText(" ");
        
    }//GEN-LAST:event_reloadButtonActionPerformed

    private void tempoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tempoMouseClicked
        // Recebe txtNomeUsuario
    }//GEN-LAST:event_tempoMouseClicked

    private void tempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempoActionPerformed
        //Recebe texto
        tempoDouble = Double.parseDouble(tempo.getText());
    }//GEN-LAST:event_tempoActionPerformed

    private void calcButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_calcButtonMouseClicked

    private void calcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButtonActionPerformed
        //Chama os metódos e retorna valor na tela
        testaPotencia();
        testaTempo();
        calcularConsumoEnergetico();
        result_lbl.setText(convertDouble());
    }//GEN-LAST:event_calcButtonActionPerformed

    private void button4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_button4MouseClicked

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button4ActionPerformed

    private void potenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_potenciaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_potenciaMouseClicked

    private void potenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potenciaActionPerformed
        //Recebe texto
        potenciaDouble = Double.parseDouble(potencia.getText());
    }//GEN-LAST:event_potenciaActionPerformed

    private void potenciaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_potenciaFocusGained
        // Ajusta o foco, limpa a dica
        if (potencia.getHint().equals("POTÊNCIA (W)")) {
                     potencia.setHint("");
            }
    }//GEN-LAST:event_potenciaFocusGained

    private void potenciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_potenciaFocusLost
        // Restaura a dica se não tiver nada
            if (potencia.getHint().isEmpty()) {
                    potencia.setHint("POTÊNCIA (W)");
            }
    }//GEN-LAST:event_potenciaFocusLost

    private void tempoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tempoFocusGained
        // Ajusta o foco, limpa a dica
        if (tempo.getHint().equals("TEMPO(MIN)")) {
                     tempo.setHint("");
            }
    }//GEN-LAST:event_tempoFocusGained

    private void tempoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tempoFocusLost
        // Restaura a dica se não tiver nada
            if (tempo.getHint().isEmpty()) {
                    tempo.setHint("TEMPO(MIN)");
            }
    }//GEN-LAST:event_tempoFocusLost

    private void potenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_potenciaKeyPressed
        //Ajustar foco ao pressionar Enter
        potencia.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    tempo.requestFocus();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }//GEN-LAST:event_potenciaKeyPressed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        //Executa quando o usuário quer voltar a tela Home 
        event.loginDone();
    }//GEN-LAST:event_backButtonActionPerformed

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        //Instancia tela Sobre
        event.sobreEvent();
    }//GEN-LAST:event_aboutButtonActionPerformed

    private void infoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoButtonActionPerformed
        //Executa quando o usuário quer ir a tela Info
        event.infoEvent();
    }//GEN-LAST:event_infoButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button aboutButton;
    private swing.Button backButton;
    private swing.Button button4;
    private swing.Button calcButton;
    private swing.Button infoButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private swing.TextField potencia;
    private swing.Button reloadButton;
    private javax.swing.JLabel result_lbl;
    private swing.TextField tempo;
    // End of variables declaration//GEN-END:variables
}
