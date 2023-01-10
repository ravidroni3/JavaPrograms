package Arrays;

public class FindNumbersWithEvenNumberofDigits {
	static int numberofdigits(int nums) {
		int cnt = 0;
		while (nums > 0) {
			nums /= 10;
			cnt++;
		}
		return cnt;
	}

	static int findNumbers(int[] n) {
		int res = 0;
		for (int i = 0; i < n.length; i++) {

			if (numberofdigits(n[i]) % 2 == 0) {
				res++;
			}
		}
		return res;

	}

	public static void main(String[] args) {
		int[] n = {12,345,2,6,7896};
		System.out.println(findNumbers(n));

	}
}