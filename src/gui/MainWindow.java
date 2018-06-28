package gui;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import main.User;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;

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
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
		
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
		btnWyjd.setBounds(246, 345, 89, 23);
		frame.getContentPane().add(btnWyjd);
		
		JPanel loguj = new JPanel();
		loguj.setBounds(250, 11, 324, 51);
		frame.getContentPane().add(loguj);
		loguj.setLayout(null);
		
		JButton btnZaloguj = new JButton("ZALOGUJ");
		btnZaloguj.setBounds(225, 0, 89, 23);
		loguj.add(btnZaloguj);
		
		JPanel wyloguj = new JPanel();
		wyloguj.setLayout(null);
		wyloguj.setBounds(250, 11, 324, 51);
		frame.getContentPane().add(wyloguj);
		
		JButton btnDodaj = new JButton("DODAJ");
		btnDodaj.setBounds(20, 11, 89, 23);
		if(User.getZaloguj()==1)
		{
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					frame.dispose();
					String[] args = null;
					Dodawanie.main(args);
				}
			});
			btnDodaj.setVisible(true);	
		}
		else
		{
			btnDodaj.setVisible(false);
		}
		frame.getContentPane().add(btnDodaj);
		
		JButton btnWyloguj = new JButton("WYLOGUJ");
		btnWyloguj.setBounds(214, 0, 100, 23);
		wyloguj.add(btnWyloguj);
		btnWyloguj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				loguj.setVisible(true);
				wyloguj.setVisible(false);
				btnDodaj.setVisible(false);
				User.setZaloguj(0);
			}
		});
		
		JLabel lblnick = new JLabel(User.user.get(Logowanie.number).getNick());
		lblnick.setForeground(Color.GRAY);
		lblnick.setHorizontalAlignment(SwingConstants.RIGHT);
		lblnick.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblnick.setBounds(142, 0, 60, 23);
		wyloguj.add(lblnick);
		
		JLabel lblZalJako = new JLabel("Zalogowany jako:");
		lblZalJako.setForeground(Color.GRAY);
		lblZalJako.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblZalJako.setBounds(35, 0, 97, 23);
		wyloguj.add(lblZalJako);
		
		btnZaloguj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				String[] args = null;
				Logowanie.main(args);
				SwingUtilities.updateComponentTreeUI(frame);
			}
		});
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
		
		if(User.getZaloguj()==0)
		{
			loguj.setVisible(true);
			wyloguj.setVisible(false);
		}
		else
		{
			loguj.setVisible(false);
			wyloguj.setVisible(true);			
		}
	}
}
