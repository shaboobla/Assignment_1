/** 
 * @author Sam Abdi
 * @course COMP 272
 * @assignment TMA 1
 *
 * This class implements Priority Queue based on a Singly linked list 
 * 
 */
public class Stack {
	
	private QueueNode head;
	private int size;
	
	/**
	 * Initializes an empty stack.
	 */
	public Stack(){
		head = null;
		size = 0;
	}
	
	public void push(Object data){
		QueueNode n = new QueueNode(data, head);
		head = n;
		size++;
	}
	
	public Object pop(){
		head = head.getNext();
		size--;
		return head;
	}
	
	public void printStack(){
		if(head == null)
			System.out.println("The Stack is Empty");
		else System.out.printf("Stack Size: %d \n", size);
		QueueNode curr = head;
		while(curr!=null){
			System.out.println(curr.getData());
			curr = curr.getNext();
		}
			
	}
	
	public static void main(String[] args){
		Stack stack = new Stack();
		stack.printStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.printStack();
		stack.pop();
		stack.printStack();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.printStack();
		stack.pop();
		stack.printStack();
		
		
		
	}
	

}
