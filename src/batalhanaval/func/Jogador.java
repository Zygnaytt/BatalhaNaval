package batalhanaval.func;

public class Jogador {
    Alvos alvos = new Alvos();
    
    private String[][] posicoes = alvos.getPosicoes();    

    public Jogador(){
        //posicoes = alvos.getPosicoes();
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

    public Alvos getAlvos() {
        return alvos;
    }
    
}
