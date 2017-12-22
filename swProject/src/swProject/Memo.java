package swProject;

import java.util.Scanner;
import java.io.*;

public class Memo {

	   static int lineNumber = 0;
	   static String EditContent = "";
	   static String filename = "swProject/swProject/memo.txt";
	   static int memo_menu = 0;
	   
	public void memoMenu() throws IOException{
		Scanner scan = new Scanner(System.in);
		File memofile = new File(filename);
		FileEdit fe = new FileEdit();
		boolean flag = true;
				
		while(flag){
	         scan();
	         
	         if(memo_menu == 1){
	            System.out.println("");
	            saveInfo();
	            if(!fe.save(memofile))
	               System.out.println("작성 실패!");
	            else
	            		System.out.println("작성 완료");
	            
	         }else if(memo_menu == 2){
	            printFile(memofile);
	            inputInfo();            
	            
	            if(!fe.edit(memofile, lineNumber, EditContent))
	               System.out.println("수정 실패!");
	            else
				System.out.println("수정 완료");

	            lineNumber = 0;
	            EditContent = "";
	            	            
	         }else if(memo_menu == 3){
	        	 	printFile(memofile);
	            if(!fe.delete(memofile))
	               System.out.println("삭제 실패!");
	            else
				System.out.println("삭제 완료");
	         }else if(memo_menu == 4)
	            flag = false;
		}
	      }
		static public void scan(){
		      Scanner scan = new Scanner(System.in);
		      
		      System.out.println("===메모===\n1.메모 작성, 2.메모 수정, 3.메모 삭제, 4.메모 종료\n========\n원하는 메뉴의 번호를 입력하세요.");
		      memo_menu = scan.nextInt();      
		   }
		   
		   static public void inputInfo(){
		      Scanner scan1 = new Scanner(System.in);
		      Scanner scan2 = new Scanner(System.in);
		      
		      System.out.println("수정 할 번호를 입력하세요.");
		      lineNumber = scan1.nextInt();
		      System.out.println("수정 내용을 입력하세요.(내용)");
		      EditContent = String.valueOf(scan2.next());
		      
		   }
		   static public void saveInfo(){
			   System.out.println("내용을 입력하세요.(띄어쓰기없이)");   
		   }
		   static public boolean printFile(File file) throws FileNotFoundException{
			      File read = new File(filename);
			      FileReader fr = new FileReader(read);
			       BufferedReader br = new BufferedReader(fr);     
			       String line = "";
			       int count = 1;
			       try {
			         while((line = br.readLine()) != null){
			            System.out.println(count +". "+ line);
			            count++;
			         }
			      } catch (IOException e) {
			         e.printStackTrace();
			         return false;
			      }			       
			      return true;
			   }
	
}
