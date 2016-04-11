package shaffer.j;

import java.util.Map;

public interface Buffer {
	public void blockingPut(int value) throws InterruptedException;
	
	public Map<String, Integer> blockingGet() throws InterruptedException;
}
