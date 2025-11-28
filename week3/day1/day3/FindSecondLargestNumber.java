package myAssignments.week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr =  {3, 2, 11, 4, 6, 7};
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i : arr) {
			list.add(i);
			
		}
		
		Collections.sort(list);
		System.out.println(list);
		
//		int secondLargest = list.get(4);
		
		System.out.println(list.size());	//size::: 6
		
		int secondLargest = list.get(list.size()-2);  //list.get(4)
		
		System.out.println(secondLargest);
	}

}
