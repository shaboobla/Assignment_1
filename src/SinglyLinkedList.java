
/**
 * @author Sam Abdi
 * @course COMP 272
 * @assignment TMA 1
 *
 *             This class implements Singly Linked List
 * @param head
 *            the head of the list
 * @param tail
 *            the tail of the list
 * @param size
 *            the size of the list
 * 
 */
public class SinglyLinkedList {

	private SinglyLinkedListNode head;
	private SinglyLinkedListNode tail;
	private int size;

	/**
	 * Initializes an empty Singly Linked List
	 */
	public SinglyLinkedList() {
		head = null;
		tail = null;
		size = 0;

	}

	/**
	 * Adds a node at the tail of the linked list
	 * 
	 * @param data
	 *            data to be set for the node
	 */
	public void enQueue(Object data) {
		SinglyLinkedListNode n = new SinglyLinkedListNode(data);
		if (head == null) {
			head = n;
			head.setNext(tail);
			tail = n;
		} else {
			tail.setNext(n);
			tail = n;
			tail.setNext(null);
		}

		size++;

	}

	/**
	 * Removes a node from the head of the linked list
	 * 
	 * @return the dequeue item
	 */
	public SinglyLinkedListNode deQueue() {
		SinglyLinkedListNode temp = null;
		if (head == tail) {
			temp = head;
			head = null;
			tail = null;
		} else {
			temp = head;
			head = head.getNext();
		}

		size--;
		return temp;

	}

	public int size() {
		return size;
	}

	/**
	 * This method swaps an element with the next element after it.
	 * 
	 * @param element
	 */

	public void swap(Object data) {
		SinglyLinkedListNode n = head;
		SinglyLinkedListNode a, a_bef, b, b_aft;

		if (head == null || head.getNext() == null) {
			System.out.println("Cannot swap.");
			return;

		} else {
			if (n.getData() == data) {
				a = n;
				b = a.getNext();
				b_aft = b.getNext();

				b.setNext(a);
				a.setNext(b_aft);
				head = b;

			}

			else {
				while (n.getNext().getData() != data) {
					n = n.getNext();
				}
				a_bef = n;
				a = a_bef.getNext();
				b = a.getNext();
				if (b == tail) {
					tail = a;
					
					a_bef.setNext(b);
					b.setNext(a);
					a.setNext(null);
				} else {
					b_aft = b.getNext();

					a_bef.setNext(b);
					b.setNext(a);
					a.setNext(b_aft);
				}

			}
		}

	}

	/**
	 * prints the list information
	 */
	public void printList() {
		if (head == null) {
			System.out.println("List is Empty!");
			return;
		} else
			System.out.printf("List size: %d\n", size);

		SinglyLinkedListNode curr = head;
		while (curr != null) {
			System.out.println(curr.getData());
			curr = curr.getNext();
		}

	}

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.printList();
		list.enQueue("1");
		list.enQueue("2");
		list.enQueue("3");
		list.enQueue("4");
		list.enQueue("5");
		list.enQueue("6");
		list.printList();
		list.deQueue();
		list.printList();
		list.swap("2");
		list.printList();
		list.swap("5");
		list.printList();

	}

}
