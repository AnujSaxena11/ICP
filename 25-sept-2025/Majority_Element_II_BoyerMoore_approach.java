package Infinity;

import java.util.ArrayList;
import java.util.List;

public class Majority_Element_II_boyer_moore_229 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,0};
		List<Integer> lst = new ArrayList<>();
		int count1 = 0;
		int count2 = 0;
		int c1 = 0;
		int c2 = 0;
		for(int i : nums) {
			if(count1 == 0 && i != c2) {
				c1 = i;
				count1 = 1;
			}
			else if(count2 == 0 && i != c1) {
				c2 = i;
				count2 = 1;
			}
			else if(c1 == i) {
				count1++;
			}
			else if(c2 == i) {
				count2++;
			}
			else {
				count1--;
				count2--;
			}
		}
		count1 = 0;
		count2 = 0;
		for(int i : nums) {
			if(i == c1) {
				count1++;
			}
			else if(i == c2) {
				count2++;
			}
		}
		if(count1 > nums.length/3) {
			lst.add(c1);
		}
		if(count2 > nums.length/3) {
			lst.add(c2);
		}
		System.out.println(lst);
	}
}
