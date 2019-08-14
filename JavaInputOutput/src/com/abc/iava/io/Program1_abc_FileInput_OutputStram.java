package com.abc.iava.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Program1_abc_FileInput_OutputStram {
	public static void main(String[] args) throws Exception{
		String path1 = "F:\\Coading\\Java\\EclipseEE_Project\\JavaInputOutput\\files_text\\Program1_abc_input1.txt";
		String path2 = "F:\\Coading\\Java\\EclipseEE_Project\\JavaInputOutput\\files_text\\Program1_abc_output1.txt";
		
		FileInputStream fis = new FileInputStream(path1);
		
		int temp;
		//FileOutputStream fos  = new FileOutputStream(path2);
		FileOutputStream fos  = new FileOutputStream(path2,true); //for appending.
		
		while((temp=fis.read())!=-1)
		{
			fos.write(temp);
		}
		
		fis.close();
		fos.close();
		
	}
}
