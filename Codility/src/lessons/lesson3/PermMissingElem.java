package lessons.lesson3;

import java.util.HashSet;
import java.util.Set;

public class PermMissingElem {

	public static void main(String[] args) {
		PermMissingElem permMissingElem = new PermMissingElem();
		int[] input = {2,3,1,5};
		int result = permMissingElem.solution(input);
		System.out.println(result);
	}
	
	private int solution(int[] A) {
		int result = 0;
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			set.add(A[i]);
		}
		
		for (int i = 1; i <= A.length + 1; i++) {
			if (!set.contains(i)) {
				result = i;
			}
		}
		
		return result;
	}

}
