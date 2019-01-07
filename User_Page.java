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
import java.awt.event.ActionEvent;
import java.awt.Color;

public class User_Page {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User_Page window = new User_Page();
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
	public User_Page() {
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

		JLabel lblNewLabel = new JLabel("珍妮野獸人力銀行", SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 256, 48);
		lblNewLabel.setFont(new java.awt.Font("標楷體", 1, 20));
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(256, 0, 768, 48);
		panel.add(lblNewLabel_1);

		JButton button = new JButton("登出");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login= new Login();
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
		lblNewLabel_2.setText("歡迎，" + Login.NowLogin);

		JButton btnEkbpyUxl = new JButton("個人資料");
		btnEkbpyUxl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				U_Ffile u_file = new U_Ffile();
				u_file.main(null);
				frame.setVisible(false);
			}
		});
		btnEkbpyUxl.setFont(new Font("標楷體", Font.BOLD, 20));
		btnEkbpyUxl.setBounds(1034, 15, 120, 23);
		panel.add(btnEkbpyUxl);

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
		panel_1.add(comboBox);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(932, 6, 128, 36);
		comboBox_1.addItem("20k~29k");
		comboBox_1.addItem("30k~39k");
		comboBox_1.addItem("40k 以上");
		panel_1.add(comboBox_1);
		

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 96, 1280, 817);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(48, 48, 1184, 512);
		panel_2.add(panel_3);
		panel_3.setLayout(null);

		JLabel label_1 = new JLabel("工作名稱:");
		label_1.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		label_1.setBounds(10, 43, 529, 34);
		panel_3.add(label_1);
		label_1.setVisible(false);

		JLabel label_2 = new JLabel("薪資:");
		label_2.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		label_2.setBounds(89, 108, 529, 34);
		panel_3.add(label_2);
		label_2.setVisible(false);

		JLabel label_3 = new JLabel("工作地區:");
		label_3.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		label_3.setBounds(89, 181, 529, 34);
		panel_3.add(label_3);
		label_3.setVisible(false);
		

		JLabel label_4 = new JLabel("履歷已送出");
		label_4.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		label_4.setBounds(770, 290, 186, 19);
		panel_3.add(label_4);
		

		JLabel label_6 = new JLabel("查無資料");
		label_6.setBackground(Color.RED);
		label_6.setFont(new Font("微軟正黑體", Font.BOLD, 40));
		label_6.setBounds(417, 34, 470, 78);
		panel_3.add(label_6);
		label_6.setVisible(false);
		label_4.setVisible(false);

		JLabel lblNewLabel_3 = new JLabel("總共:");
		lblNewLabel_3.setFont(new Font("標楷體", Font.BOLD, 20));
		lblNewLabel_3.setBounds(50, 23, 306, 24);
		panel_2.add(lblNewLabel_3);
		lblNewLabel_3.setVisible(false);

		JLabel label = new JLabel("顯示第      筆");
		label.setFont(new Font("標楷體", Font.BOLD, 20));
		label.setBounds(441, 23, 186, 24);
		panel_2.add(label);
		label.setVisible(false);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(520, 27, 44, 20);
		panel_2.add(comboBox_2);
		comboBox_2.setVisible(false);
		
		

		JButton button_2 = new JButton("我要應徵");
		button_2.setFont(new Font("標楷體", Font.BOLD, 20));
		button_2.setBounds(531, 278, 159, 34);
		panel_3.add(button_2);
		
		JLabel label_7 = new JLabel("你已應徵此工作");
		label_7.setForeground(Color.RED);
		label_7.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		label_7.setBounds(770, 290, 204, 19);
		panel_3.add(label_7);
		
		

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setForeground(Color.PINK);
		lblNewLabel_4.setFont(new Font("標楷體", Font.BOLD, 20));
		lblNewLabel_4.setBounds(770, 345, 318, 24);
		panel_3.add(lblNewLabel_4);
		label_7.setVisible(false);
		
		button_2.setVisible(false);

		
		JButton button_3 = new JButton("查看對方回覆");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel_4.setVisible(true);
				if(Normal.requestState.get(Normal.Findemployee.get(0))==-1) {
					lblNewLabel_4.setText("你在急什麼?");
				}
				else if(Normal.requestState.get(Normal.Findemployee.get(0))==1) {
					lblNewLabel_4.setText("恭喜錄取");
				}
				else if(Normal.requestState.get(Normal.Findemployee.get(0))==0) {
					lblNewLabel_4.setText("下次會更好");
				}
				
			}
		});
		button_3.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		button_3.setBounds(531, 345, 159, 24);
		panel_3.add(button_3);
		button_3.setVisible(false);
		
		
		JButton button_1 = new JButton("查詢");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_4.setVisible(false);
				button_3.setVisible(false);
				label_7.setVisible(false);
				label_1.setVisible(true);
				label_2.setVisible(true);
				label_3.setVisible(true);
				button_2.setVisible(true);
				label_4.setVisible(false);
				
				int ALLIndex=(int)comboBox_2.getSelectedItem()-1;
				label_1.setText("工作名稱:"+Normal.B_Name.get(Normal.FindWorkindex.get(ALLIndex))+Normal.B_work.get(Normal.FindWorkindex.get(ALLIndex)));
				label_2.setText("薪資:"+Normal.B_Pay.get(Normal.FindWorkindex.get(ALLIndex)));
				label_3.setText("工作地區:"+Normal.B_Location.get(Normal.FindWorkindex.get(ALLIndex)));
				
				
				
			}
		});
		button_1.setFont(new Font("標楷體", Font.BOLD, 20));
		button_1.setBounds(603, 26, 87, 23);
		panel_2.add(button_1);
		button_1.setVisible(false);

		JLabel label_5 = new JLabel("筆資料");
		label_5.setFont(new Font("標楷體", Font.BOLD, 20));
		label_5.setBounds(183, 23, 192, 24);
		panel_2.add(label_5);
		label_5.setVisible(false);

		JButton btnNewButton_1 = new JButton("搜尋");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_4.setVisible(false);
				label_6.setVisible(false);
				label_7.setVisible(false);
				button_3.setVisible(false);
				Normal.FindWorkindex.clear();
				comboBox_2.removeAllItems();
				if (!textField.getText().toString().equals("")) {
					Normal.FindWorkindex.clear();
					for (int i = 0; i < Normal.B_Name.size(); i++) {
						if (Normal.B_Name.get(i).equals(textField.getText())) {
							Normal.FindWorkindex.add(i);
						}
					}
					int read=Normal.FindWorkindex.size();
					int K=0;
					for (int i = 0; i < read; i++) {
						if (!Normal.B_Location.get(Normal.FindWorkindex.get(i-K))
								.equals(comboBox.getSelectedItem().toString())) {
							Normal.FindWorkindex.remove(i-K);
							K++;
						}
					}

					int read1=Normal.FindWorkindex.size();
					int O=0;
					for (int i = 0; i <read1; i++) {
						if (!Normal.B_Pay.get(Normal.FindWorkindex.get(i-O))
								.equals(comboBox_1.getSelectedItem().toString())) {
							Normal.FindWorkindex.remove(i-O);
						}
					}
				} else {

					Normal.FindWorkindex.clear();
					for (int i = 0; i < Normal.B_Name.size(); i++) {
						if (Normal.B_Location.get(i).equals(comboBox.getSelectedItem().toString())) {
							Normal.FindWorkindex.add(i);

							System.out.print(Normal.FindWorkindex);
						}
					}
					int read=Normal.FindWorkindex.size();
					int K=0;
					for (int i = 0; i < read; i++) {
						
						if (!Normal.B_Pay.get(Normal.FindWorkindex.get(i-K))
								.equals(comboBox_1.getSelectedItem().toString())) {
							Normal.FindWorkindex.remove(i-K);
							K++;
							System.out.print(K);
							System.out.print(Normal.FindWorkindex);
							//continue A;
						}
					}
				System.out.print(Normal.FindWorkindex);
				}
				if(Normal.FindWorkindex.size()>0) {
					label_4.setVisible(false);
					lblNewLabel_3.setVisible(true);
					label.setVisible(true);
					comboBox_2.setVisible(true);
					label_5.setVisible(true);
					button_1.setVisible(true);
					
					label_1.setVisible(false);
					label_2.setVisible(false);
					label_3.setVisible(false);
					button_2.setVisible(false);
					
					lblNewLabel_3.setText("總共:"+Normal.FindWorkindex.size());
					for(int i=0;i<Normal.FindWorkindex.size();i++) {
						comboBox_2.addItem(i+1);
					}
				}
				else {
					label_1.setVisible(false);
					label_2.setVisible(false);
					label_3.setVisible(false);
					label_6.setVisible(false);
					button_2.setVisible(false);
					label_6.setVisible(true);
					lblNewLabel_3.setVisible(false);
					label.setVisible(false);
					comboBox_2.setVisible(false);
					label_5.setVisible(false);
					button_1.setVisible(false);
				}
				
				
			}
		});
		btnNewButton_1.setBounds(1060, 6, 128, 36);
		panel_1.add(btnNewButton_1);
		

		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Normal.Findemployee.clear();
				label_4.setVisible(false);
				label_7.setVisible(false);
				for(int i=0;i<Normal.employee.size();i++) {
					if(Login.NowLogin.equals(Normal.employee.get(i))) {
						Normal.Findemployee.add(i);
					}
				}
				
				int ALLindex=(int)comboBox_2.getSelectedItem()-1;
				int read2=Normal.Findemployee.size();
				int P=0;
				for (int i = 0; i <read2; i++) {
					String judge=Normal.B_Name.get(Normal.FindWorkindex.get(ALLindex))+Normal.B_Pay.get(Normal.FindWorkindex.get(ALLindex))+Normal.B_Location.get(Normal.FindWorkindex.get(ALLindex))+Normal.B_work.get(Normal.FindWorkindex.get(ALLindex));
					if (!Normal.Workrequest.get(Normal.Findemployee.get(i-P))
							.equals(judge)) {
						Normal.Findemployee.remove(i-P);
						P++;
					}
				}
				if(Normal.Findemployee.size()>0) {
					label_7.setVisible(true);
					System.out.print(Normal.requestState);
					button_3.setVisible(true);
				}
				else {
					Normal.Workrequest.add(Normal.B_Name.get(Normal.FindWorkindex.get(ALLindex))+Normal.B_Pay.get(Normal.FindWorkindex.get(ALLindex))+Normal.B_Location.get(Normal.FindWorkindex.get(ALLindex))+Normal.B_work.get(Normal.FindWorkindex.get(ALLindex)));
					Normal.employee.add(Login.NowLogin);
					System.out.print(Normal.Workrequest);
					Normal.requestState.add(-1);
					label_4.setVisible(true);
				}
				
				
				
				
				
				
			}
		});

	}
}
