import javax.swing.*;
import java.awt.*;

public class about  {
    JFrame frame;
    JLabel title1 = new JLabel("Vision");
    JLabel thoughts1Label=new JLabel("To evolve and flourish as a progressive centre for modern technical education,");
    JLabel thoughts2Label=new JLabel("stirring creativity in every student leading to self-sustainable professionals,");
    JLabel thoughts3Label=new JLabel("through holistic development; nurtured by strength and legitimate pride of Indian ");
    JLabel thoughts4Label=new JLabel("values and ethics.");
    JLabel thoughts5Label=new JLabel("1. To provide industry oriented quality education.");
    JLabel thoughts6Label=new JLabel("2. To provide holistic environment for overall personal development.");
    JLabel thoughts7Label=new JLabel("3. To foster relationship with other institute of repute, alumni and industry.");
    JLabel title2 = new JLabel("MISSION");
    about()
    {
        createWindow();
        setLocationAndSize();
        frame.setSize(700,700);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        addComponentsToFrame();
        
    }
    public void createWindow()
    {
        frame=new JFrame();
        frame.setTitle("About us");
        frame.setBounds(40,40,380,600);
        frame.getContentPane().setBackground(Color.lightGray);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.getContentPane().setLayout(new BorderLayout());
    	frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\prati\\eclipse-workspace\\Registrationform\\src\\images\\download2.jfif")));
    	//frame.getContentPane().setLayout(new FlowLayout());
    	thoughts1Label.setFont(new Font("Mukti Narrow", Font.BOLD | Font.ITALIC , 16));
    	thoughts1Label.setForeground(Color.black);
    	thoughts2Label.setFont(new Font("Mukti Narrow", Font.BOLD | Font.ITALIC , 16));
    	thoughts2Label.setForeground(Color.black);
    	thoughts3Label.setFont(new Font("Mukti Narrow", Font.BOLD | Font.ITALIC , 16));
    	thoughts3Label.setForeground(Color.black);
    	thoughts4Label.setFont(new Font("Mukti Narrow", Font.BOLD | Font.ITALIC , 16));
    	thoughts4Label.setForeground(Color.black);
    	title1.setFont(new Font("Mukti Narrow", Font.BOLD | Font.ITALIC , 20));
    	title1.setForeground(Color.black);
    	title2.setFont(new Font("Mukti Narrow", Font.BOLD | Font.ITALIC , 20));
    	title2.setForeground(Color.yellow);
    	thoughts5Label.setFont(new Font("Mukti Narrow", Font.BOLD | Font.ITALIC , 16));
    	thoughts5Label.setForeground(Color.yellow);
    	thoughts7Label.setFont(new Font("Mukti Narrow", Font.BOLD | Font.ITALIC , 16));
    	thoughts7Label.setForeground(Color.yellow);
    	thoughts6Label.setFont(new Font("Mukti Narrow", Font.BOLD | Font.ITALIC , 16));
    	thoughts6Label.setForeground(Color.yellow);
    	
    }
    
    public void setLocationAndSize()
    {
        thoughts1Label.setBounds(25,-210,700,700);
        thoughts2Label.setBounds(25,-190,700,700);
        thoughts3Label.setBounds(25,-170,700,700);
        thoughts4Label.setBounds(25,-150,700,700);
        title1.setBounds(25,-140,500,500);
        title2.setBounds(25,80,500,500);
        thoughts5Label.setBounds(25,20,700,700);
        thoughts6Label.setBounds(25,40,700,700);
        thoughts7Label.setBounds(25,60,700,700);
    }
    
    public void addComponentsToFrame()
    {      
        frame.add(thoughts1Label);
        frame.add(thoughts2Label);
        frame.add(thoughts3Label);
        frame.add(thoughts4Label);   
        frame.add(title1);
        frame.add(title2);
        frame.add(thoughts5Label);
        frame.add(thoughts6Label);
        frame.add(thoughts7Label);
    }
      public static void main(String[] args) {
        new about();
    }
}