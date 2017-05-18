
package batalhanaval.func;


public class GerenciamentoDoJogo {
    Alvos alvos = new Alvos();
    private int numAcertosIA, numAcertos;
    
    public GerenciamentoDoJogo(){
        
    }    
    
    private void initJogo(){
        
    }
    
    private void initPosicoes(){
        
    }  
    
    public boolean vezDeQuem(){
        return false;
    }
    
    
    public boolean acertou(int x, int y){
        String str = Integer.toString(x) +"_"+ Integer.toString(y);
        System.out.println(str);
        return alvos.igual(str);
    }
    public boolean getAcertou(int x, int y){
        return acertou(x, y);
    }
}
