package login;

/* Pacote para tela de login e registro

*/


import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JComponent;

public class PanelCustom extends JComponent {
    //Classe PanelCustomrepresenta representa um painel personalizado que é utilizado para criar uma interface gráfica personalizada.

    public float getAlpha() {
    //Obtém o valor de transparência (alpha).
        return alpha;
    }

    public void setAlpha(float alpha) {
    //Define o valor de transparência (alpha).
        this.alpha = alpha;
    }

    public PanelCustom() {
    //Construtor da classe PanelCustom.
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
    //Método sobrescrito da classe PanelCustom que define como o componente será desenhado na interface gráfica.
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 10, 10));
        g2.dispose();
        super.paintComponent(grphcs);
    }

    private float alpha; //Valor de transparência (alpha).

    @Override
    public void paint(Graphics grphcs) {
    //Método sobrescrito da classe PanelCustom que define como o componente será desenhado na interface gráfica.
        super.paint(grphcs);
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha * 0.8f));
        g2.setColor(LoginAndRegister.mainColor);
        g2.fill(new Rectangle2D.Double(0, 0, getWidth(), getHeight()));
        g2.dispose();
    }
}
