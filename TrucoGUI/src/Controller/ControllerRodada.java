/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Truco;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author rafael
 */
public class ControllerRodada {
    
    private Truco telaTruco;
    
    public ControllerRodada(){
        
        this.telaTruco = new Truco();
        this.telaTruco.setControlRodada(this);
    }
    
    public void jogaCarta(JLabel lbCarta){
        
        if(this.telaTruco.jogaCartaNaMesa((ImageIcon)lbCarta.getIcon())){
            
            lbCarta.setIcon(null);
        }
        
    }
}
