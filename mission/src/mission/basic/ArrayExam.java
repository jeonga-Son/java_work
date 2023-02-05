package mission.basic;

public class ArrayExam {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int[] brr = arr;
		
		System.out.println("arr 주소값 : " + arr);
		System.out.println("brr 주소값 : " + brr);
		
		brr[0] = 5;
		
		System.out.println("arr[0] : " + arr[0]);
		System.out.println("brr[0] : " + brr[0]);
	}

}
