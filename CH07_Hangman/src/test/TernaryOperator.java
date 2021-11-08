package test;

public class TernaryOperator {

	public static void main(String[] args) {
		// 삼항 조건 연산자 => 조건 ? A:B (조건이 true면 A 아니면 B )
		//System.out.println(true ? "yes" : "no");
		//System.out.println(false ? "yes" : "no");

		int value = 101;
		value = value > 100 ? 100 : value;
		System.out.println(value);

		// 배열에 가장 큰수 출력
		int[] values = { 6, 3, 92, 64, 17 };
		int max = 0;
		for (int val : values) {
			max = val > max ? val : max;
		}
		System.out.println(max);
		
		//배열에서 가장 작은 수 출력
		int min = 10000;
		for (int val : values) {
			min = val < min ? val : min;
		}
		System.out.println(min);
	}

}
