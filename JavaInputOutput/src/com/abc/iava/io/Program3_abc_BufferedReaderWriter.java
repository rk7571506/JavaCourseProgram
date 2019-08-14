package com.abc.iava.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Program3_abc_BufferedReaderWriter {

	public static void main(String[] args) throws Exception {
		String path1 = "F:\\Coading\\Java\\EclipseEE_Project\\JavaInputOutput\\files_text\\inputBufferedreaderWriter.txt";
		String path2 = "F:\\Coading\\Java\\EclipseEE_Project\\JavaInputOutput\\files_text\\outputBufferedreaderWriter.txt";
		
		
		FileReader fr = new FileReader(path1);
		FileWriter fw = new FileWriter(path2);
		
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		String temp;
		while((temp=br.readLine())!=null)
		{
			bw.write(temp);
		}
		
		bw.flush();
		fr.close();
		fw.close();
		br.close();
		bw.close();
	}

}
