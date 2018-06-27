package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

//import main.Kot;
//import main.Pies;
//import main.Zwierzak;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dodawanie {

	private JFrame frame;
	private JTextField imie;
	private JTextField masc;
	private JTextField oczy;
	private JTextField rasa;
	private JTextField opis;
	private JTextField wiek;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dodawanie window = new Dodawanie();
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
	public Dodawanie() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDodawanie = new JLabel("Dodaj zwierz\u0119 do bazy");
		lblDodawanie.setBounds(125, 13, 255, 37);
		lblDodawanie.setHorizontalAlignment(SwingConstants.LEFT);
		lblDodawanie.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblDodawanie);
		
		JLabel lblGatunek = new JLabel("Gatunek:");
		lblGatunek.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGatunek.setBounds(12, 64, 56, 16);
		frame.getContentPane().add(lblGatunek);
		
		JComboBox<Object> gatunek = new JComboBox<Object>();
		gatunek.setModel(new DefaultComboBoxModel<Object>(new String[] {"Kot", "Pies"}));
		gatunek.setBounds(125, 63, 67, 19);
		frame.getContentPane().add(gatunek);
		
		JLabel lblImie = new JLabel("Imi\u0119:");
		lblImie.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblImie.setBounds(12, 101, 56, 16);
		frame.getContentPane().add(lblImie);
		
		JLabel lblPlec = new JLabel("P\u0142e\u0107:");
		lblPlec.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPlec.setBounds(12, 169, 56, 16);
		frame.getContentPane().add(lblPlec);
		
		JComboBox<Object> plec = new JComboBox<Object>();
		plec.setModel(new DefaultComboBoxModel<Object>(new String[] {"Samiec", "Samica"}));
		plec.setBounds(125, 168, 67, 19);
		frame.getContentPane().add(plec);
		
		imie = new JTextField();
		imie.setBounds(125, 98, 255, 22);
		frame.getContentPane().add(imie);
		imie.setColumns(10);
		
		JLabel lblMasc = new JLabel("Umaszczenie:");
		lblMasc.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMasc.setBounds(12, 203, 88, 16);
		frame.getContentPane().add(lblMasc);
		
		JLabel lblOczy = new JLabel("Kolor oczu:");
		lblOczy.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOczy.setBounds(12, 238, 88, 16);
		frame.getContentPane().add(lblOczy);
		
		JLabel lblWielk = new JLabel("Wielko\u015B\u0107:");
		lblWielk.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblWielk.setBounds(12, 271, 56, 16);
		frame.getContentPane().add(lblWielk);
		
		masc = new JTextField();
		masc.setColumns(10);
		masc.setBounds(125, 200, 255, 22);
		frame.getContentPane().add(masc);
		
		oczy = new JTextField();
		oczy.setColumns(10);
		oczy.setBounds(125, 235, 255, 22);
		frame.getContentPane().add(oczy);
		
		JLabel lblRasa = new JLabel("Rasa:");
		lblRasa.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRasa.setBounds(12, 305, 56, 16);
		frame.getContentPane().add(lblRasa);
		
		JLabel lblSiersc = new JLabel("D\u0142ugo\u015B\u0107 sier\u015Bci:");
		lblSiersc.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSiersc.setBounds(12, 338, 104, 16);
		frame.getContentPane().add(lblSiersc);
		
		JComboBox<Object> siersc = new JComboBox<Object>();
		siersc.setModel(new DefaultComboBoxModel<Object>(new String[] {"kr\u00F3tka", "\u015Brednia", "d\u0142uga"}));
		siersc.setBounds(125, 337, 67, 19);
		frame.getContentPane().add(siersc);
		
		rasa = new JTextField();
		rasa.setColumns(10);
		rasa.setBounds(125, 302, 255, 22);
		frame.getContentPane().add(rasa);
		
		JLabel lblData = new JLabel("Data przyj\u0119cia:");
		lblData.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblData.setBounds(12, 370, 104, 16);
		frame.getContentPane().add(lblData);
		
		JComboBox<Object> dzien = new JComboBox<Object>();
		dzien.setModel(new DefaultComboBoxModel<Object>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		dzien.setBounds(126, 369, 35, 19);
		frame.getContentPane().add(dzien);
		
		JComboBox<Object> miesiac = new JComboBox<Object>();
		miesiac.setModel(new DefaultComboBoxModel<Object>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		miesiac.setBounds(173, 369, 35, 19);
		frame.getContentPane().add(miesiac);
		
		JComboBox<Object> rok = new JComboBox<Object>();
		rok.setModel(new DefaultComboBoxModel<Object>(new String[] {"2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000"}));
		rok.setBounds(218, 369, 55, 19);
		frame.getContentPane().add(rok);
		
		JLabel lblOpis = new JLabel("Opis:");
		lblOpis.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOpis.setBounds(12, 401, 104, 16);
		frame.getContentPane().add(lblOpis);
		
		opis = new JTextField();
		opis.setColumns(10);
		opis.setBounds(125, 401, 255, 101);
		frame.getContentPane().add(opis);
		
		JLabel lblZdj = new JLabel("Zdj\u0119cie:");
		lblZdj.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblZdj.setBounds(12, 519, 104, 16);
		frame.getContentPane().add(lblZdj);
		
		JButton btnDodaj = new JButton("Dodaj zdj\u0119cie");
		btnDodaj.setBounds(125, 515, 120, 25);
		frame.getContentPane().add(btnDodaj);
		
		JButton btnAnuluj = new JButton("Anuluj");
		btnAnuluj.setBounds(12, 565, 97, 25);
		frame.getContentPane().add(btnAnuluj);
		
		JButton btnZatwierd = new JButton("Dodaj");
		btnZatwierd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnZatwierd.setBounds(323, 565, 97, 25);
		frame.getContentPane().add(btnZatwierd);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(256, 519, 56, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox<Object> wielkosc = new JComboBox<Object>();
		wielkosc.setModel(new DefaultComboBoxModel<Object>(new String[] {"ma\u0142y", "\u015Bredni", "du\u017Cy"}));
		wielkosc.setBounds(125, 270, 67, 19);
		frame.getContentPane().add(wielkosc);
		
		JLabel lblWiek = new JLabel("Wiek:");
		lblWiek.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblWiek.setBounds(12, 136, 56, 16);
		frame.getContentPane().add(lblWiek);
		
		wiek = new JTextField();
		wiek.setColumns(10);
		wiek.setBounds(125, 133, 255, 22);
		frame.getContentPane().add(wiek);
	}
}
