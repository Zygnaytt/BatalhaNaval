
package batalhanaval.func.pecas;

import java.util.Arrays;
import java.util.Random;

public class Submarino {
    private boolean direcao, sentido;
    private int posX1, posY1, posX2, posY2;
    private final String[] posicoesSub = new String[5];
    
    public Submarino(){
        initPecas();
        initVetor();
    }
    
    private void initPecas(){
        Random aleatorio = new Random();
        //init sub1
        //random x random y random horizontal, vertical random esquerda, direita
        posX1 = aleatorio.nextInt(10);
        posY1 = aleatorio.nextInt(10);
        int dir = aleatorio.nextInt(2);
        int sen = aleatorio.nextInt(2);
        setSentidoDirecao(dir, sen);
        
        if(direcao == true){//vertical
            if((sentido == true && posY1 != 0) || (posY1 == 9)){//cima
                posY2 = posY1 - 1;
            }else{//baixo
                posY2 = posY1 + 1;
            }
            posX2 = posX1;
        }else {//horizontal
            if((sentido == true && posX1 != 0) || (posX1 == 9)){//direita
                posX2 = posX1 - 1;
            }else{//esquerda
                posX2 = posX1 + 1;
            }
            posY2 = posY1;
        }
    }
    
    private void initVetor() {
        posicoesSub[0] = Integer.toString(posX1) +"_"+ Integer.toString(posY1);
        posicoesSub[1] = Integer.toString(posX2) +"_"+ Integer.toString(posY2);
        for(int i = 2; i < posicoesSub.length; i ++){
            posicoesSub[i] = "";
        }
//        Arrays.fill(posicoesSub, "");
    }
    
    private void setSentidoDirecao(int dir, int sen){
        direcao = dir == 0;//0 = vertical      1 = horizontal
        sentido = sen == 0;//0 = baixo, esquerda 1 = cima, direita
    }

    public String[] getPosicoes(){
        return posicoesSub;
    }
    
    @Override
    public String toString(){
        String str = "";
        for(int aux = 0; aux < posicoesSub.length; aux ++)            
            str = str +" "+posicoesSub[aux];
        return str;
    }
    
    
    
}