package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import main.Kot;
import main.Pies;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Adopcja {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args, String name, int j) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adopcja window = new Adopcja(name, j);
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
	public Adopcja(String name, int j) {
		initialize(name, j);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String name, int j) {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel lblPies;
		JLabel imietext = null;
		JLabel wiektext = null;
		JLabel datatext = null;
			
			JLabel lblNewLabel = new JLabel("FORMULARZ WYS\u0141ANY");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(10, 11, 564, 93);
			frame.getContentPane().add(lblNewLabel);
			
			JTextArea opistext = new JTextArea();
			opistext.setEditable(false);
			Pies pies = new Pies();
			Kot kot = new Kot();
		int k=j-1;
		String s;
		if(name.equals(Pies.class.getSimpleName()))
		{
			lblPies = new JLabel("Wybrany pies:");
			imietext = new JLabel(Pies.pieski.get(k).getImie());
			wiektext = new JLabel(Integer.toString(Pies.pieski.get(k).getWiek()));
			datatext = new JLabel(Pies.pieski.get(k).getDataZnalezienia());
			opistext.setText(Pies.pieski.get(k).getOpis());
			s = "PSY/" + Pies.pieski.get(k).getImie() + "_pies.jpg";
		}
		else
		{
			lblPies = new JLabel("Wybrany kot:");
			imietext = new JLabel(Kot.kotki.get(k).getImie());
			wiektext = new JLabel(Integer.toString(Kot.kotki.get(k).getWiek()));
			datatext = new JLabel(Kot.kotki.get(k).getDataZnalezienia());
			opistext.setText(Kot.kotki.get(k).getOpis());
			s = "KOTY/" + Kot.kotki.get(k).getImie() + "_kot.jpg";
		}
		lblPies.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPies.setHorizontalAlignment(SwingConstants.CENTER);
		lblPies.setBounds(10, 100, 181, 38);
		frame.getContentPane().add(lblPies);
		

		JButton btnDrukijDokument = new JButton("DRUKUJ POTWIERDZENIE");
		btnDrukijDokument.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				String[] args = null;
				Potwierdzenie.main(args);
			}

		});
		btnDrukijDokument.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnDrukijDokument.setBounds(190, 365, 203, 23);
		frame.getContentPane().add(btnDrukijDokument);
		
		JLabel zdjecie = new JLabel("");
		zdjecie.setIcon(new ImageIcon(s));
		zdjecie.setBounds(20, 149, 221, 172);
		frame.getContentPane().add(zdjecie);
		
		JLabel Imie = new JLabel("Imi\u0119:");
		Imie.setFont(new Font("Tahoma", Font.BOLD, 12));
		Imie.setBounds(251, 149, 108, 14);
		frame.getContentPane().add(Imie);
		
		imietext.setFont(new Font("Tahoma", Font.PLAIN, 12));
		imietext.setBounds(369, 149, 108, 14);
		frame.getContentPane().add(imietext);
		
		JLabel Wiek = new JLabel("Wiek:");
		Wiek.setFont(new Font("Tahoma", Font.BOLD, 12));
		Wiek.setBounds(251, 174, 108, 14);
		frame.getContentPane().add(Wiek);
		
		wiektext.setFont(new Font("Tahoma", Font.PLAIN, 12));
		wiektext.setBounds(369, 174, 108, 14);
		frame.getContentPane().add(wiektext);
		
		JLabel Dataznl = new JLabel("Data znalezienia:");
		Dataznl.setFont(new Font("Tahoma", Font.BOLD, 12));
		Dataznl.setBounds(251, 199, 108, 14);
		frame.getContentPane().add(Dataznl);
		
		datatext.setFont(new Font("Tahoma", Font.PLAIN, 12));
		datatext.setBounds(369, 199, 108, 14);
		frame.getContentPane().add(datatext);
		
		JLabel lblOpis = new JLabel("Opis:");
		lblOpis.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOpis.setBounds(251, 223, 108, 14);
		frame.getContentPane().add(lblOpis);
		
		opistext.setWrapStyleWord(true);
		opistext.setLineWrap(true);
		opistext.setWrapStyleWord(true);
		opistext.setOpaque(false);
		opistext.setBounds(251, 248, 305, 93);
		frame.getContentPane().add(opistext);
		
		if(name.equals(Pies.class.getSimpleName()))
		{
			try {
				pies.adoptuj(j);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else
		{
			try {
				kot.adoptuj(j);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
