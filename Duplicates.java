package vinay;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,1,3,2,3,4,5,4};
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("duplicates found "+a[i]);
					flag=true;
				}
			}
		}
		if(flag==false) {
			System.out.println("duplicates not there ");
		}

	}

}
