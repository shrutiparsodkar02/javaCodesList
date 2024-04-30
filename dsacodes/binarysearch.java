class BinarySearch{
	/*int search(int[] arr,int ele){
	
	}*/
	int[] sortedArray(int[] arr){
		for(int i=0;i<7;i++){
			if(arr[i]>arr[i+1]){
				int temp=arr[i];
				arr[i+1]=arr[i];
				arr[i]=temp;
				i++;
				
			}
		}
		return arr;
	}
	void printArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}	
	}
	public static void main(String args[]){
		BinarySearch bs=new BinarySearch();
		int[] arr={10,80,78,45,99,20,10};
		int[] arr2=new int[arr.length];
		arr2=bs.sortedArray(arr);
	}
}
