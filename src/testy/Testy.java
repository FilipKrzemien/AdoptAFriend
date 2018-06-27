package testy;

import main.Kot;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class Testy {

	@Test
	public void testCreate() {
		Kot kicia = new Kot("Mruczek",2,"Samiec","Czarny","Zielony","Dachowiec","krótka","02/04/2018","Blablabla");
		Assert.assertNotNull(kicia);
		Assert.assertEquals("Mruczek", kicia.getImie());
		Assert.assertEquals(2, kicia.getWiek());
		Assert.assertEquals("Samiec", kicia.getPlec());
		Assert.assertEquals("Czarny", kicia.getKolor());
		kicia.setKolorOczu("Czarny");
		Assert.assertEquals("Czarny", kicia.getKolorOczu());
		kicia.setRasa("Bombajski");
		Assert.assertEquals("Bombajski", kicia.getRasa());
		
	}

	@Test
	public void test2() {
		
	}
}
