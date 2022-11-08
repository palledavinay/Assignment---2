package vinay;

public class MergeSort {
	void merge(int a[], int count, int mid, int end)    
	{    
	    int i, j, k;  
	    int n1 = mid - count + 1;    
	    int n2 = end - mid;     
	       int LeftArray[] = new int[n1];  
	       int RightArray[] = new int[n2];  
	   
		   for (i = 0; i < n1; i++)    
		   LeftArray[i] = a[count + i];    
		   for (j = 0; j < n2; j++)    
		   RightArray[j] = a[mid + 1 + j];    
				      
			    i = 0; 
			    j = 0; 
			    k = count; 
	      
	    while (i < n1 && j < n2)    
	    {    
	        if(LeftArray[i] <= RightArray[j])    
	        {    
	            a[k] = LeftArray[i];    
	            i++;    
	        }    
	        else    
	        {    
	            a[k] = RightArray[j];    
	            j++;    
	        }    
	        k++;    
	    }    
	    while (i<n1)    
	    {    
	        a[k] = LeftArray[i];    
	        i++;    
	        k++;    
	    }    
	      
	    while (j<n2)    
	    {    
	        a[k] = RightArray[j];    
	        j++;    
	        k++;    
	    }    
	}    
	  
	void mergeSort(int a[], int count, int end)  
	{  
	    if (count < end)   
	    {  
	        int mid = (count + end) / 2;  
	        mergeSort(a, count, mid);  
	        mergeSort(a, mid + 1, end);  
	        merge(a, count, mid, end);  
	    }  
	}  
	void printArray(int a[], int n)  
	{  
	    int i;  
	    for (i = 0; i < n; i++)  
	        System.out.print(a[i] + " ");  
	}  

	public static void main(String[] args) {
		
	    int arr[] = {2,4,1,2,7,8,9};
	    int n = arr.length;  
	    MergeSort sc = new MergeSort();  
	    
	    System.out.println("Before sorting array ");  
	    sc.printArray(arr, n);  
	    sc.mergeSort(arr, 0, n - 1);
	    System.out.println();
	    
	    System.out.println("After sorting array ");  
	    sc.printArray(arr, n);  
	    System.out.println("");

	}

}
