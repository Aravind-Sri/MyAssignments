package myAssignments.week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElementusingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 4, 10, 6, 8};	// 5 7 9
		
		List<Integer> list = new ArrayList<>();
		
		for(int i : arr) {
			list.add(i);
		}
		
		Collections.sort(list);
		
		System.out.println(list);
		
		for(int i=0; i<list.size()-1; i++) {
			if(list.get(i)+1!=list.get(i+1)) {
				System.out.println(list.get(i)+1);
			}
		}

	}

}
