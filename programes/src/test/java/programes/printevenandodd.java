package programes;

import java.util.Iterator;

public class printevenandodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5};
			
			int counteven = 0;
			int countodd = 0;
			
			for (int i=0 ; i<a.length; i++) {
			if( a[i]%2==0) {
				counteven++;
			}
			else {	
				countodd++;	
			}
			

		}
			
System.out.println("The sum of even number is"+ counteven);
			
System.out.println("The sum of odd number is"+ countodd);
	}

}
