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
       
        jf.setLayout(new BorderLayout());
        JButton b1 =new JButton("one");
        JButton b2 =new JButton("two");
        JButton b3 =new JButton("three");
        JButton b4 =new JButton("four");
        JButton b5 =new JButton("five");
        jf.add(b1,BorderLayout.SOUTH);
        jf.add(b2,BorderLayout.SOUTH);
        jf.add(b3,BorderLayout. SOUTH);
        jf.add(b4,BorderLayout.SOUTH);
        jf.add(b5,BorderLayout.CENTER);
    }
}