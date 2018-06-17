package main;

import java.io.*;
import java.util.*;

public abstract class Zwierzak {
	private String imie;
	private int wiek;
	private String kolor;
	private String kolor_oczu;

	private String data_znalezienia;
	private String opis;
	
	public Zwierzak() {}
	
	public Zwierzak(String imie, int wiek, String kolor, String kolor_oczu, String data_znalezienia, String opis) {
		this.imie=imie;
		this.wiek=wiek;
		this.kolor=kolor;
		this.kolor_oczu=kolor_oczu;
		this.data_znalezienia=data_znalezienia;
		this.opis=opis;
	}
	
	public String getImie() { return imie; }
	
	public void setImie(String imie) { this.imie=imie; }
	
	public int getWiek() { return wiek; }
	
	public void setWiek(int wiek) { this.wiek=wiek; }
	
	public String getKolor() { return kolor; }
	
	public void setKolor(String kolor) { this.kolor=kolor; }
	
	public String getKolorOczu() { return kolor_oczu; }
	
	public void setKolorOczu(String kolor_oczu) { this.kolor_oczu=kolor_oczu; }
	
	public String getDataZnalezienia() { return data_znalezienia; }
	
	public void setDataZnalezienia(String data) { this.data_znalezienia=data; }
	
	public String getOpis() { return opis; }
	
	public void setOpis(String opis) { this.opis=opis; }
	
	public abstract void dodBaza() throws IOException;
	
	public static void adoptuj(ArrayList<Zwierzak> list, String name) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ktorego " + name + " chcesz adoptowaæ: ");
		int i = Integer.parseInt(in.readLine());
		list.remove(i-1);
		Pies.reloadBaza();
		Kot.reloadBaza();
	}
	
	public static void wypiszBaza(ArrayList<Zwierzak> list, String name) throws IOException {
		System.out.print("Imie\t\tWiek\t\tKolor\t\tKolor Oczu");
		if(name.equals(Pies.class.getSimpleName())) { System.out.print("\t\tWieloœæ"); }
		System.out.print("\t\tData Znalezienia\t\tOpis\r\n");
		for( int i =0; i<list.size();i++) {
			System.out.print(list.get(i).getImie() + "\t\t" + list.get(i).getWiek() + "\t\t" + list.get(i).getKolor() + "\t\t" + list.get(i).getKolorOczu() + "\t\t");
			
		if(name.equals(Pies.class.getSimpleName()))
		{
			if(((Pies) list.get(i)).getWielkosc()==1) {
				System.out.print("Ma³y\t\t");
			}
			else if(((Pies) list.get(i)).getWielkosc()==2) {
				System.out.print("Œredni\t\t");				
			}
			else if(((Pies) list.get(i)).getWielkosc()==3) {
				System.out.print("Du¿y\t\t");				
			}
		}
			System.out.print(list.get(i).getDataZnalezienia() + "\t\t" + list.get(i).getOpis());
			System.out.print("\r\n");	
		}
	};
	
	public static void reloadBaza(String nazwa, ArrayList<Zwierzak> list, String name) throws IOException {
        FileWriter fw = new FileWriter(nazwa);
        BufferedWriter bw = new BufferedWriter(fw);
		for(int i =0;i<list.size();i++) {
	        bw.write(list.get(i).getImie() + ",");
	        bw.write(list.get(i).getWiek() + ",");
	        bw.write(list.get(i).getKolor() + ",");
	        bw.write(list.get(i).getKolorOczu() + ",");
			if(name.equals(Pies.class.getSimpleName())) { bw.write(((Pies) list.get(i)).getWielkosc() + ","); }	        
	        
	        bw.write(list.get(i).getDataZnalezienia() + ",");
	        bw.write(list.get(i).getOpis());
			bw.write("\r\n");
		}
		bw.close();
	}
	
	public static void main(String[] args) {

	}
}
