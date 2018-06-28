package main;

import java.io.*;
import java.util.*;

public abstract class Zwierzak {
	private String imie;
	private int wiek;
	private String plec;
	private String kolor;
	private String kolor_oczu;
	private String rasa;
	private String siersc;
	private String data_znalezienia;
	private String opis;
	
	public Zwierzak() {}
	
	public Zwierzak(String imie, int wiek, String plec, String kolor, String kolor_oczu, String rasa, String siersc, String data_znalezienia, String opis) {
		this.imie=imie;
		this.wiek=wiek;
		this.plec=plec;
		this.kolor=kolor;
		this.kolor_oczu=kolor_oczu;
		this.rasa=rasa;
		this.siersc=siersc;
		this.data_znalezienia=data_znalezienia;
		this.opis=opis;
	}
	
	public String getImie() { return imie; }
	
	public void setImie(String imie) { this.imie=imie; }
	
	public int getWiek() { return wiek; }
	
	public void setWiek(int wiek) { this.wiek=wiek; }
	
	public String getPlec() { return plec; }
	
	public void setPlec(String plec) { this.plec=plec; }
	
	public String getKolor() { return kolor; }
	
	public void setKolor(String kolor) { this.kolor=kolor; }
	
	public String getKolorOczu() { return kolor_oczu; }
	
	public void setKolorOczu(String kolor_oczu) { this.kolor_oczu=kolor_oczu; }
	
	public String getRasa() { return rasa; }
	
	public void setRasa(String rasa) { this.rasa=rasa; }
	
	public String getSiersc() { return siersc; }
	
	public void setSiersc(String siersc) { this.siersc=siersc; }
	
	public String getDataZnalezienia() { return data_znalezienia; }
	
	public void setDataZnalezienia(String data) { this.data_znalezienia=data; }
	
	public String getOpis() { return opis; }
	
	public void setOpis(String opis) { this.opis=opis; }
	
	public abstract void dodBaza(ArrayList<String> dane) throws IOException;
	
	public static void adoptuj(ArrayList<Zwierzak> list, String name, int i) throws IOException {
		String s;
		if(name.equals(Pies.class.getSimpleName()))
		{
			s = "PSY/" + Pies.pieski.get(i-1).getImie() + "_pies.jpg";
		}
		else
		{
			s = "KOTY/" + Kot.kotki.get(i-1).getImie() + "_kot.jpg";			
		}
		File file = new File(s);
		file.delete();
		list.remove(i-1);
		Pies.reloadBaza();
		Kot.reloadBaza();
	}
	
	public static void wypiszBaza(ArrayList<Zwierzak> list, String name) throws IOException {
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
			System.out.print(list.get(i).getRasa() + "\t\t" + list.get(i).getSiersc() + "\t\t" + 
										list.get(i).getDataZnalezienia() + "\t\t" + list.get(i).getOpis());
			System.out.print("\r\n");	
		}
	};
	
	public static void reloadBaza(String nazwa, ArrayList<Zwierzak> list, String name) throws IOException {
        FileWriter fw = new FileWriter(nazwa);
        BufferedWriter bw = new BufferedWriter(fw);
		for(int i =0;i<list.size();i++) {
	        bw.write(list.get(i).getImie() + "\t");
	        bw.write(list.get(i).getWiek() + "\t");
	        bw.write(list.get(i).getPlec() + "\t");
	        bw.write(list.get(i).getKolor() + "\t");
	        bw.write(list.get(i).getKolorOczu() + "\t");
			if(name.equals(Pies.class.getSimpleName())) { bw.write(((Pies) list.get(i)).getWielkosc() + "\t"); }	        
			bw.write(list.get(i).getRasa() + "\t");
			bw.write(list.get(i).getSiersc() + "\t");
	        bw.write(list.get(i).getDataZnalezienia() + "\t");
	        bw.write(list.get(i).getOpis());
			bw.write("\r\n");
		}
		bw.close();
	}
	
	public static void main(String[] args) {

	}
}
