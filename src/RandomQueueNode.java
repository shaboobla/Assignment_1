/**
 * @author Sam Abdi
 * @course COMP 272
 * @assignment TMA 1
 *
 *             This class implements a node for a Doubly Linked List
 * 
 */
public class RandomQueueNode {

	private Object data;
	private RandomQueueNode next;
	private RandomQueueNode prev;


	public RandomQueueNode(Object data) {
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
	public RandomQueueNode getNext() {
		return next;
	}

	/**
	 * @param next
	 *            the next to set
	 */
	public void setNext(RandomQueueNode next) {
		this.next = next;
	}

	/**
	 * @return the prev
	 */
	public RandomQueueNode getPrev() {
		return prev;
	}

	/**
	 * @param prev
	 *            the prev to set
	 */
	public void setPrev(RandomQueueNode prev) {
		this.prev = prev;
	}

}
