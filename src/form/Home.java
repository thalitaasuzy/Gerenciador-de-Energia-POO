package form;

import java.awt.Color;
import swing.EventLogin;



public class Home extends javax.swing.JPanel {

/**
 *Cria novo formulário de registro e representa um painel específico para exibir conteúdo relacionado à tela inicial.
 */
   
    private EventLogin event; //Representa um evento específico relacionado ao login.
    public static Color mainColor = new Color(8, 2 ,40); //Representa a cor principal utilizada na interface gráfica.
    
   
  
    public Home() {
    /**
     * Este método é chamado de dentro do construtor para inicializar o formulário.
     */

        initComponents();
       
    }
    
     public void setEventLogin(EventLogin event) {
        this.event = event;
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        potenciaButton = new swing.Button();
        LogoutButton = new swing.Button();
        efeitoJouleButton = new swing.Button();
        consEnergeticoButton = new swing.Button();

        setBackground(new java.awt.Color(48, 19, 66));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        potenciaButton.setBackground(new java.awt.Color(80, 52, 117));
        potenciaButton.setForeground(new java.awt.Color(255, 255, 255));
        potenciaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Bateria-icon(50).png"))); // NOI18N
        potenciaButton.setText("Potencia");
        potenciaButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        potenciaButton.setMaximumSize(new java.awt.Dimension(176, 68));
        potenciaButton.setMinimumSize(new java.awt.Dimension(176, 68));
        potenciaButton.setPreferredSize(new java.awt.Dimension(176, 68));
        potenciaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                potenciaButtonMouseClicked(evt);
            }
        });
        potenciaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potenciaButtonActionPerformed(evt);
            }
        });

        LogoutButton.setBackground(new java.awt.Color(158, 85, 255));
        LogoutButton.setForeground(new java.awt.Color(255, 255, 255));
        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        efeitoJouleButton.setBackground(new java.awt.Color(80, 52, 117));
        efeitoJouleButton.setForeground(new java.awt.Color(255, 255, 255));
        efeitoJouleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Calculator-icon(48).png"))); // NOI18N
        efeitoJouleButton.setText("Efeito Joule");
        efeitoJouleButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        efeitoJouleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efeitoJouleButtonActionPerformed(evt);
            }
        });

        consEnergeticoButton.setBackground(new java.awt.Color(80, 52, 117));
        consEnergeticoButton.setForeground(new java.awt.Color(255, 255, 255));
        consEnergeticoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Lamp&Config-icon(50).png"))); // NOI18N
        consEnergeticoButton.setText("Consumo Energetico");
        consEnergeticoButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        consEnergeticoButton.setMaximumSize(new java.awt.Dimension(176, 68));
        consEnergeticoButton.setMinimumSize(new java.awt.Dimension(176, 68));
        consEnergeticoButton.setPreferredSize(new java.awt.Dimension(176, 68));
        consEnergeticoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consEnergeticoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(potenciaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(efeitoJouleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(consEnergeticoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(efeitoJouleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consEnergeticoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(potenciaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(158, 158, 158))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void potenciaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potenciaButtonActionPerformed
    //Instancia a tela Potência
        event.potenciaEvent();
    }//GEN-LAST:event_potenciaButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
    //Representa a ação de saida da tela inicial que é acionado quando o usuário faz logout.
        event.logOut();
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void potenciaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_potenciaButtonMouseClicked
   //
    }//GEN-LAST:event_potenciaButtonMouseClicked

    private void efeitoJouleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efeitoJouleButtonActionPerformed
    //Instancia a tela EfeitoJoule
        event.efeitoJouleEvent();
    }//GEN-LAST:event_efeitoJouleButtonActionPerformed

    private void consEnergeticoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consEnergeticoButtonActionPerformed
    //Instancia a tela ConsumoEnergetico
        event.consumoEnergeticoEvent();
    }//GEN-LAST:event_consEnergeticoButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button LogoutButton;
    private swing.Button consEnergeticoButton;
    private swing.Button efeitoJouleButton;
    private swing.Button potenciaButton;
    // End of variables declaration//GEN-END:variables
   
}
