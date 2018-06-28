package testy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.User;

class UserTest {

	@Test
	void testGetNick() {
		//given
		User user = new User("usr", "admin");
		
		//when
		String result = user.getNick();
		
		//then
		assertEquals(result, "usr");
	}

}