package com.sourabhshukla.javaio;

import java.io.BufferedReader;
import java.io.FileReader;

public class Program7_BufferedReader_read {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("F:\\Coading\\Java\\EclipseEE_Project\\JavaInputOutput\\files_text\\Program4_BufferWriter_Sourabh.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		char s[] = new char[20];
		/*
		 * Syntax:-
		 * 		int read(char []buf, int off, int len)
		 *    
		 *     off -> no of spaces.
		 *     len -> only len character read.
		 *     
		 *     Hello Ravi Ranjan
		 *     
		 *     br.read(s,2,4)
		 *     __Hell
		 * 
		 * */
		
	//	br.read(s,2,4);
		
	//	System.out.println(s);
		
		br.read(s,0,8);
		System.out.println(s);
		
		br.close();
		fr.close();

	}

}
