import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Color;

public class B_Page {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					B_Page window = new B_Page();
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
	public B_Page() {
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
		
		

		JLabel label_5 = new JLabel("還沒有人想要你的工作呢");
		label_5.setForeground(Color.GREEN);
		label_5.setFont(new Font("標楷體", Font.BOLD, 20));
		label_5.setBounds(270, 443, 334, 48);
		frame.getContentPane().add(label_5);
		label_5.setVisible(false);
		
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
		lblNewLabel_2.setBounds(992, 19, 166, 19);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setText("歡迎，"+Login_B.NowLogin);
		
		JLabel label = new JLabel("刊登工作");
		label.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		label.setBounds(52, 91, 248, 22);
		frame.getContentPane().add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(189, 150, 131, 29);
		frame.getContentPane().add(comboBox);
		comboBox.addItem("北部");
		comboBox.addItem("中部");
		comboBox.addItem("南部");
		
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(480, 150, 131, 29);
		frame.getContentPane().add(comboBox_1);
		comboBox_1.addItem("20k~29k");
		comboBox_1.addItem("30k~39k");
		comboBox_1.addItem("40k 以上");
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(136, 377, 526, 29);
		frame.getContentPane().add(comboBox_2);
		for(int i=0;i<Normal.B_Name.size();i++) {
			if(Normal.B_Name.get(i).equals(Login_B.NowLogin)) {
			comboBox_2.addItem(Normal.B_Name.get(i)+Normal.B_Pay.get(i)+Normal.B_Location.get(i)+Normal.B_work.get(i));
		}}
		

		textField = new JTextField();
		textField.setBounds(189, 211, 391, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("地區");
		label_1.setFont(new Font("標楷體", Font.BOLD, 20));
		label_1.setBounds(129, 151, 104, 22);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("薪資區間");
		label_2.setFont(new Font("標楷體", Font.BOLD, 20));
		label_2.setBounds(370, 151, 104, 22);
		frame.getContentPane().add(label_2);
		

		JLabel label_7 = new JLabel("已送出回復");
		label_7.setForeground(Color.BLUE);
		label_7.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		label_7.setBounds(638, 538, 235, 26);
		frame.getContentPane().add(label_7);
		label_7.setVisible(false);
		
		JButton button_1 = new JButton("刊登");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label_5.setVisible(false);
				label_7.setVisible(false);
				
				Normal.FindWork.clear();
				for (int i = 0; i < Normal.B_Name.size(); i++) {
					if (Normal.B_Name.get(i).equals(Login_B.NowLogin)) {
						Normal.FindWork.add(i);
					}
				}
				int read=Normal.FindWork.size();
				int K=0;
				for (int i = 0; i < read; i++) {
					if (!Normal.B_Location.get(Normal.FindWork.get(i-K))
							.equals(comboBox.getSelectedItem().toString())) {
						Normal.FindWork.remove(i-K);
						K++;
					}
				}

				int read1=Normal.FindWork.size();
				int O=0;
				for (int i = 0; i <read1; i++) {
					if (!Normal.B_Pay.get(Normal.FindWork.get(i-O))
							.equals(comboBox_1.getSelectedItem().toString())) {
						Normal.FindWork.remove(i-O);
						O++;
					}
				}
				int read2=Normal.FindWork.size();
				int I=0;
				for (int i = 0; i <read1; i++) {
					if (!Normal.B_work.get(Normal.FindWork.get(i-I))
							.equals(textField.getText())) {
						Normal.FindWork.remove(i-I);
						I++;
					}
				}
				
				
				if(Normal.FindWork.size()==0) {
				
				
				
				Normal.B_Name.add(Login_B.NowLogin);
				Normal.B_Pay.add(comboBox_1.getSelectedItem().toString());
				Normal.B_Location.add(comboBox.getSelectedItem().toString());
				Normal.B_work.add(textField.getText());
				comboBox_2.addItem(Login_B.NowLogin+comboBox_1.getSelectedItem().toString()+comboBox.getSelectedItem().toString()+textField.getText());
			}}
		});
		button_1.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		button_1.setBounds(662, 153, 87, 23);
		frame.getContentPane().add(button_1);
		
		JLabel label_3 = new JLabel("已刊登工作");
		label_3.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		label_3.setBounds(52, 327, 152, 22);
		frame.getContentPane().add(label_3);
		
		

		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(136, 455, 526, 29);
		frame.getContentPane().add(comboBox_3);
		comboBox_3.setVisible(false);
		
		

		JLabel label_6 = new JLabel("我覺得第               個");
		label_6.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		label_6.setBounds(136, 538, 427, 29);
		frame.getContentPane().add(label_6);
		label_6.setVisible(false);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(226, 543, 50, 21);
		frame.getContentPane().add(comboBox_4);
		comboBox_4.setVisible(false);
		
		
		JButton button_3 = new JButton("很可以");
		button_3.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		button_3.setBounds(323, 542, 114, 23);
		frame.getContentPane().add(button_3);
		button_3.setVisible(false);
		
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Normal.requestState.set(Normal.Findrequest.get(Integer.parseInt(comboBox_4.getSelectedItem().toString())-1), 1);
				label_7.setVisible(true);
				
			}});
		JButton button_4 = new JButton("母湯喔");
		button_4.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		button_4.setBounds(449, 543, 114, 23);
		frame.getContentPane().add(button_4);
		button_4.setVisible(false);
		
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Normal.requestState.set(Normal.Findrequest.get(Integer.parseInt(comboBox_4.getSelectedItem().toString())-1), 0);
				label_7.setVisible(true);
				
			}});
		
		
		
		
		
		
		JLabel label_4 = new JLabel("工作內容");
		label_4.setFont(new Font("標楷體", Font.BOLD, 20));
		label_4.setBounds(85, 208, 104, 22);
		frame.getContentPane().add(label_4);
		
		JButton button_2 = new JButton("都看看是誰來啦");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				label_5.setVisible(false);
				label_7.setVisible(false);
				label_6.setVisible(false);
				comboBox_4.setVisible(false);
				button_3.setVisible(false);
				button_4.setVisible(false);
				
				
				
				
				Normal.Findrequest.clear();
				
				for(int i=0;i<Normal.Workrequest.size();i++) {
					if(comboBox_2.getSelectedItem().equals(Normal.Workrequest.get(i))) {
						Normal.Findrequest.add(i);
					}
				}
				
				
				
				
				if(Normal.Findrequest.size()>0) {
					comboBox_3.setVisible(true);
					label_5.setVisible(false);
					label_6.setVisible(true);
					comboBox_4.setVisible(true);
					button_3.setVisible(true);
					button_4.setVisible(true);
					
					
				}
				else {
					label_5.setVisible(true);
					comboBox_3.setVisible(false);
				}
				comboBox_3.removeAllItems();
				
				
				for(int i=0;i<Normal.Findrequest.size();i++) {
				int index=Normal.U_Account.indexOf(Normal.employee.get(Normal.Findrequest.get(i)));
				comboBox_4.addItem(i+1);
				comboBox_3.addItem(Normal.employee.get(Normal.Findrequest.get(i))+"---"+Normal.U_Name.get(index)+"---"+Normal.U_Birth.get(index)+"---"+Normal.U_Contact.get(index));}
				
				
				
				
				
			}
		});
		button_2.setForeground(Color.BLUE);
		button_2.setFont(new Font("微軟正黑體", Font.BOLD, 25));
		button_2.setBounds(686, 380, 235, 26);
		frame.getContentPane().add(button_2);
		
	}
}
