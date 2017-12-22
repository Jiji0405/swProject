package swProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class HouseHold {
	static int menu = 0;
	static int lineNumber = 0;
	static String EditContent = "";
	static String filename = "swProject/swProject/accountBook.txt";
	// static String filename = "C:\\Users\\Owner\\swe\\swProject\\swProject\\accountBook.txt";

	public void houseHoldMenu() throws IOException {
		boolean flag = true;
		File file = new File(filename);
		FileEdit fe = new FileEdit();

		if (!file.exists())
			file.createNewFile();

		while (flag) {
			scan();

			if (menu == 1) {
				saveInfo();
				if (!fe.save(file))
					System.out.println("���� ����");
				else
					System.out.println("���� �Ϸ�");

			} else if (menu == 2) {
				printFile(file);
				inputInfo();

				if (!fe.edit(file, lineNumber, EditContent))
					System.out.println("���� ����");
				else
					System.out.println("���� �Ϸ�");

				lineNumber = 0;
				EditContent = "";

			} else if (menu == 3) {
				printFile(file);
				if (!fe.delete(file))
					System.out.println("���� ����");
				else
					System.out.println("���� �Ϸ�");

			} else if (menu == 4)
				flag = false;
		}

	}

	static public void scan() {
		Scanner scan = new Scanner(System.in);

		System.out.println("===�����===\n1.����� �ۼ�, 2.����� ����, 3.����� ����, 4.����� ����\n���ϴ� �޴��� ��ȣ�� �Է��ϼ���.");
		menu = scan.nextInt();
	}

	static public void saveInfo() {
		System.out.println("������ �Է��ϼ���. (��¥[yyyy-mm-dd]/����/����)");
	}

	static public void inputInfo() {
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);

		System.out.println("���� �� ��ȣ�� �Է��ϼ���.");
		lineNumber = scan1.nextInt();
		System.out.println("���� ������ �Է��ϼ���. (��¥[yyyy-mm-dd]/����/����)");
		EditContent = String.valueOf(scan2.next());

	}

	static public boolean printFile(File file) throws FileNotFoundException {
		File read = new File(filename);
		FileReader fr = new FileReader(read);
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		int count = 1;
		try {
			while ((line = br.readLine()) != null) {
				System.out.println(count + ". " + line);
				count++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		return true;
	}
}