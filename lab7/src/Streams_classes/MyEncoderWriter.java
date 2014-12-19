package Streams_classes;

import java.io.IOException;
import java.io.Writer;

public class MyEncoderWriter extends Writer {
	
	Writer w;
	
	public MyEncoderWriter(Writer w) {
		this.w = w;
	}

	@Override
	public void close() throws IOException {
		w.close();

	}

	@Override
	public void flush() throws IOException {
		w.flush();
	}

	@Override
	public void write(char[] arg0, int arg1, int arg2) throws IOException {
		String str=new String(arg0,arg1,arg2);
		String str2=Cipher.getCipher().encode(str);

	     for(int i=arg1;i<arg1+arg2;i++)
	     {
	    	 arg0[i]=str2.charAt(i);
	     }
		w.write(arg0, arg1, arg2);
	}

}
