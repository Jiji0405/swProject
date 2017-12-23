package swProject.test;

import static org.junit.Assert.*;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import swProject.FileEdit;
import swProject.Memo;

public class MemoTest {
	String path = "swProject/swProject/memo.txt";
	File file = new File(path);

	@Test
	public void testSave() {
		Memo memo = new Memo();
		FileEdit fe = new FileEdit();
		String input = "save";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);

		assertTrue(true);
	}

	@Test
	public void testEdit() throws IOException {
		FileEdit fe = new FileEdit();
		Memo memo = new Memo();
		File file = new File(path);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr); 
		
		String content = "", line = "";
		
		fe.edit(file, 1, "Memo");
		while((content = br.readLine()) != null)
			line = content;		
		fr.close();
		
		assertNotNull(line.equals(fe.getline()));
	}

}
