/**
 * @author Sam Abdi
 * @course COMP 272
 * @assignment TMA 1
 *
 *             This class implements a node for a Singly Linked List
 * 
 */
public class SinglyLinkedListNode {

	private Object data;
	private SinglyLinkedListNode next;

	public SinglyLinkedListNode(Object data, SinglyLinkedListNode next) {

		this.data = data;
		this.next = next;
	}

	public SinglyLinkedListNode(Object data) {
		this.data = data;
	}

	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * @return the next
	 */
	public SinglyLinkedListNode getNext() {
		return next;
	}

	/**
	 * @param next
	 *            the next to set
	 */
	public void setNext(SinglyLinkedListNode next) {
		this.next = next;
	}

}
