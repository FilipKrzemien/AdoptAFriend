package main;

import java.io.*;
import java.util.*;

public class Pies extends Zwierzak {
	
	static ArrayList<Zwierzak> pieski = new ArrayList<Zwierzak>();
	private int wielkosc;
	
	public int getWielkosc() { return wielkosc; }
	
	public void setWielkosc(int wielkosc) { this.wielkosc=wielkosc; }
	
	public Pies() {}
	
	public Pies(String imie, int wiek, String kolor, String kolor_oczu, int wielkosc, String data_znalezienia, String opis) {
		super(imie,wiek,kolor,kolor_oczu,data_znalezienia,opis);
		this.wielkosc=wielkosc;
	}
	
	public static void utworzPlik() throws FileNotFoundException{
		String nazwa="Psy.txt";
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
                    temp = Arrays.asList(sCurrentLine.split(","));
                    pieski.add(new Pies(temp.get(0),Integer.parseInt(temp.get(1)),temp.get(2),temp.get(3),Integer.parseInt(temp.get(4)),temp.get(5),temp.get(6)));
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
		System.out.println("Podaj kolor: ");
		setKolor(in.readLine());
		System.out.println("Podaj kolor oczu: ");
		setKolorOczu(in.readLine());
		System.out.println("Podaj wiekosc (1-maly, 2-sredni, 3-duzy): ");
		setWielkosc(Integer.parseInt(in.readLine()));
		System.out.println("Podaj date znalezienia: ");
		setDataZnalezienia(in.readLine());
		System.out.println("Podaj opis: ");
		setOpis(in.readLine());
		pieski.add(new Pies(getImie(),getWiek(),getKolor(),getKolorOczu(),getWielkosc(),getDataZnalezienia(),getOpis()));
	}
	
	public void adoptuj() throws IOException {
		adoptuj(pieski, "psa");
	}
	
	public static void wypiszBaza() throws IOException {
		wypiszBaza(pieski, "Pies");
	}
	
	public static void reloadBaza() throws IOException{
		reloadBaza("Psy.txt",pieski, "Pies");
	}

	public static void main(String[] args){

	}
}
