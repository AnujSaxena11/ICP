package Infinity;

public class Difference_Array_technique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		//int[][] q = {{1,3,2},{2,4,3},{0,2,-2}};
		int[][] q = {{0,2,5},{0,2,4},{1,3,2}};
		int[] ans = new int[5];
		for(int[] arr : q) {
			int start = arr[0];
			int end = arr[1];
			int val = arr[2];
			ans[start] += val;
			if(end+1 < n) {
				ans[end+1] -= val;
			}
		}
		sum(ans, n);
		for(int i : ans) {
			System.out.println(i);
		}
		
	}
	public static void sum(int[] ans, int n) {
		for(int i = 1; i<n; i++) {
			ans[i] += ans[i-1];
		}
	}

}
