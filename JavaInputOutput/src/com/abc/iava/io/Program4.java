package com.abc.iava.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program4 {

	public static void main(String[] args)throws IOException {
		String path1 = null;
		String path2 = null;
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		String temp = null;
		
		
		try
		{
			path1 = "F:\\Coading\\Java\\EclipseEE_Project\\JavaInputOutput\\files_text\\input.txt";
			path2 = "F:\\Coading\\Java\\EclipseEE_Project\\JavaInputOutput\\files_text\\output.txt";
			fr = new FileReader(path1);
			fw = new FileWriter(path2);
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			while((temp=br.readLine())!=null)
			{
				bw.write(temp);
			}
					
		}catch(Exception e)
		{
			System.out.println("IOException Handled.");
		}
		finally
		{
			try
			{
				br.close();
				bw.close();
				fr.close();
				fw.close();
			}
			catch(Exception e)
			{
				System.out.println("Exception Handled.");
			}
		}
		
		

	}

}
