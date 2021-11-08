package application;

import java.util.Random;

public class RandomWord {
	private String books = "behavior catalogue contract decoration hospital progressive anticipation reason assignment exclusive refrigerator constellation pepper senior executive administration detail preference hostility visual certain restrain attraction pavement strike smooth empire ethnic sensation environment";
	private String[] words = books.split(" "); // �����̽��� �и��ؼ� �迭 words�� �Է�
	private Random random = new Random();
	private String selectWord; // �������� ���� words�迭�� �ϳ� ��� ����
	private char[] characters; // ���� �迭 ( �ܾ��� ö�� ������ŭ _ ���� �� )

	public RandomWord() {
		selectWord = words[random.nextInt(words.length)];
		characters = new char[selectWord.length()];
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();
		// characters[3] = 'X';
		for (char c : characters) { // �ܾ��� ���̸�ŭ �ݺ�
			sb.append(c == '\u0000' ? '_' : c);
			sb.append(' '); // ��ĭ �پ��ش�.
		}

		return sb.toString();
	}

	public void getWords() {
		for (String word : words) { // for each�ݺ��� �迭 words�� �ִ� �ܾ �ϳ��� ���
			System.out.println(word);
		}
	}

	public void addGuess(char c) {
		// ���ôܾ ���� c�� ������ characters �Է��Ѵ�.
		for (int i = 0; i < selectWord.length(); i++) {
			if(c == selectWord.charAt(0)) {
				characters[i] = c;
			}
		}
	}
}
