class BinarySearch{
	int search(int[] arr,int ele){
		int startindex=0;
		int endindex=arr.length-1;
		while(startindex<=endindex){
		int midele=(startindex+endindex)/2;
			if(arr[midele]>ele){
				endindex=midele-1;
			}
			else if(arr[midele]==ele){
				return midele;
			}
			else{
				startindex=midele+1;
			}
		}
		return -1;
	}
	int[] sortedArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		return arr;
	}
	void printArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}	
	}
	public static void main(String args[]){
		BinarySearch bs=new BinarySearch();
		int[] arr={10,80,78,78,45,99,20,17,10};
		int[] arr2=new int[arr.length];
		arr2=bs.sortedArray(arr);
		bs.printArray(arr2);
		int  b_search=bs.search(arr2,992);
System.out.println("\nRequired Index->  "+b_search);
	}
}
