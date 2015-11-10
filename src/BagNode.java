/**
 * @author Sam Abdi
 * @course COMP 272
 * @assignment TMA 1
 *
 *             This class implements a Node for a Bag interface
 * 
 */
public class BagNode {

	private Object data;
	private BagNode next;
	private BagNode prev;

	/*/**
	 * constructor for an empty Node
	 * 
	 *
	public BagNode() {
		data = null;
		next = null;
	}*/

	/**
	 * Constructor for a bag node
	 * 
	 * @param data
	 *            the data to be stored in node
	 */
	public BagNode(Object data) {
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
	public BagNode getNext() {
		return next;
	}

	/**
	 * @param next
	 *            the next to set
	 */
	public void setNext(BagNode next) {
		this.next = next;
	}

	/**
	 * @return the prev
	 */
	public BagNode getPrev() {
		return prev;
	}

	/**
	 * @param prev the prev to set
	 */
	public void setPrev(BagNode prev) {
		this.prev = prev;
	}

}
