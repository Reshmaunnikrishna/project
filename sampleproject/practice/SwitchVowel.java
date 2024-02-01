package practice;

import java.util.*;

public class SwitchVowel {

	public static void main(String[] args) {
		System.out.println("Enter a character");
		Scanner input = new Scanner(System.in);
		char c = input.next().charAt(0);
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(c + " is a vowel");
			break;
		default:
			System.out.println(c + " is a consonant");
		}

	}

}
