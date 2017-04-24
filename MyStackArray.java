package assignment3;

import java.util.NoSuchElementException;

public class MyStackArray {
	int arr[];
	int top, size, len;

	public MyStackArray(int n) {
		size = n;
		len = 0;
		arr = new int[size];
		top = -1;

	}

	public boolean isEmpty() {
		return top == -1;
	}

	public int getsize() {
		return len;
	}

	public void push(int i) {
		if (top + 1 >= size)

			throw new IndexOutOfBoundsException();
		if (top + 1 < size)
			arr[++top] = i;
		len++;
	}

	public int pop() {
		if (isEmpty())
			throw new NoSuchElementException("underflow");
		len--;
		return arr[top--];

	}

	public String display()

	{

		if (len == 0) {
			return "[]";
		}
		String s = "";
		for (int i = top; i >= 0; i--)
			s = s + arr[i];

		return s;

	}
}
