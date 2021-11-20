/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prak1;

import java.awt.BorderLayout;
import java.awt.Frame;
import javax.swing.*;
/**
 *
 * @author erwin
 */
public class Main extends JFrame {
        JButton nButton = new JButton ("North");
        JButton sButton = new JButton ("South");
        JButton eButton = new JButton ("East");
        JButton wButton = new JButton ("West");
        JButton cButton = new JButton ("Center");
        
   public  Main (){
    super("Border Layout Beraksi");
    setSize(240, 280);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout( new BorderLayout());
        add(nButton, BorderLayout.NORTH);
        add(sButton, BorderLayout.SOUTH);
        add(eButton, BorderLayout.EAST);
        add(wButton, BorderLayout.WEST);
        add(cButton, BorderLayout.CENTER);}

    /**
     * @param args the command line arguments
     */

public static void main (String[] args){
        // TODO code application logic here
        Main frame = new Main (); 
        frame.setVisible(true);
      
    }   
   
}

