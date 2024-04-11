class Square_Multiple_obj{
	int squareCalculation(int x){
		int sqr=x*x;
		System.out.println("the square of the number is--->"+sqr);
		return sqr;
	} 
	public static void main(String args[]){
		Square_Multiple_obj sqr1=new Square_Multiple_obj();
		Square_Multiple_obj sqr2=new Square_Multiple_obj();
		Square_Multiple_obj sqr3=new Square_Multiple_obj();
		sqr1.squareCalculation(5);
		sqr2.squareCalculation(2);
		sqr3.squareCalculation(6);
	}


}
