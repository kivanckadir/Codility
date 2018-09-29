package lessons.lesson1;

public class BinaryGap {

	public static void main(String[] args) {
		BinaryGap binaryGap = new BinaryGap();
		int result = binaryGap.solution(1041);
		System.out.println(result);

	}
	
	private int solution(int n) {
		int result = 0;
		boolean flag = false;
		int zeroCounter = 0;
		
		while (n >= 1) {
			int remainder = n % 2;

			if (remainder == 1) {
				if(flag==false) {
					flag=true;

				} else if (flag==true) {
					flag=false;
					
					if (zeroCounter>result) {
						result=zeroCounter;
					}
					zeroCounter = 0;
					
					if ((n/2)%2==0) {
						flag = true;
					}
				}
			} else if (remainder == 0) {
				if (flag == true) {
					zeroCounter++;
				}
			}
			n = n/2;
		}
		
		return result;
	}
}
