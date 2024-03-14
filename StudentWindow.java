import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.time.LocalDate;

public class StudentWindow {
    
    JTextField nameField;
    JTextField courseField;
    JTextField secField;
    JTextField enrollNoField;
    JTextField ageField;


    public int ShowDialogBox(){
        //return InitializeComponent();
        if (InitializeComponent() == JOptionPane.OK_OPTION) {
            String name = nameField.getText();
            String course = courseField.getText();
            String sec = secField.getText();
            String enrollNo = enrollNoField.getText();
    

            // Add new student data to table model
            Student student = new Student();
            student.addStudent(0, name, course, sec, enrollNo, "", "", LocalDate.now());
            return 1;
        }
        else return 0;
    }

    private int InitializeComponent(){
        // Open dialog to add new student
      nameField = new JTextField(20);
      courseField = new JTextField(20);
      secField = new JTextField(20);
      enrollNoField = new JTextField(20);

      JPanel addPanel = new JPanel(new GridBagLayout());

      GridBagConstraints c = new GridBagConstraints();

      JLabel nameLabel = new JLabel("Name:");
      c.gridx = 0;
      c.gridy = 0;
      addPanel.add(nameLabel, c);
      c.gridx = 1;
      c.gridy = 0;
      addPanel.add(nameField, c);

      JLabel enrollNoLabel = new JLabel("Roll No:");
      c.gridx = 0;
      c.gridy = 1;
      addPanel.add(enrollNoLabel, c);
      c.gridx = 1;
      c.gridy = 1;
      addPanel.add(enrollNoField, c);

      JLabel classLabel = new JLabel("Class:");
      c.gridx = 0;
      c.gridy = 2;
      addPanel.add(classLabel, c);
      c.gridx = 1;
      c.gridy = 2;
      addPanel.add(courseField, c);

      JLabel divLabel = new JLabel("Div:");
      c.gridx = 0;
      c.gridy = 3;
      addPanel.add(divLabel, c);
      c.gridx = 1;
      c.gridy = 3;
      addPanel.add(secField, c);

      return JOptionPane.showConfirmDialog(null, addPanel, "Add Student", JOptionPane.OK_CANCEL_OPTION);

    }
}
