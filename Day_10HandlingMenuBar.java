import javax.swing.*;
public class Day_10HandlingMenuBar {
JMenuBar mb;
JMenu file, edit;
JMenuItem New,exit;
JFrame jf;
Day_10HandlingMenuBar(){
    jf = new JFrame();
    jf.setSize(400,400);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    mb = new JMenuBar();
    file = new JMenu("File");
    edit = new JMenu ("Edit");
    New = new JMenuItem("New");
    exit = new JMenuItem("Exit");
    
    //add menu item into menu bar
    mb.add(file);
    mb.add(edit);
    
    //add menu item into menu.
    file.add(New);
    file.add(exit);
    
    //add menubar to frame
    jf.setJMenuBar(mb);
    jf.setVisible(true);
}
    public static void main(String[] args) {
        new Day_10HandlingMenuBar();
    }
    
}