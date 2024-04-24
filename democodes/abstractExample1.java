import java.util.*;
//we cannot remove abstract keyword it will throw error MyClass is not abstract and does not override abstract method calculate(int) in MyClass

 abstract class MyClass{
 //if before method we dont write abstract it will give error --> error: missing method body, or declare abstract

	abstract void calculate(int x);
}
class Sub1 extends MyClass{
	void calculate(int x){
		System.out.println("Square of the num is --->"+(x*x));
	}
}
class Sub2 extends MyClass{
	void calculate(int x){
		System.out.println("cube of the num is --->"+(x*x*x));
	}
}
class Sub3 extends MyClass{
	void calculate(int x){
		System.out.println("Squareroot of the num is --->"+(int)(Math.sqrt(x)));
	}
}
class FinalClass{
	public static void main(String args[]){
		MyClass ref;
		Sub1 sqr=new Sub1();
		ref=sqr;
		ref.calculate(5);
		
		
		Sub2 cube=new Sub2();
		ref=cube;
		ref.calculate(2);
		
		
		Sub3 sqroot =new Sub3();
		ref=sqroot;
		ref.calculate(100);
	}
}
