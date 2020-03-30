package commandes;

import java.util.Stack;

import uvsq21807569.exo4_2.Operation;

public class OperationCmd implements Annulable_comd {

	private int  a, b  ;
	private Operation operation ;
	private Stack<Integer> pile ;
	
	public OperationCmd(Stack<Integer>pile,Operation operation) {
		this.operation=operation;
		this.pile=pile ;
	}
	
	
	public void executer() {
		int resultat ;
		a=this.pile.pop();
		b=this.pile.pop();
		
		resultat=operation.eval(a, b);
		this.pile.push(resultat);
	}

	public void undo() {
		this.pile.pop();
		this.pile.push(b);
		this.pile.push(a);
		
		
	}

}
