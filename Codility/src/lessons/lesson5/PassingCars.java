package lessons.lesson5;

public class PassingCars {

	public static void main(String[] args) {
		PassingCars passingCars = new PassingCars();
		int[] A = { 0, 1, 0, 1, 1};
		int result = passingCars.solution(A);
		System.out.println(result);

	}

	public int solution(int[] A) {
		int result = 0;
		int eastCount = 0;
		
		for (int i = 0; i < A.length; i++) {
			if (A[i]==0) {
				eastCount++;
			} else if (A[i]==1) {
				
				result += eastCount;
				
				if(result > 1000000000){
				    result=-1;
				}
			}
		}
		return result;
	}

}
