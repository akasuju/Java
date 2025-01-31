import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayoutTest {
      public static void main (String [] args) {
        JFrame jf = new JFrame("This is ");
        jf.setSize(300,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        GridBagLayout gbl = new GridBagLayout();
        jf.setLayout(gbl);
        GridBagConstraints gbc = new GridBagConstraints();
      
        JButton b1 =new JButton("one");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbl.setConstraints(b1, gbc);
        jf.add(b1);
        JButton b2 =new JButton("two");
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbl.setConstraints(b2, gbc);
        jf.add(b2);
        JButton b3 =new JButton("three");
        JButton b4 =new JButton("four");
     
        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.add(b4);
    }
}
