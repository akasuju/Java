import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
public class concentriccirlce extends JPanel implements ActionListener{
    int x=20,y=20,w=400,h=400;
    int r=1,gr=1,b=1;
    Timer t=null;
    concentriccirlce()
    {
        t=new Timer(1000,this);
        t.start();
    }   

    //this is necessary for every graphics programq
    public void paint(Graphics g)
    {
        Color c=new Color(r,gr,b);
        g.setColor(c);
        g.fillOval(x,y,w,h);
    }
    public void actionPerformed(ActionEvent e)
    {
        Random ra= new Random();
        r=ra.nextInt(255);
        gr=ra.nextInt(255);
        b=ra.nextInt(255);
        repaint();
        if(w>20)
        {
            w-=20;
            h-=20;
            x+=10;
            y+=10;
        }
        else
        t.stop();
    }
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        jf.setSize(500,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        concentriccirlce gp=new concentriccirlce();
        jf.add(gp);
        jf.setVisible(true);
    }
}