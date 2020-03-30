package uvsq21807569.exo4_2;

public enum Operation {
	
	PLUS("+"){

		@Override
		public int eval(int x, int y) {
		return  (x+y);
		}
		},
	MOINS("-"){
		@Override

		public int eval(int x, int y) {
		return  (x - y);
		}
		},
	MULT("*"){
		@Override
		public int eval(int x, int y) {
			return (x * y);

			}
},

	DIV("/"){		

		@Override

			public int eval(int x, int y) {

			return  (x / y);

			}
};
		

	private String sym;
	private Operation(String sym) {
		this.sym=sym;
	}
	
	
	public abstract int eval(int x , int y);


	public String getoper() {
		return sym;
	}
}


		



			



