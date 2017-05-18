/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval.visual;

import javax.swing.*;
/**
 *
 * @author u15185
 */
public class TelaPrincipal {
    private final Tabuleiro tabuleiro = new Tabuleiro();
    private final int largura = 1300;
    private final int altura = 800;
    private JFrame tela;
    
    
    public void initComponents(){
        initTela();
        tela.add(tabuleiro.getPainel());
        //FINALIZACAO DA INICIALIZACAO
        tela.setVisible(true);
    }
    
    public void initTela(){
        //INICIALIZACAO DA TELA
        tela = new JFrame("Reversi_PP");
        tela.setSize(largura, altura);
        tela.setLocationRelativeTo(null);
        tela.setResizable(false);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public int getAltura(){
        return this.altura;
    }
    public int getLargura(){
        return this.largura;
    }
    public JFrame getTela(){
        return this.tela;
    }
}
