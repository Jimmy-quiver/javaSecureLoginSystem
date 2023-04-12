// import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignUpOrLogin extends JFrame implements ActionListener{
    String username, password;

    Font font;
    Font inputFont;

    Color primaryColor;
    
    JFrame signUpOrLoginFrame;

    JPanel signUPanel;
    JPanel logInPanel;

    // JLabel signUpLabel;
    // JLabel logInLabel;
    JLabel signUpUserNameLabel;
    JLabel logInUserNameLabel;
    JLabel signUpPasswordLabel;
    JLabel logInPasswordLabel;
    JLabel signUpInsteadLabel;
    JLabel logInInsteadLabel;

    JTextField signUpUserNameTextField;
    JTextField logInUserNameTextField;
    JPasswordField signUpPasswordField;
    JPasswordField logInPasswordField;

    JButton signUpSubmit;
    JButton logInSubmit;
    JButton signUpClear;
    JButton logInClear;
    JButton signUpButton;
    JButton logInButton;

    SignUpOrLogin(){
        this.username = "User";
        this.password = "1234";

        font = new Font("Arial", Font.BOLD, 18);
        inputFont = new Font("Arial", Font.PLAIN, 14);

        primaryColor = new Color(0x123456);

        // sign Up Button
        signUpButton =new JButton("Sign Up");
        signUpButton.setBounds(10, 300, 80, 30);
        signUpButton.setFocusable(false);
        signUpButton.setBackground(primaryColor);
        signUpButton.setForeground(Color.WHITE);
        signUpButton.setBorder(BorderFactory.createEtchedBorder());
        signUpButton.addActionListener(this);
        
        // log in button
        logInButton =new JButton("Log in");
        logInButton.setBounds(10, 300, 80, 30);
        logInButton.setFocusable(false);
        logInButton.setBackground(primaryColor);
        logInButton.setForeground(Color.WHITE);
        logInButton.addActionListener(this);

        // sign up submit button
        signUpSubmit = new JButton("OK");
        signUpSubmit.setBounds(120, 200, 60, 30);
        signUpSubmit.setFocusable(false);
        signUpSubmit.setBackground(primaryColor);
        signUpSubmit.setForeground(Color.WHITE);
        signUpSubmit.addActionListener(this);

        // log in submit
        logInSubmit = new JButton("OK");
        logInSubmit.setBounds(120, 200, 60, 30);
        logInSubmit.setFocusable(false);
        logInSubmit.setBackground(primaryColor);
        logInSubmit.setForeground(Color.WHITE);
        logInSubmit.addActionListener(this);

        // sign up clear button
        signUpClear = new JButton("Clear");
        signUpClear.setBounds(210, 200, 70, 30);
        signUpClear.setFocusable(false);
        signUpClear.setBackground(primaryColor);
        signUpClear.setForeground(Color.WHITE);
        signUpClear.addActionListener(this);

        // log in clear button
        logInClear = new JButton("Clear");
        logInClear.setBounds(210, 200, 70, 30);
        logInClear.setFocusable(false);
        logInClear.setBackground(primaryColor);
        logInClear.setForeground(Color.WHITE);
        logInClear.addActionListener(this);

        // sign up label
        // signUpLabel = new JLabel("Sign Up Tab");
        // signUpLabel.setHorizontalAlignment(JLabel.CENTER);
        // signUpLabel.setFont(font);
        // signUpLabel.setBackground(primaryColor);

        // sign up username label
        signUpUserNameLabel = new JLabel("Username: ");
        signUpUserNameLabel.setBounds(10, 10, 150, 40);;
        signUpUserNameLabel.setFont(font);
        signUpUserNameLabel.setForeground(primaryColor);
        signUpUserNameLabel.setVisible(true);

        // sign up username text field
        signUpUserNameTextField = new JTextField();
        signUpUserNameTextField.setBounds(130, 20, 150, 30);
        signUpUserNameTextField.setForeground(primaryColor);
        signUpUserNameTextField.setFont(inputFont);
        signUpUserNameTextField.setBorder(BorderFactory.createLineBorder(primaryColor));

        // log in username label
        logInUserNameLabel = new JLabel("Username: ");
        logInUserNameLabel.setBounds(10, 10, 150, 40);;
        logInUserNameLabel.setFont(font);
        logInUserNameLabel.setForeground(primaryColor);
        logInUserNameLabel.setVisible(true);

        // log in username text field
        logInUserNameTextField = new JTextField();
        logInUserNameTextField.setBounds(130, 20, 150, 30);
        logInUserNameTextField.setForeground(primaryColor);
        logInUserNameTextField.setFont(inputFont);
        logInUserNameTextField.setBorder(BorderFactory.createLineBorder(primaryColor));

        // sign up password label
        signUpPasswordLabel = new JLabel("Password: ");
        signUpPasswordLabel.setBounds(10, 70, 150, 40);;
        signUpPasswordLabel.setFont(font);
        signUpPasswordLabel.setForeground(primaryColor);
        signUpPasswordLabel.setVisible(true);

        // log in password label
        logInPasswordLabel = new JLabel("Password: ");
        logInPasswordLabel.setBounds(10, 70, 150, 40);;
        logInPasswordLabel.setFont(font);
        logInPasswordLabel.setForeground(primaryColor);
        logInPasswordLabel.setVisible(true);

        // sign up instead label
        signUpInsteadLabel = new JLabel("Sign Up instead: ");
        signUpInsteadLabel.setBounds(10, 260, 150, 40);;
        signUpInsteadLabel.setFont(inputFont);
        signUpInsteadLabel.setForeground(primaryColor);
        signUpInsteadLabel.setVisible(true);

        // log in instead label
        logInInsteadLabel = new JLabel("Log In instead: ");
        logInInsteadLabel.setBounds(10, 260, 150, 40);;
        logInInsteadLabel.setFont(inputFont);
        logInInsteadLabel.setForeground(primaryColor);
        logInInsteadLabel.setVisible(true);

        // log in password field
        logInPasswordField = new JPasswordField();
        logInPasswordField.setBounds(130, 80, 150, 30);
        logInPasswordField.setForeground(primaryColor);
        logInPasswordField.setFont(inputFont);
        logInPasswordField.setBorder(BorderFactory.createLineBorder(primaryColor));

        // sign up password field
        signUpPasswordField = new JPasswordField();
        signUpPasswordField.setBounds(130, 80, 150, 30);
        signUpPasswordField.setForeground(primaryColor);
        signUpPasswordField.setFont(inputFont);
        signUpPasswordField.setBorder(BorderFactory.createLineBorder(primaryColor));

        // sign up panel
        signUPanel  = new JPanel();
        signUPanel.setLayout(null);
        signUPanel.setBounds(60,20,300,350);
        signUPanel.add(signUpUserNameLabel);
        signUPanel.add(signUpUserNameTextField);
        signUPanel.add(signUpPasswordLabel);
        signUPanel.add(signUpPasswordField);
        signUPanel.add(signUpSubmit);
        signUPanel.add(signUpClear);
        signUPanel.add(logInButton);
        signUPanel.add(logInInsteadLabel);

        // log in panel
        logInPanel  = new JPanel();
        logInPanel.setLayout(null);
        logInPanel.setBounds(60,20,300,350);
        logInPanel.add(logInUserNameLabel);
        logInPanel.add(logInUserNameTextField);
        logInPanel.add(logInPasswordLabel);
        logInPanel.add(logInPasswordField);
        logInPanel.add(logInSubmit);
        logInPanel.add(logInClear);
        logInPanel.add(signUpButton);
        logInPanel.add(signUpInsteadLabel);

        // sign up or log in frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Log In");
        this.setSize(420, 420);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);
        // this.add(signUpLabel);
        // this.add(logInLabel);
        this.add(logInPanel);
        this.add(signUPanel);


    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getSource()==signUpButton)
        {
            signUPanel.setVisible(true);
            logInPanel.setVisible(false);
            this.setTitle("Sign Up");
        }
        else if(event.getSource()==logInButton)
        {
            signUPanel.setVisible(false);
            logInPanel.setVisible(true);
            this.setTitle("Log In");
        }
        else if(event.getSource()==logInClear)
        {
            logInUserNameTextField.setText("");
            logInPasswordField.setText("");
        }
        else if(event.getSource()==signUpClear)
        {
            signUpUserNameTextField.setText("");
            signUpPasswordField.setText("");
        }
        else if(event.getSource()==signUpSubmit)
        {
            new Dashboard();
            dispose();
        }
        else
        {
            if (logInUserNameTextField.getText() == null ? username == null : logInPasswordField.getText().equals(password)&& logInUserNameTextField.getText().equals(username))
            {
                JOptionPane.showMessageDialog(logInPanel, "Login Successfull");
                new Dashboard();
                dispose();
            } 
            else 
            {
                JOptionPane.showMessageDialog(logInPanel, "Username or Password Mismatch", "Alert", JOptionPane.WARNING_MESSAGE); 
                logInUserNameTextField.setText("");
                logInPasswordField.setText("");   
            }
        }
    }
}