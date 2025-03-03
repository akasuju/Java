import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Jtabletest {
    public static void main(String[] args) {
        // Frame initialization
        JFrame frame = new JFrame();

        // Frame Title
        frame.setTitle("JTable Example");

      
        String[][] data = {
                { "John Doe", "123 Elm St", "Manager", "75000" },
                { "Jane Smith", "456 Oak St", "Developer", "65000" },
                { "Mike Johnson", "789 Pine St", "Designer", "60000" }
        };

        String[] columnNames = { "Name", "Address", "Position", "Salary" };

        JTable table = new JTable(data, columnNames);
        table.setBounds(30, 40, 200, 300);

        JScrollPane sp = new JScrollPane(table);
        frame.add(sp);

        frame.setSize(500, 200);

        frame.setVisible(true);
    }
}