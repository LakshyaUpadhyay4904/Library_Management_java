import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

public class StudentManagement extends JFrame implements ActionListener {

  private JTable studentTable;
  private DefaultTableModel tableModel;
  private JButton addButton, editButton, deleteButton, refreshButton;

  public StudentManagement() {
    super("Student List");
    setSize(800, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Define table model
    tableModel = new DefaultTableModel(new String[]{"Name", "Roll No", "Class", "Div", "Age"}, 0);
    studentTable = new JTable(tableModel);

    // Add buttons
    addButton = new JButton("Add");
    addButton.addActionListener(this);
    editButton = new JButton("Edit");
    editButton.addActionListener(this);
    deleteButton = new JButton("Delete");
    deleteButton.addActionListener(this);
    refreshButton = new JButton("Refresh");
    refreshButton.addActionListener(this);

    // Layout
    JPanel buttonPanel = new JPanel();
    buttonPanel.add(addButton);
    buttonPanel.add(editButton);
    buttonPanel.add(deleteButton);
    buttonPanel.add(refreshButton);

    JScrollPane scrollPane = new JScrollPane(studentTable);

    add(buttonPanel, BorderLayout.NORTH);
    add(scrollPane, BorderLayout.CENTER);

    // Implement button actions (replace with your actual logic)
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == addButton) {
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

      int result = JOptionPane.showConfirmDialog(null, addPanel, "Add Student", JOptionPane.OK_CANCEL_OPTION);

      if (result == JOptionPane.OK_OPTION) {
        String name = nameField.getText();
        String rollNo = rollNoField.getText();
        String studentClass = classField.getText();
        String div = divField.getText();
        int age = Integer.parseInt(ageField.getText());

        // Add new student data to table model
        tableModel.addRow(new Object[]{name, rollNo, studentClass, div, age});
      }
    } else if (e.getSource() == editButton) {
      // Get the selected student from the table
      // Open a dialog to edit student details
      // Update the corresponding row in the table model
    } else if (e.getSource() == deleteButton) {
      // Get the selected student from the table
      // Confirm deletion and remove the student data from the table model
    } else if (e.getSource() == refreshButton) {
      // Reload data from the underlying source (e.g., database)
      // Update the table model with fresh data
    }
  }

  public static void main(String[] args) {
    new StudentManagement().setVisible(true);
  }
}
