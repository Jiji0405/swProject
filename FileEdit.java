package sw;

import java.io.File;
import java.io.*;

public class FileEdit {
	//File memo = new File("C:\\Users\\Owner\\sw\\memo.txt");

	public static void main(String[] args) throws IOException {
		
		 File memo = new File("C:\\Users\\Owner\\sw\\memo.txt");
		 save(memo);
		 System.out.println("Success");
		//edit(memo);
	}

	
 	public static boolean save(File file){
 		BufferedWriter bw = null;
 		int memo_line_count=0;
 		String memo_file = "C:\\Users\\Owner\\sw\\memo.txt"; //메모파일 저장위치
 		int n = 0;
 		FileWriter fw = null;
 		//new FileWriter(new File(memo_file))
 		File f= null;
 		final String LINE_SEPARATOR = System.getProperty("line.separator");

		try{
			f = new File(memo_file);
			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);

			System.out.println("내용을 입력하시오.");//기능에 따라 달라져야함.
			memo_line_count++;
			while((n=System.in.read()) !='\n'){
            	bw.write(n);     // OutPutStream에 내용을 기록한다.
            	bw.flush();    // 스트림에 있는 데이터를 출력한다.
            }     	
			bw.write(LINE_SEPARATOR);       
            System.in.close();
           
           // fw.close();
            bw.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
		return true;
	}
	
	public boolean edit(File file){
		Scanner scan = new Scanner(System.in);
		String result = "";
		String updateString = "";
		String line = "";
		int update, count=0;
		
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
	
	public boolean delete(File file){
		return true;
	}
}
