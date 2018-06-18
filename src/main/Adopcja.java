package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Adopcja {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args, String name) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adopcja window = new Adopcja(name);
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
	public Adopcja(String name) {
		initialize(name);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String name) {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel lblAdoptowaePsa;
		if(name.equals(Pies.class.getSimpleName()))
		{
			lblAdoptowaePsa = new JLabel("ADOPTOWA\u0141E\u015A PSA :)");
		}
		else
		{
			lblAdoptowaePsa = new JLabel("ADOPTOWA\u0141E\u015A KOTA :)");
		}
		lblAdoptowaePsa.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		lblAdoptowaePsa.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdoptowaePsa.setBounds(10, 11, 564, 124);
		frame.getContentPane().add(lblAdoptowaePsa);
		
		JButton btnDrukijDokument = new JButton("DRUKUJ DOKUMENT");
		btnDrukijDokument.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnDrukijDokument.setBounds(220, 407, 151, 23);
		frame.getContentPane().add(btnDrukijDokument);
	}
}
