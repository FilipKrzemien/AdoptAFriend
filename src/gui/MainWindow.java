package gui;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;

public class MainWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(70, 170, 200, 150);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon("GUI/pieski.jpg"));
		JButton button = new JButton("");
		button.setBounds(310, 170, 200, 150);
		frame.getContentPane().add(button);
		button.setIcon(new ImageIcon("GUI/kotki.jpg"));
		
		JLabel lblSchroniskoDlaZwierzt = new JLabel("Schronisko dla zwierz\u0105t w Krakowie");
		lblSchroniskoDlaZwierzt.setBounds(10, 11, 564, 168);
		frame.getContentPane().add(lblSchroniskoDlaZwierzt);
		lblSchroniskoDlaZwierzt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSchroniskoDlaZwierzt.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnWyjd = new JButton(" WYJD\u0179 ");
		btnWyjd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnWyjd.setBounds(250, 345, 89, 23);
		frame.getContentPane().add(btnWyjd);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Pies.wypiszBaza();
				frame.dispose();

				String[] args = null;
				BazaPsy.main(args);
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Kot.wypiszBaza();
				frame.dispose();

				String[] args = null;
				BazaKoty.main(args);
			}
		});
		

	}
}
