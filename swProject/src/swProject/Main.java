package swProject;

import java.util.Scanner;
import java.io.*;

public class Main {

	static int input;
	static Scanner sc = new Scanner(System.in);
	static Memo memo;
	static Calculator calculator;
	static HouseHold household;

	public static void main(String[] args) throws IOException {
		memo = new Memo();
		calculator = new Calculator();
		household = new HouseHold();

		boolean flag = true;

		while (flag) {
			System.out.println("////////////////////////////");
			System.out.println("1.�޸�");
			System.out.println("2.����");
			System.out.println("3.�����");
			System.out.println("4.���α׷� ����");
			System.out.println("////////////////////////////");

			input = sc.nextInt();

			if (input == 1) {
				memo.memoMenu();
			} else if (input == 2) {
				calculator.calculatorMenu();
			} else if (input == 3) {
				household.houseHoldMenu();
			} else if (input == 4) {
				flag = false;
			}
		}
	}

}