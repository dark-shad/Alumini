
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;


public class LoginForm1 implements ActionListener {
    JFrame frame;
    JLabel nameLabel=new JLabel("USERNAME");
    JLabel thought1Label=new JLabel("Nobody is Bothered about an Institution more ");
    JLabel thought2Label=new JLabel("than its Alumini.");
    JLabel passwordLabel=new JLabel("PASSWORD");
    JTextField nameTextField=new JTextField();
    JPasswordField passwordField=new JPasswordField();
    JButton registerButton=new JButton("CONFIRM");
    String passwrd = "1234";

    LoginForm1()
    {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        actionEvent();
        frame.setSize(600,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public void createWindow()
    {
        frame=new JFrame();
        frame.setTitle("Login Portal");
        frame.setBounds(40,40,380,600);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.getContentPane().setLayout(new BorderLayout());
    	frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\prati\\eclipse-workspace\\Registrationform\\src\\images\\download.png")));
    	thought1Label.setFont(new Font("Mukti Narrow", Font.BOLD | Font.ITALIC , 24));
    	thought1Label.setForeground(Color.black);
    	thought2Label.setFont(new Font("Mukti Narrow", Font.BOLD | Font.ITALIC , 24));
    	thought2Label.setForeground(Color.black);
    	nameLabel.setFont(new Font("Mukti Narrow", Font.BOLD | Font.ITALIC , 16));
    	nameLabel.setForeground(Color.black);
    	passwordLabel.setFont(new Font("Mukti Narrow", Font.BOLD | Font.ITALIC , 16));
    	passwordLabel.setForeground(Color.black);
    }
    public void setLocationAndSize()
    {
        thought1Label.setBounds(20,-200,550,500);
        thought2Label.setBounds(20,-160,550,500);
        nameLabel.setBounds(140,100,100,100);
        passwordLabel.setBounds(140,180,100,70);
        nameTextField.setBounds(270,140,165,23);
        passwordField.setBounds(270,205,165,23);
        registerButton.setBounds(220,300,100,35);

    }
    public void addComponentsToFrame()
    {
        frame.add(nameLabel);
        frame.add(thought1Label);
        frame.add(thought2Label);
        frame.add(passwordLabel);
        frame.add(nameTextField);
        frame.add(passwordField);
        frame.add(registerButton);

    }
    public void actionEvent()
    {
        registerButton.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==registerButton)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Alumini","root","Okay@2020");
                PreparedStatement Pstatement=connection.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?)");
                Pstatement.setString(1,nameTextField.getText());
                Pstatement.setString(2,null);
                Pstatement.setString(3,null);
                Pstatement.setString(4,null);
                Pstatement.setString(5,null);
                Pstatement.setString(6,null);
                Pstatement.setString(7,null);
                Pstatement.setString(8,passwordField.getText());
                Pstatement.setString(9,null);
                if(passwordField.getText().equals(passwrd))
                {

                    Pstatement.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Login Successfully");
                    new Display();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"password did not match");
                }

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }


    }

    public static void main(String[] args) {
        new LoginForm1();
    }
}