package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import main.Kot;
import main.User;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Component;
import java.awt.Dimension;
public class BazaKoty {

	private JFrame frame;
	private static String[][] cechy = new String[Kot.kotki.size()][4];
	JButton btnAdoptuj;
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
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 582, 441);
		JScrollPane scrollPane = new JScrollPane(panel_1);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		JButton btnWstecz = new JButton("WSTECZ");
		btnWstecz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				String[] args = null;
				MainWindow.main(args);
			}
		});
		panel_2.add(btnWstecz);

		JButton btnSzukaj = new JButton("SZUKAJ");
		btnSzukaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				String[] args = null;
				Przeszukaj.main(args, "Kot",getCechy());
			}
		});
		panel_2.add(btnSzukaj);	

		JButton btnWyjd = new JButton(" WYJD\u0179 ");
		btnWyjd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		panel_2.add(btnWyjd);
		
		JLabel lblNewLabel_9 = new JLabel("KOTY");
		frame.getContentPane().add(lblNewLabel_9);
		lblNewLabel_9.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		for(int i=0;i<Kot.kotki.size();i++)
		{		
		
		
		JPanel panel = new JPanel();
		JLabel lblNewLabel = new JLabel("");
		String s = "KOTY/" + Kot.kotki.get(i).getImie() + "_kot.jpg";
		
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
		setCechy(cechy, i);
		JTextArea txtr = new JTextArea();
		txtr.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtr.setText(Kot.kotki.get(i).getOpis());
		txtr.setLineWrap(true);
		txtr.setWrapStyleWord(true);
		txtr.setOpaque(false);
		int j=i+1;
		if(User.getZaloguj()==1)
		{
			btnAdoptuj = new JButton("USUÑ");
			btnAdoptuj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					frame.dispose();
					Kot kot = new Kot();
					try {
						kot.adoptuj(j);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					String[] args = null;
					BazaKoty.main(args);
				}
			});
		}
		else
		{
			btnAdoptuj = new JButton("ADOPTUJ");
			btnAdoptuj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					frame.dispose();
					String[] args = null;
					FormularzAdopt.main(args, j, "Kot");
				}
			});
		}



		JSeparator separator = new JSeparator();
		
		JLabel lblNewLabel_11 = new JLabel("");
		File imageMale = new File("GUI/male.png");
		File imageFemale = new File("GUI/female.png");
		String plec = "samiec";
		if(plec.equals(Kot.kotki.get(i).getPlec()))
		{
			try {
				BufferedImage imagemale = ImageIO.read(imageMale);
				lblNewLabel_11.setIcon(new ImageIcon(imagemale));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		else
		{
			try {
				BufferedImage imagefemale = ImageIO.read(imageFemale);
				lblNewLabel_11.setIcon(new ImageIcon(imagefemale));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		
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
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblWiek)
								.addComponent(lblKolor)
								.addComponent(lblKolorOczu)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblImi)
										.addComponent(lblRasa)
										.addComponent(lblDugoSierci)
										.addComponent(lblDataZnalezienia))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(70)
											.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(50)
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
												.addComponent(lblNewLabel_8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblNewLabel_6, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
												.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))))))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(txtr, GroupLayout.PREFERRED_SIZE, 433, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnAdoptuj))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(0)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 525, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(30, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblImi, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
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
								.addComponent(lblNewLabel_6))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDugoSierci)
								.addComponent(lblNewLabel_7))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_8)
								.addComponent(lblDataZnalezienia))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblOpis)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtr, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnAdoptuj))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addGap(10))
		);
		panel.setLayout(gl_panel);
		panel_1.add(panel);
		frame.getContentPane().add(scrollPane);
		SwingUtilities.invokeLater(new Runnable() {
		    @Override
		    public void run() {
		        scrollPane.getViewport().setViewPosition( new Point(0, 0) );
		    }
		});
		}
	}

	private void setCechy(String[][] cechy, int i) {
		cechy[i][0]=Kot.kotki.get(i).getKolor();
		cechy[i][1]=Kot.kotki.get(i).getKolorOczu();
		cechy[i][2]=Kot.kotki.get(i).getRasa();
		cechy[i][3]=Kot.kotki.get(i).getSiersc();
	}
	public static String[][] getCechy(){
		return cechy;
	}
}
	