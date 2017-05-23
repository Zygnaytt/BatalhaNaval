package batalhanaval.visual;

import javax.swing.*;
public class TelaPrincipal {
    private final Tabuleiro tabuleiro = new Tabuleiro();
    private final int largura = 1040;
    private final int altura = 550;
    private JFrame tela;
    
    
    public void initComponents(){
        initTela();
        tabuleiro.habilitar(tabuleiro.getQuadradinhos1(), false);
        tabuleiro.getBtnns().setTela(this);
        tela.add(tabuleiro.getPainel());
        //FINALIZACAO DA INICIALIZACAO
        tela.setVisible(true);
    }
    
    private void initTela(){
        //INICIALIZACAO DA TELA
        tela = new JFrame("Batalha Naval");
        tela.setSize(largura, altura);
        tela.setLocationRelativeTo(null);
        tela.setResizable(false);
        tela.setIconImage(new ImageIcon(getClass().getResource("icone.png")).getImage());
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }
    
    public void fimDeJogo(){
        JOptionPane.showMessageDialog(null, "Parabéns "+tabuleiro.getGerenciamento().getVencedor()+" você ganhou!!!\n Aperte o botão para fechar o jogo.", "GameOver", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("iconeExplodido.png")));
        System.exit(0);
    }    
    public int getAltura(){
        return this.altura;
    }
    public int getLargura(){
        return this.largura;
    }
    public JFrame getTela(){
        return this.tela;
    }
}
