package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> fruit = new ArrayList<String>();
		//2. Add five Strings to your list
		fruit.add("orange");
		fruit.add("apple");
		fruit.add("strawberry");
		fruit.add("pear");
		fruit.add("grape"); 
		
		System.out.println("Here's an ArrayList of Strings:\n");

		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < fruit.size(); i++) {
			String s = fruit.get(i);
			System.out.println("String at element " + i + " " + s);
		}
		System.out.println("\n");
		//4. Print all the Strings using a for-each loop
		for(String s : fruit) {
			System.out.println(s);
		}
		System.out.println("\n");
		System.out.println("Here's an ArrayList of Integers:\n");

		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < fruit.size(); i++) {
			if(i % 2 == 0) {
				System.out.println(fruit.get(i));
			}
		
			
		}
		//6. Print all the Strings in reverse order.
		for (int i = 5; i > fruit.size(); i--) {
			System.out.println(fruit.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < fruit.size(); i++) {
			if(fruit.get(i).contains("e")){
				
			}
		}
	}
}
