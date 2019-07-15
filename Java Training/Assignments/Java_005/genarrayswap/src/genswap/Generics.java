package genswap;

class Generics<T> {

	private final Object[] arr;
	public final int length;

	// constructor
	public Generics(int length)
	{
		// Creates a new Object array of specified length
		arr = new Object[length];
		this.length = length;
	}

	/*
	 * This function gets the object
	 * at index i in the array of objects
	 */
	public T get(int i) {
		@SuppressWarnings("unchecked")
		final T t = (T)arr[i];
		return t;
	}

	/*
	 * This function sets an object at
	 * index i in the array with value t
	 */
	public void set(int i, T t) {
		arr[i] = t;
	}
	
	public void swap(int x, int y, Generics<T> t) {
		int i = 0, j = 0;
		T tmp, tmp2 = null; // created 2 object Ts to perform the swap with.
		for(i = 0; i < t.length; i++) {
			if(i == x) { 
				for(j = x; j < t.length; j++) {
					if(j == y) {
						tmp = t.get(i); //give tmp the value at i
						tmp2 = t.get(j); //give tmp2 the value at j
						t.set(j, tmp); //sets the value at index j to tmp
						t.set(i, tmp2); //sets the value at index i to tmp2
					}
				}
			} else if(i == y){
				for(j = y; j < t.length; j++) {
					if(j == x) {
						tmp = t.get(j); //gives tmp the value at j
						tmp2 = t.get(i); //gives tmp2 the value at i
						t.set(i, tmp); //sets the value at index i to tmp
						t.set(j, tmp2); //sets the value at index j to tmp2
					}
				}
			}
		}
	}
}