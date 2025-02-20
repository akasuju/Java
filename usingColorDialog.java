
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class usingColorDialog {
    JFrame jf;
    JButton b1;

    usingColorDialog() {
        jf = new JFrame();
        jf.setSize(300, 300);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1 = new JButton("Click Me!");
        jf.add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color c = JColorChooser.showDialog(null, "Choose a Color", Color.YELLOW);
                jf.getContentPane().setBackground(c);
            }
        });
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new usingColorDialog();
    }
}