abstract class Car{
	int licenesNum;
	Car(int r){
		this.licenesNum=r;	
	}
	void openTank(){
	}
	abstract void SteringWheel(int distance,int time);
	abstract void brakes(int force);
}
class Maruti extends Car{
	Maruti(int r){
		super(r);
	}
	void openTank(){
		System.out.println("opening fule tank");
	}
	void SteringWheel(int distance,int time){
		int speed=(distance/time);
		if(speed<30){
			System.out.println("manual stering wheel");
		}
		else if(speed>30){
			System.out.println("power stering ");
		}
	}
	void brakes(int force){
		if(force>30){
			System.out.println("power breaker");
		}
		else{
			System.out.println("simple breaks");
		}
	}

}
class MainExecute{
	public static void main(String args[]){
	Car ref;
	Maruti m = new  Maruti(254618);
	ref=m;
	ref.SteringWheel(5000,20);
	ref.brakes(50);
	}

}
