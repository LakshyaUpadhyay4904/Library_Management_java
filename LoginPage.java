import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame implements ActionListener {

  private JTextField usernameField;
  private JPasswordField passwordField;
  private JButton loginButton;

  public LoginPage() {
    super("Login");
    InitializeComponent();
    
  }

  private void InitializeComponent(){
    setSize(400, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();

    JLabel usernameLabel = new JLabel("Email or Phone");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 0;
    c.gridy = 0;
    panel.add(usernameLabel, c);

    usernameField = new JTextField(20);
    c.gridx = 1;
    c.gridy = 0;
    panel.add(usernameField, c);

    JLabel passwordLabel = new JLabel("Password");
    c.gridx = 0;
    c.gridy = 1;
    panel.add(passwordLabel, c);

    passwordField = new JPasswordField(20);
    c.gridx = 1;
    c.gridy = 1;
    panel.add(passwordField, c);

    loginButton = new JButton("Login");
    loginButton.addActionListener(this);
    c.gridx = 1;
    c.gridy = 2;
    panel.add(loginButton, c);

    add(panel);
    setVisible(true);
  }
  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == loginButton) {
      String username = usernameField.getText();
      String password = new String(passwordField.getPassword());

      // Simulate login process (normally you would connect to a database or authentication service)
      if (username.equals("admin") && password.equals("password")) {
        JOptionPane.showMessageDialog(this, "Login successful!");
        // Open new window or perform other actions after successful login
      } else {
        JOptionPane.showMessageDialog(this, "Invalid username or password.");
      }
    }
  }

  public static void main(String[] args) {
    new LoginPage();
  }
}