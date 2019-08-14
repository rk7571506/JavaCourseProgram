package com.abc.iava.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program2_abc_FileReaderWriter {

	public static void main(String[] args) throws IOException {
		
		String path1 = "F:\\Coading\\Java\\EclipseEE_Project\\JavaInputOutput\\files_text\\inputFilereaderWriter.txt";
		String path2 = "F:\\Coading\\Java\\EclipseEE_Project\\JavaInputOutput\\files_text\\outputFileReaderWriter.txt";
		
		FileReader fr = new FileReader(path1);
		int temp;
		FileWriter fw = new FileWriter(path2);
 
		while((temp=fr.read())!=-1)
		{
			fw.write(temp);
		}
		fw.flush();
		fr.close();
		fw.close();
		
	}

}
