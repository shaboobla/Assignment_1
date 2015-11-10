/**
 * @author Sam Abdi
 * @course COMP 272
 * @assignment TMA 1
 *
 *             This class implements a Doubly Linked List
 * @param head
 *            the head of the list
 * @param tail
 *            the tail of the list
 * @param size
 *            the size of the list
 * 
 */
public class DoublyLinkedList {

	/**
	
	 */
	private DoublyLinkedListNode head;
	private DoublyLinkedListNode tail;
	private int size;

	/**
	 * Initializes an empty Doubly Linked List
	 */
	public DoublyLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}

	/**
	 * Adds a node to the tail of the list
	 * 
	 * @param data
	 *            data to be set for the node
	 */
	public void enQueue(Object data) {
		DoublyLinkedListNode n = new DoublyLinkedListNode(data);
		if (head == null) {
			head = n;
			head.setNext(null);
			head.setPrev(null);
			tail = n;
			tail.setNext(null);
			tail.setPrev(null);
		} else {
			if (head.getNext() == null) {
				head.setNext(n);
				n.setPrev(tail);
				n.setNext(null);
				tail = n;
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
	 * Dequeues node from the head of the list
	 * 
	 * @return the dequeued node
	 */
	public DoublyLinkedListNode deQueue() {
		DoublyLinkedListNode temp = head;
		if (head == null) {
			System.out.println("List is empty!");
			return null;
		} else {
			head = head.getNext();
			head.setPrev(null);
			size--;
			return temp;
		}

	}

	/**
	 * swaps a node with its next node
	 * 
	 * @param data
	 *            the node with data to swap
	 */
	public void swap(Object data) {
		DoublyLinkedListNode n = head;
		DoublyLinkedListNode a_bef, a, b, b_aft;
		if (head == null || head.getNext() == null)
			System.out.println("Cannot Swap!");
		if (n.getData() == data) {
			a = head;
			b = a.getNext();
			if (b == tail)
				tail = a;
			b_aft = b.getNext();
			head = b;
			b_aft.setPrev(a);
			a.setNext(b.getNext());
			a.setPrev(b);
			b.setNext(a);
			b.setPrev(null);
		} else {
			while (n.getData() != data)
				n = n.getNext();
			a = n;
			b = a.getNext();
			if (b == tail) {
				tail = a;
				a_bef = a.getPrev();
				

				a_bef.setNext(b);
				
				a.setPrev(b);
				a.setNext(null);
				b.setPrev(a_bef);
				b.setNext(a);

			} else {
				a_bef = a.getPrev();
				b_aft = b.getNext();

				a_bef.setNext(b);
				b_aft.setPrev(a);
				a.setPrev(b);
				a.setNext(b_aft);
				b.setPrev(a_bef);
				b.setNext(a);
			}

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

		DoublyLinkedListNode curr = head;
		while (curr != null) {
			System.out.println(curr.getData());
			curr = curr.getNext();
		}
	}

	public static void main(String[] args) {

		DoublyLinkedList dll = new DoublyLinkedList();

		dll.printList();
		dll.enQueue("1");
		dll.enQueue("2");
		dll.enQueue("3");
		dll.enQueue("4");
		dll.enQueue("5");
		dll.enQueue("6");
		dll.printList();
		dll.deQueue();
		dll.printList();
		dll.swap("3");
		dll.printList();
		dll.swap("5");
		dll.printList();

	}

}
