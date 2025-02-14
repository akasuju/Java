
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class focusJLabeltest implements FocusListener {
    JLabel T1;

    public static void main(String[] args) {
        JFrame jf = new JFrame("Focus Event Test");
        jf.setSize(300, 300);
        jf.setLayout(new GridLayout(2, 1)); 
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        focusJLabeltest fet = new focusJLabeltest();
        fet.T1 = new JLabel("Label 1");
        JLabel statusLabel = new JLabel("Focus status will be displayed here.");
        jf.add(statusLabel);
        fet.T1.addFocusListener(fet);

        jf.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                jf.getContentPane().setBackground(Color.CYAN);
            }

            public void mouseExited(MouseEvent e) {
                jf.getContentPane().setBackground(Color.WHITE);
            }
            public void mousePressed(MouseEvent e) {
                jf.getContentPane().setBackground(Color.GREEN);
            }
            public void mouseReleased(MouseEvent e) {
                jf.getContentPane().setBackground(Color.CYAN);
            }
            public void mouseClicked(MouseEvent e) {
                jf.getContentPane().setBackground(Color.YELLOW);
            }
            
        });
        jf.setVisible(true);
    }

    public void focusGained(FocusEvent e) {
        if (e.getSource() == T1) {
            T1.setBackground(Color.YELLOW);
        }

    }

    public void focusLost(FocusEvent e) {
        if (e.getSource() == T1) {
            T1.setBackground(Color.WHITE);
        }
    }

}
