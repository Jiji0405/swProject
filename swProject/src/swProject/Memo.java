package swProject;

import java.util.Scanner;
import java.io.*;

public class Memo {
	
	public void memoMenu() throws IOException{
		Scanner scan = new Scanner(System.in);
		String filename = "C:\\Users\\Owner\\sw\\swProject\\src\\swProject\\memoText.txt";
		File memofile = new File(filename);
		FileEdit fe = new FileEdit();
		int memo_menu = 0;
		
		while(true){
			System.out.println("===�޸�===\n1.�޸� �ۼ�, 2.�޸� ����, 3.�޸� ����, 4.�޸� ����\n���ϴ� �޴��� ��ȣ�� �Է��ϼ���.");
			memo_menu = scan.nextInt();
			
			if(memo_menu == 1) {
				fe.save(memofile);					
			}
			else if(memo_menu == 2) {
				fe.edit(memofile);
			}
			else if(memo_menu == 3) {
				fe.delete(memofile);
			}
			else if(memo_menu == 4){
				break;
			}
		}
	}
	
}
