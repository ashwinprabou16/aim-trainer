import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Write a description of class Menu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Menu
{
    public static void main(String[] args){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame f = new JFrame("Menu");
        JButton s = new JButton("Aim Trainer Classic");
        s.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){  
                //3 options-Regular, Doubled, Tripled
            }  
        });        
        
        
        
        
        
        
        f.getContentPane().setBackground(new Color(173, 216, 230));
        f.setSize(screenSize.width, screenSize.height);  
        f.setLayout(null);  
        f.setVisible(true);
    }
}
