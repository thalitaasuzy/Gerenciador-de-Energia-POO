package main;

import form.ConsumoEnergetico;
import form.EfeitoJoule;
import form.Home;
import form.Info;
import swing.EventLogin;
import form.Potencia;
import form.Sobre;

/**
 *
 * @author RAVEN
 */
public class Main extends javax.swing.JFrame {
//Representa a janela principal do sistema.

    private Home home; //Objeto home do tipo Home representa a tela ou painel principal do sistema.
    private Potencia potencia;
    private EfeitoJoule efeitoJoule;
    private ConsumoEnergetico consumoEnergetico;
    private Sobre sobre;
    private Info info;
    
    public Main() {
    //O construtor Main() é responsável por inicializar uma nova instância da classe Main.
        initComponents();
        home = new Home();
        potencia = new Potencia();
        efeitoJoule = new EfeitoJoule();
        consumoEnergetico = new ConsumoEnergetico();
        sobre = new Sobre();
        info = new Info();
        EventLogin event = new EventLogin() {
        // Personalizado queimplementa os métodos loginDone() e logOut().
            @Override
            public void loginDone() {
            //Executada ao concluir login, remove todos os componentes do painel principal (main), adiciona o painel home, e realiza a revalidação e repintura do painel principal.
                main.removeAll();
                main.add(home);
                main.revalidate();
                main.repaint();
            }

            @Override
            public void logOut() {
            //Executada ao fazer logout. Atualiza a interface do usuário após o logout, exibindo o painel de login e registro.
                main.removeAll();
                main.add(loginAndRegister1);
                main.revalidate();
                main.repaint();
            }
            
            @Override
            public void potenciaEvent(){
               main.removeAll();
               main.add(potencia);
               main.revalidate();
               main.repaint();
            };
            
            @Override
            public void efeitoJouleEvent(){
               main.removeAll();
               main.add(efeitoJoule);
               main.revalidate();
               main.repaint();
            };
            
            @Override
            public void consumoEnergeticoEvent(){
               main.removeAll();
               main.add(consumoEnergetico);
               main.revalidate();
               main.repaint();
            };
            
            @Override
            public void sobreEvent(){
               main.removeAll();
               main.add(sobre);
               main.revalidate();
               main.repaint();
            };
            
            @Override
            public void infoEvent(){
               main.removeAll();
               main.add(info);
               main.revalidate();
               main.repaint();
            };
        };
        loginAndRegister1.setEventLogin(event); //Associa o objeto EventLogin ao componente loginAndRegister1.
        home.setEventLogin(event); //Associa o objeto EventLogin ao componente home.
        potencia.setEventLogin(event);
        efeitoJoule.setEventLogin(event);
        consumoEnergetico.setEventLogin(event);
        sobre.setEventLogin(event);
        info.setEventLogin(event);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        loginAndRegister1 = new login.LoginAndRegister();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setLayout(new java.awt.BorderLayout());
        main.add(loginAndRegister1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 1322, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //Metodo principal, inicia a execução do sistema.
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //Cria uma nova instância da classe Main e torná-a visível.
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private login.LoginAndRegister loginAndRegister1;
    private javax.swing.JPanel main;
    // End of variables declaration//GEN-END:variables
}
