package batalhanaval.func;

public class Alvos {
    
    public Alvos(){
        
    }
    
    public boolean igual(String[][] matriz, String posi){
        for(String[] strV: matriz){
            for(String str : strV){
                if(posi.equals(str)){
                    return true;
                }
            }
        }
        return false;
    }
}
