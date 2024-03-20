class Bitwiseop{
	int and(int n,int m){
		int res=n&m;
		return res;
	}
	int or(int n,int m){
		int res=n|m;
		return res;
	}
	int not(int n){
		int res=~n;
		return res;
	}
	public static void main(String args[]){
		Bitwiseop b =new Bitwiseop();
		System.out.println(b.and(5,10));
		System.out.println(b.or(5,10));
		System.out.println(b.not(10));
	}
}
