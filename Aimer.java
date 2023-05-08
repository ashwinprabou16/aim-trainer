import java.awt.event.*;  
import javax.swing.*;    
import java.util.Random;
import java.awt.Dimension;
import java.awt.*;  
import java.util.Timer;
import java.util.TimerTask;
public class Aimer {
    public static int score = -1;
    public static int interval = 30;
    public static Timer timer;
    public static void main(String[] args) { 
        timer = new Timer();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Random rand = new Random();
        JFrame f = new JFrame("Aimer (Single)");    
        JButton s = new JButton("START");
        s.setBounds(screenSize.width/2-100,screenSize.height/2-100,200,200);
        f.add(s);
        final JTextField time = new JTextField();
        time.setBounds(screenSize.width/2+25,10, 50,50); 
        f.add(time);
        final JTextField tf = new JTextField();  
        tf.setBounds(screenSize.width/2-75,10, 50,50); 
        Icon icon = new ImageIcon("/Users/ashwinprabou/Downloads/StudentFiles/cashregsiter/red.png");
        JButton b = new JButton(icon);  
        s.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){  
            f.remove(s);
            timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {
                time.setText(""+setInterval());
                if(interval == 0){
                    for( ActionListener al : b.getActionListeners() ) {
                        b.removeActionListener( al );
                    }
                    b.setBounds(screenSize.width/2-100,screenSize.height/2-100,200,200);
                    b.setIcon(null);
                    b.setText("" + score);
                }
            }
        }, 1000, 1000);
    }  
        });
        b.setBounds(screenSize.width/2-100,screenSize.height/2-100,200,200);  
        b.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            b.setBounds(rand.nextInt(screenSize.width - 200),rand.nextInt(screenSize.height- 300),200,200);
            score++;
            tf.setText("" + score);
    }  
        });  
        f.add(b);f.add(tf);
        f.getContentPane().setBackground(new Color(173, 216, 230));
        
        f.setSize(screenSize.width, screenSize.height);  
        f.setLayout(null);  
        f.setVisible(true);   
    }  
    
    private static final int setInterval() {
        if (interval == 1)
            timer.cancel();
        return --interval;
    }
}  