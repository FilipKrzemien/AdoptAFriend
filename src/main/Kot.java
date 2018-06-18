package main;

import java.io.*;
import java.util.*;

public class Kot extends Zwierzak {
	
	static ArrayList<Zwierzak> kotki = new ArrayList<Zwierzak>();
	
	public Kot() {}
	
	public Kot(String imie, int wiek, String plec, String kolor, String kolor_oczu, String rasa, String siersc, String data_znalezienia, String opis) {
		super(imie,wiek,plec, kolor,kolor_oczu,rasa, siersc, data_znalezienia,opis);
	}

	public static void utworzPlik() throws FileNotFoundException{
		String nazwa="Koty.txt";
        File plik = new File(nazwa);
    	List<String> temp = new ArrayList<String>();
        if( plik.isFile() == true){
            System.out.println("Wczytano baze " + nazwa);
            StringBuilder contentBuilder = new StringBuilder();
            try (BufferedReader br = new BufferedReader(new FileReader(nazwa)))
            {
         
                String sCurrentLine;
                while ((sCurrentLine = br.readLine()) != null)
                {
                    contentBuilder.append(sCurrentLine).append("\n");
                    temp = Arrays.asList(sCurrentLine.split("\t"));
                    kotki.add(new Kot(temp.get(0),Integer.parseInt(temp.get(1)),temp.get(2),temp.get(3), temp.get(4),temp.get(5),temp.get(6),temp.get(7),temp.get(8)));
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            System.out.println();
        }
        else{
            try{
                plik.createNewFile();
                System.out.println("Utworzono nowa baze " + nazwa);
            }
            catch(IOException e){
                System.out.println("Nie mo¿na utworzyæ bazy " + nazwa);
            }
        }
    }
	
	public void dodBaza() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Podaj imie: ");
		setImie(in.readLine());
		System.out.println("Podaj wiek: ");
		setWiek(Integer.parseInt(in.readLine()));
		System.out.println("Podaj plec(samiec/samica): ");
		setPlec(in.readLine());
		System.out.println("Podaj kolor: ");
		setKolor(in.readLine());
		System.out.println("Podaj kolor oczu: ");
		setKolorOczu(in.readLine());
		System.out.println("Podaj jaka to rasa: ");
		setRasa(in.readLine());
		System.out.println("Podaj dlugosc siersci: ");
		setSiersc(in.readLine());
		System.out.println("Podaj date znalezienia: ");
		setDataZnalezienia(in.readLine());
		System.out.println("Podaj opis: ");
		setOpis(in.readLine());
		kotki.add(new Kot(getImie(),getWiek(),getPlec(), getKolor(),getKolorOczu(),getRasa(), getSiersc(), getDataZnalezienia(),getOpis()));
	}
	
	public void adoptuj(int i) throws IOException {
		adoptuj(kotki, "kota", i);
	}
	
	public static void wypiszBaza() throws IOException {
		wypiszBaza(kotki, "Kot");
	}
	
	public static void reloadBaza() throws IOException{
		reloadBaza("Koty.txt",kotki, "Kot");
	}
	
	public static void main(String[] args) {

	}
}
