//A class that cannot be further extended is called a final class in Java. A final class is declared using the final keyword. An abstract class cannot be a final class, hence, it can only be created when the class possesses a completion in nature
//abstract final class FinalImplementation--->illegal combination of modifiers: abstract and final
 final class FinalImplementation{
 	int a;
 	void displayName(String name){
 		System.out.println(name);
 	}
	
}
//error!!!!! --->cannot inherit from final FinalImplementation -->we cannot inherit from final class 
class A extends FinalImplementation{
	public static void main(String args[]){
		A a=new A();
		FinalImplementation f=new FinalImplementation();
		a.displayName("shruti");	
	}

}
