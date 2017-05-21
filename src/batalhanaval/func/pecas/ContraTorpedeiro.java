
package batalhanaval.func.pecas;

import java.util.Random;


public class ContraTorpedeiro {
    private boolean direcao, sentido;
    private int posX1, posY1, posX2, posY2, posX3, posY3;
    private final String[] posicoesCT = new String[5];
    
    public ContraTorpedeiro(){
        initPecas();
        initVetor();
    }
    
    private void initPecas(){
        Random aleatorio = new Random();
        posY2 = 0;
        posY3 = 0;
        posX2 = 0;
        posX3 = 0;
        //init sub1
        //random x random y random horizontal, vertical random esquerda, direita
        posX1 = aleatorio.nextInt(10);
        posY1 = aleatorio.nextInt(10);
        int dir = aleatorio.nextInt(2);
        int sen = aleatorio.nextInt(2);
        setSentidoDirecao(dir, sen);
        
        if(direcao == true){//vertical
            if((sentido == true && posY1 != 0) || ((posY1 <= 9)&&(posY1 >= 8))
                    //|| (posY2 == 8)
                    ){//cima
                posY2 = posY1 - 1;
                posY3 = posY2 - 1;
            }else{//baixo
                posY2 = posY1 + 1;
                posY3 = posY2 + 1;
            }
            posX2 = posX1;
            posX3 = posX2;
        }else {//horizontal
            if((sentido == true && posX1 != 0) || ((posX1 <= 9)&&(posX1 >= 8))
                    //|| (posX2 == 8)
                    ){//direita
                posX2 = posX1 - 1;
                posX3 = posX2 -1;
            }else{//esquerda
                posX2 = posX1 + 1;
                posX3 = posX2 + 1;
            }
            posY2 = posY1;
            posY3 = posY2;
        }
    }
    
    private void initVetor() {
        posicoesCT[0] = Integer.toString(posX1) +"_"+ Integer.toString(posY1);
        posicoesCT[1] = Integer.toString(posX2) +"_"+ Integer.toString(posY2);
        posicoesCT[2] = Integer.toString(posX3) +"_"+ Integer.toString(posY3); 
        for(int i = 3; i < posicoesCT.length; i ++){
            posicoesCT[i] = "";
        }
//        Arrays.fill(posicoesCT, "");       
    }
    
    private void setSentidoDirecao(int dir, int sen){
        direcao = dir == 0;//0 = vertical      1 = horizontal
        sentido = sen == 0;//0 = baixo, esquerda 1 = cima, direita
    }
    
    @Override
    public String toString(){
        String str = "";
        for(int aux = 0; aux < posicoesCT.length; aux ++)            
            str = str +" "+posicoesCT[aux];
        return str;
    }
    
    public String[] getPosicoes(){
        return posicoesCT;
    }
    
    public boolean getDirecao() {
        return direcao;
    }

    public boolean getSentido() {
        return sentido;
    }

    public int getPosX1() {
        return posX1;
    }

    public int getPosY1() {
        return posY1;
    }

    public int getPosX2() {
        return posX2;
    }

    public int getPosY2() {
        return posY2;
    }

    public int getPosX3() {
        return posX3;
    }

    public int getPosY3() {
        return posY3;
    }
}
