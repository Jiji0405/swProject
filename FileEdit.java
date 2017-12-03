package sw;

import java.io.File;
import java.io.*;

public class FileEdit {
	//File memo = new File("C:\\Users\\Owner\\sw\\memo.txt");

	public static boolean save(File file){
		try{
			int n = 0;
			String memo_file = "C:\\Users\\Owner\\sw\\memo.txt"; //메모파일 저장위치
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(memo_file));

			System.out.println("내용을 입력하시오.");//기능에 따라 달라져야함.
			while((n=System.in.read()) !=-1){
            	bw.write(n);     // OutPutStream에 내용을 기록한다.
            	bw.flush();    // 스트림에 있는 데이터를 출력한다.
            }            
            System.in.close();
            bw.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
		return false;
	}

	
	public boolean edit(File file){
		return true;
	}
	
	public boolean delete(File file){
		return true;
	}
}
