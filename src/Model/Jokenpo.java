
package Model;

import java.util.Random;
import javax.swing.JOptionPane;

public class Jokenpo {
    public static void jogo(){
       int cont = 0;
        Random gerador = new Random();
        
        do {
        int maquina = gerador.nextInt(3);
        System.out.println(maquina);
        String x = JOptionPane.showInputDialog(null, "[0] - Pedra\n"
                + "[1] - Papel\n"
                + "[2] - Tesoura");
       int jogador = Integer.parseInt(x);
        
        if(maquina == 0 && jogador == 1){
            JOptionPane.showMessageDialog(null, "Parabéns VITORIA");
            cont = 1;
        }
        else if(maquina == 1 && jogador == 2){
            JOptionPane.showMessageDialog(null, "Parabéns VITORIA");
            cont = 1;
        }
        else if(maquina == 2 && jogador == 0){
            JOptionPane.showMessageDialog(null, "Parabéns VITORIA");
            cont = 1;
        }
        else if(maquina == jogador){
            JOptionPane.showMessageDialog(null, "Empate Tente Novamente");
            cont = 0;
        }
        else{
            JOptionPane.showMessageDialog(null, "Você Perdeu! Tente Novamente");
        }
            
        } while (cont == 0);
        
    }
}
