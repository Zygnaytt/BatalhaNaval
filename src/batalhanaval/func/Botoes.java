
package batalhanaval.func;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.JButton;

public class Botoes implements ActionListener{
    GerenciamentoDoJogo gr = new GerenciamentoDoJogo();

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        JButton button = (JButton) e.getSource();
        
        int posicaoX = Integer.parseInt(e.getActionCommand().substring(6, 7));
        int posicaoY = Integer.parseInt(e.getActionCommand().substring(8, 9));
        
        if(gr.getAcertou(posicaoX, posicaoY))
            button.setBackground(Color.red);
        button.setEnabled(false);
    }
}
