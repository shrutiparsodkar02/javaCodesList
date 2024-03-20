//java program using logical operator
class Logicalop{
	int check1(int m,int n){
		System.out.println("finding greatest");
		if(m>n && m>0){
			return m;
		}
		else{
			return n;
		}
	}
	void check2(int m ,int n){
		if(m<0 || m<n){
		System.out.println(m+" is negative or smaller then "+n);
		}
		else{
	System.out.println(m+" is not negative or smaller then "+n);
		}
	}
	public static void main(String args[]){
		Logicalop l= new Logicalop();
		System.out.println(l.check1(5,2));
		l.check2(-2,6);
	}
	
	
}
