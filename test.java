
public class test {
	public static void main(String[] args) {
		Queue q1 = new Queue();
		for (int i = 0; i <16 ; i+=2) {
			q1.add(i);
		}
		q1.print();
		System.out.println(q1.length());
		q1.add(0);
		q1.del();
		q1.print();
		if (q1.search(8)) {
			System.out.println("Number is in queue");
		}
		else {
			System.out.println("Number isn't in queue");
		}
		if (q1.search(7)) {
			System.out.println("Number is in queue");
		}
		else {
			System.out.println("Number isn't in queue");
		}
		System.out.println(q1.length());
		for (int i = 0; i< 7; i++) {
			q1.del();
		}
		System.out.println(q1.length());
		q1.del();
		if (q1.search(8)) {
			System.out.println("Number is in queue");
		}
		else {
			System.out.println("Number isn't in queue");
		}
	}
}
