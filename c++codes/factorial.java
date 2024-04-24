//print factorial of number 
class Factorial{
	public static void main(String args[]){
		int num=5;
		int fact=1;
		try{
			for(int i=1;i<=num;i++){
				fact=fact*i;
			}
			System.out.println(fact);
		}
		catch(Exception e){
		
		}
	}
}
