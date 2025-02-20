import javax.swing.*;
import java.awt.*;

public class UsingInputDialog {
    public static void main(String[] args) {
       String message= JOptionPane.showInputDialog(null, "Yoshi is the best character in Mario Kart");
         JOptionPane.showMessageDialog(null, message);
        int choice= JOptionPane.showConfirmDialog(null, "Do you agree?");
        if(choice==0){
            System.out.println("You agreed");
        }

    }
}
