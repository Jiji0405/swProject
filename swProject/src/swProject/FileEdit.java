package swProject;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileEdit {

    static Scanner scan = new Scanner(System.in);
       static String saveString="", result = "";
       static int count=0, line_count;
    
    public static boolean save(File file) throws FileNotFoundException{
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);      
        BufferedWriter bw = null;
        
        try {
              bw = new BufferedWriter(new FileWriter(file, true));
              while((result = br.readLine())!= null){
                  line_count++;
              }
              System.out.print(++line_count + "/");
              saveString = scan.next();
              bw.write(saveString);
              line_count =0;
              bw.newLine();
              bw.flush();
          } catch (IOException e) {
              e.printStackTrace();
          }finally {
              if(bw != null) try {bw.close(); } catch (IOException e) {}
          }
        return true;
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
         
         if(!((update > 0) && (update <= count))){
            System.err.println("없는 줄 번호입니다.");
            return false;
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
         
         if(!((update > 0) && (update <= count))){
            System.err.println("없는 줄 번호입니다.");
            return false;
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