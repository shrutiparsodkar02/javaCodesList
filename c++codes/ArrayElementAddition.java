import java.util.Scanner;
class ArraySumTenElement{
	int arraySum(int[] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum;
	}
	public static void main(String args[]){
		ArraySumTenElement are =new ArraySumTenElement();
		Scanner sc= new Scanner(System.in);
		int[] arr=new int[10];
		System.out.println("enter 10 array elemets-->");
			for(int i=0;i<arr.length;i++){
				arr[i]=sc.nextInt();
			}
		int sum=are.arraySum(arr);
		System.out.println("Sum of element is--->"+sum);
	}
}
