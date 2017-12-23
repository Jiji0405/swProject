package swProject.test;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import swProject.FileEdit;
import swProject.HouseHold;

public class hhTest {
	String path = "swProject/swProject/accountBook.txt";
	@Test
	public void testCreate() throws IOException{
		FileEdit fe = new FileEdit();
		HouseHold hh = new HouseHold();
		File file = new File(path);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr); 
		
		String content = "", line = "";
		
		hh.saveInfo();
		fe.save(file);
		while((content = br.readLine()) != null)
			line = content;
		
		fr.close();
		
		assertTrue(line.equals(fe.getline()));
	}
	
	@Test
	public void testInputRange() throws IOException{
		FileEdit fe = new FileEdit();
		File file = new File(path);
		int lineNumber = -1;
		String line = "2017-12-25/영화관람/11000원";
		
		assertEquals(fe.edit(file, lineNumber, line), false);
	}

}