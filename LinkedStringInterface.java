package edu.ualbany.Project2;

/**
 * Interface to be implemented by LinkedString and the methods to be included in this interface.
 * @author Derren Lyons
 * @version 1.0
 */
public interface LinkedStringInterface {
	
	/**
	 * Gets the character stored at a specific index of a linked string.
	 * @param index The specified index to return the character value.
	 * @return The character stored at the index of the linked list.
	 */
	public char charAt(int index);
	
	/**
	 * Concatenates a specified LinkedString to the end of another LinkedString.
	 * @param LinkedString The LinkedString to be used for the concat method.
	 * @return A new LinkedString after concatenating one LinkedString to another.
	 */
	public LinkedString concat(LinkedString string);
	
	/**
	 * Returns a boolean value after checking if a LinkedString is empty.
	 * @return The boolean value 1 if empty and 0 if not empty.
	 */
	public boolean isEmpty();
	
	/**
	 * Gets the length of this LinkedString.
	 * @return An integer value length of a LinkedString.
	 */
	public int length();
	
	/**
	 * Gets a substring of a LinkedString.
	 * @param index1 The index at which to start the substring.
	 * @param index2 The index at which to stop the substring.
	 * @return A new LinkedString that is a substring of this LinkedString
	 */
	public LinkedString substring(int index1, int index2);
	
	

}
