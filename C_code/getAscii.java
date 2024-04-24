import java.util.Scanner;
class  AsciiValue{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("enter any character");
		char res=sc.next().charAt(0);
		int res2=(int)res;
		System.out.println("entered character is-->"+res);
		System.out.println("Ascii value of character is--->"+res2);
		
	}
}
