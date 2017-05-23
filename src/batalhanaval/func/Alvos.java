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
        if(!submarinoValido()){
            reiniciar();
        }
        if(!contratorpedeiroValido()){
            reiniciar();
        }
        if(!naviotanqueValido()){
            reiniciar();
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
    
    private boolean submarinoValido(){
        for (int i = 0; i < portaviao.getPosicoes().length; i++) {
            if((submarino.getPosicoes()[0].equals(contratorpedeiro.getPosicoes()[i]))
            ||(submarino.getPosicoes()[1].equals(contratorpedeiro.getPosicoes()[i]))){
                return false;
            }
            if((submarino.getPosicoes()[0].equals(naviotanque.getPosicoes()[i]))
            ||(submarino.getPosicoes()[1].equals(naviotanque.getPosicoes()[i]))){
                return false;
            }
            if((submarino.getPosicoes()[0].equals(portaviao.getPosicoes()[i]))
            ||(submarino.getPosicoes()[1].equals(portaviao.getPosicoes()[i]))){
                return false;
            }
        }
        return true;
    }
    
    private boolean contratorpedeiroValido(){
        for (int i = 0; i < portaviao.getPosicoes().length; i++) {
            if((contratorpedeiro.getPosicoes()[0].equals(naviotanque.getPosicoes()[i]))
            ||(contratorpedeiro.getPosicoes()[1].equals(naviotanque.getPosicoes()[i]))
            ||(contratorpedeiro.getPosicoes()[2].equals(naviotanque.getPosicoes()[i]))){
                return false;
            }
            if((contratorpedeiro.getPosicoes()[0].equals(portaviao.getPosicoes()[i]))
            ||(contratorpedeiro.getPosicoes()[1].equals(portaviao.getPosicoes()[i]))
            ||(contratorpedeiro.getPosicoes()[2].equals(portaviao.getPosicoes()[i]))){
                return false;
            }
        }
        return true;
    }
    private boolean naviotanqueValido(){
        for (int i = 0; i < portaviao.getPosicoes().length; i++) {
            if((naviotanque.getPosicoes()[0].equals(portaviao.getPosicoes()[i]))
            ||(naviotanque.getPosicoes()[1].equals(portaviao.getPosicoes()[i]))
            ||(naviotanque.getPosicoes()[2].equals(portaviao.getPosicoes()[i]))){
                return false;
            }
        }
        return true;
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
    
    @Override
    public String toString(){
        String str = "";
        
        for(String[] strV : posicoes){
            for(String stri : strV){
                str += " "+stri;
            }
        }
        return str;
    }
}
