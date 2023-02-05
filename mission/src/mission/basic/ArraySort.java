package mission.basic;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int[] arr = {3, 2, 4};
		int[] brr = arr;
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		int[] crr = new int[arr.length];
		
		// 내림차순
		
		for (int i = 0; i < arr.length; i++) {
			crr[i] = arr[arr.length - 1 - i];
		}
		
		arr = crr;
		
		System.out.println(Arrays.toString(arr));
	}

}
