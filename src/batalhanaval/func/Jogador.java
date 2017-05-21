package batalhanaval.func;

import batalhanaval.func.pecas.*;


public class Jogador {
    Submarino subJogador = new Submarino();
    ContraTorpedeiro ctJogador = new ContraTorpedeiro();
    NavioTanque ntJogador = new NavioTanque();
    PortaAviao ptJogador = new PortaAviao();
    
    private final String[][] posicoes = new String[4][5];
    
    public Jogador(){
        initMatriz(subJogador.getPosicoes(), ctJogador.getPosicoes(), ntJogador.getPosicoes(), ptJogador.getPosicoes());
    }
    
    public void initMatriz(String[] posSub, String[] posCT, String[] posNavio, String[] posPT){
        posicoes[0] = posSub;
        posicoes[1] = posCT;
        posicoes[2] = posNavio;
        posicoes[3] = posPT;
    }

    public String[][] getPosicoes() {
        return posicoes;
    }
    
    @Override
    public String toString(){
        String str = "";
        for(int aux = 0; aux < posicoes.length; aux++){
            for(int aux1 = 0; aux1 < posicoes.length; aux1++){
                str = "\n"+ str +" "+ posicoes[aux][aux1];
            }
        }
        return str;
    }
}
