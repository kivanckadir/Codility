package lessons.lesson2;

import java.util.Arrays;

public class CyclicRotation {

	public static void main(String[] args) {
		CyclicRotation cyclicRotation = new CyclicRotation();
		int[] input = {3,8,9,7,6};
		int result[] = cyclicRotation.solution(input, 3);
		System.out.println(Arrays.toString(result));

	}
	
	public int[] solution(int[] A, int K) {
		int[] result = new int[A.length];
					
		for (int i = 0; i < A.length; i++) {
			result[(i+K)%A.length]=A[i];
		}
		
		return result;
	}

}
