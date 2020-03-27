package commandes;

import java.util.Stack;

public class EnrigesterNombre implements Annulable_comd {

	
	private int nb;
	private Stack<Integer> pile ;
	
	public EnrigesterNombre(Stack<Integer> pile ,int nb ) {
		this.nb=nb ;
		this.pile=pile ;
		
	}
	
	public void executer() {
		this.pile.push(nb);
		
	}

	public void undo() {
		this.pile.pop();
		
	}

}
