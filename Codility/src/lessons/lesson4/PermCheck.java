package lessons.lesson4;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {

	public static void main(String[] args) {
		PermCheck permCheck = new PermCheck();
		int[] input = {4, 1, 3, 2, 5};
		int result = permCheck.solution(input);
		System.out.println(result);

	}
	
	public int solution(int[] A) {
		int result = 1;
		Set<Integer> set = new HashSet<>();
				
		for (int i = 0; i < A.length; i++) {
			if (!set.contains(A[i])) {
				set.add(A[i]);
			} else {
				return 0;
			}
		}
		
		for (int i = 1; i <= A.length; i++) {
			if (!set.contains(i)) {
				return 0;
			}
		}
		
		return result;
	}
}
