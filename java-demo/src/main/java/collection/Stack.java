package collection;

public class Stack {

	private int MAXIMUM_SIZE = 10;
	private int[] stack = new int[MAXIMUM_SIZE];
	private int front = 0; 
	private int back = 0;
	private boolean full = false;
	
	public Stack() {}
	
	public Stack(int size) {
		this.MAXIMUM_SIZE = size;
		stack = new int[MAXIMUM_SIZE];
	}
	
	public boolean isFull() {
		return full;
	}
	
	public boolean isEmpty() {
		return !full && front == back;
	}
	
	public void enQueue(int data) {
		if (isFull()) {
			System.err.println("Stack is full");
			return;
		}
		stack[back] = data;
		back = incrementRingCounter(back);
		full = front == back ? true : false;
	}
	
	public int deQueue() {
		if (isEmpty()) {
			System.err.println("Stack is empty");
			return -1;
		}
		int result = stack[front];
		front = incrementRingCounter(front);
		full = false;
		return result;
	}
	
	private int incrementRingCounter(int count) {
		return ++count >= MAXIMUM_SIZE ? 0 : count; 
	}
	
	public int size() {
		if (back > front) {
			return back - front;
		}
		if (front > back) {
			return MAXIMUM_SIZE - front + back;
		}
		return full ? MAXIMUM_SIZE : 0;
	}
}
