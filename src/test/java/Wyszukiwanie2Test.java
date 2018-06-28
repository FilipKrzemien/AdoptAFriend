package test.java;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import main.Pies;
import main.Wyszukiwanie;
import main.Zwierzak;

class Wyszukiwanie2Test {

	@Test
	void testProperFilter_pies() {
		//given
		Pies.pieski = preparePieski();
		
		//when
		 ArrayList<Zwierzak> result = Wyszukiwanie.properFilter("Pies", new Integer[] {0,3,1,2});
		
		//then
		 assertEquals(3, result.size());
		 assertEquals("Damiano2",result.get(0).getImie());
		 assertEquals("Damiano4",result.get(1).getImie());
		 assertEquals("Damiano3",result.get(2).getImie());

	}

	private ArrayList<Zwierzak> preparePieski() {
		ArrayList<Zwierzak> pieski = new ArrayList<>();
		pieski.add(new Pies("Damiano", 15, "œmieszek", "kaloryfer", "zielony", 3, "pcmr", "puszysta", "12-12-12", "opis"));
		pieski.add(new Pies("Damiano2", 15, "cos", "kaloryfer", "zielony", 1, "pcmr", "puszysta", "12-11-12", "opis"));
		pieski.add(new Pies("Damiano3", 15, "cos", "kaloryfer", "zielony", 2, "pcmr", "puszysta", "12-10-12", "opis"));
		pieski.add(new Pies("Damiano4", 15, "cos", "kaloryfer", "zielony",1, "pcmr", "puszysta", "12-09-12", "opis"));

		return pieski;
	}

}
