import java.util.Scanner;
class Student{
	String Name;
	String RegNum;
	int DS_Marks;
	int OOP_Marks;
	int MATHS_Marks;
	void setName(String Name){
		this.Name=Name;
	}
	void setRegNum(String RegNum){
		this.RegNum=RegNum;
	}
	void setMaths(int DS_Marks,int OOP_Marks,int MATHS_Marks){
		this.DS_Marks=DS_Marks;
		this.OOP_Marks=OOP_Marks;
		this.MATHS_Marks=MATHS_Marks;
	}
	void display(){
		System.out.println("Name of student is--->"+Name);
		System.out.println("Registration Number of Student is--->"+RegNum);
		System.out.println("marks in ds-->"+DS_Marks);
		System.out.println("marks in oops-->"+OOP_Marks);
		System.out.println("marks in maths-->"+MATHS_Marks);
	}
	int Percentage(){
		int total=((DS_Marks+OOP_Marks+MATHS_Marks)/3)*100;
		return total;
	}
	void grade(){
		int p=Percentage();
		if(p>89){
			System.out.println("frist division");
		}
		else if(89<p && p>75){
			System.out.println("second division");
		}
		else if(75<p && p>50){
			System.out.println("thrid division");
		}
		else{
			System.out.println("you are failed!!!");
		}
	}
	public static void main(String args[]){
		Student s1=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name--->");
		String Name=sc.nextLine();
		s1.setName(Name);
		
		System.out.println("enter your registration number--->");
		String regNum=sc.nextLine();
		s1.setRegNum(regNum);
		
		System.out.println("enter subject marks--->1.ds \n 2.oops \n 3.maths");
		int DS_Marks=sc.nextInt();
		int OOP_Marks=sc.nextInt();
		int MATHS_Marks=sc.nextInt();
		s1.setMaths(DS_Marks,OOP_Marks,MATHS_Marks);
		
		s1.display();
		s1.grade();
		
	}
}
