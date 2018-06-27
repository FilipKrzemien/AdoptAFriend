package testy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import main.Kot;
import main.Wyszukiwanie;
import main.Zwierzak;

class WyszukiwanieTest {

	@Test
	void testProperFilter_kot() {
		//given
		Kot.kotki = prepareKotki();
		
		//when
		 ArrayList<Zwierzak> result = Wyszukiwanie.properFilter("Kot", new Integer[] {0,3,1,2});
		
		//then
		 assertEquals(3, result.size());
		 assertEquals("Damiano2",result.get(0).getImie());
		 assertEquals("Damiano4",result.get(1).getImie());
		 assertEquals("Damiano3",result.get(2).getImie());

	}

	private ArrayList<Zwierzak> prepareKotki() {
		ArrayList<Zwierzak> kotki = new ArrayList<>();
		kotki.add(new Kot("Damiano", 15, "œmieszek", "sraczkowy", "zielony", "pcmr", "puszysta", "12-12-12", "opis"));
		kotki.add(new Kot("Damiano2", 15, "cos", "sraczkowy", "zielony", "pcmr", "puszysta", "12-11-12", "opis"));
		kotki.add(new Kot("Damiano3", 15, "cos", "sraczkowy", "zielony", "pcmr", "puszysta", "12-10-12", "opis"));
		kotki.add(new Kot("Damiano4", 15, "cos", "sraczkowy", "zielony", "pcmr", "puszysta", "12-09-12", "opis"));

		return kotki;
	}

}
