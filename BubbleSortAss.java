package vinay;

public class BubbleSortAss {

	public static void main(String[] args) {
		int[] a= {4,7,8,3,2,1,6};
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length-i;j++) {
				if(a[j]<a[j-1]) {
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		for(int elem:a) {
			System.out.print(elem+" ");
		}

	}

}
