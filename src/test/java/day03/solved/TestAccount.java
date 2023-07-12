package day03.solved;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAccount {
	
	
	@Test
	  void test() {
        
        //create Account
        Account acct1 = new Account("B202", "Naresh" , 1000 );
        System.out.println(acct1.accNo + "-" + acct1.name + "-" + acct1.balance);
        
         
         
        //create Account
        Account acct2 = new Account("A102","Arun", 1000);
        System.out.println(acct2.accNo + "-" + acct2.name + "-" + acct2.balance);
        
        assertEquals("B202",acct1.accNo);
        assertEquals("A102",acct2.accNo);
    }

}
