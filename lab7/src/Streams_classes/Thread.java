package Streams_classes;

public class Thread implements Runnable{

	Runnable r;
	
	public Thread (Runnable r) {
		this.r = r;
	}
	
	public void run() {
		r.run();
	}
}
