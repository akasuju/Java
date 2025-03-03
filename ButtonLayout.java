import javax.swing.JFrame;

import java.util.concurrent.Flow;
import java.awt.*;
import javax.swing.*;
public class ButtonLayout {
    public static void main (String [] args) {
        JFrame jf = new JFrame("This is ");
        jf.setSize(300,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        //jf.setLayout(new GridLayout()) 
        // jf.setLayout(new GridLayout(2,2))  
         jf.setLayout(new GridLayout(2,2,5,5));
        JButton b1 =new JButton("one");
       b1=new JButton(new ImageIcon ("images/tomcat.png"));
     
        jf.add(b1);
    
    }
}