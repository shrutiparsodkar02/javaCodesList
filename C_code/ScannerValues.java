import java.util.Scanner;
class Print{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("enter any integer value");
		int res1=sc.nextInt();
		System.out.println("enter any integer value is--->"+res1);
		
		System.out.println("enter any float value");
		float res2=sc.nextFloat();
		System.out.println("enter any Float value is--->"+res2);
		
		System.out.println("enter any double value");
		double res3=sc.nextDouble();
		System.out.println("enter any double value is--->"+res3);
		
		System.out.println("enter any long value");
		long res4=sc.nextLong();
		System.out.println("enter any long value is--->"+res4);
		
		System.out.println("enter any character value");
		char res5=sc.next().charAt(0);
		System.out.println("enter any character value is--->"+res5);
		
		System.out.println("enter any short value");
		short res6=sc.nextShort();
		System.out.println("enter any short value is--->"+res6);
		
	}
}
