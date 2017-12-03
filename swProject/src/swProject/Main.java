package swProject;

import java.util.Scanner;

public class Main {
	
	static int input;
	static Scanner sc = new Scanner(System.in);
	static Calculator calculator;

	public static void main(String[] args) {
		calculator = new Calculator();
		
		System.out.println("1.메모");
		System.out.println("2.계산기");
		System.out.println("3.가계부");
		System.out.println("4.프로그램 종료");

		input = sc.nextInt();
		//sc.nextLine();
		
		switch(input) {
		case 1:
			
		case 2:
			calculator.calculatorMenu();
			break;
		case 3:
			
			
		}

	}

}