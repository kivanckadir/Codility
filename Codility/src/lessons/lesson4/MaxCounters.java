package lessons.lesson4;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.function.BiConsumer;

public class MaxCounters {

	public static void main(String[] args) {
		MaxCounters maxCounters = new MaxCounters();
		int[] A = {3,4,4,6,1,4,4};
		int X = 5;
		int[] result = maxCounters.solution(X, A);
		System.out.println(Arrays.toString(result));
	}
	
	public int[] solution(int N, int[] A) {
		int[] counters = new int[N];
		int max = 0;
		int lastUpdate = 0;
		
		for (int i = 0; i < A.length; i++) {
			if(A[i]==N+1) {
				lastUpdate = max;
			} else{
				
				if (counters[A[i]-1] < lastUpdate)
					counters[A[i]-1] = lastUpdate + 1;
                else
                	counters[A[i]-1]++;

                if (counters[A[i]-1] > max) {
                    max = counters[A[i]-1];
                }
				
			}
			
		}
		
		 for (int i = 0; i < N; i++)
	           if (counters[i] < lastUpdate)
	        	   counters[i] = lastUpdate;
		
		return counters;
	}
}
