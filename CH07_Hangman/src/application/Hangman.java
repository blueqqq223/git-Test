package application;

import java.util.Scanner;

public class Hangman {

	private boolean running = true; //프로그램 실행중? true or false
	private RandomWord word = new RandomWord(); //한번만 생성
	private Scanner scanner = new Scanner(System.in);
	
	public void run() { //프로그램 실행
		
		do {
			displayWord();    //1. 단어의 철자를 _로 표시
			getUserInput();   //2. 사용자 입력 
			checkUserInput(); //3. 맞는지 체크 (단어가 맞으면 running false)
		} while(running);	  //running이 false가 되면 종료
	}

	private void checkUserInput() {
		System.out.println("입력 체크");	
		
	}

	private void getUserInput() {		
		//유저에게 한 문자 입력 요구
		//입력받은 문자열에서 한문자를 뽑아서 RandomWord 클래스로 전달
		//addGuess(문자) 메소드를 만들기
		System.out.print("한 문자 입력: ");
		String guess = scanner.nextLine();
		
		word.addGuess(guess.charAt(0));
		
	}

	private void displayWord() {
		//랜덤으로 단어골라오기
		System.out.println(word.toString());
	}
	
}
