/**
 * @author Sam Abdi
 * @course COMP 272
 * @assignment TMA 1
 *
 *             This class implements a node for a Doubly Linked List
 * 
 */
public class DoublyLinkedListNode {

	private Object data;
	private DoublyLinkedListNode next;
	private DoublyLinkedListNode prev;

	public DoublyLinkedListNode(Object data, DoublyLinkedListNode next) {

		this.data = data;
		this.next = next;
	}

	public DoublyLinkedListNode(Object data) {
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
	public DoublyLinkedListNode getNext() {
		return next;
	}

	/**
	 * @param next
	 *            the next to set
	 */
	public void setNext(DoublyLinkedListNode next) {
		this.next = next;
	}

	/**
	 * @return the prev
	 */
	public DoublyLinkedListNode getPrev() {
		return prev;
	}

	/**
	 * @param prev the prev to set
	 */
	public void setPrev(DoublyLinkedListNode prev) {
		this.prev = prev;
	}

}
