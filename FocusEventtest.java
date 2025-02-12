import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class FocusEventtest implements FocusListener {
    JTextArea T1, T2;
    
    public static void main(String[] args) {
        JFrame jf = new JFrame("Focus Event Test");
        jf.setSize(300, 300);
        jf.setLayout(new GridLayout(2, 1)); // Changed to GridLayout with 2 rows and 1 column
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FocusEventtest fet = new FocusEventtest();
        fet.T1 = new JTextArea(5, 10);
        fet.T2 = new JTextArea(5, 10);
      fet.T1.addFocusListener(fet);
      fet.T2.addFocusListener(fet);
        fet.T1.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
        fet.T2.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        jf.add(fet.T1);
        jf.add(fet.T2);
        jf.setVisible(true);
    }
    public void focusGained(FocusEvent e) {
        if (e.getSource() == T1) {
            T1.setBackground(Color.YELLOW);
        } else if (e.getSource() == T2) {
            T2.setBackground(Color.YELLOW);
        }
    }
    public void focusLost(FocusEvent e) {
        if (e.getSource() == T1) {
            T1.setBackground(Color.WHITE);
        } else if (e.getSource() == T2) {
            T2.setBackground(Color.WHITE);
        }
    }


}
