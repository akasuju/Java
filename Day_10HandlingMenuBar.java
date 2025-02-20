import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Day_10HandlingMenuBar implements ActionListener {
    JMenuBar mb;
    JMenu file, edit;
    JMenuItem New, exit;
    JFrame jf;

    Day_10HandlingMenuBar() {
        jf = new JFrame();
        jf.setSize(400, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        New = new JMenuItem("New");
        exit = new JMenuItem("Exit");

        // add menu item into menu bar
        mb.add(file);
        mb.add(edit);

        file.add(New);
        file.addSeparator();
        file.add(exit);
        file.setMnemonic('F');

        New.addActionListener(this);
        exit.addActionListener(this);
        // New.setAccelerator(this); // Removed incorrect call
        exit.addActionListener(this);
        New.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        // add menubar to frame
        jf.setJMenuBar(mb);
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == New) {
        new Day_10HandlingMenuBar();
       jf.dispose();
        }
        else if (e.getSource() == exit) {
            System.exit(0);
        }
    }


    public static void main(String[] args) {
        new Day_10HandlingMenuBar();
    }

}