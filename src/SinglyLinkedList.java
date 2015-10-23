
/**
 * @author Sam Abdi
 * @course COMP 272
 * @assignment TMA 1
 *
 *             This class implements Singly Linked List
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
			head = temp;
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

	public void swap(SinglyLinkedListNode element) {
		SinglyLinkedListNode n = head;
		SinglyLinkedListNode a, a_bef, a_aft, b, b_bef;

		if (head == null || head.getNext() == null) {
			System.out.println("Cannot swap.");
			return;

		} else {
			if (n.getData() == element.getData()) {
				a_bef = n;
				a = a_bef.getNext();
				a_aft = a.getNext();
				b_bef = a;
				b = a_aft;

				a_bef.setNext(b);
				b.setNext(a);
				a.setNext(b_bef.getNext());
			}

			else {
				while (n.getNext().getData() != element.getData()) {
					n = n.getNext();
				}
				a_bef = n;
				a = a_bef.getNext();
				a_aft = a.getNext();
				b_bef = a;
				b = a_aft;

				a_bef.setNext(b);
				b.setNext(a);
				a.setNext(b_bef.getNext());
			}
		}

	}

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
		list.swap();
		list.printList();

	}

}
