package Infinity;

public class Product_of_Array_Except_Self_238 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int[] arr = new int[nums.length];
		arr[0] = 1;
		for(int i = 1; i<nums.length; i++) {
			arr[i] = arr[i-1]*nums[i-1];
		}
		int sufix = 1;
		for(int i = nums.length-1; i>=0; i--) {
			arr[i] *= sufix;
			sufix *= nums[i];
		}
		for(int i : arr) {
			System.out.println(i);
		}
	}
}
