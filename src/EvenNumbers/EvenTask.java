package EvenNumbers;

public class EvenTask implements Runnable {

	
	private EvenNumberHolder evenNumberHolder;
	
	public EvenTask(EvenNumberHolder evenNumberHolder) {
		this.evenNumberHolder = evenNumberHolder;
	}
	
	
	@Override
	public void run() {
		
			System.out.println("Starting thread " + Thread.currentThread().getName());
		
		while(true) {
			int value = evenNumberHolder.getNextEven();
			System.out.println("Thread " + Thread.currentThread().getName() + " has got the number: " + value);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		

	}

}
