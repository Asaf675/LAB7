package Streams_classes;

import java.io.IOException;
import java.io.Reader;

public class MyDecoderReader extends Reader {

	Reader r;
	
	public MyDecoderReader(Reader r) {
		this.r = r;
	}
	
	@Override
	public void close() throws IOException {
		r.close();
	}

	@Override
	public int read(char[] arg0, int arg1, int arg2) throws IOException {
		int charsRead = r.read(arg0, arg1, arg2);
		
		String coded = new String(arg0);
		String decoded = Cipher.getCipher().decode(coded);
		
		for(int i = 0; i < arg0.length; i++) {
			arg0[i]=decoded.charAt(i);
		}
		
		return charsRead; 
	}
// at 7:06 in eli's video
}
