
package batalhanaval.func;
import batalhanaval.visual.Tabuleiro;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.JButton;

public class Botoes implements ActionListener{
    GerenciamentoDoJogo gr;
    Tabuleiro tab;

    @Override
    public void actionPerformed(ActionEvent e) {
        
        System.out.println(e.getActionCommand());
        JButton button = (JButton) e.getSource();
        
        int posicaoX = Integer.parseInt(e.getActionCommand().substring(6, 7));
        int posicaoY = Integer.parseInt(e.getActionCommand().substring(8, 9));
        
        if(gr.getAcertou(posicaoX, posicaoY)){
            button.setBackground(Color.red);
            System.out.println("acertou");
        }else{
            button.setBackground(Color.lightGray);
            System.out.println("errou");
        }
        
        button.setEnabled(false);
        
        System.out.println(gr.getVezDoJogador());
        tab.habilitar(tab.getQuadradinhos1(), gr.getVezDoJogador());
        tab.habilitar(tab.getQuadradinhos2(), !gr.getVezDoJogador());
        
        gr.setVezDoJogador(!gr.getVezDoJogador());
    }
    
    public void setGerenciamento(GerenciamentoDoJogo gr){
        this.gr = gr;
    }
    
    public void setTabuleiro(Tabuleiro tab){
        this.tab = tab;
    }
}
