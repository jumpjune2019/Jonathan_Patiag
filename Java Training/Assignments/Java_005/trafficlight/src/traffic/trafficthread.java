package traffic;

class TrafficThread implements Runnable {
	
	/*
	 * intialising variables
	 */
	Thread thread; //the thread
	boolean suspended; //pause boolean
	boolean stopped; //stop boolean
	String name; //name of thread
	int wait; //time of thread
	
	/* This will construct a new thread
	 * with the given parameters based on the 
	 * enum. 
	 * Also setting pause/stop to false
	 */
	 public TrafficThread(String name) {
	        thread = new Thread(this, name);
	        suspended = false; // Set our boolean value to false
	        stopped = false; // Set our boolean value to false
	        thread.start();
	 }
	
	// Begin execution of new thread
	public void run() {
		try {
			while(!stopped) { //this while statement ensures the thread continues running
				/*
				 * These if statements are here to ensure
				 * that if at any point "stopped"
				 * becomes true, the remaining threads do not run
				 */
                //green if statement
				if(!stopped) {
					System.out.println("Light is Green - Go!"); //green message
					Thread.sleep(Light.GREEN.getTime()); //green timer
				} else {
					break;
				}
                // yellow if statement
                if(!stopped) {
                	System.out.println("Light is Yellow - Beware!"); //yellow message
                	Thread.sleep(Light.YELLOW.getTime()); //yellow timer
                } else {
                	break;
                }
                // red if statement
                if(!stopped) {
                	System.out.println("Light is Red - Stop!"); //red message
                	Thread.sleep(Light.RED.getTime()); //red timer
                } else {
                	break;
                }
            }
		} catch (InterruptedException e) {
			System.out.println("Exception caught.");
			e.printStackTrace();
		}
	}
	
	// This will suspend the thread until called again
	synchronized void lightsuspend() {
		suspended = true;	
	}
	
	// This will resume the thread
	synchronized void lightresume() {
		suspended = false;
		notify();
	}
	
	//this will stop the thread once enter is pressed
	synchronized void lightstop() {
		//this should make all suspended threads stopped as well
		suspended = false;
		notifyAll(); //notifies other threads that are stopped
		stopped = true;
	}	
}