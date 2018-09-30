package lessons.lesson4;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

	public static void main(String[] args) {
		MissingInteger missingInteger = new MissingInteger();
		int[] A = {1,3,1,4,2,3,5,4};
		int result = missingInteger.solution(A);
		System.out.println(result);

	}

	public int solution(int[] A) {
		int result = 0;
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < A.length; i++) {
			if (A[i]>0 && !set.contains(A[i])) {
				set.add(A[i]);
			}
		}
		
		for (int i = 1; i <= 1000000; i++) {
			if (!set.contains(i)) {
				result=i;
				break;
			}
		}
		
		return result;
	}


}
