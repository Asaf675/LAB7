package Streams_classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;


public class TEST {

	public static void main(String[] args)  throws Exception{	
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		HashMap<String,Command> commands = new HashMap<String,Command>();
		commands.put("code", new Encryption());
	
		
		Thread t = new Thread(new CLI(in,commands,"exit"));		
		t.start();
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
