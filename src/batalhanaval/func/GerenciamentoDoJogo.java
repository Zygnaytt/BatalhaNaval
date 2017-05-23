
package batalhanaval.func;

import batalhanaval.visual.Tabuleiro;
import javax.swing.JButton;


public class GerenciamentoDoJogo {
    Jogador jogador = new Jogador();
    Jogador ia = new Jogador();
    Tabuleiro tab;
    
    
    IA maquina = new IA();
    
    private final int xMatriz = 4;
    private final int yMatriz = 5;
    
    String[][] matrizJogador = new String[xMatriz][yMatriz];
    String[][] matrizIA = new String[xMatriz][yMatriz];
    
    Botoes btnns;
    
    private int numAcertosJogador1, numAcertosJogador2;
    private boolean vezDoJogador = true;//true = jogador 1 fale = jogador 2
    
    String vencedor = "jogador";
    
    
    public GerenciamentoDoJogo(){
        initMatrizes();
    }    
    
    private void initMatrizes(){
        matrizJogador = jogador.getPosicoes();
        
        matrizIA = ia.getPosicoes();
    }
    
    public boolean acertou(int x, int y){
        String str = Integer.toString(x) +"_"+ Integer.toString(y);
        boolean ret = false;
        
        if(vezDoJogador){
            if(ia.getAlvos().igual(str)){
                ret = ia.getAlvos().igual(str);
                numAcertosJogador1++;
            }
        }else{
            if(jogador.getAlvos().igual(str)){
                ret = jogador.getAlvos().igual(str);
                numAcertosJogador2++;
            }
        }
        
        getFimDeJogo();
        
        return ret;
    }
    
    public void selecionarBotaoIA(){
        if(!vezDoJogador){
            maquina.selecionarPosicao();
            String str = maquina.toString();
            for(JButton[] btnV : tab.getQuadradinhos1()){
                for(JButton btn : btnV){
                    if((btn.getActionCommand().substring(6, 7)).equals(str.substring(0, 1))){
                        if((btn.getActionCommand().substring(8, 9)).equals(str.substring(2, 3))){
                            if(btn.isEnabled() == true){
                                btn.doClick();
                            }else{
                                selecionarBotaoIA();
                            }
                        }
                    }
                    
                }
            }
        }
        vezDoJogador = true;
    }
    
    public boolean getFimDeJogo(){
        if(numAcertosJogador1 == 14){
            vencedor = "Jogador1";
            return true;
        }else if(numAcertosJogador2 == 14){
            vencedor = "Jogador2";
            return true;
        }
        return  false;
    }
    
    
    
    public boolean getAcertou(int x, int y){
        return acertou(x, y);
    }
    
    public void setVezDoJogador(boolean bool){
        this.vezDoJogador = bool;
    }
    
    public boolean getVezDoJogador(){
        return vezDoJogador;
    }

    public int getNumAcertosJogador1() {
        return numAcertosJogador1;
    }

    public int getNumAcertosJogador2() {
        return numAcertosJogador2;
    }

    public String getVencedor() {
        return vencedor;
    }
    
    public void setTabuleiro(Tabuleiro tab){
        this.tab = tab;
    }
}
