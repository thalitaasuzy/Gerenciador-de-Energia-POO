package login;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import swing.EventLogin;

public class Login extends PanelCustom {

    private EventLogin event; //Utilizado para definir comportamentos específicos que ocorrem durante o processo de login

    public Login() {
        // Inicializa e configura a instância da classe Login
        initComponents();
        setAlpha(1);
    }

    public void setEventLogin(EventLogin event) {
        //Define o objeto EventLogin para o evento de login.
        this.event = event;
    }
    
    private boolean validateUser(String username, String password) {
		try (BufferedReader reader = new BufferedReader(new FileReader("logins.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(":");
				if (parts.length == 2) {
					String storedUsername = parts[0];
					String storedPassword = parts[1];
					if (storedUsername.equals(username) && storedPassword.equals(password)) {
						return true;
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        txtNomeUsuario = new swing.TextField();
        password1 = new swing.Password();
        button1 = new swing.Button();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setBackground(new java.awt.Color(242, 241, 243));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(76, 76, 76));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIGN IN");

        txtNomeUsuario.setForeground(new java.awt.Color(76, 76, 76));
        txtNomeUsuario.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtNomeUsuario.setHint("NOME DE USUÁRIO");
        txtNomeUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeUsuarioFocusLost(evt);
            }
        });
        txtNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeUsuarioActionPerformed(evt);
            }
        });
        txtNomeUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeUsuarioKeyPressed(evt);
            }
        });

        password1.setForeground(new java.awt.Color(76, 76, 76));
        password1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        password1.setHint("SENHA");
        password1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                password1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                password1FocusLost(evt);
            }
        });
        password1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password1ActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(158, 85, 255));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Entrar");
        button1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        button1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                button1KeyPressed(evt);
            }
        });

        jButton3.setForeground(new java.awt.Color(76, 76, 76));
        jButton3.setText("Esqueceu sua senha? Lembrar");
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/SignIn-icon(48).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(password1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
    //Verifica se o valor de transparência (alpha) é igual a 0 através do método getAlpha(). Recebe nome de usuário e realiza validação.
        if (getAlpha() == 0) {
            String username = txtNomeUsuario.getText();
			String password = new String(password1.getPassword());

			if (username.isEmpty() || password.isEmpty()) {
				JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos", "Campos em branco",
						JOptionPane.WARNING_MESSAGE);
			} else if (validateUser(username, password)) {
				event.loginDone();
			} else {
				JOptionPane.showMessageDialog(this, "Usuário ou senha inválidos", "Erro de autenticação",
						JOptionPane.ERROR_MESSAGE);
			}
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Ainda não incrementamos esta função. Você pode Criar uma Conta novamente ou usar o Usuário e Senha Padrões(Usuário: user; Senha: 123;)", "Lembrar senha",
		JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeUsuarioActionPerformed

    private void password1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password1ActionPerformed

    private void txtNomeUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeUsuarioFocusGained
        // Limpa o campo quando clicado
            if (txtNomeUsuario.getHint().equals("NOME DE USUÁRIO")) {
                    txtNomeUsuario.setHint("");
            }        
        
    }//GEN-LAST:event_txtNomeUsuarioFocusGained

    private void txtNomeUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeUsuarioFocusLost
        // Restaura a dica se não tiver nada
            if (txtNomeUsuario.getHint().isEmpty()) {
                    txtNomeUsuario.setHint("NOME DE USUÁRIO");
            }
    }//GEN-LAST:event_txtNomeUsuarioFocusLost

    private void password1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password1FocusGained
        // Limpa o campo quando clicado
            if (password1.getHint().equals("SENHA")) {
                    password1.setHint("");
            }
    }//GEN-LAST:event_password1FocusGained

    private void password1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password1FocusLost
        // Restaura a dica se não tiver nada
            if (password1.getHint().isEmpty()) {
                    password1.setHint("SENHA");
            }
    }//GEN-LAST:event_password1FocusLost

    private void txtNomeUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeUsuarioKeyPressed
        //Ajustar foco ao pressionar Enter
        txtNomeUsuario.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    password1.requestFocus();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        
    }//GEN-LAST:event_txtNomeUsuarioKeyPressed

    private void button1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_button1KeyPressed
        // TODO add your handling code here:s
    }//GEN-LAST:event_button1KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button button1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private swing.Password password1;
    private swing.TextField txtNomeUsuario;
    // End of variables declaration//GEN-END:variables
}
