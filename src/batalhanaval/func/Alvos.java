
package batalhanaval.func;

import batalhanaval.func.pecas.*;

public class Alvos {
    Submarino subJogador = new Submarino();
    Submarino subIA = new Submarino();
    ContraTorpedeiro ctJogador = new ContraTorpedeiro();
    ContraTorpedeiro ctIA = new ContraTorpedeiro();
    NavioTanque ntJogador = new NavioTanque();
    NavioTanque ntIA = new NavioTanque();
    PortaAviao ptJogador = new PortaAviao();
    PortaAviao ptIA = new PortaAviao();
    
    private final int xMatriz = 4;
    private final int yMatriz = 5;
    
    String[][] matrizJogador = new String[xMatriz][yMatriz];
    String[][] matrizIA = new String[xMatriz][yMatriz];
    
    public Alvos(){
        initVetores();
    }
    
    private void initVetores(){
        matrizJogador[0] = subJogador.getPosicoes();
        matrizJogador[1] = ctJogador.getPosicoes();
        matrizJogador[2] = ntJogador.getPosicoes();
        matrizJogador[3] = ptJogador.getPosicoes();
        
        matrizIA[0] = subIA.getPosicoes();
        matrizIA[1] = ctIA.getPosicoes();
        matrizIA[2] = ntIA.getPosicoes();
        matrizIA[3] = ptIA.getPosicoes();
    }
    
    
    @Override
    public String toString(){
        String strJogador = "";
        String strIA = "";
        String str="";
        
        for(int aux = 0; aux <= xMatriz-1; aux++){
            for(int aux1 = 0; aux1 <= yMatriz-1; aux1++){
                strJogador += " " + matrizJogador[aux][aux1];
                strIA += " "+ matrizIA[aux][aux1];
            }
        }
        
        str += "Jogador: " + strJogador +"\n"+"IA: "+ strIA;
        
        return str;
    }
    
    public boolean igual(String posi){
        for(String[] strV: matrizJogador){
            for(String str : strV){
                if(posi.equals(str)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public String getFullPeca(String posicao){
        for(String str : matrizJogador[0]){
            if(posicao.equals(str)){
                return "submarino";
            }                
        }
        for(String str : matrizJogador[1]){
            if(posicao.equals(str)){
                return "contratorpedeiro";
            }                
        }
        for(String str : matrizJogador[2]){
            if(posicao.equals(str)){
                return "naviotanque";
            }                
        }
        for(String str : matrizJogador[3]){
            if(posicao.equals(str)){
                return "portaaviao";
            }                
        }
        return "nada";
    }
}
