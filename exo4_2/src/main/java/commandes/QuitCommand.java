package commandes;

import uvsq21807569.exo4_2.RecepteurSwitch;

public class QuitCommand implements Command {

	private RecepteurSwitch interepteur ;
	
	public QuitCommand(RecepteurSwitch inte) {
		this.interepteur=inte;
	}
	
	
	public void executer() {
		interepteur.eteindre();
		
	}
	

}
