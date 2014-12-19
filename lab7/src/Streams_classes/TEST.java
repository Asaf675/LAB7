package Streams_classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class TEST {

	public static void main(String[] args)  throws Exception{	
		
		FileReader f = new FileReader("bart.txt");
		BufferedReader input=new BufferedReader(f);
		
		Thread t = new Thread(new CLI(input,,"exit"))		
		
		

	/*	
		FileReader f = new FileReader("bart.txt");
		BufferedReader input=new BufferedReader(f);


		PrintWriter out1=new PrintWriter(new MyEncoderWriter(new FileWriter("encodedBart.txt")));

		String line;
		while((line=input.readLine())!=null) {
			out1.write(line +"\n", 0, line.length()+1);
		}
		
		out1.close();
		
		BufferedReader in=new BufferedReader(new MyDecoderReader(new FileReader("encodedBart.txt")));
		BufferedWriter output = new BufferedWriter(new FileWriter("decodedBart.txt"));
		
		while((line=in.readLine())!=null) {
			output.write(line +"\n", 0, line.length()+1);
		}
		
		
		in.close();
		out1.close();
		output.close();
		input.close(); */
	
	}
}
