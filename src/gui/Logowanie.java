package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.NoSuchAlgorithmException;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import main.User;

import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dimension;

public class Logowanie {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	public static int number;
	JLabel lblError;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logowanie window = new Logowanie();
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
	public Logowanie() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.setType(Type.POPUP);
		frame.setBounds(100, 100, 300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		lblError = new JLabel("B\u0142\u0119dny login lub has\u0142o");
		lblError.setForeground(Color.RED);
		lblError.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblError.setHorizontalAlignment(SwingConstants.CENTER);
		lblError.setBounds(40, 285, 199, 14);
		panel.add(lblError);
		lblError.setVisible(false);
		
		JButton btnZaloguj = new JButton("ZALOGUJ");
		btnZaloguj.setBounds(150, 230, 89, 23);
		panel.add(btnZaloguj);
		btnZaloguj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				check();
			}
		});
		
		JButton btnAnuluj = new JButton("ANULUJ");
		btnAnuluj.setBounds(40, 230, 89, 23);
		panel.add(btnAnuluj);
		btnAnuluj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Pies.wypiszBaza();
				frame.dispose();

				String[] args = null;
				MainWindow.main(args);
			}
		});
		
		JLabel lblNazwaUytkownika = new JLabel("Nazwa u\u017Cytkownika:");
		lblNazwaUytkownika.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNazwaUytkownika.setBounds(40, 99, 132, 14);
		panel.add(lblNazwaUytkownika);
		
		textField = new JTextField();
		textField.setBounds(40, 124, 199, 20);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblHaso = new JLabel("Has\u0142o:");
		lblHaso.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHaso.setBounds(40, 155, 46, 14);
		panel.add(lblHaso);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(40, 180, 199, 20);
		panel.add(passwordField);
		
		frame.getRootPane().setDefaultButton(btnZaloguj);
	}
	
	private void check() {
		for(int i = 0; i<User.user.size(); i++)
		{
			if(textField.getText().equals(User.user.get(i).getNick()))
			{
				for(int j = 0;j<User.user.size(); j++) {
					String pass = new String(passwordField.getPassword());
					try {
						if(User.user.get(j).getPass().equals(User.sha(pass)))
						{
							User.setZaloguj(1);
							number=i;
							frame.dispose();
							String[] args = null;
							MainWindow.main(args);
							//break;
						}
						else
						{
							lblError.setVisible(true);	
						}
					} catch (NoSuchAlgorithmException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			else
			{
				lblError.setVisible(true);		
			}
		}		
	}
}