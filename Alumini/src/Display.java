import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;

public class Display extends JFrame {

	private JPanel contentPane;
	private javax.swing.JTable jt1;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Display frame = new Display();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
public Display() {
	
	
	//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(600, 200, 400, 305);
	setSize(500,400);
	setLocationRelativeTo(null);
	setResizable(false);
	setVisible(true);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(100, 100, 500, 550));
	setContentPane(contentPane);
	contentPane.setLayout(null);	
	
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(10, 63, 400, 107);
	contentPane.add(scrollPane);
	my_mysql obj=new my_mysql();
		
	String[] column= {"USERNAME","GENDER","YEAR_OF_JOIN","YEAR_OF_PASS", "PROFESSION", "CITY", "EMIAL"};
	
	jt1 = new javax.swing.JTable(obj.my_db_select(),column);
	scrollPane.setViewportView(jt1);
	}
}
