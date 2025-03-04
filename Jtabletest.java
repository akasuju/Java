import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Jtabletest {
    public static void main(String[] args) {
  
        JFrame frame = new JFrame();

  
        frame.setTitle("JTable Example");

      
        String[][] data = {
                { "1", "John Doe", "123 Elm St", "Manager", "75000" },
                { "2", "Jane Smith", "456 Oak St", "Developer", "65000" },
                { "3", "Mike Johnson", "789 Pine St", "Designer", "60000" }
        };

        String[] columnNames = {"ID", "Name", "Address", "Position", "Salary" };

        JTable table = new JTable(data, columnNames);
        table.setBounds(30, 40, 200, 300);

        JScrollPane sp = new JScrollPane(table);
        frame.add(sp);

        frame.setSize(500, 200);

        frame.setVisible(true);
    }
}