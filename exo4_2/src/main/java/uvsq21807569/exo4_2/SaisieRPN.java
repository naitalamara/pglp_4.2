package uvsq21807569.exo4_2;

import java.util.Scanner;

public class SaisieRPN {
	private MoteurRPN moteur;
	private Scanner sc ;
	
	
	public SaisieRPN() {
		moteur=new MoteurRPN() ;
		
		
	}
	
	public void setScanner(Scanner sc) {

		this.sc = sc;		

	}
	
	
	public void saisie() {
	this.setScanner(new Scanner(System.in));

	String input = ""; 
	String saisi ="";
	while(moteur.etats()) {
		System.out.println("Saisissez sois un entier,sois  une opération ou exit pour sortir, puis taper sur entrée");
		try {

			input = lecture();
			saisi += input + " ";
			System.out.println(saisi);
			}

		catch (Exception e) {

			System.err.println(e.getMessage());

		}

		System.out.println(moteur.afficherPile());

	}
	}
	
	
	
	
	public String lecture() {
		String input;

		if (sc.hasNextInt()) {

			Integer d = sc.nextInt();
			moteur.enregistrernb(d);
			sc.nextLine();
			input = d.toString();
			} 

		else {

			input = sc.nextLine();
			if (input.equals("exit")) {
				moteur.quittercommand();
			}

			else if (input.equals("undo")) {
				moteur.undocommand();

			}

			else if (eskoperation(input)) {
				moteur.appeleroperation( renvoisoperation(input));	

			}

			else {

				System.out.println("erreur");

			}

		}

		return input;

	}
	
	
	
	private Operation renvoisoperation(String s) {
		for(Operation op :Operation.values()) 
			if(s.equals(op.getoper())) 
				return op ;
		
			return null ;
		
}
	
	public boolean eskoperation(String s) {
		return this.renvoisoperation(s)!=null ;
		
	}
}
