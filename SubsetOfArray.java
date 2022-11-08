package vinay;

public class SubsetOfArray {
	static boolean isSubset(int ar1[], int ar2[], int a, int b)
    {
        int i = 0;
        int j = 0;
        for (i = 0; i < b; i++) {
            for (j = 0; j < a; j++)
                if (ar2[i] == ar1[j])
                    break;
            if (j == a)
                return false;
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar1[] = {1,4,8,3,4,9};
        int ar2[] = {9,4,3,6};
 
        int a = ar1.length;
        int b = ar2.length;
        
        System.out.println("checking Array is subset of another Array");
 
	        if (isSubset(ar1, ar2, a, b)) 
	        {
	            System.out.print("ar2[] is " + "subset of ar1[] ");
	        }
	        else 
	        {
	            System.out.print("ar2[] is " + "not a subset of ar1[]");                        
	        }
	}

}
