package com.eniac.interviews.airportbaggagerouting;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import junit.framework.TestCase;

public class MainTestEx extends TestCase {
	@Test
	public void testMain(){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.out.println("entered into test");

        
        System.setOut(new PrintStream(baos));
        Main.main(new String [] {"InputTestData.txt"});
        String output=baos.toString();
        assertEquals("0001 Concourse_A_Ticketing A5 A1 : 11\n" +
                "0002 A5 A1 A2 A3 A4 : 9\n" +
                "0003 A2 A1 : 1\n" +
                "0004 A8 A9 A10 A5 : 6\n" +
                "0005 A7 A8 A9 A10 A5 BaggageClaim : 12\n",output);
    }

}
