package sw;

import java.io.File;
import java.io.*;

public class FileEdit {
	//File memo = new File("C:\\Users\\Owner\\sw\\memo.txt");

	public static boolean save(File file){
		try{
			int n = 0;
			String memo_file = "C:\\Users\\Owner\\sw\\memo.txt"; //�޸����� ������ġ
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(memo_file));

			System.out.println("������ �Է��Ͻÿ�.");//��ɿ� ���� �޶�������.
			while((n=System.in.read()) !=-1){
            	bw.write(n);     // OutPutStream�� ������ ����Ѵ�.
            	bw.flush();    // ��Ʈ���� �ִ� �����͸� ����Ѵ�.
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
