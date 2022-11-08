package vinay;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {4,3,2,6,7,1};
		System.out.println("Before selection sorting array");
		for(int elem:arr) {
			System.out.print(elem+" ");
		}
		int minVal;
		int tempVar=0;
		for(int i=0;i<arr.length;i++) 
		{
			minVal=i;
			for(int j=i+1;j<arr.length;j++) 
			{ 
				if(arr[j]<arr[minVal]) 
				{
					minVal=j;
				}
			}
			tempVar=arr[i];
			arr[i]=arr[minVal];
			arr[minVal]=tempVar;
		}
		System.out.println();
		System.out.println("After selection sorting array");
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
