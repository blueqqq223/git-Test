package test;

import java.util.Random;

import application.RandomWord;

public class App {

	public static void main(String[] args) {
		RandomWord randomWord = new RandomWord();		
		randomWord.getWords();
		
		Random random = new Random(); //���� ��ü ����
		
		String[] words = { "���","�����","���̾�","����","��" };
		
		for(int i=0; i< 100; i++) {
			int randomIndex = random.nextInt(words.length);
			System.out.print(words[randomIndex]);
			System.out.print(" ");
		}
	

	}

}
