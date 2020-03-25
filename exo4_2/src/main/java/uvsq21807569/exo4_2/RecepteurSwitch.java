package uvsq21807569.exo4_2;

public class RecepteurSwitch {
	private boolean a ;
	
	public RecepteurSwitch() {
		this.a=true ;
	}
	
	
	public boolean etat() {
		return a ;
	}
	
	
	public void allumer() {
		a=true ;
	}
	
	
	public void eteindre() {
		a=false ;
	}


}
