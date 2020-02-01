/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paulorvj
 */
public class MeuTimer extends TimerTask {

    private int segundos;
    
    @Override
    public void run() {
	GradeView.setTempo(""+segundos);
	try {
	    Thread.sleep(1000);
	} catch (InterruptedException ex) {
	    Logger.getLogger(MeuTimer.class.getName()).log(Level.SEVERE, null, ex);
	}
	segundos++;
    }
    
    
    
}
