/** 
 * @author Sam Abdi
 * @course COMP 272
 * @assignment TMA 1
 *
 * This class implements a node for a stack queue
 * 
 */
public class QueueNode {
	
	private Object data;
	private QueueNode next;
	
	public QueueNode(Object data, QueueNode next){
		
		this.data = data;
		this.next = next;
	}

	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * @return the next
	 */
	public QueueNode getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(QueueNode next) {
		this.next = next;
	}

}
