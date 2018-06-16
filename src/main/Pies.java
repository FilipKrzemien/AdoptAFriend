package main;

import java.io.*;
import java.util.ArrayList;

public class Pies extends Zwierzak {
	
	ArrayList<String> pieski = new ArrayList<String>();

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

		Writer output = new BufferedWriter(new FileWriter("Psy.txt", true));
		output.append(getImie() + "\t" + getWiek() + "\t" + getKolor() + "\t" + getKolorOczu() + "\t"
				+ getWielkosc() + "\t" + getDataZnalezienia() + "\t" + getOpis() + System.getProperty("line.separator"));
		output.close();
	}
	
	public void usBaza() {
		
	}
	
	public static void main(String[] args) {

	}
}
