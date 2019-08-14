package com.sourabhshukla.javaio;

import java.io.File;

public class Program1_FileClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f1 = new File("F:\\Coading\\Java\\EclipseEE_Project\\JavaInputOutput\\files_text\\Program1_sourabh.txt");
		f1.createNewFile();
		
		System.out.println("can file Read:"+f1.canRead());
		System.out.println("can file write:"+f1.canWrite());
		System.out.println("Is file exist:"+f1.exists());
		System.out.println("file name:"+f1.getName());
		System.out.println("length of file:"+f1.length());
		
		System.out.println("file total space:"+f1.getTotalSpace());
	}

}
