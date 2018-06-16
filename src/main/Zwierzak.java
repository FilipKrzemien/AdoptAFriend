package main;

import java.io.*;

public abstract class Zwierzak {
	private String imie;
	private int wiek;
	private String kolor;
	private String kolor_oczu;
	private int wielkosc;
	private String data_znalezienia;
	private String opis;
	
	public String getImie() { return imie; }
	
	public void setImie(String imie) { this.imie=imie; }
	
	public int getWiek() { return wiek; }
	
	public void setWiek(int wiek) { this.wiek=wiek; }
	
	public String getKolor() { return kolor; }
	
	public void setKolor(String kolor) { this.kolor=kolor; }
	
	public String getKolorOczu() { return kolor_oczu; }
	
	public void setKolorOczu(String kolor_oczu) { this.kolor_oczu=kolor_oczu; }
	
	public int getWielkosc() { return wielkosc; }
	
	public void setWielkosc(int wielkosc) { this.wielkosc=wielkosc; }
	
	public String getDataZnalezienia() { return data_znalezienia; }
	
	public void setDataZnalezienia(String data) { this.data_znalezienia=data; }
	
	public String getOpis() { return opis; }
	
	public void setOpis(String opis) { this.opis=opis; }
	
	public abstract void dodBaza() throws IOException;
	
	public abstract void usBaza();
	
	public static void wypiszBaza(String nazwa) throws IOException {
		 BufferedReader br = new BufferedReader(new FileReader(nazwa));
		 
		  String st;
		  while ((st = br.readLine()) != null)
		    System.out.println(st);
		  br.close();
	};
	
	public static void utworzPlik(String nazwa){
        File plik = new File(nazwa);
        if( plik.isFile() == true){
            System.out.println("Wczytano baze");
        }
        else{
            try{
                plik.createNewFile();
                System.out.println("Utworzono nowa baze");
            }
            catch(IOException e){
                System.out.println("Nie mo¿na utworzyæ bazy");
            }
        }
    }
	
	public static void main(String[] args) {

	}
}
