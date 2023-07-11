package day02.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class TestLogger {
	
	
	@Test
	void testDebug() {
		Logger log = new Logger();
		assertEquals("Check1",log.debug("Check1"));
		assertNotEquals(3,log.debug(5));
	}
	
	@Test
	void testInfo() {
		Logger log = new Logger();
		assertEquals("info",log.info("info"));
		assertNotEquals(10,log.info(3));
	}
	
	@Test
	void testError() {
		Logger log = new Logger();
		assertNotEquals("Error",log.error("error"));
		assertEquals(1,log.error(1));
	}
		
		
	
		
	
	
	

}
