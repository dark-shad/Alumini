import javax.swing.*;
import java.awt.event.*;  
import java.awt.*;


public class Home implements ActionListener
{
    JFrame frame;
    JLabel welLabel=new JLabel("Fr. Conceicao Rodrigues College of Engineering");
    JButton loginButton=new JButton("LOGIN");
    JButton registerButton=new JButton("REGISTER");
    JButton aboutButton=new JButton("ABOUT US");
    


    Home()
    {
        createWindow();
        setLocationAndSize();
        frame.setSize(800,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        addComponentsToFrame();
        actionEvent();
        
    }
    public void createWindow()
    {
        frame=new JFrame();
        frame.setTitle("Home");
        frame.setBounds(40,40,380,600);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        welLabel.setFont(new Font("Mukti Narrow", Font.BOLD | Font.ITALIC, 30));
    	welLabel.setForeground(Color.black);
    	frame.getContentPane().setLayout(new BorderLayout());
    	frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\prati\\eclipse-workspace\\Registrationform\\src\\images\\home.JPEG")));
    	frame.getContentPane().setLayout(new FlowLayout());
        
        
    }
    
    public void setLocationAndSize()
    { 
        welLabel.setBounds(50,-250,700,700);
        registerButton.setBounds(390,10,100,35);
        aboutButton.setBounds(520,10,100,35);
        loginButton.setBounds(650,10,100,35);
        
    }
    
    public void addComponentsToFrame()
    {
        frame.add(aboutButton);
        frame.add(welLabel);
        frame.add(registerButton);
        frame.add(loginButton);
       
        
    }
    public void actionEvent()
    {
       loginButton.addActionListener(this);
       registerButton.addActionListener(this);
       aboutButton.addActionListener(this);
       
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loginButton)
        {
        	new LoginForm1();
        }
        if(e.getSource()==registerButton)
        {
        	new RegistrationForm();
        }
        if(e.getSource()==aboutButton)
        {
        	new about();
        }
    }
}

    
  