import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class App implements ActionListener {

    private static JTextField passwordTextField;
    private static JTextField nameTextField;
    private static JButton logInButton;
    private static JLabel welcomelabel;
    private static JPanel mainPanel;
    private static JFrame mainFrame;
    private static JButton registerButton;

    public static void main(String[] args) throws Exception {

        /// Frame setup

        mainFrame = new JFrame("Login App");

        mainFrame.setVisible(true);
        mainFrame.setSize(500, 400);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(null);
        mainFrame.getContentPane().setBackground(new Color(42, 43, 44));
        mainFrame.setResizable(false);

        /// Label setup

        welcomelabel = new JLabel();
        JLabel nameL = new JLabel("Name:");
        JLabel passL = new JLabel("Code:");

        welcomelabel.setText("WELCOME");
        welcomelabel.setBounds(160, 3, 200, 100);
        welcomelabel.setFont(new Font("Tahoma", Font.BOLD, 35));
        welcomelabel.setForeground(new Color(239, 243, 248));
        mainFrame.add(welcomelabel);

        nameL.setBounds(12, 85, 200, 100);
        nameL.setFont(new Font("Tahoma", Font.BOLD, 25));
        nameL.setForeground(new Color(239, 243, 248));
        mainFrame.add(nameL);

        passL.setBounds(20, 160, 200, 100);
        passL.setFont(new Font("Tahoma", Font.BOLD, 25));
        passL.setForeground(new Color(239, 243, 248));
        mainFrame.add(passL);

        /// TextField setup

        nameTextField = new JTextField();
        nameTextField.setSize(500, 500);
        nameTextField.setBounds(120, 100, 260, 70);
        nameTextField.setBackground(new Color(83, 94, 104));
        nameTextField.setForeground(new Color(239, 243, 248));
        nameTextField.setFont(new Font("Tahoma", Font.PLAIN, 35));
        nameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        mainFrame.add(nameTextField);

        passwordTextField = new JTextField();
        passwordTextField.setSize(500, 500);
        passwordTextField.setBounds(120, 180, 260, 70);
        passwordTextField.setBackground(new Color(83, 94, 104));
        passwordTextField.setForeground(new Color(239, 243, 248));
        passwordTextField.setFont(new Font("Tahoma", Font.PLAIN, 35));
        passwordTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        mainFrame.add(passwordTextField);

        /// Button setup

        logInButton = new JButton("Login");
        logInButton.setSize(500, 500);
        logInButton.setBounds(100, 260, 300, 70);
        logInButton.setBackground(new Color(146, 181, 207));
        logInButton.setFont(new Font("Tahoma", Font.BOLD, 35));
        logInButton.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        logInButton.setFocusPainted(false);
        logInButton.addActionListener(new App());
        mainFrame.add(logInButton);

        registerButton = new JButton("Register");
        registerButton.setSize(150, 30); // Adjusted size
        registerButton.setBounds(210, 335, 70, 20); // Adjusted position and size
        registerButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        registerButton.setForeground(new Color(239, 243, 248));
        registerButton.setFocusPainted(false);
        registerButton.setBorderPainted(false); // Set border to be not painted
        registerButton.setBorder(null);
        registerButton.setContentAreaFilled(false);
        registerButton.addActionListener(new App());

        mainFrame.add(registerButton);

        /// Panel setup

        mainPanel = new JPanel();
        JPanel log = new JPanel();
        JPanel em = new JPanel();
        JPanel re = new JPanel();

        mainPanel.setSize(500, 110);
        mainPanel.setBackground(new Color(146, 207, 160));
        mainPanel.setBounds(100, 20, 300, 70);
        mainFrame.add(mainPanel);

        log.setSize(500, 500);
        log.setBackground(new Color(83, 94, 104));
        log.setBounds(100, 100, 300, 70);
        mainFrame.add(log);

        em.setSize(500, 500);
        em.setBackground(new Color(83, 94, 104));
        em.setBounds(100, 180, 300, 70);
        mainFrame.add(em);

        re.setSize(500, 500);
        re.setBackground(new Color(83, 94, 104));
        re.setBounds(210, 335, 70, 20);
        mainFrame.add(re);

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = nameTextField.getText();
        String pass = passwordTextField.getText();
        System.out.println(user + ", " + pass);

        if (e.getSource() == logInButton) {
            if (user.equals("Kenneth") && pass.equals("12345")) {
                welcomelabel.setText("Successful!");
                welcomelabel.setBounds(155, 3, 200, 100);
                nameTextField.setText("");
                passwordTextField.setText("");
                mainPanel.setBackground(new Color(123, 208, 239));

                openNewWindow();
                if (mainFrame != null) {
                    mainFrame.dispose();
                }
            } else {
                welcomelabel.setText("WRONG!");
                welcomelabel.setBounds(175, 3, 200, 100);
                nameTextField.setText("");
                passwordTextField.setText("");
                mainPanel.setBackground(new Color(228, 98, 98));
            }
        } else if (e.getSource() == registerButton) {
            openRegistrationWindow();
            mainFrame.dispose();
    }
}


    // New Window

    private void openNewWindow() {
        JFrame nFrame = new JFrame("Welcome Window");
        nFrame.setVisible(true);
        nFrame.setSize(500, 400);
        nFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nFrame.setLayout(null);
        nFrame.getContentPane().setBackground(new Color(42, 43, 44));

        JLabel welcomeLabel = new JLabel("Welcome to the New Window!");
        welcomeLabel.setBounds(100, 50, 300, 30);
        welcomeLabel.setForeground(new Color(239, 243, 248));
        nFrame.add(welcomeLabel);
    }

    private void openRegistrationWindow() {
        

        // Frame For Registration Window
        JFrame regFrame = new JFrame("Registration Window");
        regFrame.setVisible(true);
        regFrame.setSize(500, 400);
        regFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        regFrame.setLayout(null);
        regFrame.getContentPane().setBackground(new Color(42, 43, 44));
        regFrame.setResizable(false);

        // Label for Reugistration Window
        JLabel regLabel = new JLabel("Welcome to the Registration Window!");
        regLabel.setBounds(100, 50, 300, 30);
        regLabel.setForeground(new Color(239, 243, 248));
        regFrame.add(regLabel);

        JPanel regPanel = new JPanel();
        

    }
}
