import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class StudentWindow {
    
    JTextField nameField;
    JTextField rollNoField;
    JTextField classField;
    JTextField divField;
    JTextField ageField;


    public int ShowDialogBox(){
        //return InitializeComponent();
        if (InitializeComponent() == JOptionPane.OK_OPTION) {
            String name = nameField.getText();
            String rollNo = rollNoField.getText();
            String studentClass = classField.getText();
            String div = divField.getText();
            int age = Integer.parseInt(ageField.getText());
    
            // Add new student data to table model
    }

    private int InitializeComponent(){
        // Open dialog to add new student
      JTextField nameField = new JTextField(20);
      JTextField rollNoField = new JTextField(10);
      JTextField classField = new JTextField(5);
      JTextField divField = new JTextField(5);
      JTextField ageField = new JTextField(3);

      JPanel addPanel = new JPanel(new GridBagLayout());
      GridBagConstraints c = new GridBagConstraints();

      JLabel nameLabel = new JLabel("Name:");
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 0;
      c.gridy = 0;
      addPanel.add(nameLabel, c);
      addPanel.add(nameField, c);

      JLabel rollNoLabel = new JLabel("Roll No:");
      c.gridx = 0;
      c.gridy = 1;
      addPanel.add(rollNoLabel, c);
      addPanel.add(rollNoField, c);

      JLabel classLabel = new JLabel("Class:");
      c.gridx = 0;
      c.gridy = 2;
      addPanel.add(classLabel, c);
      addPanel.add(classField, c);

      JLabel divLabel = new JLabel("Div:");
      c.gridx = 0;
      c.gridy = 3;
      addPanel.add(divLabel, c);
      addPanel.add(divField, c);

      JLabel ageLabel = new JLabel("Age:");
      c.gridx = 0;
      c.gridy = 4;
      addPanel.add(ageLabel, c);
      addPanel.add(ageField, c);

      return JOptionPane.showConfirmDialog(null, addPanel, "Add Student", JOptionPane.OK_CANCEL_OPTION);

    }
}
