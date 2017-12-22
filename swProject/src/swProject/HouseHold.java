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
					System.out.println("저장 실패");
				else
					System.out.println("저장 완료");

			} else if (menu == 2) {
				printFile(file);
				inputInfo();

				if (!fe.edit(file, lineNumber, EditContent))
					System.out.println("수정 실패");
				else
					System.out.println("수정 완료");

				lineNumber = 0;
				EditContent = "";

			} else if (menu == 3) {
				printFile(file);
				if (!fe.delete(file))
					System.out.println("삭제 실패");
				else
					System.out.println("삭제 완료");

			} else if (menu == 4)
				flag = false;
		}

	}

	static public void scan() {
		Scanner scan = new Scanner(System.in);

		System.out.println("===가계부===\n1.가계부 작성, 2.가계부 수정, 3.가계부 삭제, 4.가계부 종료\n원하는 메뉴의 번호를 입력하세요.");
		menu = scan.nextInt();
	}

	static public void saveInfo() {
		System.out.println("내용을 입력하세요. (날짜[yyyy-mm-dd]/내용/가격)");
	}

	static public void inputInfo() {
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);

		System.out.println("수정 할 번호를 입력하세요.");
		lineNumber = scan1.nextInt();
		System.out.println("수정 내용을 입력하세요. (날짜[yyyy-mm-dd]/내용/가격)");
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