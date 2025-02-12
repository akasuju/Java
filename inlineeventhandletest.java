import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class inlineeventhandletest {
    JFrame jf;
    JButton b1;

    inlineeventhandletest() {
        jf = new JFrame();
        jf.setSize(300, 300);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1 = new JButton("click me");
        jf.add(b1);
        b1.addActionListener(new handleEvent());
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        inlineeventhandletest in = new inlineeventhandletest();
    }

    class handleEvent implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Button clicked");
        }
    }
}
