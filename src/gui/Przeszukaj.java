package gui;

import java.awt.EventQueue;

import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import main.Wyszukiwanie;

import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

public class Przeszukaj {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args, String name, String[][] cechy) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Przeszukaj window = new Przeszukaj(name, cechy);
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
	public Przeszukaj(String name, String[][] cechy) {
		initialize(name, cechy);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String name, String[][] cechy) {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		
		JLabel lblPrzeszukiwanieBazyDanych = new JLabel("PRZESZUKIWANIE BAZY DANYCH ");
		lblPrzeszukiwanieBazyDanych.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		
		JLabel lblKolor = new JLabel("Kolor:");
		lblKolor.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		
		
		JLabel lblKolorOczu = new JLabel("Kolor oczu:");
		lblKolorOczu.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel = new JLabel("Rasa:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblSier = new JLabel("Sier\u015B\u0107:");
		lblSier.setFont(new Font("Tahoma", Font.BOLD, 12));
		System.out.println(cechy.length);
		
		String[] kolory;
		String[] koloryOczu;
		String[] siersci;
		String[] rasy;
		
		kolory=Wyszukiwanie.usun_duplikaty(cechy,0);
		koloryOczu=Wyszukiwanie.usun_duplikaty(cechy,1);
		siersci=Wyszukiwanie.usun_duplikaty(cechy,2);
		rasy=Wyszukiwanie.usun_duplikaty(cechy,3);	
		
	    System.out.println(kolory);
		JComboBox<Object> kolor = new JComboBox<Object>();
		kolor.setModel(new DefaultComboBoxModel<Object>(kolory));
		
		JComboBox<Object> kolorOczu = new JComboBox<Object>();
		kolorOczu.setModel(new DefaultComboBoxModel<Object>(koloryOczu));
		
		JComboBox<Object> siersc = new JComboBox<Object>();
		siersc.setModel(new DefaultComboBoxModel<Object>(siersci));
		
		JComboBox<Object> rasa = new JComboBox<Object>();
		rasa.setModel(new DefaultComboBoxModel<Object>(rasy));
		
		JButton btnFiltruj = new JButton("Filtruj");
		
		JButton btnWstecz = new JButton("Wstecz");
		btnWstecz.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if (name.equals("Kot")) 
				{
					frame.dispose();
					String[] args = null;
					BazaKoty.main(args);
				}
				else 
				{
					frame.dispose();
					String[] args = null;
					BazaPsy.main(args);
				}
			}
		});
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("GUI/grafika1.png"));
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblPrzeszukiwanieBazyDanych)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblKolor)
										.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(lblKolorOczu, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addComponent(lblSier))
									.addGap(26)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(rasa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(kolorOczu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(kolor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(siersc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(82)
									.addComponent(label, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(136)
							.addComponent(btnFiltruj))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnWstecz)))
					.addContainerGap(60, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(44)
					.addComponent(lblPrzeszukiwanieBazyDanych)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(35)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblKolor)
								.addComponent(kolor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblKolorOczu)
								.addComponent(kolorOczu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel)
								.addComponent(siersc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblSier)
								.addComponent(rasa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(btnFiltruj)
							.addGap(26)
							.addComponent(btnWstecz))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(39, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
	}
}
