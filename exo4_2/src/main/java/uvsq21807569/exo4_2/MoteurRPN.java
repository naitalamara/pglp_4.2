package uvsq21807569.exo4_2;

import java.util.Stack;

import commandes.EnrigesterNombre;
import commandes.OperationCmd;

public class MoteurRPN extends Interpreteur {
	
		private Stack<Integer> pile ;
		
		
		public MoteurRPN() {
			this.pile=new Stack<Integer>();
		}
		
		public void enregistrernb(int a) {
			try {
				this.enregistrercmd(new EnrigesterNombre(pile,a));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void appeleroperation(Operation op) {
			try {
				this.enregistrercmd(new OperationCmd(pile,op));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public String afficherPile() {

			String s = " ";

			for (int d : this.pile) {

				s += (d + " ");

			}	
			

			return s ;

		}
		public int taillePile(){

			return this.pile.size();

		}
}
