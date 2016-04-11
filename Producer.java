package shaffer.j;

import java.util.Random;

public class Producer implements Runnable {
	
	private Random generator = new Random();
	private Buffer sharedLocation;
	
	public Producer(Buffer sharedLocation){
		this.sharedLocation = sharedLocation;
	}

	@Override // need to implement hashmap with values for card deck.
	public void run() {
		
		//Object[] values = myHashMap.values().toArray();
		//Object randomValue = values[generator.nextInt(values.length)];
	}
}
