/**
 * @author Sam Abdi
 * @course COMP 272
 * @assignment TMA 1
 *
 *             This class implements Bag
 * 
 */
public class Bag {

	private BagNode head;
	private int size;

	/**
	 * constructor for an empty bag
	 */
	public Bag() {

		head = null;
		size = 0;
	}

	public void add(Object data) {

		BagNode n = new BagNode(data);
		if (head == null) {
			head = n;
			head.setNext(null);
			head.setPrev(null);
		} else {
			n.setNext(head);
			head.setPrev(n);
			head = n;
			head.setPrev(null);
		}
		size++;
	}
	/**
	 * Finds and removes x from the bag
	 * 
	 * @param x item to be removed
	 * @return removed item
	 */
	public BagNode remove(Object x){
		BagNode remove;
		remove = this.find(x);
		if(remove == head){
			remove.getNext().setPrev(null);
			head = remove.getNext();
		}else{
		remove.getPrev().setNext(remove.getNext());
		remove.getNext().setPrev(remove.getPrev());
		}
		System.out.printf("%s was removed from the bag.\n", x);
		return remove;
		
	}
	
	/**
	 * finds the first x in the bag
	 * 
	 * @param x the item to look for
	 * @return first found item
	 */
	
	public BagNode find(Object x){
		BagNode y;
		y = head;
		while(y.getData() != x)
			y = y.getNext();
		if(y.getData() == x)
			System.out.printf("%s was found in the bag.\n", x);
		return y;
		
	}
	
	/**
	 * finds all elements that are equal to x
	 * 
	 * @param x the item to look for
	 * @return a list of found items if present
	 */
	public String findAll(Object x){
		
	}

	/**
	 * Prints the list information
	 */
	public void printList() {
		if (head == null) {
			System.out.println("Bag is Empty!");
			return;
		} else
			System.out.printf("Bag size: %d\n", size);

		BagNode curr = head;
		while (curr != null) {
			System.out.println(curr.getData());
			curr = curr.getNext();
		}
	}
	

	public static void main(String[] args) {

		Bag bag = new Bag();
		bag.printList();
		bag.add("1");
		bag.add("2");
		bag.add("3");
		bag.add("4");
		bag.add("5");
		bag.printList();
		bag.remove("3");
		bag.printList();

	}

}
