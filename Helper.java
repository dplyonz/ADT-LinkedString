package edu.ualbany.Project2;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * Class to test implementation of the LinkedString
 * @author Derren Lyons
 * @version 1.0
 */
public class Helper {

	public static void start() throws FileNotFoundException{
		
		ArrayList<LinkedString> List = new ArrayList<LinkedString>();
		create(List);
		for(int i = 0;i<List.size();i++){
			displayAndMore(List.get(i));
		}
	}
	
	/**
	 * Displays the contents of the linked string.
	 * @param string The LinkedString to be displayed.
	 */
	private static void displayAndMore(LinkedString string){
		//First, display each LinkedString in the list along with it's length
		int length = string.length();
		System.out.print("Linked String: ");
		for(int i = 0;i<length;i++){
			char data = string.charAt(i);
			System.out.print(data);
		}
		System.out.println("\n"+"Length of the String: "+length);
		//Second, print first character of each LinkedString
		char firstChar = string.charAt(0);
		System.out.println("First character of this String: "+firstChar);
		//Third, call substring to get the first character of each LinkedString
		LinkedString newString = string.substring(0, 1);
		System.out.print("Substring of Linked String: ");
		int length2 = newString.length();
		for(int i = 0; i < length2; i++){
			char data = newString.charAt(i);
			System.out.print(data);
		}
		//Fourth, concatenate this string with its original string
		LinkedString concatString = string.concat(newString);
		int length3 = concatString.length();
		System.out.print("\n"+"Original String concatenated with Substring: ");
		for(int i =0;i<length3;i++){
			char data = concatString.charAt(i);
			System.out.print(data);
		}
		System.out.println("\n"+"Length of concatenated String: "+length3);
		//Fifth, call isEmpty function for each LinkedString in ArrayList
		boolean isFalse = string.isEmpty();
		System.out.println("IsEmpty??? "+isFalse);
		System.out.println("\n");
	}
	
	/**
	 * Creates an ArrayList of LinkedStrings from data file.
	 * @param List The ArrayList that will be filled with the LinkedStrings.
	 * @throws FileNotFoundException
	 */
	private static void create(ArrayList<LinkedString> List) throws FileNotFoundException{
		Scanner scanner = new Scanner(new File("Names.txt"));
		//There are 20 names in testing data file...first 10 names in the file will be constructed with String parameter
		for(int i =0;i<10;i++){
			while(scanner.hasNext()){
				String NameString = scanner.next();
				LinkedString newString = new LinkedString(NameString);
				List.add(newString);
			}
		}
		//Last 10 names in the file will be constructed with Char Array parameter
		for(int j=0;j<10;j++){
			while(scanner.hasNext()){
				String NameString = scanner.next();
				char[] charNameArray = NameString.toCharArray(); 
				LinkedString newString = new LinkedString(charNameArray);
				List.add(newString);
			}
		}
		scanner.close();
	}
}
