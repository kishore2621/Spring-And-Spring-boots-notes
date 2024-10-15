package com.lib.filehandling;

import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filehandling 
{
	
	public static void main(String[] args) 
	{
		File f1= new File("MY file.text");
		
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileWriter fw = new  FileWriter(f1);
			fw.write("hello java\n");
			fw.write("hello sql");
			fw.append("bye java sql");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileReader r= new FileReader(f1);
//			int i=0;
//			while((i=r.read())!=-1)
//			{
//				System.out.println((char)i);
//			}
//			r.close();
			BufferedReader b1= new BufferedReader(r);
			String i="";
			while ((i=b1.readLine())!=null)
			{
				System.out.println(i);
			}
			b1.close();
			if(f1.delete())
			{
				System.out.println("delete the file");
			}
			else {
				System.out.println("delete operation some problem");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
