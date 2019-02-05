package com.sarthak.ConsecutiveLetters;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import javax.print.DocFlavor.INPUT_STREAM;

import org.junit.Test;

public class TestConsecutive {
	@Test
	public void testConsLetter() {
		ArrayList<String> inputList = new ArrayList<String>(3); 
		inputList.add("google");
		inputList.add("facebook");
		inputList.add("somil");
		
		ArrayList<String> expected = new ArrayList<String>(3);
		expected.add("google");
		expected.add("facebook");
		
		Letter let = new Letter();
		ArrayList<String> actual=let.getCons(inputList);
		
		assertEquals(expected, actual);
	}
		
		
	}
	