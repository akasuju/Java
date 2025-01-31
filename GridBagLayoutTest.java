import javax.swing.*;
import java.awt.*;

public class GridBagLayoutTest {
      public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(300,300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        GridBagLayout gBL= new GridBagLayout();
        jf.setLayout(gBL);
        GridBagConstraints gbc = new GridBagConstraints();
        



        
//        buttons defined       
        JButton b1 = new JButton ("1");
        gbc.gridx=0;
        gbc.gridy=0;
        gBL.setConstraints(b1, gbc);
        jf.add(b1);
          
        JButton b2 = new JButton ("2");
        gbc.gridx=1;
        gbc.gridy=0;
        gBL.setConstraints(b2, gbc);
        jf.add(b2);
        
        
        JButton b4 = new JButton ("4");
        gbc.gridx=1;
        gbc.gridy=1;
        gBL.setConstraints(b4, gbc);
        jf.add(b4);
        
         JButton b5 = new JButton ("5");
        gbc.gridx=1;
        gbc.gridy=2;
        gBL.setConstraints(b5, gbc);
        jf.add(b5);
        
         JButton b6 = new JButton ("6");
        gbc.gridx=0;
        gbc.gridy=3;
        gbc.gridwidth=2;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gBL.setConstraints(b6, gbc);
        jf.add(b6);
        
        JButton b3 = new JButton ("3");
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.gridheight=2;
        gbc.gridwidth=1;
        gbc.fill = GridBagConstraints.VERTICAL;
        gBL.setConstraints(b3, gbc);
        jf.add(b3);
        
      


//setting visibility
      jf.setVisible(true);  
    }

    
}