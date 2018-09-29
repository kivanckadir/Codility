package lessons.lesson4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

	public static void main(String[] args) {
		FrogRiverOne frogRiverOne = new FrogRiverOne();
		int[] A = {1,3,1,4,2,3,5,4};
		int X = 5;
		int result = frogRiverOne.solution(X, A);
		System.out.println(result);

	}

	public int solution(int X, int[] A) {
		int result = -1;
		int[] time = new int[X+1];
		
		Arrays.fill(time, -1);
		
		for (int i = 0; i < A.length; i++) {
			if(A[i]<=X && time[A[i]]==-1) {
				time[A[i]]=i;
			}
		}
		
		for (int i = 1; i <= X; i++) {
			if (time[i]!=-1 && time[i]>result) {
				result = time[i];
			} else if(time[i]==-1) {
				result = -1;
				break;
			}
		}
		return result;
	}
}
