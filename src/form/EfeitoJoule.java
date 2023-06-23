package form;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import login.*;
import swing.EventLogin;
import javax.swing.JOptionPane;

public class EfeitoJoule extends PanelCustom {

    private EventLogin event; //Utilizado para definir comportamentos específicos.
    private double resistenciaDouble, potenciaDouble, tempoDouble, resultado;
   
    public EfeitoJoule() {
        // Inicializa e configura a instância da classe Login
        initComponents();
        setAlpha(0);
    }

    public void setEventLogin(EventLogin event) {
        //Define o objeto EventLogin para o evento de login.
        this.event = event;
    }
    
      public double calcularEfeitoJoule() {
        //Calcula Efeito Joule
        resultado = potenciaDouble * resistenciaDouble * tempoDouble;
        return resultado;
    }
    
    public void testaResistencia(){
        //Verifica se o valor digitado é do tipo double
        String input = resistencia.getText();
                try {
                    resistenciaDouble = Double.parseDouble(input);
                    // Faça algo com o número recebido
                    System.out.println("Número recebido: " + resistenciaDouble);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(EfeitoJoule.this, "Digite um número válido", "Erro", JOptionPane.ERROR_MESSAGE);
                }
    };
    
    public void testaPotencia(){
        //Verifica se o valor digitado é do tipo double
        String input = potencia.getText();
                try {
                    potenciaDouble = Double.parseDouble(input);
                    // Faça algo com o número recebido
                    System.out.println("Número recebido: " + potenciaDouble);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(EfeitoJoule.this, "Digite um número válido", "Erro", JOptionPane.ERROR_MESSAGE);
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
                    JOptionPane.showMessageDialog(EfeitoJoule.this, "Digite um número válido", "Erro", JOptionPane.ERROR_MESSAGE);
                }
    };
    
    public String convertDouble(){
        String resultString = Double.toString(calcularEfeitoJoule());
        return resultString;
    };

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tempo = new swing.TextField();
        calcButton = new swing.Button();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        result_lbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        reloadButton = new swing.Button();
        resistencia = new swing.TextField();
        potencia = new swing.TextField();
        aboutButton = new swing.Button();
        backButton1 = new swing.Button();
        infoButton = new swing.Button();

        jMenuItem1.setText("jMenuItem1");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("EFEITO JOULE");

