package commandes;

import java.util.Stack;

public class UndoCommand implements Command  {

	private Annulable_comd derniere_cmd ;
	
	public UndoCommand(Stack<Annulable_comd> historique  ) {
		
		this.derniere_cmd =historique.pop();
		
	}
	
	
	public void executer() {
		derniere_cmd.undo();
		
	}

}
