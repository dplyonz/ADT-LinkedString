package edu.ualbany.Project2;

/**
 * Definition and implementation of Node for doubly linked list
 * @author Derren Lyons
 * @version 1.0
 */
public class Node<E> {
	
	/**
	 * Declares an element type to be stored into the node.
	 */
	private E data;
	
	/**
     * Declares next node to be used in the linked list.
	 */
	private Node<E> next;
	
	/**
	 * Declares previous node to be used in the linked list.
	 */
	private Node<E> previous;
	
	/**
	 * Constructs a newly created Node that holds no data with two null pointers.
	 */
	public Node(){
		this(null,null,null);
	}
	
	/**
	 * Constructs a Node that holds some data with two null pointers.
	 * @param data
	 */
	public Node(E data){
		this(data,null,null);
	}
	/**
	 * Constructs a newly created Node with some data passed in and two Nodes to be linked in the list.
	 * @param data The data to be passed into the Node.
	 * @param previous The previous Node to be linked to this Node.
	 * @param next The next Node to be linked to this Node.
	 */
	public Node(E data, Node<E> previous, Node<E> next){
		this.data = data;
		this.next = next;
		this.previous = previous;
	}
	
	/**
	 * Gets the data stored at this node.
	 * @return The item at this node.
	 */
	public E getItem(){
		return this.data;
	}
	
	/**
	 * Sets the item stored at this node.
	 * @param item The data to be stored at this node.
	 */
	public void setItem(E data){
		this.data = data;
	}
	
	/**
	 * Gets the next node linked in the list.
	 * @return Reference to the node following the current node.
	 */
	public Node<E> getNext(){
		return this.next;
	}
	
	/**
	 * Sets the next node to be linked in the list.
	 * @param next The next node to be linked in the list.
	 */
	public void setNext(Node<E> next){
		this.next = next;
	}
	
	/**
	 * Gets the previous node linked in the list.
	 * @return A reference to the previous node of this node.
	 */
	public Node<E> getPrevious(){
		return this.previous;
	}
	
	/**
	 * Sets the previous node linked in the list.
	 * @param previous The previous node in the list from this node.
	 */
	public void setPrevious(Node<E> previous){
		this.previous = previous;
	}
	

}
