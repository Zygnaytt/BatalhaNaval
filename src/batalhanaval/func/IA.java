package batalhanaval.func;

import java.util.Random;
//classe não utilizada
public class IA {
    private final int[] posicao = new int[2];
    
    public IA(){
        selecionarPosicao();
    }
    
    private int[] selecionarPosicao(){
        Random rdm = new Random();
        posicao[0] = rdm.nextInt(10);
        posicao[1] = rdm.nextInt(10);
        
        return posicao;
    }
    
    @Override
    public String toString(){
        String str = "";
        str = Integer.toString(posicao[0])+"_"+Integer.toString(posicao[1]);
        return str;
    }
}
