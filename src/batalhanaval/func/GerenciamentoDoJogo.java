
package batalhanaval.func;


public class GerenciamentoDoJogo {
    Jogador jogador = new Jogador();
    Jogador ia = new Jogador();
    
    private final int xMatriz = 4;
    private final int yMatriz = 5;
    
    String[][] matrizJogador = new String[xMatriz][yMatriz];
    String[][] matrizIA = new String[xMatriz][yMatriz];
    
    Alvos alvos = new Alvos();
    private int numAcertosJogador1, numAcertosJogador2;
    private boolean vezDoJogador = true;//true = jogador 1 fale = jogador 2
    
    
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
            if(alvos.igual(matrizIA, str)){
                ret = alvos.igual(matrizIA, str);
                numAcertosJogador1++;
            }
        }else{
            if(alvos.igual(matrizJogador, str)){
                ret = alvos.igual(matrizJogador, str);
                numAcertosJogador2++;
            }
        }
        
        return ret;
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
}
