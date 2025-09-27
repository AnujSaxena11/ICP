package Infinity;

public class Boyer_Moore_Voting_Algorithm {
	public static void main(String[] args) {
		int[] arr = {1,2,1,2,2,2,1};
		int n = arr.length;
		int count = 0;
		int candidate = -1;
		for(int i = 0; i<n; i++) {
			if(count == 0) {
				candidate = arr[i];
				count = 1;
			}
			else {
				if(candidate == arr[i]) {
					count++;
				}
				else {
					count--;
				}
			}
		}
		count = 0;
		for(int i : arr) {
			if(i == candidate) {
				count++;
			}
		}
		if(count > n/2) {
			System.out.print(candidate);
		}
		else {
			System.out.print(-1);
		}
	}
}
