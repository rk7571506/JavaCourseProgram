package com.sourabhshukla.javaio;

import java.io.BufferedReader;
import java.io.FileReader;

public class Program5_BufferedReader_Sourabh {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("F:\\Coading\\Java\\EclipseEE_Project\\JavaInputOutput\\files_text\\Program4_BufferWriter_Sourabh.txt");
		
		BufferedReader br = new BufferedReader(fr);
		int temp;
		while((temp = br.read())!=-1)
		{
			System.out.print((char)temp);
		}
		
		br.close();
		fr.close();

	}

}
