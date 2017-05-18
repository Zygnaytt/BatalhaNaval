
package batalhanaval.func;

import batalhanaval.func.pecas.*;
import java.util.Arrays;

public class Alvos {
    Submarino subJogador = new Submarino();
    Submarino subIA = new Submarino();
    ContraTorpedeiro ctJogador = new ContraTorpedeiro();
    ContraTorpedeiro ctIA = new ContraTorpedeiro();
    NavioTanque ntJogador = new NavioTanque();
    NavioTanque ntIA = new NavioTanque();
    PortaAviao ptJogador = new PortaAviao();
    PortaAviao ptIA = new PortaAviao();
    
    private final int xMatriz = 5;
    private final int yMatriz = 4;
    
    String[][] matrizJogador = new String[xMatriz][yMatriz];
    String[][] matrizIA = new String[xMatriz][yMatriz];
    
    public Alvos(){
        initVetores();
    }
    
    private void initVetores(){
        matrizJogador[0] = subJogador.getPosicoes();
        matrizJogador[1] = ctJogador.getPosicoes();
        matrizJogador[2] = ntJogador.getPosicoes();
        matrizJogador[3] = ptJogador.getPosicoes();
//        for(String[] matriz : matrizJogador)
//            Arrays.fill(matriz, " ");
        
        matrizIA[0] = subIA.getPosicoes();
        matrizIA[1] = ctIA.getPosicoes();
        matrizIA[2] = ntIA.getPosicoes();
        matrizIA[3] = ptIA.getPosicoes();
//        for(String[] matriz : matrizIA)
//            Arrays.fill(matriz, " ");
    }
    
    
    @Override
    public String toString(){
        String strJogador = "";
        String strIA = "";
        String str="";
        
        for(int aux = 0; aux < xMatriz-1; aux++){
            for(int aux1 = 0; aux1 < yMatriz-1; aux1++){
                strJogador += " " + matrizJogador[aux][aux1];
                strIA += " "+ matrizIA[aux][aux1];
            }
        }
        
        str += "Jogador: " + strJogador +"\n"+"IA: "+ strIA;
        
        return str;
    }
    
    public String test(){
        String str1 = matrizJogador[0][0];
        String str2 = matrizJogador[0][1];
        String str3 = matrizJogador[1][0];
        String str4 = matrizJogador[1][1];
        String str5 = matrizJogador[1][2];
        String str6 = matrizJogador[2][0];
        String str7 = matrizJogador[2][1];
        String str8 = matrizJogador[2][2];
        String str9 = matrizJogador[2][3];
        String str10= matrizJogador[3][0];
        String str11= matrizJogador[3][1];
        String str12= matrizJogador[3][2];
        String str13= matrizJogador[3][3];
        String str14= matrizJogador[3][4];
        
        return str1+str2+" - "+str3+str4+str5+" - "+str6+str7+str8+str9+" - "+str10+str11+str12+str13+str14;
        
    }
}
