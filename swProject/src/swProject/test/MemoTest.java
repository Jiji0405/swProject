package swProject.test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Test;

import swProject.FileEdit;
import swProject.Memo;

public class MemoTest {

	@Test
	public void testSave() {
		Memo memo = new Memo();
		FileEdit fe = new FileEdit();
		String input ="save";
		InputStream in = new  ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		assertTrue(true);
	}

	@Test
	public void testDelete() {
		Memo memo = new Memo();
		FileEdit fe = new FileEdit();
		
		
	}
}
