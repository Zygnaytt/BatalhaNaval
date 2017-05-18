package batalhanaval.visual;

import batalhanaval.func.Botoes;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Tabuleiro {
    private final JPanel painel = new JPanel();
    private final JButton[][] bnQuadradinhos1 = new JButton[10][10];
    private final JButton[][] bnQuadradinhosIA = new JButton[10][10];
    private JPanel bnTabuleiro1;
    private JPanel bnTabuleiroIA;
    private static final String COLS = "ABCDEFGHIJ";
    
    public Tabuleiro(){
        initTabuleiro1();
        initTabuleiroIA();
    }
    
    private void initTabuleiro1(){
        //INICIALIZACAO DO TABULEIRO 1
	bnTabuleiro1 = new JPanel(new GridLayout(0, 11));
        bnTabuleiro1.setBorder(new LineBorder(Color.BLACK));
       	painel.add(bnTabuleiro1);

       	Insets margemDoBotao1 = new Insets(0,0,0,0);
        for(int ii = 0; ii < bnQuadradinhos1.length; ii++){
            for(int jj = 0; jj < bnQuadradinhos1[ii].length; jj++){
                JButton btn = new JButton();
                btn.setActionCommand("tab1 V"+jj+"H"+ii+" "+COLS.substring(ii, ii+1));
                btn.addActionListener(new Botoes());
                btn.setMargin(margemDoBotao1);
                ImageIcon icone = new ImageIcon(new BufferedImage(40, 40, BufferedImage.TYPE_INT_ARGB));
                btn.setIcon(icone);
                btn.setBackground(Color.WHITE);   
                btn.setEnabled(false);
                
                bnQuadradinhos1[jj][ii] = btn;
                
            }
       	}
        //parte de cima do tabuleiro(horizontal)
        bnTabuleiro1.add(new JLabel(""));
        for(int ii = 0; ii < 10; ii++){
            bnTabuleiro1.add(new JLabel("" + (ii + 1),SwingConstants.CENTER));
        }
        
        //parte da esquerda  do tabuleiro(vetrical)
        for(int ii = 0; ii < 10; ii++){
            for(int jj = 0; jj < 10; jj++){
                switch(jj){
                    case 0:{
                        bnTabuleiro1.add(new JLabel(COLS.substring(ii, ii + 1),SwingConstants.CENTER));
                    }
                    default:{
                        bnTabuleiro1.add(bnQuadradinhos1[jj][ii]);
                    }
                }   
            }
        }
        
    }
    
    private void initTabuleiroIA(){//INICIALIZACAO DO TABULEIRO 2
	bnTabuleiroIA = new JPanel(new GridLayout(0, 11));
        bnTabuleiroIA.setBorder(new LineBorder(Color.BLACK));
       	painel.add(bnTabuleiroIA);

       	Insets margemDoBotao2 = new Insets(0,0,0,0);
        for(int ii = 0; ii < bnQuadradinhosIA.length; ii++){
            for(int jj = 0; jj < bnQuadradinhosIA[ii].length; jj++){
                JButton btn = new JButton();
                btn.setActionCommand("tab2 V"+jj+"H"+ii+" "+COLS.substring(ii, ii+1));
                btn.addActionListener(new Botoes());
                btn.setMargin(margemDoBotao2);
                ImageIcon icone = new ImageIcon(new BufferedImage(40, 40, BufferedImage.TYPE_INT_ARGB));
                btn.setIcon(icone);
                btn.setBackground(Color.WHITE);         
                
                bnQuadradinhosIA[jj][ii] = btn;
                
            }
       	}
        //parte de cima do tabuleiro(horizontal)
        bnTabuleiroIA.add(new JLabel(""));
        for(int ii = 0; ii < 10; ii++){
            bnTabuleiroIA.add(new JLabel("" + (ii + 1),SwingConstants.CENTER));
        }
        
        //parte da esquerda  do tabuleiro(vetrical)
        for(int ii = 0; ii < 10; ii++){
            for(int jj = 0; jj < 10; jj++){
                switch(jj){
                    case 0:{
                        bnTabuleiroIA.add(new JLabel(COLS.substring(ii, ii + 1),SwingConstants.CENTER));
                    }
                    default:{
                        bnTabuleiroIA.add(bnQuadradinhosIA[jj][ii]);
                    }
                }   
            }
        }
    }
    
    public JComponent getPainel(){
        return painel;
    }
    
    public JComponent getTabuleiro1(){
        return bnTabuleiro1;
    }
    public JComponent getTabuleiroIA(){
        return bnTabuleiroIA;
    }
}
