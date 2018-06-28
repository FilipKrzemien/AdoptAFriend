package main;

import java.io.*;
import java.util.*;

public class Pies extends Zwierzak {
	
	public static ArrayList<Zwierzak> pieski = new ArrayList<Zwierzak>();
	private int wielkosc;
	
	public int getWielkosc() { return wielkosc; }
	
	public void setWielkosc(int wielkosc) { this.wielkosc=wielkosc; }
	
	public Pies() {}
	
	public Pies(String imie, int wiek, String plec, String kolor, String kolor_oczu, int wielkosc,String rasa, String siersc, String data_znalezienia, String opis) {
		super(imie,wiek,plec,kolor,kolor_oczu,rasa, siersc, data_znalezienia,opis);
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
                    temp = Arrays.asList(sCurrentLine.split("\t"));
                    pieski.add(new Pies(temp.get(0),Integer.parseInt(temp.get(1)),temp.get(2),temp.get(3),temp.get(4),Integer.parseInt(temp.get(5)),temp.get(6),temp.get(7),temp.get(8),temp.get(9)));
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
                System.out.println("Nie można utworzyć bazy " + nazwa);
            }
        }
    }
	
	public void dodBaza(ArrayList<String> dane) throws IOException {
		pieski.add(new Pies(dane.get(0),Integer.parseInt(dane.get(1)),dane.get(2),dane.get(3),dane.get(4),Integer.parseInt(dane.get(5)),dane.get(6),dane.get(7),dane.get(8),dane.get(9)));
	}
	
	public void adoptuj(int i) throws IOException {
		adoptuj(pieski, "Pies", i);
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
