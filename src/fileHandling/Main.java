package fileHandling;

import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	
	
	
	public static void main(String[] args) throws IOException {
		// use predefined File class and import package java.io.File
		File create=new File("hello.txt");
		// give conditions
		if(create.createNewFile()) {
			System.out.println("file is createdd");
		}
		else {
			System.out.println("file is already created");
		}
		
		// inout intu the file
		FileWriter writes=new FileWriter("hello.txt");
		writes.write("Hello world");
		writes.close();
		FileReader read =new FileReader("hello.txt");
		//String data=read.readAllAsString();
	
		
		
//		BufferedReader bf=new BufferedReader(read);
//		String data=bf.readLine();
//		System.out.println(data);
//		
		int info;
		while((info=read.read())!=-1) {
			System.out.print((char) info);
			System.out.print(info);
		}
		System.out.println();
		read.close();
//		FileWriter write=new FileWriter("hi.txt");
//		write.write("hi goodmorning");
//		write.close();
		
		
		
		
		
		//create.delete();
	}

}
