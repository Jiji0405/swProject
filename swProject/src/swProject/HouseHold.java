package swProject;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HouseHold{
	
	public void houseHoldMenu() throws IOException{
		Scanner scan = new Scanner(System.in);
		String filename = "C:/ClassJava/eo/swProject/swProject/accountBook.txt";
		File file = new File(filename);
		boolean flag = true;
		FileEdit fe = new FileEdit();
		int menu = 0;
		
		
		while(flag){
			System.out.println("===�����===\n1.����� �ۼ�, 2.����� ����, 3.����� ����, 4.����� ����\n=========\n���ϴ� �޴��� ��ȣ�� �Է��ϼ���.");
			menu = scan.nextInt();
			
			if(menu == 1){
				if(!fe.save(file))
					System.out.println("����!");
				
			}else if(menu == 2){
				if(!fe.edit(file))
					System.out.println("����!");
				
			}else if(menu == 3){
				if(!fe.delete(file))
					System.out.println("����!");
				
			}else if(menu == 4)
				flag = false;
		}
	}
}
