class Mathmatics{
	int a;
	int b;
	Mathmatics(int a,int b){
		this.a=a;
		this.b=b;	
	}
	void addition(){
		System.out.println("addition" +(a+b));
	}
	public static void main(String args[]){
		Mathmatics m =new Mathmatics(5,8);
		m.addition();
	}
}
