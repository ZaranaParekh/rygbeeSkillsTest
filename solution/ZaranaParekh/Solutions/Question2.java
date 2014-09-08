/*
 * This is the source code for question 2.
 * The input is stored in a String named input.
 * The characters in the String are traversed one by one.
 * The output is stored in the form of a linked list.
 * If a character in the string is such that it has been encountered last, then it is not appended to the linked list, otherwise it is.
 * 
 * 
 * @author : Zarana Parekh
 * @version : 1.0
 * @since : 2014 - 09 - 08
 */


package SkillsTest;

import java.util.Iterator;
import java.util.LinkedList;

public class Question2 
{
	LinkedList<Character> finalList; // the output list
	String input; // the input string of characters
	
	public Question2()
	{
		this.finalList = new LinkedList<Character>(); // initializing a new linked list
		this.input = null; // initializing the input string to null
	}
	
	// method to remove consecutive duplicates from the string
	public void removeConsecutiveDuplicates(String input)
	{
		this.input = input;
		
		for(int i=0;i<input.length();i++)
		{
			char ch = input.charAt(i);
			
			if(!finalList.isEmpty())
			{
				char last = finalList.getLast();
				
				if(last != ch)
				{
					finalList.add(ch);
				}
			}
			
			else
			{
				//System.out.println("inserted " + ch);
				finalList.add(ch);
			}
		}
	}
	
	// method to print the elements of the linked list
	public void print()
	{
		Iterator<Character> itr  = finalList.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next() + "-");
		}
	}
	
	public static void main(String[] args) 
	{
		Question2 q2 = new Question2();
		q2.removeConsecutiveDuplicates("abbbbccccccddeffffffffgggggggggggghhijjjjjjjjjjjkllllllllMMMMMmmnnoppqrrsttuvvwxxyzz");
		q2.print();
	}

}
