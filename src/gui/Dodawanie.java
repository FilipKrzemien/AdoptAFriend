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
import java.util.ArrayList;

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
		frame.setBounds(100, 100, 450, 660);
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
		gatunek.setBounds(125, 60, 95, 25);
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
		plec.setBounds(125, 165, 95, 25);
		frame.getContentPane().add(plec);
		
		imie = new JTextField();
		imie.setBounds(125, 97, 255, 25);
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
		
		JLabel lblWielkosc = new JLabel("Wielko\u015B\u0107:");
		lblWielkosc.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblWielkosc.setBounds(12, 271, 56, 16);
		frame.getContentPane().add(lblWielkosc);
		
		masc = new JTextField();
		masc.setColumns(10);
		masc.setBounds(125, 199, 255, 25);
		frame.getContentPane().add(masc);
		
		oczy = new JTextField();
		oczy.setColumns(10);
		oczy.setBounds(125, 235, 255, 23);
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
		siersc.setBounds(125, 334, 95, 25);
		frame.getContentPane().add(siersc);
		
		rasa = new JTextField();
		rasa.setColumns(10);
		rasa.setBounds(125, 301, 255, 25);
		frame.getContentPane().add(rasa);
		
		JLabel lblData = new JLabel("Data przyj\u0119cia:");
		lblData.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblData.setBounds(12, 376, 104, 16);
		frame.getContentPane().add(lblData);
		
		JComboBox<Object> dzien = new JComboBox<Object>();
		dzien.setModel(new DefaultComboBoxModel<Object>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		dzien.setBounds(126, 372, 41, 25);
		frame.getContentPane().add(dzien);
		
		JComboBox<Object> miesiac = new JComboBox<Object>();
		miesiac.setModel(new DefaultComboBoxModel<Object>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		miesiac.setBounds(179, 372, 41, 25);
		frame.getContentPane().add(miesiac);
		
		JComboBox<Object> rok = new JComboBox<Object>();
		rok.setModel(new DefaultComboBoxModel<Object>(new String[] {"2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000"}));
		rok.setBounds(232, 372, 55, 25);
		frame.getContentPane().add(rok);
		
		JLabel lblOpis = new JLabel("Opis:");
		lblOpis.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOpis.setBounds(12, 410, 104, 16);
		frame.getContentPane().add(lblOpis);
		
		opis = new JTextField();
		opis.setColumns(10);
		opis.setBounds(125, 410, 255, 101);
		frame.getContentPane().add(opis);
		
		JLabel lblZdj = new JLabel("Zdj\u0119cie:");
		lblZdj.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblZdj.setBounds(12, 528, 104, 16);
		frame.getContentPane().add(lblZdj);
		
		JButton btnDodaj = new JButton("Dodaj zdj\u0119cie");
		btnDodaj.setBounds(125, 524, 120, 25);
		frame.getContentPane().add(btnDodaj);
		
		JComboBox<Object> wielkosc = new JComboBox<Object>();
		wielkosc.setModel(new DefaultComboBoxModel<Object>(new String[] {"ma\u0142y", "\u015Bredni", "du\u017Cy"}));
		wielkosc.setBounds(125, 267, 95, 25);
		frame.getContentPane().add(wielkosc);
		
		JButton btnAnuluj = new JButton("Anuluj");
		btnAnuluj.setBounds(12, 575, 97, 25);
		frame.getContentPane().add(btnAnuluj);
		
		JButton btnZatwierd = new JButton("Dodaj");
		btnZatwierd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String data = dzien.getSelectedItem().toString() + "/" + miesiac.getSelectedItem().toString() + "/" + rok.getSelectedItem().toString();
				String pies = "Pies";
				ArrayList<String> dane = new ArrayList<String>();
				dane.add(imie.getText());
				dane.add(wiek.getText());
				dane.add(plec.getSelectedItem().toString());
				dane.add(masc.getText());
				dane.add(oczy.getText());
				if(pies.equals(gatunek.getSelectedItem().toString())) {
				dane.add(wielkosc.getSelectedItem().toString());
				}
				dane.add(rasa.getText());
				dane.add(siersc.getSelectedItem().toString());
				dane.add(data);
				dane.add(opis.getText());
				
			}
		});
		btnZatwierd.setBounds(323, 575, 97, 25);
		frame.getContentPane().add(btnZatwierd);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(256, 528, 56, 16);
		frame.getContentPane().add(lblNewLabel);
		
		
		JLabel lblWiek = new JLabel("Wiek:");
		lblWiek.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblWiek.setBounds(12, 136, 56, 16);
		frame.getContentPane().add(lblWiek);
		
		wiek = new JTextField();
		wiek.setColumns(10);
		wiek.setBounds(125, 132, 255, 25);
		frame.getContentPane().add(wiek);
	}
}
