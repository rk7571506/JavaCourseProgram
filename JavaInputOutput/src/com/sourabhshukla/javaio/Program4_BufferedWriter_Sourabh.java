package com.sourabhshukla.javaio;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Program4_BufferedWriter_Sourabh {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("F:\\Coading\\Java\\EclipseEE_Project\\JavaInputOutput\\files_text\\Program4_BufferWriter_Sourabh.txt");
		BufferedWriter bw = new BufferedWriter(fw); 
		bw.write("Hello Ravi Ranajn");
		
		bw.flush();
		bw.close();
		fw.close();
		
		

	}

}
