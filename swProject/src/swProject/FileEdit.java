package swProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileEdit{
	C:\Users\Owner\git\swProject\swProject\src\swProject
	    static File file = new File("C:\\Users\\Owner\\git\\swProject\\swProject\\src\\swProject", "fil.txt");
		static Scanner scan = new Scanner(System.in);
	 	static String saveString="", result = "";
	 	static int count=0, line_count, totalcount;
	 	
	    
    public static void main(String[] args) throws FileNotFoundException{
    
       save(file);
       edit(file);
       delete(file); 
    }
    
    public static boolean save(File file) throws FileNotFoundException{
    		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);		
    		BufferedWriter bw = null;
    		
    		try {
            bw = new BufferedWriter(new FileWriter(file, true));
            while((result = br.readLine())!= null){
    			line_count++;
            }
            totalcount = line_count;
            System.out.print(++totalcount + "/");
            saveString = scan.next();
            bw.write(saveString);
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(bw != null) try {bw.close(); } catch (IOException e) {}
        }
		return false;
    }
    public static boolean edit(File file){
//		String result = "";
		String updateString = "";
		String line = "";
		int update/*, count=0*/;
		
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		
		System.out.println("수정할 내용의 번호를 입력하세요.");
		update = scan.nextInt();
		System.out.println("수정 내용을 입력하세요.");
		updateString = scan.next();
		
		try{
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			while((result = br.readLine())!= null){
				count++;
				if(count == update){
					line += updateString + "\n";
				}else{
					line += result + "\n";
				}
			}

			System.out.println(line);
			fw = new FileWriter(file);
			
			fw.write(line);
			count = 0;	
			fr.close();
			fw.close();	
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		return true;
	}
	
    public static boolean delete(File file){
    	   
        String result = "";
         String updateString = "";
         String line = "";
         int update/*, count=0*/;
         
         FileReader fr = null;
         FileWriter fw = null;
         BufferedReader br = null;
         
         System.out.println("삭제할 내용의 번호를 입력하세요.");
         update = scan.nextInt();
         
         try{
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            
            while((result = br.readLine())!= null){
               count++;
               if(count != update){           
                  line += result + "\n";
               }
            }

            System.out.println(line);
            fw = new FileWriter(file);
            fw.write(line);
            count = 0;   
            fr.close();
            fw.close();   
         }catch (Exception e){
            System.out.println(e.getMessage());
         }
         return true;
     }

 /*public static boolean edit(File file){
   
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(br != null) 
            	try {
            		br.close();
            	} catch (IOException e) {}
        }
		return false;
    }*/
}
