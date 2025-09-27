package Infinity;

import java.util.*;

public class Next_Greater_Element_I_496 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {4,1,2};	
		int[] nums2 = {1,3,4,2};
		Stack<Integer> stk = new Stack<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i : nums2) {
			while(!stk.isEmpty() && i>stk.peek()) {
				map.put(stk.pop(), i);
			}
			stk.push(i);
		}
		while(!stk.isEmpty()) {
			map.put(stk.pop(), -1);
		}
		int[] arr = new int[nums1.length];
		for(int i = 0; i<nums1.length; i++) {
			arr[i] = map.get(nums1[i]);
		}
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

}
