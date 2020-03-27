package uvsq21807569.exo4_2;

public enum Operation {
	
	PLUS("+"){

		@Override
		public double eval(double x, double y) {
		return x+y;
		}
		},
	MOINS("-"){
		@Override

		public double eval(double x, double y) {
		return x - y;
		}
		},
	MULT("*"){
		@Override
		public double eval(double x, double y) {
			return x * y;

			}
},

	DIV("/"){		

		@Override

			public double eval(double x, double y) {

			return x / y;

			}
};
		

	private String sym;
	private Operation(String sym) {
		this.sym=sym;
	}
	
	
	public abstract double eval(double x , double y);


	public String getoper() {
		return sym;
	}
}


		



			



