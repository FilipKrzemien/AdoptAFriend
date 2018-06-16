package main;

import java.io.*;
import java.util.*;

public class Kot extends Zwierzak {
	
	static ArrayList<List<String>> kotki = new ArrayList<List<String>>();


	public void dodBaza() throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.println("Podaj imie: ");
		setImie(in.nextLine());
		System.out.println("Podaj wiek: ");
		setWiek(in.nextInt());
		System.out.println("Podaj kolor: ");
		setKolor(in.nextLine());
		System.out.println("Podaj kolor oczu: ");
		setKolorOczu(in.nextLine());
		System.out.println("Podaj wiekosc (1-maly, 2-sredni, 3-duzy): ");
		setWielkosc(in.nextInt());
		System.out.println("Podaj date znalezienia: ");
		setDataZnalezienia(in.nextLine());
		System.out.println("Podaj opis: ");
		setOpis(in.nextLine());
		in.close();
		Writer output = new BufferedWriter(new FileWriter("Psy.txt", true));
		output.append(getImie() + "\t" + getWiek() + "\t" + getKolor() + "\t" + getKolorOczu() + "\t"
				+ getWielkosc() + "\t" + getDataZnalezienia() + "\t" + getOpis() + System.getProperty("line.separator"));
		output.close();	
	}
	
	public void usBaza() {
		
	}
	
	public static void wypiszBaza() throws IOException {
		wypiszBaza(kotki);
	}
	public static void main(String[] args) {

	}
}
