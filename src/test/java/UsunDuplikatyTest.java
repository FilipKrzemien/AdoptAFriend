package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Wyszukiwanie;

class UsunDuplikatyTest {

	@Test
	void test() {
		//given
		String[][] cechy;
		cechy = ustawCechy();
		//when
		String[] result = Wyszukiwanie.usun_duplikaty(cechy, 0);
		
		//then
		assertEquals(3, result.length);
		assertEquals("bialy",result[0]);
		assertEquals("czarny",result[1]);
		assertEquals("zielony",result[2]);
		
	}

	private String[][] ustawCechy() {
		
		String[][] cechy;
		cechy = new String[4][1];
		
		cechy[0][0] = "bialy";
		cechy[1][0] = "bialy"; 
		cechy[2][0] = "czarny"; 
		cechy[3][0] = "zielony";
	
		return cechy;
	}
	
}