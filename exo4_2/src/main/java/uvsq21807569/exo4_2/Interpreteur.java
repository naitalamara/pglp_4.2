package uvsq21807569.exo4_2;

import java.util.Stack;

import commandes.Annulable_comd;
import commandes.Command;
import commandes.QuitCommand;
import commandes.UndoCommand;

public class Interpreteur {
	
	private Stack<Annulable_comd> historique ;
	private RecepteurSwitch s ;
	
	public Interpreteur() {
		this.historique = new Stack<Annulable_comd>();
		this.s = new  RecepteurSwitch();
	}
	public void executerCommand(Command command) {

		command.executer();
		
}	
	public void enregistrercmd(Annulable_comd command) throws Exception {

		try {

			command.executer();

			this.historique.add(command);	

		} catch (Exception e) {

			throw e;

		}

	}
	
	public void undocommand() {
		this.executerCommand(new UndoCommand(historique));
	}

	public void quittercommand() {
		this.executerCommand(new QuitCommand(s));
	}
	
	public boolean etats() {

		return s.etat();

	}
}
