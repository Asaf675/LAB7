package Streams_classes;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class Encryption extends Thread implements Command {
	
	String[] params;

	public void setParams(String[] params) {
		this.params = params;
	}

	public void execute() {
		start();
	}
	
	@Override
	public void run() {
		System.out.println("run");
		PrintWriter out = new PrintWriter(new MyEncoderWriter(new OutputStreamWriter(System.out)));
		for(int i = 0; i < params.length; i++){
			out.print("a");
			out.println(params[i]);
			System.out.println(params[i]);
		}
		
		System.out.println("end run");
	}

}
