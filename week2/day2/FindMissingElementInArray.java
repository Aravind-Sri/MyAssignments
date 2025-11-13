package myAssignments.week2.day2;

import java.util.Arrays;

public class FindMissingElementInArray {

	public static void main(String[] args) {

		int a[] = {1,4,3,2,8,6,7};
//		{1,2,3,4,'5',6,7,8}
		
		Arrays.sort(a);
//		int length = a.length;
//		System.out.println("Length: "+length);
		
		for(int i=0; i<a.length-1;i++) {
			if(a[i+1]!=a[i]+1) {
				System.out.println("Missing number:" +(a[i]+1));
			}
			
			
		}
	}

}
