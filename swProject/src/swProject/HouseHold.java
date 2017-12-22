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
			System.out.println("===가계부===\n1.가계부 작성, 2.가계부 수정, 3.가계부 삭제, 4.가계부 종료\n=========\n원하는 메뉴의 번호를 입력하세요.");
			menu = scan.nextInt();
			
			if(menu == 1){
				if(!fe.save(file))
					System.out.println("실패!");
				
			}else if(menu == 2){
				if(!fe.edit(file))
					System.out.println("실패!");
				
			}else if(menu == 3){
				if(!fe.delete(file))
					System.out.println("실패!");
				
			}else if(menu == 4)
				flag = false;
		}
	}
}
