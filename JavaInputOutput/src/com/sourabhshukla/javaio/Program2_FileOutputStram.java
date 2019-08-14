package com.sourabhshukla.javaio;

import java.io.FileOutputStream;

public class Program2_FileOutputStram {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fout = new FileOutputStream("F:\\Coading\\Java\\EclipseEE_Project\\JavaInputOutput\\files_text\\Program2_FileOutputStram.txt");
		String s = "Ravi Ranjan";
		
		char t[] =  s.toCharArray();
		
		for(int i=0;i<s.length();i++)
		{
			fout.write(t[i]);
		}
		fout.close();
		

	}

}
