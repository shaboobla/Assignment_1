/**
 * @author Sam Abdi
 * @course COMP 272
 * @assignment TMA 1
 *
 *             This class implements a Random Queue using a Singly Linked list
 * 
 */
public class RandomQueue {

	private RandomQueueNode head;
	private RandomQueueNode tail;
	private RandomQueueNode rr;
	private int size;

	/**
	 * Constructor for an empty list
	 */
	public RandomQueue() {
		head = null;
		tail = null;
		size = 0;
	}

	/**
	 * adds an item to the tail of the list
	 * is method runs O(1)
	 * 
	 * @param data
	 *            data for the node
	 */
	public void add(Object data) {
		RandomQueueNode n = new RandomQueueNode(data);
		if (head == null) {
			head = n;
			head.setPrev(null);
			head.setNext(null);
			tail = n;
			tail.setPrev(null);
			tail.setNext(null);
		} else {
			if (head.getNext() == null) {
				head.setNext(n);
				tail = n;
				tail.setPrev(head);
				tail.setNext(null);
			} else {
				tail.setNext(n);
				n.setPrev(tail);
				n.setNext(null);
				tail = n;

			}

		}
		size++;
	}

	/**
	 * removes a node at random from the list
	 * 
	 * @return
	 */
	public RandomQueueNode remove() {
		RandomQueueNode n = head;

		if (head == null)
			System.out.println("List is Empty!");
		int r = (int) (Math.random() * size + 1);
		System.out.println("Random number is " + r);
		for (int i = 1; i < r; i++)
			n = n.getNext();
		if (n == head) {
			head = head.getNext();
			head.setPrev(null);
			System.out.println("if 1");
			size--;
			return n;
		}
		if (n == tail) {
			tail = tail.getPrev();
			tail.setNext(null);
			System.out.println("if 2");
			size--;
			return n;
		} else {
			n.getPrev().setNext(n.getNext());
			n.getNext().setPrev(n.getPrev());
			System.out.println("if 3");
			size--;
			return n;
		}

	}

	/**
	 * Prints the list information
	 */
	public void printList() {
		if (head == null) {
			System.out.println("List is Empty!");
			return;
		} else
			System.out.printf("List size: %d\n", size);

		RandomQueueNode curr = head;
		while (curr != null) {
			System.out.println(curr.getData());
			curr = curr.getNext();
		}
	}

	public static void main(String[] args) {
		RandomQueue ranQ = new RandomQueue();

		ranQ.printList();
		ranQ.add("1");
		ranQ.add("2");
		ranQ.add("3");
		ranQ.add("4");
		ranQ.add("5");
		ranQ.add("6");
		ranQ.printList();
		ranQ.remove();
		ranQ.printList();

	}

}
