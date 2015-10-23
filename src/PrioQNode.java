
/**
 * 
 * @author Sam Abdi
 * @course COMP 272
 * @assignment TMA 1
 *
 * This class implements Singly linked list node for Priority Queue
 * 
 */
public class PrioQNode {
	private Object data;
	private int priority;
	private PrioQNode next;

	/**
	 * @param data 
	 * 			  the data to be stored in node
	 * @param priority 
	 * 			      priority of the node
	 * @param next 
	 * 			  next link in list
	 */
	public PrioQNode(Object data, int priority, PrioQNode next) {
		this.data = data;
		this.priority = priority;
		this.next = next;
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
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * @param priority
	 *            the priority to set
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}

	/**
	 * @return the next
	 */
	public PrioQNode getNext() {
		return next;
	}

	/**
	 * @param next
	 *            the next to set
	 */
	public void setNext(PrioQNode next) {
		this.next = next;
	}
}