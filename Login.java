import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	static boolean Acheck=false;
	static boolean Pcheck=false;
	static int FindAccount = -1;
	static int Aindex=-1;
	static String NowLogin ="";
	private void initialize() {

		Normal.B_Account.add("JN");
		Normal.B_Password.add("JN87");
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
		button.setBounds(1024, 0, 128, 48);
		panel.add(button);

		JButton button_1 = new JButton("企業登入");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_B login_b = new Login_B();
				login_b.main(null);
				frame.setVisible(false);
			}
		});
		button_1.setBounds(1152, 0, 128, 48);
		panel.add(button_1);

		JLabel label_1 = new JLabel("珍    野    會    登");
		label_1.setFont(new Font("Meiryo", Font.BOLD, 39));
		label_1.setBounds(453, 204, 351, 85);
		frame.getContentPane().add(label_1);

		JLabel label_2 = new JLabel("妮    獸    員    入");
		label_2.setFont(new Font("Meiryo", Font.BOLD, 39));
		label_2.setBounds(475, 251, 327, 60);
		frame.getContentPane().add(label_2);

		textField = new JTextField();
		textField.setFont(new Font("新細明體", Font.PLAIN, 20));
		textField.setBounds(464, 310, 291, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("新細明體", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(464, 367, 291, 35);
		frame.getContentPane().add(textField_1);

		JLabel label_3 = new JLabel("帳號");
		label_3.setFont(new Font("標楷體", Font.PLAIN, 30));
		label_3.setBounds(381, 282, 166, 80);
		frame.getContentPane().add(label_3);

		JLabel label_4 = new JLabel("密碼");
		label_4.setFont(new Font("標楷體", Font.PLAIN, 30));
		label_4.setBounds(381, 339, 166, 80);
		frame.getContentPane().add(label_4);

		//boolean Acheck = false;
		//boolean Pcheck = false;

		JButton btnNewButton = new JButton("登入");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Acheck=false;
				Pcheck=false;
				if (!textField.getText().contentEquals("")) {
					if (!textField_1.getText().contentEquals("")) {
						for (int i = 0; i < Normal.U_Account.size(); i++) {
							if (textField.getText().equals(Normal.U_Account.get(i))) {
								Acheck=true;
								Aindex=i;
							}
						}
						if(textField_1.getText().contentEquals(Normal.U_Password.get(Aindex))) {
							Pcheck=true;
						}
						if(Acheck==true&&Pcheck==true) {
							NowLogin=textField.getText();
							User_Page U_page = new User_Page();
							U_page.main(null);
							frame.setVisible(false);
							Acheck=false;
							Pcheck=false;
						}
					}
				}
			}
		});
		btnNewButton.setFont(new Font("標楷體", Font.BOLD, 20));
		btnNewButton.setBounds(466, 436, 107, 35);
		frame.getContentPane().add(btnNewButton);

		JLabel label_5 = new JLabel("帳號已存在");
		label_5.setForeground(Color.RED);
		label_5.setFont(new Font("標楷體", Font.BOLD, 25));
		label_5.setBounds(782, 315, 177, 25);
		frame.getContentPane().add(label_5);

		JLabel label_6 = new JLabel("註冊成功");
		label_6.setForeground(Color.RED);
		label_6.setFont(new Font("標楷體", Font.BOLD, 25));
		label_6.setBounds(782, 311, 177, 25);
		frame.getContentPane().add(label_6);

		label_5.setVisible(false);
		label_6.setVisible(false);
		JButton button_2 = new JButton("註冊");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FindAccount = -1;
				if (!textField.getText().contentEquals("")) {
					if (!textField_1.getText().contentEquals("")) {

						for (int i = 0; i < Normal.U_Account.size(); i++) {
							if (textField.getText().equals(Normal.U_Account.get(i))) {
								FindAccount = i;
							}
						}
						if (FindAccount >= 0) {
							label_6.setVisible(false);
							label_5.setVisible(true);
						} else {
							Normal.U_Account.add(textField.getText());
							Normal.U_Password.add(textField_1.getText());
							Normal.U_Birth.add("");
							Normal.U_Contact.add("");
							Normal.U_Name.add("");
							label_5.setVisible(false);
							label_6.setVisible(true);
						}
					}
				}
			}
		});
		button_2.setFont(new Font("標楷體", Font.BOLD, 20));
		button_2.setBounds(648, 436, 107, 35);
		frame.getContentPane().add(button_2);

	}
}
