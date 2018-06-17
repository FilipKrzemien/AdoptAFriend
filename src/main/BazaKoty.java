package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.BoxLayout;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Component;
public class BazaKoty {

	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BazaKoty window = new BazaKoty();
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
	public BazaKoty() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 600, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 582, 441);
		JScrollPane scrollPane = new JScrollPane(panel_1);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		frame.getContentPane().add(scrollPane);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));

		for(int i=0;i<Kot.kotki.size();i++)
		{		
		JPanel panel = new JPanel();
		JLabel lblNewLabel = new JLabel("");
		String s = "KOTY/" + (i+1) + "_" + Kot.kotki.get(i).getImie() + "_kot.jpg";
		lblNewLabel.setIcon(new ImageIcon(s));
		JLabel lblImi = new JLabel("Imi\u0119:");
		lblImi.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblWiek = new JLabel("Wiek:");
		lblWiek.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblKolor = new JLabel("Kolor:");
		lblKolor.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblKolorOczu = new JLabel("Kolor oczu:");
		lblKolorOczu.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblRasa = new JLabel("Rasa:");
		lblRasa.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblDugoSierci = new JLabel("D\u0142ugo\u015B\u0107 sier\u015Bci:");
		lblDugoSierci.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblDataZnalezienia = new JLabel("Data znalezienia:");
		lblDataZnalezienia.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblOpis = new JLabel("Opis:");
		lblOpis.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_1 = new JLabel(Kot.kotki.get(i).getImie());
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		JLabel lblNewLabel_2 = new JLabel(Integer.toString(Kot.kotki.get(i).getWiek()));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		JLabel lblNewLabel_3 = new JLabel(Kot.kotki.get(i).getKolor());
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		JLabel lblNewLabel_4 = new JLabel(Kot.kotki.get(i).getKolorOczu());
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		JLabel lblNewLabel_6 = new JLabel(Kot.kotki.get(i).getRasa());
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		JLabel lblNewLabel_7 = new JLabel(Kot.kotki.get(i).getSiersc());
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		JLabel lblNewLabel_8 = new JLabel(Kot.kotki.get(i).getDataZnalezienia());
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		JTextArea txtr = new JTextArea();
		txtr.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtr.setText(Kot.kotki.get(i).getOpis());
		txtr.setLineWrap(true);
		txtr.setWrapStyleWord(true);
		txtr.setOpaque(false);
		JButton btnAdoptuj = new JButton("ADOPTUJ");
		int j=i+1;
		btnAdoptuj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Kot Kot = new Kot();
					Kot.adoptuj(j);
					frame.setVisible(false);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		JLabel lblNewLabel_9 = new JLabel("KOTY");
		lblNewLabel_9.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(lblNewLabel_9);
		
		JSeparator separator_1 = new JSeparator();
		panel_1.add(separator_1);
		JSeparator separator = new JSeparator();
		

		txtr.setEditable(false);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblOpis)
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblImi)
										.addComponent(lblWiek)
										.addComponent(lblKolor)
										.addComponent(lblKolorOczu)
										.addGroup(gl_panel.createSequentialGroup()
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(lblDataZnalezienia)
												.addComponent(lblRasa)
												.addComponent(lblDugoSierci))
											.addGap(0)
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_8, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
												.addComponent(lblNewLabel_7, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
												.addComponent(lblNewLabel_6, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
												.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
												.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
												.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
												.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)))))
								.addComponent(txtr, GroupLayout.PREFERRED_SIZE, 433, GroupLayout.PREFERRED_SIZE))
							.addGap(0)
							.addComponent(btnAdoptuj))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(49)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(17)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnAdoptuj)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblImi, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblNewLabel_1))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblWiek)
										.addComponent(lblNewLabel_2))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblKolor)
										.addComponent(lblNewLabel_3))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblKolorOczu)
										.addComponent(lblNewLabel_4))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblRasa)
										.addComponent(lblNewLabel_6, GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel_7, GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
										.addComponent(lblDugoSierci))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblNewLabel_8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblDataZnalezienia, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addGap(17)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblOpis)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtr, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(18)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(89))
		);
		panel.setLayout(gl_panel);
		panel_1.add(panel);			
		}
	}
}
