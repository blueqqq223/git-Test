package application;

import java.util.Scanner;

public class Hangman {

	private boolean running = true; //���α׷� ������? true or false
	private RandomWord word = new RandomWord(); //�ѹ��� ����
	private Scanner scanner = new Scanner(System.in);
	
	public void run() { //���α׷� ����
		
		do {
			displayWord();    //1. �ܾ��� ö�ڸ� _�� ǥ��
			getUserInput();   //2. ����� �Է� 
			checkUserInput(); //3. �´��� üũ (�ܾ ������ running false)
		} while(running);	  //running�� false�� �Ǹ� ����
	}

	private void checkUserInput() {
		System.out.println("�Է� üũ");	
		
	}

	private void getUserInput() {		
		//�������� �� ���� �Է� �䱸
		//�Է¹��� ���ڿ����� �ѹ��ڸ� �̾Ƽ� RandomWord Ŭ������ ����
		//addGuess(����) �޼ҵ带 �����
		System.out.print("�� ���� �Է�: ");
		String guess = scanner.nextLine();
		
		word.addGuess(guess.charAt(0));
		
	}

	private void displayWord() {
		//�������� �ܾ������
		System.out.println(word.toString());
	}
	
}
