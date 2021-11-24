import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.ImageIcon;
import java.sql.*;

public class RegistrationForm implements ActionListener {
    JFrame frame;
    String[] gender={"Male","Female"};
    String Y_tmp[]={"1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};
    String X_tmp[]={"1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};
    ImageIcon icon = new ImageIcon("C:\\Users\\prati\\eclipse-workspace\\Registrationform\\src\\images\\fcritlogo.jpg");
    JLabel label = new JLabel(icon);
    JLabel titleLabel=new JLabel("Welcome to the registration page for alumini. Please take a moment to fill out the form below.");
    JLabel nameLabel=new JLabel("NAME");
    JLabel genderLabel=new JLabel("GENDER");
    JLabel joinLabel=new JLabel("YEAR OF JOIN");
    JLabel passLabel=new JLabel("YEAR OF PASS");
    JLabel profLabel=new JLabel("PROFESSION");
    JLabel passwordLabel=new JLabel("PASSWORD");
    JLabel confirmPasswordLabel=new JLabel("CONFIRM PASSWORD");
    JLabel cityLabel=new JLabel("CITY");
    JLabel emailLabel=new JLabel("EMAIL");
    JTextField nameTextField=new JTextField();
    JComboBox genderComboBox=new JComboBox(gender);
    JComboBox joinComboBox=new JComboBox(Y_tmp);
    JComboBox passComboBox=new JComboBox(X_tmp);
    JTextField profTextField=new JTextField();
    JPasswordField passwordField=new JPasswordField();
    JPasswordField confirmPasswordField=new JPasswordField();
    JTextField cityTextField=new JTextField();
    JTextField emailTextField=new JTextField();
    JButton registerButton=new JButton("REGISTER");
    JButton resetButton=new JButton("RESET");
    


    RegistrationForm()
    {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        actionEvent();
        
    }
    
    public void createWindow()
    {
        frame=new JFrame();
        frame.setTitle("Registration Form");	
        frame.setBounds(40,40,380,600);
        frame.getContentPane().setBackground(Color.white);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
    public void setLocationAndSize()
    {
    	titleLabel.setBounds(1,1,4000,70);
    	label.setBounds(400,80,400,400);
    	nameLabel.setBounds(20,30,40,70);
        genderLabel.setBounds(20,70,80,70);
        joinLabel.setBounds(20,120,100,70);
        passLabel.setBounds(20,170,100,70);
        profLabel.setBounds(20,220,100,70);
        passwordLabel.setBounds(20,270,100,70);
        confirmPasswordLabel.setBounds(20,320,140,70);
        cityLabel.setBounds(20,370,100,70);
        emailLabel.setBounds(20,420,100,70);
        nameTextField.setBounds(180,55,165,23);
        genderComboBox.setBounds(180,93,165,23);
        joinComboBox.setBounds(180,143,165,23);
        passComboBox.setBounds(180,195,165,23);
        passwordField.setBounds(180,295,165,23);
        confirmPasswordField.setBounds(180,345,165,23);
        cityTextField.setBounds(180,395,165,23);
        profTextField.setBounds(180,245,165,23);
        emailTextField.setBounds(180,445,165,23);
        registerButton.setBounds(70,500,100,35);
        resetButton.setBounds(220,500,100,35);
    }
    public void addComponentsToFrame()
    {
    	frame.add(titleLabel);
    	frame.add(label);
    	frame.add(nameLabel);
        frame.add(genderLabel);
        frame.add(joinLabel);
        frame.add(passLabel);
        frame.add(profLabel);
        frame.add(passwordLabel);
        frame.add(confirmPasswordLabel);
        frame.add(cityLabel);
        frame.add(emailLabel);
        frame.add(nameTextField);
        frame.add(genderComboBox);
        frame.add(joinComboBox);
        frame.add(passComboBox);
        frame.add(profTextField);
        frame.add(passwordField);
        frame.add(confirmPasswordField);
        frame.add(cityTextField);
        frame.add(emailTextField);
        frame.add(registerButton);
        frame.add(resetButton);
    }
    public void actionEvent()
    {
        registerButton.addActionListener(this);
        resetButton.addActionListener(this);
    }
       

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==registerButton)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Alumini","root","Okay@2020");
                PreparedStatement Pstatement=connection.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?)");
                Pstatement.setString(1,nameTextField.getText());
                Pstatement.setString(2,genderComboBox.getSelectedItem().toString());
                Pstatement.setString(3,joinComboBox.getSelectedItem().toString());
                Pstatement.setString(4,passComboBox.getSelectedItem().toString());
                Pstatement.setString(5,profTextField.getText());
                Pstatement.setString(8,passwordField.getText());
                Pstatement.setString(9,confirmPasswordField.getText());
                Pstatement.setString(6,cityTextField.getText());
                Pstatement.setString(7,emailTextField.getText());
                if(passwordField.getText().equalsIgnoreCase(confirmPasswordField.getText()))
                {

                    Pstatement.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Data Registered Successfully");
                    new LoginForm1();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"password did not match");
                }

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        if(e.getSource()==resetButton)
        {
            nameTextField.setText("");
            genderComboBox.setSelectedItem("Male");
            joinComboBox.setSelectedItem("2016");
            passComboBox.setSelectedItem("2020");
            profTextField.setText("");
            passwordField.setText("");
            confirmPasswordField.setText("");
            cityTextField.setText("");
            emailTextField.setText("");
        }

    }
}
