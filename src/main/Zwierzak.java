package main;

import java.io.*;
import java.util.*;

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
	
	public static void wypiszBaza(ArrayList<List<String>> list) throws IOException {
		System.out.println(list);
	};
	
	public static void utworzPlik(String nazwa, ArrayList<List<String>> list) throws FileNotFoundException{
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
                    list.add(temp);
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
	
	public static void reloadBaza(String nazwa, ArrayList<List<String>> list) throws IOException {
        FileWriter fw = new FileWriter(nazwa);
        BufferedWriter bw = new BufferedWriter(fw);
		for(int i =0;i<list.size();i++) {
			for(int j=0; j<7;j++) {
	            bw.write(list.get(i).get(j).toString() + "\t");
			}
			bw.write("\r\n");
		}
		bw.close();
	}
	
	public static void main(String[] args) {

	}
}
