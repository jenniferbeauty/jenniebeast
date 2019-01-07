import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Normal {
	static ArrayList<String> B_Account =new ArrayList<String>();
	static ArrayList<String> B_Password =new ArrayList<String>();
	static ArrayList<String> U_Account =new ArrayList<String>();
	static ArrayList<String> U_Password =new ArrayList<String>();
	static ArrayList<String> U_Name =new ArrayList<String>();
	static ArrayList<String> U_Birth =new ArrayList<String>();
	static ArrayList<String> U_Contact =new ArrayList<String>();
	static ArrayList<String> B_Name =new ArrayList<String>();
	static ArrayList<String> B_Pay =new ArrayList<String>();
	static ArrayList<String> B_Location =new ArrayList<String>();
	static ArrayList<String> B_work =new ArrayList<String>();
	static ArrayList<Integer> FindWorkindex =new ArrayList<Integer>();
	static ArrayList<String> Workrequest =new ArrayList<String>();
	static ArrayList<String> employee =new ArrayList<String>();
	static ArrayList<Integer> Findemployee =new ArrayList<Integer>();
	static ArrayList<Integer> Findrequest =new ArrayList<Integer>();
	static ArrayList<Integer> FindWork =new ArrayList<Integer>();
	static ArrayList<Integer> requestState =new ArrayList<Integer>();
	
	
	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Normal window = new Normal();
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
	public Normal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		
		B_Account.add("JN");
		B_Password.add("JN87");
		U_Account.add("");
		U_Password.add("");
		frame = new JFrame();
		frame.setBounds(100, 100, 1300, 960);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1280, 48);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("珍妮野獸人力銀行",SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 256, 48);
		lblNewLabel.setFont(new java.awt.Font("標楷體", 1, 20));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(256, 0, 768, 48);
		panel.add(lblNewLabel_1);
		
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
		
		JButton btnNewButton = new JButton("企業登入");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login_B login_b = new Login_B();
				login_b.main(null);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(1152, 0, 128, 48);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 48, 1280, 48);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(48, 6, 756, 36);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(804, 6, 128, 36);
		comboBox.addItem("北部");
		comboBox.addItem("中部");
		comboBox.addItem("南部");
		String 地區 = comboBox.getSelectedItem().toString();
		panel_1.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(932, 6, 128, 36);
		comboBox_1.addItem("20k~30k");
		comboBox_1.addItem("30k~40k");
		comboBox_1.addItem("40k 以上");
		String 薪資 = comboBox_1.getSelectedItem().toString();
		panel_1.add(comboBox_1);
		
		JButton btnNewButton_1 = new JButton("搜尋");
		btnNewButton_1.setBounds(1060, 6, 128, 36);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 96, 1280, 817);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(48, 48, 1184, 512);
		panel_2.add(panel_3);
		
	}
}
