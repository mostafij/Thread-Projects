package demo1;

public class Runner extends Thread{
	@Override
	public void run() {
		for(int i=0; i<10; i++){
			// just printing hello and value of i
			System.out.println("Hello "+ i);
			
			try {
				//put the current thread in sleep for 1000ms
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
