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
import java.awt.Color;

public class U_Ffile {
	
	
	static String Store="";

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U_Ffile window = new U_Ffile();
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
	public U_Ffile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
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
		
		JButton button = new JButton("登出");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.main(null);
				frame.setVisible(false);
			}
		});
		button.setFont(new Font("標楷體", Font.BOLD, 20));
		button.setBounds(1164, 15, 87, 23);
		panel.add(button);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("標楷體", Font.BOLD, 20));
		lblNewLabel_2.setBounds(800, 19, 166, 19);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setText("歡迎，"+Login.NowLogin);
		
		JButton btnEkbpyUxl = new JButton("返回搜尋");
		btnEkbpyUxl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				User_Page U_page = new User_Page();
				U_page.main(null);
				frame.setVisible(false);
			}
		});
		btnEkbpyUxl.setFont(new Font("標楷體", Font.BOLD, 20));
		btnEkbpyUxl.setBounds(1034, 15, 120, 23);
		panel.add(btnEkbpyUxl);
		
		JLabel label = new JLabel("姓名");
		label.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		label.setBounds(378, 256, 236, 48);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("生日");
		label_1.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		label_1.setBounds(378, 327, 236, 48);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("連絡電話");
		label_2.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		label_2.setBounds(315, 406, 236, 48);
		frame.getContentPane().add(label_2);
		
		textField = new JTextField();
		textField.setBounds(459, 265, 324, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(459, 336, 324, 28);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(459, 415, 324, 28);
		frame.getContentPane().add(textField_2);
		
		

		JLabel lblNewLabel_3 = new JLabel("修改成功");
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblNewLabel_3.setBounds(828, 271, 90, 15);
		frame.getContentPane().add(lblNewLabel_3);
		lblNewLabel_3.setVisible(false);
		
		JLabel label_3 = new JLabel("修改成功");
		label_3.setForeground(Color.BLUE);
		label_3.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		label_3.setBackground(Color.WHITE);
		label_3.setBounds(828, 342, 90, 15);
		frame.getContentPane().add(label_3);
		label_3.setVisible(false);
		
		JLabel label_4 = new JLabel("修改成功");
		label_4.setForeground(Color.BLUE);
		label_4.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		label_4.setBackground(Color.WHITE);
		label_4.setBounds(828, 421, 90, 15);
		frame.getContentPane().add(label_4);
		label_4.setVisible(false);
		
		JButton button_1 = new JButton("修改");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print(Normal.U_Name);
				if(!textField.getText().equals("")) {
					Store=textField.getText().toString();
					Normal.U_Name.set(Login.Aindex, Store);
					lblNewLabel_3.setVisible(true);
				}
				else {
					lblNewLabel_3.setVisible(false);
				}
				if(!textField_1.getText().equals("")) {
					Normal.U_Birth.set(Login.Aindex, textField_1.getText());
					label_3.setVisible(true);
				}
				else {
					label_3.setVisible(false);
				}
				if(!textField_2.getText().equals("")) {
					Normal.U_Contact.set(Login.Aindex, textField_2.getText());
					label_4.setVisible(true);
				}
				else {
					label_4.setVisible(false);
				}
				System.out.print(Normal.U_Name.get(Login.Aindex));
				
			}
		});
		button_1.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		button_1.setBounds(546, 521, 133, 34);
		frame.getContentPane().add(button_1);
		
		
		
	}

}
