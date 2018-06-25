package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Kandydat {
	private String imie;
	private String nazwisko;
	private String data_urodzenia;
	private String adres;
	private String tel_num;
	private String mail;
	
	public Kandydat(String imie, String nazwisko, String data_urodzenia, String adres, String tel_num, String mail) {
		this.imie=imie;
		this.nazwisko=nazwisko;
		this.data_urodzenia=data_urodzenia;
		this.adres=adres;
		this.tel_num=tel_num;
		this.mail=mail;
	}
	
	public String getImie() { return imie; }
	
	public void setImie(String imie) { this.imie=imie; }
	
	public String getNazwisko() { return nazwisko; }
	
	public void setNazwisko(String nazwisko) { this.nazwisko=nazwisko; }
	
	public String getData() { return data_urodzenia; }
	
	public void setData(String data) { this.data_urodzenia=data; }
	
	public String getAdres() { return adres; }
	
	public void setAdres(String adres) { this.adres=adres; }
	
	public String getTel() { return tel_num; }
	
	public void setTel(String tel) { this.tel_num=tel; }
	
	public String getMail() { return mail; }
	
	public void setMail(String mail) { this.mail=mail; }
	
	//zapis do pliku + dane zwierzaka tez
	
	public static void zapis(String spec, int k, Kandydat kandydat) throws IOException {
        FileWriter fw = new FileWriter("Potwierdzenie_" + kandydat.getNazwisko() + "_" + kandydat.getImie() + ".txt");
        BufferedWriter bw = new BufferedWriter(fw);
		bw.write("------------ SCHRONISKO DLA ZWIERZ¥T W KRAKOWIE ------------");
		bw.newLine();
		bw.write("------------ POTWIERDZENIE WYS£ANIA FORMULARZA -------------");
		bw.newLine();
		bw.newLine();
		bw.write("~ Wybrany " + spec + " ~");
		bw.newLine();
		bw.newLine();
		bw.write("Imiê: " + Kot.kotki.get(k).getImie());
		bw.newLine();
		bw.write("Wiek: " + Integer.toString(Kot.kotki.get(k).getWiek()));
		bw.newLine();
		bw.write("Data znalezienia: " + Kot.kotki.get(k).getDataZnalezienia());
		bw.newLine();			
		bw.newLine();
		bw.newLine();
		bw.write("Dane osobowe:");
		bw.newLine();
		bw.newLine();
		bw.write("Imiê: " + kandydat.getImie());
		bw.newLine();
		bw.write("Nazwisko: " + kandydat.getNazwisko());
		bw.newLine();
		bw.write("Data urodzenia: " + kandydat.getData());
		bw.newLine();
		bw.write("Adres: " + kandydat.getAdres());
		bw.newLine();
		bw.write("Numer telefonu: " + kandydat.getTel());
		bw.newLine();
		bw.write("Adres e-mail: " + kandydat.getMail());
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write("------------ SCHRONISKO DLA ZWIERZ¥T W KRAKOWIE ------------");
		bw.close();
		fw.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
