package main;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Pies.utworzPlik();
		Kot.utworzPlik();
		System.out.println("Schronisko dla zwierzat\nw Krakowie");
		int wybor;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i=0;
		while(i==0)
		{
			System.out.println("Wybierz psy czy koty:\n1. Psy\n2. Koty\n");
			i=1;
			while(i==1)
			{	
				wybor=Integer.parseInt(br.readLine());
				if(wybor==1)
				{
					System.out.println("Co chcesz zrobic?\n1. Przegladaj baze.\n2. Dodaj psa do bazy.\n3. Wroc\n");
					wybor=Integer.parseInt(br.readLine());
					if(wybor==1)
					{
						Pies.wypiszBaza();
						i=0;
					}
					else if(wybor==2)
					{
						Pies pies = new Pies();
						pies.dodBaza();
						i=0;
					}
					else
						i=0;
				}
				else if(wybor==2)
				{
					System.out.println("Co chcesz zrobic?\n1. Przegladaj baze.\n2. Dodaj kota do bazy.\n3. Wroc\n");
					wybor=Integer.parseInt(br.readLine());
					if(wybor==1)
					{
						Kot.wypiszBaza();
						i=0;
					}
					else if(wybor==2)
					{
						Kot kot = new Kot();
						kot.dodBaza();
						i=0;
					}
					else
						i=0;
				}
				else
				{
					Pies.reloadBaza();
					Kot.reloadBaza();
					i=2;
				}
			}
		}
	}
}