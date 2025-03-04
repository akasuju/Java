import java.awt.*;
import javax.swing.*;

public class Graphictest extends JPanel {
    public void paint(Graphics g) {
//         g.setColor(Color.red);
//         g.setColor(Color.blue);
//         Font f=new Font("inter", Font.BOLD, 20);
//         g.setFont(f);
//       g.drawString("Welcome Homie", 50, 50);
//       g.setColor(Color.blue);
//       g.drawLine(20,20,100,20);
// //TO draw a rectangle
//       g.drawRect(20, 100, 100, 100 );
//       g.fillRect(20, 100, 100, 100);
//       // corner raadius 
//         g.drawRoundRect(20, 250, 100, 100, 50, 50);
//         // to draw oval
//         g.drawOval(200, 100, 80, 100);
//         g.fillOval(200, 100, 100, 100);
//         //TO draw arc
//         g.drawArc(200, 250, 100, 100, 0, 180);
//         g.fillArc(200, 250, 100, 400, 0, 180);

//         //TO draw polygon
//         int xpoints[]={20,200,20,200,20};
//         int ypoints[]={20,20,200,200,20};
//         int npoints=5;
//         g.drawPolygon(xpoints, ypoints, npoints);
//         g.fillPolygon(xpoints, ypoints, npoints);   

//Draw Nepals flag 





         
    
    }
public static void main(String[] args) {

    JFrame jf=new JFrame();
    jf.setSize(500, 500);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Graphictest obj=new Graphictest();
    jf.setVisible(true);
    jf.add(obj);
}
}

;
