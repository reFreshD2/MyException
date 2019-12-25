
public class Queue {
int maxElem = 8;
int H, T;
int[] Elem;

public Queue() {
	H = 0;
	T = 0;
	Elem = new int[maxElem];
}

public void add(int data) {
	try {
		if (this.length() < maxElem) {
			Elem[T] = data;
			T++;
		}
		else {
			throw new QueueException("Adding to full queue");
	}
	} catch (QueueException e){
			System.out.println(e);
	}
}

public void del() {
	try {
		if (this.length() != 0) {
		for (int i = H; i < T-1; i++) {
			Elem[i] = Elem[i+1];
		}
		T--;
		}
		else {
			throw new QueueException("Deleting from empty queue");
		}
	}
	catch (QueueException e) {
		System.out.println(e);
	}
}

public int length() {
	return T-H;
}

public void print() {
	if (this.length() == 0) {
		System.out.println("Queue is empty");
	}
	else {
		for (int i=H; i<T;i++) {
			System.out.print(Elem[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
}

public boolean search(int data) {
	boolean isFound = false;
	try {
		if (this.length() != 0) {
			for(int i = H; i < T && isFound == false; i++) {
				if (data == Elem[i]) {
					isFound = true;
				}
			}
		}
		else {
			throw new QueueException("Searching in empty queue");
		}
	}
	catch (QueueException e) {
		System.out.println(e);
	}
	return isFound;
}
}
