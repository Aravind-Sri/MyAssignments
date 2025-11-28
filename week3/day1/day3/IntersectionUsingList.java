package myAssignments.week3.day3;

import java.util.ArrayList;
import java.util.List;

public class IntersectionUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {3, 2, 11, 4, 6, 7} ;
		int[] arr2 = {1, 2, 8, 4, 9, 7} ;
		
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		for (int i : arr1) {
			list1.add(i);	
		}
		System.out.println("List1: " +list1);
		
		for (int i : arr2) {
			list2.add(i);
		}
		System.out.println("List2: " +list2);
		
		System.out.println("Matching values are:" );
		
		for(int i=0; i<list1.size();i++) {
			if (list2.contains(list1.get(i))) {
                System.out.println(list1.get(i));
            }
		}

	}

}
