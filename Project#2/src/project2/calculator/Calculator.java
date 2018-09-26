package project2.calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setTitle("\uACC4\uC0B0\uAE30");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 367, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("23");
		textField.setBounds(17, 32, 311, 47);
		contentPane.add(textField);
		textField.setColumns(20);
		
		JPanel panel = new JPanel();
		panel.setBounds(9, 85, 372, 63);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 16, 16));
		
		JButton btnNewButton = new JButton("C");
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		flowLayout.setVgap(16);
		flowLayout.setHgap(16);
		panel_1.setBounds(9, 163, 372, 63);
		contentPane.add(panel_1);
		
		JButton button = new JButton("7");
		panel_1.add(button);
		
		JButton btnNewButton_2 = new JButton("8");
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("9");
		panel_1.add(btnNewButton_1);
		
		JButton button_1 = new JButton("/");
		panel_1.add(button_1);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_2.getLayout();
		flowLayout_1.setVgap(16);
		flowLayout_1.setHgap(16);
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_2.setBounds(9, 241, 372, 73);
		contentPane.add(panel_2);
		
		JButton button_5 = new JButton("4");
		panel_2.add(button_5);
		
		JButton button_2 = new JButton("5");
		panel_2.add(button_2);
		
		JButton button_3 = new JButton("6");
		panel_2.add(button_3);
		
		JButton button_4 = new JButton("*");
		panel_2.add(button_4);
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_3.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		flowLayout_2.setHgap(16);
		panel_3.setBounds(9, 316, 372, 63);
		contentPane.add(panel_3);
		
		JButton button_6 = new JButton("1");
		panel_3.add(button_6);
		
		JButton button_7 = new JButton("2");
		panel_3.add(button_7);
		
		JButton button_8 = new JButton("3");
		panel_3.add(button_8);
		
		JButton button_9 = new JButton("-");
		panel_3.add(button_9);
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_4.getLayout();
		flowLayout_3.setHgap(16);
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel_4.setBounds(9, 379, 372, 60);
		contentPane.add(panel_4);
		
		JButton button_10 = new JButton("0");
		panel_4.add(button_10);
		
		JButton button_11 = new JButton("00");
		panel_4.add(button_11);
		
		JButton button_12 = new JButton("=");
		panel_4.add(button_12);
		
		JButton button_13 = new JButton("+");
		panel_4.add(button_13);
	}
}
