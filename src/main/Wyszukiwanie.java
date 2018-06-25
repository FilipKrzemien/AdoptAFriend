package main;

import java.util.LinkedHashSet;
import java.util.Set;

public class Wyszukiwanie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static String[] usun_duplikaty(String[][] cechy, int j) {
		
		String[] array;
		array = new String[cechy.length];
		for(int i=0;i<cechy.length;i++) 
		{
			array[i]=cechy[i][j];
		}
		Set<String> tmp=new LinkedHashSet<String>();
		for(int i=0;i<array.length;i++) {
			tmp.add(array[i]);
		}
		String[] array2 = tmp.toArray(new String[tmp.size()]);
		
		return array2;
		
	}
}
