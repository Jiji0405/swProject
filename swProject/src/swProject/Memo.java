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
	               System.out.println("�ۼ� ����!");
	            else
	            		System.out.println("�ۼ� �Ϸ�");
	            
	         }else if(memo_menu == 2){
	            printFile(memofile);
	            inputInfo();            
	            
	            if(!fe.edit(memofile, lineNumber, EditContent))
	               System.out.println("���� ����!");
	            else
				System.out.println("���� �Ϸ�");

	            lineNumber = 0;
	            EditContent = "";
	            	            
	         }else if(memo_menu == 3){
	        	 	printFile(memofile);
	            if(!fe.delete(memofile))
	               System.out.println("���� ����!");
	            else
				System.out.println("���� �Ϸ�");
	         }else if(memo_menu == 4)
	            flag = false;
		}
	      }
		static public void scan(){
		      Scanner scan = new Scanner(System.in);
		      
		      System.out.println("===�޸�===\n1.�޸� �ۼ�, 2.�޸� ����, 3.�޸� ����, 4.�޸� ����\n========\n���ϴ� �޴��� ��ȣ�� �Է��ϼ���.");
		      memo_menu = scan.nextInt();      
		   }
		   
		   static public void inputInfo(){
		      Scanner scan1 = new Scanner(System.in);
		      Scanner scan2 = new Scanner(System.in);
		      
		      System.out.println("���� �� ��ȣ�� �Է��ϼ���.");
		      lineNumber = scan1.nextInt();
		      System.out.println("���� ������ �Է��ϼ���.(����)");
		      EditContent = String.valueOf(scan2.next());
		      
		   }
		   static public void saveInfo(){
			   System.out.println("������ �Է��ϼ���.(�������)");   
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
