package com.bridgelabz.cardsGame;
import java.util.Scanner;
public class PlayerCards {
	
	public static void main(String[] args) {
		System.out.println("Press 1-->  view cards of 4 players");
		DeckOfCards cards = new DeckOfCards();
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		switch (number) {
		case 1:
			cards.getCardCombination();
			cards.getPlayer();
			break;

		default:
			System.out.println("Invalid Input");
			break;
		}
	}
}
