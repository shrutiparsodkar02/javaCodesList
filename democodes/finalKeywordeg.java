abstract class A{
	final void displayName(String name){
		System.out.println("Name is -->"+name);
	}
}
//error!!! displayName(String) in B cannot override displayName(String) in A

class B extends A{
	void displayName(String a){
		System.out.println(a);
	}
	public static void main(String args[]){
		B b=new B();
		b.displayName(7);
	}
}
