package uvsq21807569.exo4_2;

import java.util.Stack;

import commandes.Annulable_comd;
import commandes.Command;

public class Interpreteur {
	
	private Stack<Annulable_comd> historique ;
	private RecepteurSwitch s ;
	
	public Interpreteur() {
		this.historique = new Stack<Annulable_comd>();
		this.s = new  RecepteurSwitch();
	}
	private void applyCommand(Command command) {

		command.executer();

	}	
	
	

}
