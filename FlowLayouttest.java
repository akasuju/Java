import javax.swing.JFrame;

import java.util.concurrent.Flow;
import java.awt.*;
import javax.swing.*;
public class FlowLayouttest {
    public static void main (String [] args) {
        JFrame jf = new JFrame("This is ");
        jf.setSize(300,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout fl = new FlowLayout();
        jf.setLayout(fl);
        JButton b1 =new JButton("one");
        JButton b2 =new JButton("two");
        JButton b3 =new JButton("three");
        JButton b4 =new JButton("four");
        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.add(b4);
    }
}