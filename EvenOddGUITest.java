import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EvenOddGUITest {
    static JButton b1;
    static JTextField t1;
    public static void main (String []args){
JFrame jf =new  JFrame("Even Odd Test");
jf.setSize(300, 300);
jf.setLayout(new FlowLayout());
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
b1 = new JButton("Check");
t1 = new JTextField(10);
jf.add(t1);
jf.add(b1);
b1.addActionListener(new handleEvent());
jf.setVisible(true);
    }
    static class handleEvent implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int num = Integer.parseInt(t1.getText());
            if (num % 2 == 0) {
                JOptionPane.showMessageDialog(null, "Even Number");
            } else {
                JOptionPane.showMessageDialog(null, "Odd Number");
            }
        }
    }

}

