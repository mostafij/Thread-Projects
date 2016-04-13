package demo2;

public class App {
	public static void main(String[] args){
		//create an object for Runner class
		Thread t1 = new Thread(new Runner());
		t1.start();
		
		Thread t2 = new Thread(new Runner());
		t2.start();
	}
}
