
package batalhanaval.func;
import batalhanaval.visual.Tabuleiro;
import batalhanaval.visual.TelaPrincipal;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.JButton;

public class Botoes implements ActionListener{
    GerenciamentoDoJogo gr;
    Tabuleiro tab;
    TelaPrincipal tp;
    
    JButton button;

    @Override
    public void actionPerformed(ActionEvent e) {
        button = (JButton) e.getSource();
        
        int posicaoX = Integer.parseInt(e.getActionCommand().substring(6, 7));
        int posicaoY = Integer.parseInt(e.getActionCommand().substring(8, 9));
        
        if(gr.getAcertou(posicaoX, posicaoY)){
            button.setBackground(Color.red);
        }else{
            button.setBackground(Color.lightGray);
        }
        
        if(gr.getFimDeJogo()){
            tp.fimDeJogo();
        }
        
        button.setEnabled(false);
        
        tab.habilitar(tab.getQuadradinhos1(), gr.getVezDoJogador());
        
        gr.setVezDoJogador(!gr.getVezDoJogador());
        if(e.getActionCommand().substring(0, 4).equals("tab2")){
            gr.selecionarBotaoIA();
        }
    }
    
    public void setGerenciamento(GerenciamentoDoJogo gr){
        this.gr = gr;
    }
    
    public void setTabuleiro(Tabuleiro tab){
        this.tab = tab;
    }
    
    public void setTela(TelaPrincipal tela){
        this.tp = tela;
    }

    public JButton getButton() {
        return button;
    }
    
}
