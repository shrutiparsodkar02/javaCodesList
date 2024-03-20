class Arithmatic{
	
	int add(int a, int b){
		return a+b;
	}
	int sub(int a ,int b){
		return a-b;
	}
	int mul(int a,int b){
		return a*b;
	}
	
	int divison(int a, int b){
		try{
			return a/b;
		}
		catch(Exception e){
			System.out.println("zero division");
		}
		return 0;
	}
	int modulas(int a, int b){
		return a%b;
	}
	public static void main(String args[]){
		Arithmatic a1= new Arithmatic();
		System.out.println(a1.add(5,5));
		System.out.println(a1.sub(15,5));
		System.out.println(a1.mul(5,5));
		System.out.println(a1.divison(5,0));
		System.out.println(a1.divison(5,5));
		System.out.println(a1.modulas(50,5));
	}
	
}
