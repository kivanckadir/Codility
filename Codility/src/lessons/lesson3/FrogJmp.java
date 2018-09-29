package lessons.lesson3;

public class FrogJmp {
	public static void main(String[] args) {
		FrogJmp frogJmp = new FrogJmp();
		int result = frogJmp.solution(10, 85, 30);
		System.out.println(result);
	}
	
	private int solution(int X, int Y, int D) {
		int result = 0;
		
		result = (Y-X)/D;
		
		if ((Y-X)%D>0) {
			result++;
		}
		
		return result;
	}
}
