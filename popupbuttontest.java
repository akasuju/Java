import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class popupbuttontest implements ActionListener {
    JFrame jf;
    JButton b1;

    popupbuttontest() {
        JFrame jf = new JFrame();
        jf.setSize(300, 300);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b1 = new JButton("click me");
        jf.add(b1);
        b1.addActionListener(this);
        jf.setVisible(true);

    }

public static void main(String[] args) {
    popupbuttontest pbt = new popupbuttontest();
}

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "You clicked the button");
       
    }

}
