package com.sourabhshukla.javaio;

import java.io.BufferedReader;
import java.io.FileReader;

public class Program6_BufferedRader_readLine {

	public static void main(String[] args) throws Exception{

				FileReader fr = new FileReader("F:\\Coading\\Java\\EclipseEE_Project\\JavaInputOutput\\files_text\\Program4_BufferWriter_Sourabh.txt");
				
				BufferedReader br = new BufferedReader(fr);
				String temp;
				while((temp = br.readLine())!=null)
				{
					System.out.print(temp);
				}
				
				br.close();
				fr.close();

	}

}
