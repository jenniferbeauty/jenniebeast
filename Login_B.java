import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login_B {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	static boolean Acheck=false;
	static boolean Pcheck=false;
	static int Aindex=-1;
	static String NowLogin="";
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_B window = new Login_B();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login_B() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1280, 960);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1280, 48);
		panel.setLayout(null);
		frame.getContentPane().add(panel);
		
		JLabel label = new JLabel("珍妮野獸人力銀行", SwingConstants.CENTER);
		label.setFont(new Font("Dialog", Font.BOLD, 20));
		label.setBounds(0, 0, 256, 48);
		panel.add(label);
		
		JButton button = new JButton("求職者登入/註冊");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.main(null);
				frame.setVisible(false);
			}
		});
		button.setBounds(1024, 0, 128, 48);
		panel.add(button);
		
		JButton button_1 = new JButton("企業登入");
		button_1.setBounds(1152, 0, 128, 48);
		panel.add(button_1);
		
		JLabel label_1 = new JLabel("珍    野    企    登");
		label_1.setFont(new Font("Meiryo", Font.BOLD, 39));
		label_1.setBounds(453, 204, 351, 85);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("妮    獸    業    入");
		label_2.setFont(new Font("Meiryo", Font.BOLD, 39));
		label_2.setBounds(475, 251, 327, 60);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("帳號");
		label_3.setFont(new Font("標楷體", Font.PLAIN, 30));
		label_3.setBounds(381, 282, 166, 80);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("密碼");
		label_4.setFont(new Font("標楷體", Font.PLAIN, 30));
		label_4.setBounds(381, 339, 166, 80);
		frame.getContentPane().add(label_4);
		
		textField = new JTextField();
		textField.setBounds(475, 309, 313, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(476, 361, 312, 28);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton button_2 = new JButton("登入");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Acheck=false;
				Pcheck=false;
				if (!textField.getText().contentEquals("")) {
					if (!textField_1.getText().contentEquals("")) {
						for (int i = 0; i < Normal.B_Account.size(); i++) {
							if (textField.getText().equals(Normal.B_Account.get(i))) {
								Acheck=true;
								Aindex=i;
								if(textField_1.getText().contentEquals(Normal.B_Password.get(Aindex))) {
									Pcheck=true;
								}
							}
						}
						
						if(Acheck==true&&Pcheck==true) {////////////////////////////////////////////////////////////////////記得改

							NowLogin=textField.getText();
							B_Page B_page = new B_Page();
							B_page.main(null);
							frame.setVisible(false);
							Acheck=false;
							Pcheck=false;
						}
					}
				}
			
			
			}
		});
		button_2.setFont(new Font("標楷體", Font.PLAIN, 20));
		button_2.setBounds(567, 431, 87, 23);
		frame.getContentPane().add(button_2);
		
		JLabel lblxxxxxxx = new JLabel("如需加入企業會員請洽 (07)-XXX-XXXX");
		lblxxxxxxx.setFont(new Font("標楷體", Font.PLAIN, 20));
		lblxxxxxxx.setBounds(672, 869, 582, 42);
		frame.getContentPane().add(lblxxxxxxx);

	}

}
