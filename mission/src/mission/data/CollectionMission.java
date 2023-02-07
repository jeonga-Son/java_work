package mission.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class CollectionMission {

	public static void main(String[] args) {
		// 로또번호 1-45까지 중복되지 않는 정수 6개를 출력
		// 1.배열
		Random r = new Random();
//		int arr[] = new int[6];
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = r.nextInt(45) + 1;
//			
//			for (int j = 0; j < i; j++) {
//				if (arr[i] == arr[j]) {
//					i = i - 1;
//				}
//			}
//		}
//		
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		// 2. List(ArrayList)
		
//		List<Integer> list = new ArrayList<Integer>();
//		
//		while(true) {
//			int n = r.nextInt(45) + 1;
//			
//			if (list.contains(n)) {
//				continue;
//			} else {
//				list.add(n);
//			}
//			
//			if (list.size() == 6) {
//				break;
//			}
//		}
//		
//		Collections.sort(list);
//		System.out.println(list);
		
		// 3.Set(TreeSet)
		// Set 자체가 중복되는 값 허용하지 않음.
		// TreeSet 자체가 정렬되어 있음.
		Set<Integer> set = new TreeSet<Integer>();
		
		// set.size() < 6 이렇게 안하면 중복되는 값 있으면 값이 몇 개 줄어서 나올 수 있다.
		for (int i = 0; set.size() < 6; i++) {
			set.add(r.nextInt(45) + 1);
		}
		
		System.out.println(set);
	}

}
