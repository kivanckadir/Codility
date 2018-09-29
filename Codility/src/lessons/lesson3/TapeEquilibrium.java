package lessons.lesson3;

public class TapeEquilibrium {

	public static void main(String[] args) {
		TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
		int[] input = {3,1,2,4,3};
		int result = tapeEquilibrium.solution(input);
		System.out.println(result);
	}
	
	private int solution(int[] A) {

		int result = 0;
		int left = 0, right = 0;
		
		for (int i = 0; i < A.length; i++) {
			if (i==0) {
				left += A[i];
			} else {
				right += A[i];
			}
		}
		
		result = Math.abs(left-right);
		
		for (int i = 1; i < A.length-1; i++) {
			left += A[i];
			right -= A[i];
			
			if (Math.abs(left-right)<result) {
				result = Math.abs(left-right);
			}
		}
	
		return result;
	}

}
