import java.util.*;
abstract class MyClass{
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
		Sub1 sqr=new Sub1();
		Sub2 cube=new Sub2();
		Sub3 sqroot =new Sub3();
		sqr.calculate(5);
		cube.calculate(2);
		sqroot.calculate(100);
	}
}
