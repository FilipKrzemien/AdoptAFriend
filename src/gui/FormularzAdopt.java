package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

import main.Kandydat;
import main.Pies;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class FormularzAdopt extends Kandydat{

	private JFrame frame;
	private JTextField nazwisko;
	private JTextField imie;
	private JTextField adres;
	private JTextField telefon;
	private JTextField email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args, int j, String name) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularzAdopt window = new FormularzAdopt(j, name);
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
	public FormularzAdopt(int j, String name) {
		initialize(j, name);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int j, String name) {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setVgap(10);
		flowLayout.setHgap(9);
		frame.getContentPane().add(panel_1);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		
		JLabel lblImi = new JLabel("Imi\u0119:");
		lblImi.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		imie = new JTextField();
		imie.setColumns(10);
		
		JLabel lblNazwisko = new JLabel("Nazwisko:");
		lblNazwisko.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		nazwisko = new JTextField();
		nazwisko.setColumns(10);
		
		JLabel lblDzien = new JLabel("Data urodzenia:");
		lblDzien.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JComboBox<Object> dzien = new JComboBox<Object>();
		dzien.setModel(new DefaultComboBoxModel<Object>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		
		JComboBox<Object> miesiac = new JComboBox<Object>();
		miesiac.setModel(new DefaultComboBoxModel<Object>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		
		JComboBox<Object> rok = new JComboBox<Object>();
		rok.setModel(new DefaultComboBoxModel<Object>(new String[] {"2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920"}));
		
		JLabel lblAdres = new JLabel("Adres:");
		lblAdres.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		adres = new JTextField();
		adres.setColumns(10);
		
		JLabel lblNumerTelefonu = new JLabel("Numer telefonu:");
		lblNumerTelefonu.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		telefon = new JTextField();
		telefon.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("E-mail:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		email = new JTextField();
		email.setColumns(10);
		

		JButton btnWylij = new JButton("WY\u015ALIJ");
		btnWylij.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] args = null;
				setImie(imie.getText());
				setNazwisko(nazwisko.getText());
				setData(dzien.getSelectedItem().toString()+miesiac.getSelectedItem().toString()+rok.getSelectedItem().toString());
				setAdres(adres.getText());
				setTel(telefon.getText());
				setMail(email.getText());
				if(name.equals(Pies.class.getSimpleName()))
				{
					frame.dispose();
					Adopcja.main(args, "Pies", j);
				}
				else
				{
					frame.dispose();
					Adopcja.main(args, "Kot", j);
				}
			}
		});
		
		JButton btnAnuluj = new JButton("ANULUJ");
		btnAnuluj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String[] args = null;
				if(name.equals(Pies.class.getSimpleName()))
				{
					frame.dispose();
					BazaPsy.main(args);
				}
				else
				{
					frame.dispose();
					BazaKoty.main(args);				
				}
			}
		});
		
		JLabel lblFormularzAdopcyjny = new JLabel("FORMULARZ ADOPCYJNY");
		lblFormularzAdopcyjny.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		
		
		//TUTAJ JEST JLABEL KTORY TRZEBA POJAWIAC PRZY BLEDZIE
		//TRZEBA TO PRZENIESC NA POCZATEK TEJ METODY - LINIA 71
		//POTEM ZROBIC TE TRY...CATCH DO ODPOWIEDNICH DANYCH :)
		JLabel blad = new JLabel("Brakuje danych lub niepoprawne dane");
		blad.setFont(new Font("Tahoma", Font.BOLD, 12));
		blad.setForeground(new Color(255, 0, 0));
		blad.setVisible(false);
		//KONIEC TEGO JLABEL
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnAnuluj)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnWylij))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblImi, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNazwisko)
								.addComponent(lblDzien)
								.addComponent(lblAdres)
								.addComponent(lblNumerTelefonu)
								.addComponent(lblNewLabel))
							.addGap(20)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(9)
									.addComponent(dzien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(miesiac, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rok, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(10)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addComponent(telefon, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
										.addComponent(adres, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
										.addComponent(email)))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(10)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(nazwisko, Alignment.LEADING)
										.addComponent(imie, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))))
							.addGap(117)))
					.addGap(135))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(168)
					.addComponent(lblFormularzAdopcyjny, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(261, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGap(168)
					.addComponent(blad)
					.addContainerGap(306, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lblFormularzAdopcyjny)
					.addGap(17)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblImi, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(imie, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNazwisko, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(nazwisko, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDzien, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(dzien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(miesiac, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(rok, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAdres)
						.addComponent(adres, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNumerTelefonu)
						.addComponent(telefon, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(53)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAnuluj)
						.addComponent(btnWylij))
					.addGap(71)
					.addComponent(blad)
					.addContainerGap(50, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}
}