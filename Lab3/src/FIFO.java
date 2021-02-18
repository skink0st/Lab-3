

import java.util.ArrayList;
import java.util.NoSuchElementException;


public class FIFO implements Queue {
	private ArrayList<Object> myQueueList = new ArrayList<Object>();
	private int max_Size = 0;
	
	public void add(Object item) {
		this.myQueueList.add(item);
		
		if (size() < this.myQueueList.size()) {
			max_Size = myQueueList.size();
			max_Size++;
		}
		
	}
	
	public int size() {
		return this.myQueueList.size();
	}
	public int maxSize() {
		return max_Size;
	}
	public boolean isEmpty() {
		if (myQueueList.size() == 0) {
			return true;
		}
		return false;
	}
	public Object first() throws NoSuchElementException {
		if (myQueueList.size() == 0) {
			throw new NoSuchElementException();
		}
		return myQueueList.get(0);
	}
	public boolean equals(Object f) throws ClassCastException {
		if (f instanceof FIFO){
			if (myQueueList.size() == ((FIFO)f).myQueueList.size()){
				for (int i = 0; i < size(); i++) {

					Object a = this.myQueueList.get(i);
					Object b = ((FIFO) f).myQueueList.get(i);
								
					if ((a == null) && (b != null)){
						return false;
					}
					if ((a != null) && (b == null)){
						return false;
					}
					if (a == null && b == null){
						continue;
					}
					if (!(a.equals(b))){
						return false;
					}
				}
				return true;
			}
			
		}
		return false;
}
	
	public String toString() {
		String printQueue = " ";
		for (Object elem : this.myQueueList) {
			printQueue += "(" + String.valueOf(elem) + ") ";
		}
		return printQueue + "Queue: ";
	}
	
	public void removeFirst() throws NoSuchElementException {
		if (myQueueList.size() == 0) {
			throw new NoSuchElementException();
		}
		this.myQueueList.remove(0);
	}
	
	

	
}
