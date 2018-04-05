
package ping;

import java.awt.Color;
import javax.swing.JFrame;

public class Jframe {
    
      
    void criarJanela(String pingStr) {
        JFrame janela = new JFrame("o ping é " + pingStr);
            janela.setSize(300,200);
            
            int ping = Integer.parseInt(pingStr);
            
            
            if(ping < 25){
                janela.getContentPane().setBackground(Color.green);
            }else
                if(ping < 50 && ping >=25){
                    janela.getContentPane().setBackground(Color.blue);
                }
            else
                if(ping > 50){
                    janela.getContentPane().setBackground(Color.red);
                }
            
                
               janela.setVisible(true);     }
        
    }
    

