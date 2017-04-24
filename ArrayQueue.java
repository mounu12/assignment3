package assignment3;

import java.util.NoSuchElementException;

public class ArrayQueue {
	int Queue[];
	int front, rear, size, len;

	public ArrayQueue(int n)

	{
		size = n;
		len = 0;
		Queue = new int[size];
		front = -1;
		rear = -1;

	}

	public boolean isEmpty() {
		return front == -1;
	}

	public int getsize() {
		return len;
	}

	public void enqueue(int i) {
		if (rear == -1) {
			front = 0;
			rear = 0;
			Queue[rear] = i;
		} else if (rear + 1 >= size)
			throw new IndexOutOfBoundsException("Overflow Exception");
		else if (rear + 1 < size)
			Queue[++rear] = i;
		len++;
	}

	public int dequeue() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		else {
			len--;
			int ele = Queue[front];
			if (front == rear) {
				front = -1;
				rear = -1;
			} else
				front++;
			return ele;
		}
	}

	public void display() {
		System.out.print("\nQueue = ");
		if (len == 0) {
			System.out.print("Empty\n");
			return;
		}
		for (int i = front; i <= rear; i++)
			System.out.print(Queue[i] + " ");
	}
}
