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
 		String memo_file = "C:\\Users\\Owner\\sw\\memo.txt"; //�޸����� ������ġ
 		int n = 0;
 		FileWriter fw = null;
 		//new FileWriter(new File(memo_file))
 		File f= null;
 		final String LINE_SEPARATOR = System.getProperty("line.separator");

		try{
			f = new File(memo_file);
			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);

			System.out.println("������ �Է��Ͻÿ�.");//��ɿ� ���� �޶�������.
			memo_line_count++;
			while((n=System.in.read()) !='\n'){
            	bw.write(n);     // OutPutStream�� ������ ����Ѵ�.
            	bw.flush();    // ��Ʈ���� �ִ� �����͸� ����Ѵ�.
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
