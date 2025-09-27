package Infinity;

import java.util.*;

public class Majority_Element_II_hashmap_229 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,3,2,2,3,2};
		List<Integer> lst = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int key : map.keySet()){
            if(map.get(key) > nums.length/3){
                lst.add(key);
            }
        }
        System.out.print(lst);
	}

}
