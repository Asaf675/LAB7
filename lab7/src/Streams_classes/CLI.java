package Streams_classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;


public class CLI implements Runnable{

	BufferedReader in;
	PrintWriter out;
	HashMap<String,Command> commands;
	String exitCommand;
	/**
	 * 
	 * @param in - the input source
	 * @param commands - <String,Command> String is the input, Command is what to do with it
	 * @param exitCommand - the input to exit the user interface
	 */
	public CLI(BufferedReader in, HashMap<String,Command> commands,String exitCommand) {
		this.in=in;
		this.out=out;
		this.commands=commands;
		this.exitCommand=exitCommand;
	}
	
	/**
	 * starts the input loop
	 * might block the code
	 * 
	 * @throws IOException 
	 */
	public void start() throws IOException{
		String line;
		while(!(line=in.readLine()).equals(exitCommand)){
			String sp[]=line.split(" ");
			Command c=commands.get(sp[0]);
			if(c!=null){
				if(sp.length>1)
					c.setParams(line.substring(sp[0].length()+1).split(" "));
				else
					c.setParams(null);
				c.execute();
			}
		}
		in.close();		
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		in.close();
	}
	
	
	public void run() {
		try {
			start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
}
