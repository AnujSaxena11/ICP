package Infinity;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,7,7,8,8,10};
		int target = 8;
		System.out.println(first(nums, target));
		System.out.print(last(nums, target));
	}
	public static int first(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid] == target){
                ans = mid;
                e = mid - 1;
            }
            else if(nums[mid] < target){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return ans;
    }
    public static int last(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid] == target){
                ans = mid;
                s = mid + 1;
            }
            else if(nums[mid] < target){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return ans;
    }

}
