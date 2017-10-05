package exo31;

import static org.junit.Assert.*;

import org.junit.Test;

public class compteTest {

	@Test
	public void testgetSolde()
	{	
		compte comp = new compte(100);
		assertTrue(comp.getSolde() == 100);
	}
	
	@Test
	public void testcredit()
	{
		compte comp = new compte(100);
		assertTrue(comp.credit(30) == 130);
	}
	
	@Test
	public void testdebit()
	{	
		compte comp = new compte(100);
		assertTrue(comp.debit(30) == 70);
	}
	
	@Test
	public void testvirement()
	{
		compte comp = new compte(100);
		compte comp2 = new compte(200);
		comp.virement(comp2,30);
		assertTrue(comp.getSolde() == 70);
		assertTrue( comp2.getSolde() == 230);
		
	}

}