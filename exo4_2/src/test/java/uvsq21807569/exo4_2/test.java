package uvsq21807569.exo4_2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import commandes.OperationCmd;
import commandes.UndoCommand;

public class test {

	private MoteurRPN calcul =new MoteurRPN();

	@Before
	public void init() {
	MoteurRPN calcul =new MoteurRPN();
	 
	
	}
	@Test
	public void test() {
		calcul.enregistrernb(2);
		System.out.println(calcul.afficherPile());
		assertEquals(calcul.taillePile(),1);
		calcul.enregistrernb(3);
		System.out.println(calcul.afficherPile());
		assertEquals(calcul.taillePile(),2);
		
	}
}	


