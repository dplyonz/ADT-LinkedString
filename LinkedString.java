package edu.ualbany.Project2;

/**
 * Definition and implementation of LinkedString doubly linked list
 * @author Derren Lyons
 * @version 1.0
 */
public class LinkedString implements LinkedStringInterface{

	private Node<Character> head;
	
	/**
	 * Creates an empty LinkedString instance
	 */
	public LinkedString(){
		this.head = null;
	}
	
	/**
	 * Creates a LinkedString instance containing a sequence of characters.
	 * @param charArray The charArray used for the sequence of characters.
	 */
	public LinkedString(char[] charArray){
		this.head = null;
		int length = charArray.length;
		int count = 0;
		if(length == 1){
			while(count==0){
				this.head = new Node<Character>(charArray[count],null,null);
				count++;
			}
		}
		if(length != 1 && length > 0){
			while(count==0){
				this.head = new Node<Character>(charArray[count],null,null);
				count++;
			}
			while(count == 1){
				char data = charArray[count];
				Node<Character> temp = this.head;
				temp.setNext(new Node<Character>(data,temp,null));
				count++;
			}
			while(count > 1 && count < length){
				int i = 0;
				char data = charArray[count];
				Node<Character> temp = this.head;
				while(i != (count-1)){
					i++;
					temp = temp.getNext();
				}
				temp.setNext(new Node<Character>(data,temp,null));
				++count;
			}
		}

	}
	
	/**
	 * Creates a LinkedString instance containing the same sequence of character as a String instance.
	 * @param string The String instance to be used for the sequence of characters.
	 */
	public LinkedString(String string){
		this(string.toCharArray());
	}
	
	/**
	 * Gets the character stored at a specific index of a linked string.
	 * @param index The specified index to return the character value.
	 * @return The character stored at the index of the linked list.
	 */
	public char charAt(int index){
		int i = 0;
		Node<Character> temp = this.head;
		while(i != index){
			i++;
			temp = temp.getNext();
		}
		return temp.getItem();
	}
	
	/**
	 * Returns a boolean value after checking if a LinkedString is empty.
	 * @return The boolean value true if empty and false if not empty.
	 */
	public boolean isEmpty(){
		return this.length() == 0;
	}
	
	/**
	 * Gets the length of this LinkedString.
	 * @return An integer value length of a LinkedString.
	 */
	public int length(){
		int i = 0;
		Node<Character> temp = this.head;
		while(temp != null){
			i++;
			temp = temp.getNext();
		}
		return i;
	}
	
	/**
	 * Concatenates a specified LinkedString to the end of another LinkedString.
	 * @param LinkedString The LinkedString to be used for the concat method.
	 * @return A new LinkedString after concatenating one LinkedString to another.
	 */
	public LinkedString concat(LinkedString string){
		int length = this.length();
		int length2 = string.length();
		char charArray1[] = new char[length+length2];
		for(int i = 0;i<length;i++){
			char NodeData = this.charAt(i);
			charArray1[i]= NodeData;
		}
		int z = 0;
		for(int j = length; j < length2+length ; j++){
			char NodeData = string.charAt(z);
			charArray1[j] = NodeData;
			z++;
		}
		LinkedString newString = new LinkedString(charArray1);
		return newString;
	}
	
	/**
	 * Gets a substring of a LinkedString.
	 * @param index1 The index at which to start the substring.
	 * @param index2 The index at which to stop the substring.
	 * @return A new LinkedString that is a substring of this LinkedString
	 */
	public LinkedString substring(int index1, int index2){
		int length = index2 - index1;
		char charArray[] = new char[length];
		int j = index1;
		for(int i = 0;i < length;i++){
			char NodeData = this.charAt(j);
			charArray[i] = NodeData;
			j++;
		}
		LinkedString newString = new LinkedString(charArray);
		return newString;
	}
	
}
