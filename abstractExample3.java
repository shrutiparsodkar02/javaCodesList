//if we have any method declare in abstract class then when we extend it in subclass then all the abstract method  must be icluded 
abstract class Plan{
	protected double rate;
	int units;
	abstract void getBill();
	abstract void calculateBill(double rate,int units);
	abstract void Display();
}
class DomesticBill extends Plan{
	double rate=25.3;
	int units=250;
	double bill=0;
	void calculateBill(double rate,int units){
		bill=rate*units;
		//System.out.println("the bill for"+units+"units and for"+rate+"rate is--->"+bill);
	}
	void getBill(){
		calculateBill(rate,units);
		System.out.println("the bill for "+units+" units and for "+rate+" rate is--->"+bill);
	}
	void Display(){
	
	}
	
	//as these method is declare in sub class so we cant call it using refrence variable of super class
	/*void Nodisplay(){
		System.out.println("hi");
	}*/
}
class ComercialBill extends Plan{
	double rate=12.3;
	int units=250;
	double bill=0;
	void calculateBill(double rate,int units){
		 bill=rate*units;
		//System.out.println("the bill for"+units+"units and for"+rate+"rate is--->"+bill);
	}
	void getBill(){
		calculateBill(rate,units);
		System.out.println("the bill for "+units+" units and for "+rate+" rate is--->"+bill);
	}
	void Display(){
	
	}
}
class returnBill{
	public static void main(String args[]){
		Plan p;
		DomesticBill d= new DomesticBill();
		p=d;
		p.getBill();
		//d.Nodisplay();
		
		ComercialBill c= new ComercialBill();
		p=c;
		p.getBill();
		
	}
}

