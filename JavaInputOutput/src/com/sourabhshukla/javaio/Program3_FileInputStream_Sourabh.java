package com.sourabhshukla.javaio;

import java.io.FileInputStream;

public class Program3_FileInputStream_Sourabh {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream  fis = new FileInputStream("F:\\Coading\\Java\\EclipseEE_Project\\JavaInputOutput\\files_text\\Program2_FileOutputStram.txt");
		int temp;
		while((temp=fis.read())!=-1)
		{
			System.out.print((char)temp);
		}
		System.out.println();
		fis.close();

	}

}