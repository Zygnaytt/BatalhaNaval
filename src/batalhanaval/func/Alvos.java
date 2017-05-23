package batalhanaval.func;

import batalhanaval.func.pecas.*;

public class Alvos {
    Submarino submarino = new Submarino();
    ContraTorpedeiro contratorpedeiro = new ContraTorpedeiro();
    NavioTanque naviotanque = new NavioTanque();
    PortaAviao portaviao = new PortaAviao();
        
    private final String[][] posicoes = new String[4][5];
    
    public Alvos(){
        initMatriz();
    }
    
    private void posicoesValidas(){
        for(int i = 0; i < portaviao.getPosicoes().length; i++){
            if((naviotanque.getPosicoes()[i].equals(portaviao.getPosicoes()[i]))
                || (contratorpedeiro.getPosicoes()[i].equals(portaviao.getPosicoes()[i])
                || (submarino.getPosicoes()[i].equals(portaviao.getPosicoes()[i])))){
                reiniciar();
            }
        }
        for(int i = 0; i < naviotanque.getPosicoes().length; i++){
            if((contratorpedeiro.getPosicoes()[i].equals(portaviao.getPosicoes()[i])
                || (submarino.getPosicoes()[i].equals(portaviao.getPosicoes()[i])))){
                reiniciar();
            }
        }
        for(int i = 0; i < contratorpedeiro.getPosicoes().length; i++){
            if(((submarino.getPosicoes()[i].equals(portaviao.getPosicoes()[i])))){
                reiniciar();
            }
        }
    }
    
    private void reiniciar(){
        System.out.println("reiniciado");
        submarino = new Submarino();
        contratorpedeiro = new ContraTorpedeiro();
        naviotanque = new NavioTanque();
        portaviao = new PortaAviao();
        posicoesValidas();
    }
    
    private void initMatriz(){
        posicoesValidas();
        posicoes[0] = submarino.getPosicoes();
        posicoes[1] = contratorpedeiro.getPosicoes();
        posicoes[2] = naviotanque.getPosicoes();
        posicoes[3] = portaviao.getPosicoes();
    }
    
    public boolean igual(String posi){
        for(String[] strV: posicoes){
            for(String str : strV){
                if(posi.equals(str)){
                    return true;
                }
            }
        }
        return false;
    }

    public Submarino getSubmarino() {
        return submarino;
    }

    public ContraTorpedeiro getContratorpedeiro() {
        return contratorpedeiro;
    }

    public NavioTanque getNaviotanque() {
        return naviotanque;
    }

    public PortaAviao getPortaviao() {
        return portaviao;
    }

    public String[][] getPosicoes() {
        return posicoes;
    }
    
    
}
