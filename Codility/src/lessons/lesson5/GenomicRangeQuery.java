package lessons.lesson5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GenomicRangeQuery {

	public static void main(String[] args) {
		GenomicRangeQuery genomicRangeQuery = new GenomicRangeQuery();
		String S = "CAGCCTA";
		int[] P = {2, 5, 0};
		int[] Q = {4, 5, 6};
		int[] result = genomicRangeQuery.solution(S, P, Q);
		System.out.println(Arrays.toString(result));

	}
	
	/*quotation*/
	//O(N + M) - Score: %100
	public int[] solution(String S, int[] P, int[] Q) {
		int N = S.length();
		int M = P.length;
		int[] result = new int[M];
		int[][] prefixSumOfNucleotides = new int[4][N+1];
		
		for (int i = 0; i < N; i++) {
			short a = 0,c = 0,g = 0,t = 0;
			
			if (S.charAt(i)=='A') {
				a=1;
			} else if (S.charAt(i)=='C') {
				c=1;
			} else if (S.charAt(i)=='G') {
				g=1;
			} else if (S.charAt(i)=='T') {
				t=1;
			}
			
			prefixSumOfNucleotides[0][i+1] = prefixSumOfNucleotides[0][i] + a;
			prefixSumOfNucleotides[1][i+1] = prefixSumOfNucleotides[1][i] + c;
			prefixSumOfNucleotides[2][i+1] = prefixSumOfNucleotides[2][i] + g;
			prefixSumOfNucleotides[3][i+1] = prefixSumOfNucleotides[3][i] + t;
		}
		
		for (int i = 0; i < M; i++) {
			
            int fromIndex = P[i];
            int toIndex = Q[i]+1;
            
            if (prefixSumOfNucleotides[0][toIndex] - prefixSumOfNucleotides[0][fromIndex] > 0) {
                result[i] = 1;
            } else if (prefixSumOfNucleotides[1][toIndex] - prefixSumOfNucleotides[1][fromIndex] > 0) {
                result[i] = 2;
            } else if (prefixSumOfNucleotides[2][toIndex] - prefixSumOfNucleotides[2][fromIndex] > 0) {
                result[i] = 3;
            } else if (prefixSumOfNucleotides[3][toIndex] - prefixSumOfNucleotides[3][fromIndex] > 0) {
                result[i] = 4;
            }
		}
		
		return result;
		
	}

	/* my solution*/
	//O(M * N) - Score: %62
	public int[] mSolution(String S, int[] P, int[] Q) {
		int M = P.length;
		int[] result = new int[M];
		
		for (int i = 0; i < M; i++) {
			int pValue = P[i];
			int qValue = Q[i];
			int min = 0;
			
			for (int j = pValue; j <= qValue; j++) {
				char nucleotide = S.charAt(j);
				int impactFactor = 0;
				
				switch (nucleotide) {
				case 'A':
					impactFactor = 1;
					break;
				case 'C':
					impactFactor = 2;
					break;
				case 'G':
					impactFactor = 3;
					break;
				case 'T':
					impactFactor = 4;
					break;
				}
				
				if (j==pValue) {
					min = impactFactor;
				}
				
				if (impactFactor < min) {
					min = impactFactor;
				}
			}
			
			result[i]=min;
			
		}
		
		return result;
	}

}
