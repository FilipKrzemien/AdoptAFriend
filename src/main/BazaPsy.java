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
public class BazaPsy {

	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BazaPsy window = new BazaPsy();
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
	public BazaPsy() {
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

		for(int i=0;i<Pies.pieski.size();i++)
		{		
		JPanel panel = new JPanel();
		JLabel lblNewLabel = new JLabel("");
		String s = "PSY/" + (i+1) + "_" + Pies.pieski.get(i).getImie() + "_pies.jpg";
		lblNewLabel.setIcon(new ImageIcon(s));
		JLabel lblImi = new JLabel("Imi\u0119:");
		lblImi.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblWiek = new JLabel("Wiek:");
		lblWiek.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblKolor = new JLabel("Kolor:");
		lblKolor.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblKolorOczu = new JLabel("Kolor oczu:");
		lblKolorOczu.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblWielko = new JLabel("Wielko\u015B\u0107:");
		lblWielko.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblRasa = new JLabel("Rasa:");
		lblRasa.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblDugoSierci = new JLabel("D\u0142ugo\u015B\u0107 sier\u015Bci:");
		lblDugoSierci.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblDataZnalezienia = new JLabel("Data znalezienia:");
		lblDataZnalezienia.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblOpis = new JLabel("Opis:");
		lblOpis.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_1 = new JLabel(Pies.pieski.get(i).getImie());
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		JLabel lblNewLabel_2 = new JLabel(Integer.toString(Pies.pieski.get(i).getWiek()));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		JLabel lblNewLabel_3 = new JLabel(Pies.pieski.get(i).getKolor());
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		JLabel lblNewLabel_4 = new JLabel(Pies.pieski.get(i).getKolorOczu());
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		JLabel lblNewLabel_5 = null;
		if(((Pies) Pies.pieski.get(i)).getWielkosc()==1) {
			lblNewLabel_5 = new JLabel("Ma³y");
		}
		else if(((Pies) Pies.pieski.get(i)).getWielkosc()==2) {
			lblNewLabel_5 = new JLabel("Œredni");				
		}
		else if(((Pies) Pies.pieski.get(i)).getWielkosc()==3) {
			lblNewLabel_5 = new JLabel("Du¿y");				
		}
		//JLabel lblNewLabel_5 = new JLabel(Integer.toString(((Pies) Pies.pieski.get(i)).getWielkosc()));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		JLabel lblNewLabel_6 = new JLabel(Pies.pieski.get(i).getRasa());
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		JLabel lblNewLabel_7 = new JLabel(Pies.pieski.get(i).getSiersc());
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		JLabel lblNewLabel_8 = new JLabel(Pies.pieski.get(i).getDataZnalezienia());
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		JTextArea txtr = new JTextArea();
		txtr.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtr.setText(Pies.pieski.get(i).getOpis());
		txtr.setLineWrap(true);
		txtr.setWrapStyleWord(true);
		txtr.setOpaque(false);
		JButton btnAdoptuj = new JButton("ADOPTUJ");
		int j=i+1;
		btnAdoptuj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Pies pies = new Pies();
					pies.adoptuj(j);
					frame.setVisible(false);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		JLabel lblNewLabel_9 = new JLabel("PSY");
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
									.addComponent(lblWielko)
									.addGap(71)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_8)
										.addComponent(lblNewLabel_7)
										.addComponent(lblNewLabel_6)
										.addComponent(lblNewLabel_5)
										.addComponent(lblNewLabel_4)
										.addComponent(lblNewLabel_3)
										.addComponent(lblNewLabel_2)
										.addComponent(lblNewLabel_1)))
								.addComponent(lblRasa)
								.addComponent(lblDugoSierci)
								.addComponent(lblDataZnalezienia)))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(txtr, GroupLayout.PREFERRED_SIZE, 433, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(btnAdoptuj)))
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(28)
					.addComponent(separator, GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
					.addGap(48))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(17)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnAdoptuj)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
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
									.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblWielko)
										.addComponent(lblNewLabel_5))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblRasa)
										.addComponent(lblNewLabel_6))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblDugoSierci)
										.addComponent(lblNewLabel_7))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblDataZnalezienia)
										.addComponent(lblNewLabel_8)))
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblOpis)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtr, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(18)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(120))
		);
		panel.setLayout(gl_panel);
		panel_1.add(panel);			
		}
	}
}
