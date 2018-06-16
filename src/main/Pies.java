package main;

import java.io.*;
import java.util.*;

public class Pies extends Zwierzak {
	
	static ArrayList<List<String>> pieski = new ArrayList<List<String>>();

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
    	List<String> temp = new ArrayList<String>();

		temp.add(getImie());
		temp.add(String.valueOf(getWiek()));
		temp.add(getKolor());
		temp.add(getKolorOczu());
		temp.add(String.valueOf(getWielkosc()));
		temp.add(getDataZnalezienia());
		temp.add(getOpis());
		pieski.add(temp);
	}
	
	public void usBaza() {
		
	}
	
	public static void wypiszBaza() throws IOException {
		wypiszBaza(pieski);		
	}
	
	public static void reloadBaza() throws IOException{
		reloadBaza("Psy.txt",pieski);
	}
	public static void main(String[] args){

	}
}
