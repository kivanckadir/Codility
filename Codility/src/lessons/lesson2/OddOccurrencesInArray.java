package lessons.lesson2;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {

	public static void main(String[] args) {
		OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
		int[] input = {9,3,9,3,9,7,9};
		int result = oddOccurrencesInArray.solution(input);
		System.out.println(result);

	}
	
	public int solution(int[] A) {
		Set<Integer> set = new HashSet<Integer>();
		int result;
		
		for (int i = 0; i < A.length; i++) {
			if(set.contains(A[i])) {
				set.remove(A[i]);
			} else {
				set.add(A[i]);
			}
		}
		
		result = (int) set.toArray()[0];
		return result;
	}
	
}
