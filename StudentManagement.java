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
    setSize(1200, 700);
    //jframe should start at center of the screen
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Define table model
    tableModel = new DefaultTableModel(new String[]{"Name", "EnRollment No", "Course", "Section"}, 0);
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

  // function to show the student list in tablemodel
  public void showStudentList() {
    // Clear the table model
    tableModel.setRowCount(0);

    // Add students to the table model
    for (Student student : Student.StudentList) {
      tableModel.addRow(new Object[]{student.Name, student.EnrollNo, student.Course, student.Section});
    }
  }


  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == addButton) {
      StudentWindow studentWindow = new StudentWindow();
      int result = studentWindow.ShowDialogBox();
      if (result == 1) {
        showStudentList();
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
