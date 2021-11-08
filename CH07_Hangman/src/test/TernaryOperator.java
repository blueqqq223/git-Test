package test;

public class TernaryOperator {

	public static void main(String[] args) {
		// ���� ���� ������ => ���� ? A:B (������ true�� A �ƴϸ� B )
		//System.out.println(true ? "yes" : "no");
		//System.out.println(false ? "yes" : "no");

		int value = 101;
		value = value > 100 ? 100 : value;
		System.out.println(value);

		// �迭�� ���� ū�� ���
		int[] values = { 6, 3, 92, 64, 17 };
		int max = 0;
		for (int val : values) {
			max = val > max ? val : max;
		}
		System.out.println(max);
		
		//�迭���� ���� ���� �� ���
		int min = 10000;
		for (int val : values) {
			min = val < min ? val : min;
		}
		System.out.println(min);
	}

}
