package com.basics.junittestcase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.basics.College;
import com.basics.StudentImpl;

public class StudentImplTest {

	@Test
	public void doTest() { // all test cases should be void
		College c = new StudentImpl();
		String result = c.student("Anee");
		
		assertNotNull(result);
		assertEquals("Hello Anee", result);

	}

}
