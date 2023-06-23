package login;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;



public class Register extends PanelCustom {
  
    /** 
    * Cria novo formulário de registro
    */
    public Register() {
        initComponents();
        setFocusable(true);
        requestFocusInWindow();
    }
    
    /**
     * Este método é chamado de dentro do construtor para inicializar o formulário.
     */
    
    private boolean isUsernameAvailable(String username) {
		try (BufferedReader reader = new BufferedReader(new FileReader("logins.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(":");
				if (parts.length > 0 && parts[0].equals(username)) {
					return false; // Usuário já existe
				}
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return true; // Usuário não existe
	}
    
    private void saveUser(String username, String password) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("logins.txt", true))) {
			writer.write(username + ":" + password);
			writer.newLine();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNomeUsuario = new swing.TextField();
        password1 = new swing.Password();
        button1 = new swing.Button();
        confirmPassword = new swing.Password();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(37, 17, 49));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIGN UP");

        txtNomeUsuario.setForeground(new java.awt.Color(242, 242, 242));
        txtNomeUsuario.setCaretColor(new java.awt.Color(61, 56, 56));
        txtNomeUsuario.setDisabledTextColor(new java.awt.Color(187, 105, 253));
        txtNomeUsuario.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtNomeUsuario.setHint("NOME DE USUÁRIO");
        txtNomeUsuario.setSelectedTextColor(new java.awt.Color(176, 148, 189));
        txtNomeUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeUsuarioFocusLost(evt);
            }
        });
        txtNomeUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNomeUsuarioMouseClicked(evt);
            }
        });
        txtNomeUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeUsuarioKeyPressed(evt);
            }
        });

        password1.setForeground(new java.awt.Color(242, 242, 242));
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
        password1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                password1InputMethodTextChanged(evt);
            }
        });
        password1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                password1KeyPressed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(158, 85, 255));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Cadastrar");
        button1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        button1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                button1FocusGained(evt);
            }
        });
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });
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

        confirmPassword.setForeground(new java.awt.Color(242, 242, 242));
        confirmPassword.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        confirmPassword.setHint("CONFIRMAR SENHA");
        confirmPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmPasswordFocusLost(evt);
            }
        });
        confirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordActionPerformed(evt);
            }
        });
        confirmPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                confirmPasswordKeyPressed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/SignUp-icon(48).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void confirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordActionPerformed
        //Recebe ConfirmPassword
        confirmPassword.getPassword();
    }//GEN-LAST:event_confirmPasswordActionPerformed

    private void password1ActionPerformed(java.awt.event.ActionEvent evt) {                                                
       // Recebe password1
        password1.getPassword();
    }
    
    private void txtNomeUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeUsuarioMouseClicked
       // Recebe txtNomeUsuario
        txtNomeUsuario.getText();
    }//GEN-LAST:event_txtNomeUsuarioMouseClicked

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
    //Validação de senha de registro: Compara se password1 e confirmPassword são iguais, exibindo uma mensagem
    String username = txtNomeUsuario.getText();
    String password = new String(password1.getPassword());
    String confirmPassword1 = new String(confirmPassword.getPassword());
    if (username.isEmpty() || password.isEmpty() || confirmPassword1.isEmpty()) {
	JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
    } else if (!password.equals(confirmPassword1)) {
        JOptionPane.showMessageDialog(null, "As senhas estão diferentes.");
    } else if (isUsernameAvailable(username)) {
        saveUser(username, password);
        JOptionPane.showMessageDialog(null, "Sua conta foi registrada!");
    } else {
        JOptionPane.showMessageDialog(null, "Esse usuário já existe, tente outro.");
        }
 
    }//GEN-LAST:event_button1MouseClicked

    private void password1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_password1InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_password1InputMethodTextChanged

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    private void txtNomeUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeUsuarioFocusGained
        // Limpa o campo quando clicado
            if (txtNomeUsuario.getHint().equals("NOME DE USUÁRIO")) {
                    txtNomeUsuario.setHint("");
            }
    }//GEN-LAST:event_txtNomeUsuarioFocusGained

    private void password1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password1FocusGained
        // Limpa o campo quando clicado
            if (password1.getHint().equals("SENHA")) {
                    password1.setHint("");
            }
    }//GEN-LAST:event_password1FocusGained

    private void confirmPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmPasswordFocusGained
        // Limpa o campo quando clicado
            if (confirmPassword.getHint().equals("CONFIRMAR SENHA")) {
                    confirmPassword.setHint("");
            }
    }//GEN-LAST:event_confirmPasswordFocusGained

    private void button1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_button1FocusGained
        //Ajusta foco para o botão
        button1.requestFocusInWindow();
    }//GEN-LAST:event_button1FocusGained

    private void confirmPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmPasswordFocusLost
        // Restaura a dica se não tiver nada
            if (confirmPassword.getHint().isEmpty()) {
                    confirmPassword.setHint("CONFIRMAR SENHA");
            }
    }//GEN-LAST:event_confirmPasswordFocusLost

    private void password1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password1FocusLost
       // Restaura a dica se não tiver nada
            if (password1.getHint().isEmpty()) {
                    password1.setHint("SENHA");
            }
    }//GEN-LAST:event_password1FocusLost

    private void txtNomeUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeUsuarioFocusLost
        // Restaura a dica se não tiver nada
            if (txtNomeUsuario.getHint().isEmpty()) {
                    txtNomeUsuario.setHint("NOME DE USUÁRIO");
            }
    }//GEN-LAST:event_txtNomeUsuarioFocusLost

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

    private void password1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password1KeyPressed
        //Ajustar foco ao pressionar Enter
        password1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    confirmPassword.requestFocus();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        
    }//GEN-LAST:event_password1KeyPressed

    private void confirmPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmPasswordKeyPressed
        //Transferir foco para o botão
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                button1.requestFocusInWindow();
            }
    }//GEN-LAST:event_confirmPasswordKeyPressed

    private void button1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_button1KeyPressed
        // Botão ser ativado com a tecla enter - AINDA NN FUNCIONA
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    button1.doClick();
                }
    }//GEN-LAST:event_button1KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button button1;
    private swing.Password confirmPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private swing.Password password1;
    private swing.TextField txtNomeUsuario;
    // End of variables declaration//GEN-END:variables
}
