package project2.interest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;

public class Interest extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPanel panel;
	private JButton btnNewButton;
	private JPanel panel_1;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interest frame = new Interest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interest() {
		setTitle("\uC774\uC790 \uACC4\uC0B0\uAE30");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setText("1000");
		textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_2.setBounds(227, 49, 156, 27);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setText("7.5");
		textField_3.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_3.setBounds(227, 101, 156, 27);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		panel = new JPanel();
		panel.setBounds(0, 143, 428, 48);
		contentPane.add(panel);
		
		btnNewButton = new JButton("   \r\n\r\n\uBCC0\uD658   ");
		panel.add(btnNewButton);
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 194, 428, 50);
		contentPane.add(panel_1);
		
		textField_4 = new JTextField();
		textField_4.setBackground(Color.WHITE);
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setText("\uC774\uC790\uB294 \uC5F0 75\uB9CC\uC6D0 \uC785\uB2C8\uB2E4.");
		panel_1.add(textField_4);
		textField_4.setColumns(22);
		
		JLabel label = new JLabel("\uC6D0\uAE08\uC744 \uC785\uB825\uD558\uC2DC\uC624.");
		label.setBounds(27, 52, 183, 21);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\uC774\uC728\uC744 \uC785\uB825\uD558\uC2DC\uC624.");
		label_1.setBounds(27, 104, 156, 21);
		contentPane.add(label_1);
	}
}
