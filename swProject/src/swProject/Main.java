package swProject;

import java.util.Scanner;
import java.io.*;

public class Main {
	
	static int input;
	static Scanner sc = new Scanner(System.in);
	static Memo memo;
	static Calculator calculator;
	static HouseHold household;

	public static void main(String[] args) throws IOException  {
		memo = new Memo();
		calculator = new Calculator();
		household = new HouseHold();
		
		System.out.println("1.메모");
		System.out.println("2.계산기");
		System.out.println("3.가계부");
		System.out.println("4.프로그램 종료");

		input = sc.nextInt();
		//sc.nextLine();
		
		switch(input) {
		case 1:
			memo.memoMenu();
		case 2:
			calculator.calculatorMenu();
			break;
		case 3:
			household.houseHoldMenu();
			
		}

	}

}