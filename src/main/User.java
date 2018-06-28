package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User {
	
	public static ArrayList<User> user = new ArrayList<User>();
	private String nick;
	private String pass;
	private static int zaloguj=0;
	
	public User(String nick, String pass) {
		this.nick=nick;
		this.pass=pass;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public static int getZaloguj() {
		return zaloguj;
	}

	public static void setZaloguj(int i) {
		zaloguj = i;
	}
	
	public static String sha(String password) throws NoSuchAlgorithmException {    	
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(password.getBytes());
        
        byte byteData[] = md.digest();
 
        //convert the byte to hex format method 1
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
        	sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }
	
	public static void utworzPlik() throws FileNotFoundException {
		String nazwa="dane.txt";
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
                    user.add(new User(temp.get(0),temp.get(1)));
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
                FileWriter fw = new FileWriter(nazwa);
                BufferedWriter bw = new BufferedWriter(fw);
        	    bw.write("admin\tadmin");
                System.out.println("Utworzono nowa baze u¿ytkowników" + nazwa);
                bw.close();
            }
            catch(IOException e){
                System.out.println("Nie mo¿na utworzyæ bazy u¿ytkowników" + nazwa);
            }
        }
    }
}