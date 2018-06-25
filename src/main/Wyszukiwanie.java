package main;

import java.util.ArrayList;
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
	
	public static ArrayList<Zwierzak> properFilter(String name, Integer[] counter) {
		ArrayList<Zwierzak> sorted = new ArrayList<Zwierzak>();
		ArrayList<Zwierzak> toSort = new ArrayList<Zwierzak>();
		if(name=="Kot") {
			toSort=Kot.kotki;
		}
		else {
			toSort=Pies.pieski;
		}
		for(int i=0;i<counter.length;i++) {
			for(int j=0;j<counter.length;j++) {
				if(counter[j]==0) {
					continue;
				}
				if(counter[j]==max(counter)) {
					sorted.add(toSort.get(j));
					counter[j]=0;
				}
			}
		}
		return sorted;
	}
	
	private static Integer max(Integer[] counter) {
		Integer max=counter[0];
		for(int i=1;i<counter.length;i++) {
			if(counter[i]>max) {
				max=counter[i];
			}
		}
		return max;
	}


}
