import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JSplitPane;
import java.awt.Rectangle;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JTextField textField_1;
	private JTextField txtRepeatPassword;
	private JTextField txtEmail;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setUndecorated(true);
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 748, 502);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(new Rectangle(-59, 0, 386, 652));
		panel.setForeground(new Color(0, 0, 0));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(56, 0, 330, 281);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setIcon(new ImageIcon(Home.class.getResource("/images/photo-1512641406448-6574e777bec6.jpg")));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Photography Club ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1.setForeground(Color.PINK);
		lblNewLabel_1.setBounds(120, 330, 179, 46);
		panel.add(lblNewLabel_1);
		
		JLabel lblWeGetYou = new JLabel("Welcome");
		lblWeGetYou.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeGetYou.setForeground(Color.PINK);
		lblWeGetYou.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblWeGetYou.setBounds(149, 400, 120, 27);
		panel.add(lblWeGetYou);
		
		Button button = new Button("SignUp");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setForeground(Color.BLACK);
		button.setBackground(Color.PINK);
		button.setBounds(new Rectangle(395, 278, 185, 36));
		button.setBounds(392, 351, 246, 36);
		contentPane.add(button);
		
		textField = new JTextField();
		textField.setBounds(396, 93, 242, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(396, 111, 242, 2);
		contentPane.add(separator);
		
		txtUsername = new JTextField();
		txtUsername.setBackground(new Color(255, 204, 204));
		txtUsername.setEditable(false);
		txtUsername.setText("USERNAME");
		txtUsername.setBounds(396, 62, 96, 20);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBackground(new Color(255, 204, 204));
		txtPassword.setEditable(false);
		txtPassword.setText("PASSWORD");
		txtPassword.setColumns(10);
		txtPassword.setBounds(396, 186, 96, 20);
		contentPane.add(txtPassword);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(396, 155, 242, 20);
		contentPane.add(textField_1);
		
		txtRepeatPassword = new JTextField();
		txtRepeatPassword.setBackground(new Color(255, 204, 204));
		txtRepeatPassword.setEditable(false);
		txtRepeatPassword.setHorizontalAlignment(SwingConstants.LEFT);
		txtRepeatPassword.setForeground(new Color(0, 0, 0));
		txtRepeatPassword.setText("REPEAT PASSWORD");
		txtRepeatPassword.setColumns(10);
		txtRepeatPassword.setBounds(396, 258, 160, 20);
		contentPane.add(txtRepeatPassword);
		
		txtEmail = new JTextField();
		txtEmail.setBackground(new Color(255, 204, 204));
		txtEmail.setEditable(false);
		txtEmail.setText("EMAIL");
		txtEmail.setColumns(10);
		txtEmail.setBounds(396, 124, 96, 20);
		contentPane.add(txtEmail);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(396, 235, 242, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(396, 307, 242, 2);
		contentPane.add(separator_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(396, 289, 242, 20);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(396, 217, 242, 20);
		contentPane.add(passwordField_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(396, 173, 242, 2);
		contentPane.add(separator_3);
		
		JLabel lbl_close = new JLabel("X");
		lbl_close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		
		
		lbl_close.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_close.setForeground(new Color(255, 204, 204));
		lbl_close.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_close.setBounds(666, 0, 68, 36);
		contentPane.add(lbl_close);
	}
}
