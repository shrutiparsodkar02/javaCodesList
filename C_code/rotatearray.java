class AraayRotation{
	int[] rotateArray(int arr[]){
	int temp=arr[0];
	for(int i=0;i<arr.length-1;i++){
		arr[i]=arr[i+1];
	}
	arr[arr.length-1]=temp;
	return arr;
	}	
	public static void main(String args[]){
		AraayRotation a= new AraayRotation();
		int[] arr={10,20,30,40,50,60};
		
		int[] res =a.rotateArray(arr);
		for(int i=0;i<res.length;i++){
			System.out.print(" "+res[i]);
		}
			
		//System.out.println(res);
		//System.out.println(res[5]);
		System.out.println("\nNext line----");
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}		
}


