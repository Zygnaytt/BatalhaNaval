package batalhanaval.func;


public class Jogador {
    private String[][] posicoes = new String[7][2];
    
    public void initVetor(String[] posSub, String[] posCT, String[] posNavio, String[] posPT){
        
    }

    public String getPosicoes() {
        return toString();
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
