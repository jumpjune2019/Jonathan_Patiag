package traffic;

enum Light {
	//Time for lights is represented in the numbers
	GREEN(5000), YELLOW(2000), RED(3000);
	private int waitTime; //determines how long each light will last

	//constructor
	Light(int w){
		waitTime = w;
	}
	
	/*
	 * This function returns the time
	 */
	int getTime() {
		return waitTime;
	}
}