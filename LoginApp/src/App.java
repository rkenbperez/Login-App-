import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class App implements ActionListener{


    private static JTextField password;
    private static JTextField name;
    private static JButton logIn;
    private static JLabel label;
    private static JPanel ui;


    public static void main(String[] args) throws Exception {

    
        /// Frame

        JFrame frame = new JFrame("Login App");

        frame.setVisible(true);
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(42, 43, 44));


        /// Label

        label = new JLabel();
        JLabel nameL = new JLabel("Name:");
        JLabel passL = new JLabel("Code:");
        

        label.setText("WELCOME");
        label.setBounds(160,3,200,100);
        label.setFont(new Font("Tahoma", Font.BOLD, 35));
        label.setForeground(new Color(239, 243, 248));
        frame.add(label);

        nameL.setBounds(12,85,200,100);
        nameL.setFont(new Font("Tahoma", Font.BOLD, 25));
        nameL.setForeground(new Color(239, 243, 248));
        frame.add(nameL);

        passL.setBounds(20,160,200,100);
        passL.setFont(new Font("Tahoma", Font.BOLD, 25));
        passL.setForeground(new Color(239, 243, 248));
        frame.add(passL);

        /// Button

        logIn = new JButton("Login");
        logIn.setSize(500,500);
        logIn.setBounds(100,260,300,70);
        logIn.setBackground(new Color(146, 181, 207));
        logIn.setFont(new Font("Tahoma", Font.BOLD, 35));
        logIn.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        logIn.setFocusPainted(false);
        logIn.addActionListener((ActionListener) new App());
        frame.add(logIn);



        /// Panel

        ui = new JPanel();
        JPanel log = new JPanel();
        JPanel em = new JPanel();

        ui.setSize(500, 110);
        ui.setBackground(new Color(146, 207, 160));
        ui.setBounds(100,20,300,70);
        frame.add(ui);

        log.setSize(500, 500);
        log.setBackground(new Color(83, 94, 104));
        log.setBounds(100,100,300,70);
        frame.add(log);

        em.setSize(500, 500);
        em.setBackground(new Color(83, 94, 104));
        em.setBounds(100,180,300,70);
        frame.add(em);

        /// TextField

        name = new JTextField();
        name.setSize(500,500);
        name.setBounds(120,100,260,70);
        name.setBackground(new Color(83, 94, 104));
        name.setForeground(new Color(239, 243, 248));
        name.setFont(new Font("Tahoma", Font.PLAIN, 35));
        name.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        frame.add(name);

        password = new JTextField();
        password.setSize(500,500);
        password.setBounds(120,180,260,70);
        password.setBackground(new Color(83, 94, 104));
        password.setForeground(new Color(239, 243, 248));
        password.setFont(new Font("Tahoma", Font.PLAIN, 35));
        password.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        frame.add(password);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
        String user = name.getText();
        String pass = password.getText();
        System.out.println(user + ", " + pass);

        if (user.equals("Kenneth") && pass.equals("12345")){
            label.setText("Successful!");
            label.setBounds(155,3,200,100);
            name.setText("");
            password.setText("");
            ui.setBackground(new Color(123, 208, 239));
        }
        else{
            label.setText("WRONG!");
            label.setBounds(175,3,200,100);
            name.setText("");
            password.setText("");
            ui.setBackground(new Color(228, 98, 98));
            
        }
    }

}
