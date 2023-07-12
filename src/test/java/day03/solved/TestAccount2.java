package day03.solved;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAccount2 {
	
	@Test
	void test1() {
		
		Account2 acct1 = new Account2();
		acct1.setAccNo("A101");
		assertEquals("A101",acct1.getAccNo());
		
	}
	
	@Test
	void test2() {
		Account2 acct2 = new Account2("B101","Kumar",2000);
		assertNotEquals(100,acct2.getBalance());
	}

}
