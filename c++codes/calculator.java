import java.util.Scanner;
class Calculator{
	int add(int a, int b){
		return a+b;
	}
	int sub(int a,int b){
		return a-b;
	}
	int mul(int a,int b){
		return a*b;
	}
	int division(int a,int b){
		try{
			return a/b;
		}
		catch(Exception ex){
			System.out.println("division by zero not allowed");
		}
		return 0;
	}
	public static void main(String args[]){
		Calculator c1=new Calculator();
		//Scanner sc=new Scanner(System.in);
		int i=0;
		do{
			System.out.println("chose any one operation");
			System.out.println("1.Addition");
			System.out.println("2.Multipilcation");
			System.out.println("3.Division");
			System.out.println("4.Subtraction");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			System.out.println("enter two values--->");
			int a=sc.nextInt();
			int b=sc.nextInt();
				switch(choice){
				case 1:
				System.out.println("Addition is-->"+c1.add(a,b));
				break;
				case 2:
				System.out.println("multiplication is-->"+c1.mul(a,b));
				break;
				case 3:
				System.out.println("Division is--->"+c1.division(a,b));
				break;
				case 4:
				System.out.println("Subtraction is"+c1.sub(a,b));
				break;
				default:
				System.out.println("not entered proper choice!!!");
				}
		}
		while(i<10);
	}
}
