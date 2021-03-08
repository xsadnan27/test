package com.code.core;


import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.code.core.ThreeWordSeq;

class ThreeWordSeqTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testFileFound() throws IOException {
	   
	    String[] files = {"file1.txt"};
	    
	    ThreeWordSeq.readFiles(files);
	    
	  
	}
	
	@Test
	public void testCalulateFreq() throws IOException {
	   
	    String pharse = "once upon a time";
	    
	    ThreeWordSeq.calculateFreq(pharse);
	    
	  
	}

}
