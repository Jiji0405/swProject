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
		Scanner scan = new Scanner(System.in);
		String result = "";
		String updateString = "";
		String line = "";
		int update, count=0;
		
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		
		System.out.println("������ ������ ��ȣ�� �Է��ϼ���.");
		update = scan.nextInt();
		System.out.println("���� ������ �Է��ϼ���.");
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
