package swProject;

import java.util.Scanner;

public class Calculator {
	int select;
	Scanner sc = new Scanner(System.in);

	public Calculator() {
	}

	public void calculatorMenu() {
		while (true) {
			System.out.println("===����===");
			System.out.println("1.��Ģ����");
			System.out.println("2.���� ��ȯ");
			System.out.println("3.��Ģ���� ����");
			System.out.println("===========");
			System.out.print("��ȣ�� �Է��ϼ��� : ");

			select = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch (select) {
			case 1:
				arithmetic_operation();
				break;
			case 2:
				unitConversion();
				break;
			case 3:
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			}
		}
	}

	public void arithmetic_operation() {
		double operation1, operation2 = 0;

		while (true) {
			System.out.println("===��Ģ����===");
			System.out.println("1. ����");
			System.out.println("2. ����");
			System.out.println("3. ����");
			System.out.println("4. ������");
			System.out.println("5. �ڷΰ���");
			System.out.println("===========");
			System.out.print("��ȣ�� �Է��ϼ��� : ");

			select = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch (select) {
			case 1:
				System.out.print("operation1�� �Է��ϼ���: ");
				operation1 = sc.nextInt();
				sc.nextLine();
				System.out.print("operation2�� �Է��ϼ���: ");
				operation2 = sc.nextInt();
				sc.nextLine();

				System.out.print("��� ���: ");
				System.out.println(add(operation1, operation2));
				break;
			case 2:
				System.out.print("operation1�� �Է��ϼ���: ");
				operation1 = sc.nextInt();
				sc.nextLine();
				System.out.print("operation2�� �Է��ϼ���: ");
				operation2 = sc.nextInt();
				sc.nextLine();

				System.out.print("��� ���: ");
				System.out.println(subtract(operation1, operation2));
				break;
			case 3:
				System.out.print("operation1�� �Է��ϼ���: ");
				operation1 = sc.nextInt();
				sc.nextLine();
				System.out.print("operation2�� �Է��ϼ���: ");
				operation2 = sc.nextInt();
				sc.nextLine();

				System.out.print("��� ���: ");
				System.out.println(multiplication(operation1, operation2));
				break;
			case 4:
				System.out.print("operation1�� �Է��ϼ���: ");
				operation1 = sc.nextInt();
				sc.nextLine();
				System.out.print("operation2�� �Է��ϼ���: ");
				operation2 = sc.nextInt();
				sc.nextLine();

				System.out.print("��� ���: ");
				System.out.println(divide(operation1, operation2));
				break;
			case 5:
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			}
		}
	}

	public void unitConversion() {
		double input = 0;

		while (true) {
			System.out.println("===���� ��ȯ===");
			System.out.println("1. pound to kg");
			System.out.println("2. kg to pound");
			System.out.println("3. inch to cm");
			System.out.println("4. cm to inch");
			System.out.println("5. fahrenheit to celsius");
			System.out.println("6. celsius to fahrenheit");
			System.out.println("7. �ڷΰ���");
			System.out.println("===========");
			System.out.print("��ȣ�� �Է��ϼ��� : ");

			select = sc.nextInt();
			sc.nextLine();
			System.out.println();

			switch (select) {
			case 1:
				System.out.print("��ȯ�� pound ���� �Է��ϼ���: ");
				input = sc.nextInt();
				sc.nextLine();

				System.out.print("��� ���: ");
				System.out.println(pound_to_kg(input) + "kg");
				break;
			case 2:
				System.out.print("��ȯ�� kg ���� �Է��ϼ���: ");
				input = sc.nextInt();
				sc.nextLine();

				System.out.print("��� ���: ");
				System.out.println(kg_to_pound(input) + "pound");
				break;
			case 3:
				System.out.print("��ȯ�� inch ���� �Է��ϼ���: ");
				input = sc.nextInt();
				sc.nextLine();

				System.out.print("��� ���: ");
				System.out.println(inch_to_cm(input) + "inch");
				break;
			case 4:
				System.out.print("��ȯ�� cm ���� �Է��ϼ���: ");
				input = sc.nextInt();
				sc.nextLine();

				System.out.print("��� ���: ");
				System.out.println(cm_to_inch(input) + "cm");
				break;
			case 5:
				System.out.print("��ȯ��  fahrenheit ���� �Է��ϼ���: ");
				input = sc.nextInt();
				sc.nextLine();

				System.out.print("��� ���: ");
				System.out.println(fahrenheit_to_celsius(input) + " fahrenheit");
				break;
			case 6:
				System.out.print("��ȯ��  celsius ���� �Է��ϼ���: ");
				input = sc.nextInt();
				sc.nextLine();

				System.out.print("��� ���: ");
				System.out.println(celsius_to_fahrenheit(input) + " celsius");
				break;
			case 7:
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			}
		}
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
		if(operation2 == 0)
			System.out.println("��� ���� �߻�!");
		else 
			result = operation1 / operation2;
	
		return result;
	}

	public double pound_to_kg(double input) {
		double result = 0;
		result = input * 0.45359237;
		return result;
	}

	public double kg_to_pound(double input) {
		double result = 0;
		result = input / 0.45359237;
		return result;
	}

	public double inch_to_cm(double input) {
		double result = 0;
		result = input * 2.54;
		return result;
	}

	public double cm_to_inch(double input) {
		double result = 0;
		result = input * 0.3937;
		return result;
	}

	public double fahrenheit_to_celsius(double input) {
		double result = 0;
		result = (input - 32) / 1.8;
		return result;
	}

	public double celsius_to_fahrenheit(double input) {
		double result = 0;
		result = input * 1.8 + 32;
		return result;
	}

}
