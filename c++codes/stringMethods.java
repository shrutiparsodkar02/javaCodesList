import java.util.Scanner;
class StringOperations{
	String concatOperation(String str1 , String str2){
		String str3=str1+str2;
		return str3;
	}
	String stringSubstring(String str1){
		String str2=str1.substring(2);
		return str2;
	}
	String upperCase(String str){
		String str1=str.toUpperCase();
		return str1;
	}
	String lowerCase(String str){
		String str1=str.toLowerCase();
		return str1;
	}
	public static void main(String args[]){
		StringOperations stroper=new StringOperations();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter string for concat operation-->");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		System.out.println("concadination of two string is--->"+stroper.concatOperation(str1,str2));
		
		System.out.println("enter string for getting Substring -->");
		String str3=sc.nextLine();
		System.out.println("substring is--->"+stroper.stringSubstring(str3));
		
		System.out.println("enter string for converting it in uppercase -->");
		String str4=sc.nextLine();
		System.out.println("uppercase of string is--->"+stroper.upperCase(str4));
		
		System.out.println("enter string for converting it in lowercase -->");
		String str5=sc.nextLine();
		System.out.println("lowercase of string is--->"+stroper.lowerCase(str5));
		
		
	}
	
}