        setBackground(new java.awt.Color(14, 6, 19));
        setLayout(new java.awt.GridBagLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Calculator-icon(48).png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 181, 0, 0);
        add(jLabel3, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(242, 242, 242));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("EFEITO JOULE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 111;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 79, 0, 0);
        add(jLabel5, gridBagConstraints);

        tempo.setForeground(new java.awt.Color(242, 242, 242));
        tempo.setCaretColor(new java.awt.Color(61, 56, 56));
        tempo.setDisabledTextColor(new java.awt.Color(187, 105, 253));
        tempo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tempo.setHint("TEMPO (MIN)");
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
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 213;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 79, 0, 0);
        add(tempo, gridBagConstraints);

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
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 183;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 79, 0, 0);
        add(calcButton, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 242, 242));
        jLabel6.setText("J");

        result_lbl.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        result_lbl.setForeground(new java.awt.Color(240, 240, 240));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(242, 242, 242));
        jLabel7.setText("Resultado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(result_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel7)
                    .addContainerGap(140, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(result_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel6))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel7)
                    .addContainerGap(185, Short.MAX_VALUE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 8;
        gridBagConstraints.ipadx = 109;
        gridBagConstraints.ipady = 69;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(49, 74, 102, 0);
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
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -10;
        gridBagConstraints.ipady = -9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(49, 6, 0, 0);
        add(reloadButton, gridBagConstraints);

        resistencia.setForeground(new java.awt.Color(242, 242, 242));
        resistencia.setCaretColor(new java.awt.Color(61, 56, 56));
        resistencia.setDisabledTextColor(new java.awt.Color(187, 105, 253));
        resistencia.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        resistencia.setHint("RESISTÊNCIA (Ω)");
        resistencia.setSelectedTextColor(new java.awt.Color(176, 148, 189));
        resistencia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                resistenciaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                resistenciaFocusLost(evt);
            }
        });
        resistencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resistenciaMouseClicked(evt);
            }
        });
        resistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resistenciaActionPerformed(evt);
            }
        });
        resistencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                resistenciaKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 213;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 79, 0, 0);
        add(resistencia, gridBagConstraints);

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
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 213;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 79, 0, 0);
        add(potencia, gridBagConstraints);

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
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 6, 0, 0);
        add(aboutButton, gridBagConstraints);

        backButton1.setBackground(new java.awt.Color(14, 6, 19));
        backButton1.setForeground(new java.awt.Color(204, 204, 204));
        backButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Voltar-icon(20).png"))); // NOI18N
        backButton1.setText("Voltar");
        backButton1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 6, 0, 0);
        add(backButton1, gridBagConstraints);

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
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 297, 0, 0);
        add(infoButton, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void tempoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tempoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tempoMouseClicked

    private void tempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempoActionPerformed
        // TODO add your handling code here:
        tempoDouble = Double.parseDouble(tempo.getText());
    }//GEN-LAST:event_tempoActionPerformed

    private void calcButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_calcButtonMouseClicked

    private void calcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButtonActionPerformed
        //Chama os metódos e retorna valor na tela
        testaResistencia();
        testaPotencia();
        testaTempo();
        calcularEfeitoJoule();
        result_lbl.setText(convertDouble());
    }//GEN-LAST:event_calcButtonActionPerformed

    private void reloadButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reloadButtonMouseClicked
        //TODO add your handling code here:
    }//GEN-LAST:event_reloadButtonMouseClicked

    private void reloadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadButtonActionPerformed
        //Limpa a tela para calcular novamente
        resistencia.setText("");
        potencia.setText("");
        tempo.setText("");
        resistencia.setHint("RESISTÊNCIA (Ω)");
        potencia.setHint("POTÊNCIA (W)");
        tempo.setHint("TEMPO(MIN)");
        result_lbl.setText(" ");
        
    }//GEN-LAST:event_reloadButtonActionPerformed

    private void resistenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resistenciaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_resistenciaMouseClicked

    private void resistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resistenciaActionPerformed
        //Recebe valor
        resistenciaDouble = Double.parseDouble(resistencia.getText());
    }//GEN-LAST:event_resistenciaActionPerformed

    private void potenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_potenciaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_potenciaMouseClicked

    private void potenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potenciaActionPerformed
        //Recebe valor
        potenciaDouble = Double.parseDouble(potencia.getText());
    }//GEN-LAST:event_potenciaActionPerformed

    private void resistenciaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_resistenciaFocusGained
        // Ajusta o foco, limpa a dica
        if (resistencia.getHint().equals("RESISTÊNCIA (Ω)")) {
                    resistencia.setHint("");
            }  
    }//GEN-LAST:event_resistenciaFocusGained

    private void resistenciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_resistenciaFocusLost
        // Restaura a dica se não tiver nada
            if (resistencia.getHint().isEmpty()) {
                    resistencia.setHint("RESISTÊNCIA (Ω)");
            }
    }//GEN-LAST:event_resistenciaFocusLost

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

    private void resistenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resistenciaKeyPressed
        //Ajustar foco ao pressionar Enter
        resistencia.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    potencia.requestFocus();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }//GEN-LAST:event_resistenciaKeyPressed

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

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        //Instancia tela Sobre
        event.sobreEvent();
    }//GEN-LAST:event_aboutButtonActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        //Executa quando o usuário quer voltar a tela Home 
        event.loginDone();
    }//GEN-LAST:event_backButton1ActionPerformed

    private void infoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoButtonActionPerformed
        //Executa quando o usuário quer ir a tela Info
        event.infoEvent();
    }//GEN-LAST:event_infoButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button aboutButton;
    private swing.Button backButton1;
    private swing.Button calcButton;
    private swing.Button infoButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private swing.TextField potencia;
    private swing.Button reloadButton;
    private swing.TextField resistencia;
    private javax.swing.JLabel result_lbl;
    private swing.TextField tempo;
    // End of variables declaration//GEN-END:variables
}
