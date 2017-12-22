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

   public boolean edit(File file, int LineNumber, String EditContent) throws IOException{
		
		String result = "";
		int update = LineNumber, count=0;
		int i;
		ArrayList<String> al = new ArrayList();

		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));   	
		
		
		try{
			
			while((result = br.readLine()) != null){
				count++;
				if(count == update){
					al.add(EditContent);
				}else
					al.add(result);
			}
			
			bw.flush();
			bw.close();
			
			bw = new BufferedWriter(new FileWriter(file));
			
			for(i=0 ; i<al.size(); ++i){
				bw.write((String)al.get(i));
				bw.newLine();
			}
			
			al.clear();
			
			fr.close();
			bw.flush();
			bw.close();
			
			
		}catch (Exception e){
			System.out.println(e.getMessage());
			return false;		
		}
		
		return true;
	}

	public boolean delete(File file) throws IOException{

		String result = "";
		int update, count=0;
		int lineNumber = 1;
		int i;
		ArrayList<String> al = new ArrayList();

		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));  
		
		System.out.println("삭제할 내용의 번호를 입력하세요.");
	    update = scan.nextInt();		
		
		try{
			
			while((result = br.readLine()) != null){
				count++;
				if(count != update){
					al.add(result);
				}
			}
			
			bw.flush();
			bw.close();
			
			bw = new BufferedWriter(new FileWriter(file));
			
			for(i=0 ; i<al.size(); ++i){
				bw.write((String)al.get(i));
				bw.newLine();
			}
			
			al.clear();
			
			fr.close();
			bw.flush();
			bw.close();
			
			
		}catch (Exception e){
			System.out.println(e.getMessage());
			return false;		
		}
		
		return true;
	}
}
