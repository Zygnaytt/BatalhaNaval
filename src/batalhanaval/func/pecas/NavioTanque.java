
package batalhanaval.func.pecas;

import java.util.Random;


public class NavioTanque {
    private boolean direcao, sentido;
    private int posX1, posY1, posX2, posY2, posX3, posY3, posX4, posY4;
    private final String[] posicoesNT = new String[5];
    
    public NavioTanque(){
        initPecas();
        initVetor();
    }
    
    private void initPecas(){
        Random aleatorio = new Random();
        posY2 = 0;
        posY3 = 0;
        posY4 = 0;
        posX2 = 0;
        posX3 = 0;
        posX4 = 0;
        //init sub1
        //random x random y random horizontal, vertical random esquerda, direita
        posX1 = aleatorio.nextInt(10);
        posY1 = aleatorio.nextInt(10);
        int dir = aleatorio.nextInt(2);
        int sen = aleatorio.nextInt(2);
        setSentidoDirecao(dir, sen);
        
        if(direcao == true){//vertical
            if((sentido == true && posY1 >= 3) || ((posY1 >= 7)&&(posY1 <= 9))
                    //|| (posY3 == 7)
                    ){//cima
                posY2 = posY1 - 1;
                posY3 = posY2 - 1;
                posY4 = posY3 - 1;
            }else{//baixo
                posY2 = posY1 + 1;
                posY3 = posY2 + 1;
                posY4 = posY3 + 1;
            }
            posX2 = posX1;
            posX3 = posX2;
            posX4 = posX3;
        }else {//horizontal
            if((sentido == true && posX1 >= 3) || ((posX1 >= 7)&&(posX1 <= 9))
                    //|| (posX2 == 8)|| (posX3 == 7)
                    ){//direita
                posX2 = posX1 - 1;
                posX3 = posX2 - 1;
                posX4 = posX3 - 1;
            }else{//esquerda
                posX2 = posX1 + 1;
                posX3 = posX2 + 1;
                posX4 = posX3 + 1;
            }
            posY2 = posY1;
            posY3 = posY2;
            posY4 = posY3;
        }
    }
    
    private void initVetor() {
        posicoesNT[0] = Integer.toString(posX1) +"_"+ Integer.toString(posY1);
        posicoesNT[1] = Integer.toString(posX2) +"_"+ Integer.toString(posY2);
        posicoesNT[2] = Integer.toString(posX3) +"_"+ Integer.toString(posY3);
        posicoesNT[3] = Integer.toString(posX4) +"_"+ Integer.toString(posY4);
        posicoesNT[4] = "";
//        Arrays.fill(posicoesNT, "");
    }
    
    private void setSentidoDirecao(int dir, int sen){
        direcao = dir == 0;//0 = vertical      1 = horizontal
        sentido = sen == 0;//0 = baixo, esquerda 1 = cima, direita
    }
    
    @Override
    public String toString(){
        String str = "";
        for(int aux = 0; aux < posicoesNT.length; aux ++)            
            str = str +" "+posicoesNT[aux];
        return str;
    }
    
    public String[] getPosicoes(){
        return posicoesNT;
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

    public int getPosX4() {
        return posX4;
    }

    public int getPosY4() {
        return posY4;
    }
}
