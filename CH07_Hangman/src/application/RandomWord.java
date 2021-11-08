package application;

import java.util.Random;

public class RandomWord {
	private String books = "behavior catalogue contract decoration hospital progressive anticipation reason assignment exclusive refrigerator constellation pepper senior executive administration detail preference hostility visual certain restrain attraction pavement strike smooth empire ethnic sensation environment";
	private String[] words = books.split(" "); // 스페이스로 분리해서 배열 words에 입력
	private Random random = new Random();
	private String selectWord; // 랜덤으로 위의 words배열중 하나 골라 저장
	private char[] characters; // 문자 배열 ( 단어의 철자 개수만큼 _ 넣을 것 )

	public RandomWord() {
		selectWord = words[random.nextInt(words.length)];
		characters = new char[selectWord.length()];
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();
		// characters[3] = 'X';
		for (char c : characters) { // 단어의 길이만큼 반복
			sb.append(c == '\u0000' ? '_' : c);
			sb.append(' '); // 한칸 뛰어준다.
		}

		return sb.toString();
	}

	public void getWords() {
		for (String word : words) { // for each반복문 배열 words에 있는 단어를 하나씩 출력
			System.out.println(word);
		}
	}

	public void addGuess(char c) {
		// 선택단어에 문자 c가 있으면 characters 입력한다.
		for (int i = 0; i < selectWord.length(); i++) {
			if(c == selectWord.charAt(0)) {
				characters[i] = c;
			}
		}
	}
}
