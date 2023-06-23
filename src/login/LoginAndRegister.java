package login;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import org.jdesktop.animation.timing.interpolation.PropertySetter;
import swing.EventLogin;

public class LoginAndRegister extends javax.swing.JPanel {
    /**
     * Cria novo formulário LoginAndRegister
     */

    private MigLayout layout; //Responsável por controlar o posicionamento e o dimensionamento dos componentes em um container
    private Register register; //Representa uma parte da interface gráfica que permite ao usuário realizar o registro no sistema.
    private Login login; //representa uma parte da interface gráfica que permite ao usuário efetuar o login no sistema.
    private Animator animator; //Responsável por controlar as animações
    private boolean isLogin; //Representa o estado de exibição da tela de login.
    public static Color mainColor = new Color(83, 52 ,102); //Representa a cor principal utilizada na interface gráfica.
    
    
    public void setAnimate(int animate) {
       layout.setComponentConstraints(register, "pos (50%)-290px-" + animate + " 0.5al n n");
        layout.setComponentConstraints(login, "pos (50%)-10px+" + animate + " 0.5al n n");
        if (animate == 30) {
            if (isLogin) {
                setComponentZOrder(login, 0);
            } else {
                setComponentZOrder(register, 0);
            }
        }
        revalidate();
    }
    
    /*Define o modo de animação com base no valor inteiro fornecido e configura as restrições de posicionamento dos componentes relacionados, como "register" e "login", usando a classe Layout. 
    * Se o valor de "animate" for igual a 30, o método também verifica se o login está ativo ou não. */
     

    public LoginAndRegister() {
        initComponents();
        init();
        initAnimator();
    }
    
    /**
     * Este método é chamado de dentro do construtor para inicializar o formulário.
     */

    private void initAnimator() {
    //Inicializa animação dos componentes Login e Registro.
        animator = new Animator(1000, new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                if (isLogin) {
                    register.setAlpha(fraction);
                    login.setAlpha(1f - fraction);
                } else {
                    register.setAlpha(1f - fraction);
                    login.setAlpha(fraction);
                }
            }
        });
        animator.addTarget(new PropertySetter(this, "animate", 0, 30, 0));
        animator.setResolution(0);
    }

    private void init() {
    //Inicializa componentes.
        setBackground(mainColor);
        layout = new MigLayout("fill", "fill", "fill");
        setLayout(layout);
        register = new Register();
        login = new Login();
        applyEvent(register, false);
        applyEvent(login, true);
        add(register, "pos (50%)-290px 0.5al n n");
        add(login, "pos (50%)-10px 0.5al n n");
        register.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    showLogin(false);
                }
            }
        });
        login.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    showLogin(true);
                }
            }
        });
    }
    

    public void showLogin(boolean show) {
    /*Exibe ou oculta a tela de login com base no valor booleano fornecido como parâmetro. Se o valor de "show" for
    * diferente do estado atual de exibição da tela de login (isLogin), o método verifica se o animador (animator)
    * não está em execução. Caso essas condições sejam atendidas, o estado de exibição da tela de login (isLogin) é 
    * atualizado com o novo valor e o animador é iniciado (animator.start()) para realizar a transição de exibição. */ 
        if (show != isLogin) {
            if (!animator.isRunning()) {
                isLogin = show;
                animator.start();
            }
        }
    }

    private void applyEvent(JComponent panel, boolean login) {
    /*Aplica um evento de clique aos componentes contidos em um painel. Cada componente é percorrido por meio 
    * de um loop, e um objeto MouseAdapter é adicionado como ouvinte de eventos de clique para cada componente. */
        for (Component com : panel.getComponents()) {
            com.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent me) {
                    showLogin(login);
                }
            });
        }
    }

    public void setEventLogin(EventLogin event) {
    /*Define o objeto EventLogin para o componente de login. Isso possibilita 
    * associar um determinado evento ou comportamento personalizado ao componente de login. */
        login.setEventLogin(event);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
