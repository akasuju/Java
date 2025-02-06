// Source code is decompiled from a .class file using FernFlower decompiler.
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class HelloButton implements ActionListener {
   JFrame jf;
   JButton b1,b2;
   JTextField t1;
   HelloButton() {
      jf = new JFrame();
      jf.setSize(300, 300);
      jf.setLayout(new FlowLayout());
      jf.setDefaultCloseOperation(3);
      b1 = new JButton("click me");
      jf.add(b1);
      b1.addActionListener(this);
      b2 = new JButton("click me");
      jf.add(b2);
      b2.addActionListener(this);
      t1 = new JTextField("");
      jf.add(t1);
      jf.setVisible(true);
   }


   public static void main(String[] var0) {
      HelloButton var1 = new HelloButton();
   }

   public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b1) {
        t1.setText("Hello");
    } else if (e.getSource() == b2) {
       t1.setText("");
    }
   }
}
