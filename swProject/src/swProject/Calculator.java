package swProject;

import java.util.Scanner;

public class Calculator {
	int input;
	Scanner sc = new Scanner(System.in);

	void calculatorMenu() {
		System.out.println("===����===\n");
		System.out.println("1.��Ģ����");
		System.out.println("2.���� ��ȯ");
		System.out.println("3.��Ģ���� ����");
		System.out.println("===========\n");

		input = sc.nextInt();
		sc.nextLine();

		switch (input) {
		case 1:

		case 2:

		case 3:

		}
	}

	void arithmetic_operation() {

	}

	void unitConversion() {

	}

	public double add(double operation1, double operation2) {
		double result = 0;
		result = operation1 + operation2;
		return result;
	}

	public double subtract(double operation1, double operation2) {
		double result = 0;
		result = operation1 - operation2;
		return result;
	}

	public double multiplication(double operation1, double operation2) {
		double result = 0;
		result = operation1 * operation2;
		return result;
	}

	public double divide(double operation1, double operation2) {
		double result = 0;
		result = operation1 / operation2;
		return result;
	}

	double pound_to_kg(double input) {
		double result = 0;

		return result;
	}

	double kg_to_pound(double input) {
		double result = 0;

		return result;
	}

}
