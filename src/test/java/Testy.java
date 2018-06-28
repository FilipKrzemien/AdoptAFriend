package test.java;

import main.Kot;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testy {

	@Test
	public void testCreate() {
		Kot kicia = new Kot("Mruczek",2,"Samiec","Czarny","Zielony","Dachowiec","krótka","02/04/2018","Blablabla");
		assertNotNull(kicia);
		assertEquals("Mruczek", kicia.getImie());
		assertEquals(2, kicia.getWiek());
		assertEquals("Samiec", kicia.getPlec());
		assertEquals("Czarny", kicia.getKolor());
		kicia.setKolorOczu("Czarny");
		assertEquals("Czarny", kicia.getKolorOczu());
		kicia.setRasa("Bombajski");
		assertEquals("Bombajski", kicia.getRasa());
		
	}
}