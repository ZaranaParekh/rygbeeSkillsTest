/*
 * This is the source code for question 1.
 * The input is stored in a String named input.
 * The characters in the String are traversed one by one.
 * The output is stored in the form of a linked list.
 * If a character in the string is such that it has been encountered before, then it is not appended to the linked list, otherwise it is.
 * 
 * 
 * @author : Zarana Parekh
 * @version : 1.0
 * @since : 2014 - 09 - 08
 */

package SkillsTest;

import java.util.Iterator;
import java.util.LinkedList;

public class Question1 
{
	LinkedList<Character> finalList; // the output list
	String input; // the input string of characters
	
	public Question1()
	{
		finalList = new LinkedList<Character>(); // initializing a new linked list
		this.input = null; // initializing the input string to null
	}

	/* public void removeDuplicates(String input)
	{
		this.input = input;
		
		for(int i=0;i<input.length();i++)
		{
			boolean removed = false;
			char ch = input.charAt(i);
			
			if(!finalList.isEmpty())
			{
				Iterator<Character> itr = finalList.iterator();
				
				while(itr.hasNext())
				{
					char c = itr.next();
					//System.out.print(c + "-");
					if(c == ch)
					{
						//itr.remove();
						removed = true;
						break;
					}
				}
				
				//System.out.println();
				
				if(!removed)
				{
					finalList.add(ch);
					//System.out.println("inserted " + ch);
				}
			}
			
			else
			{
				//System.out.println("inserted " + ch);
				finalList.add(ch);
			}
		}
	} */
	
	// method to remove duplicates from the list
	public void removeMethod(String input)
	{
		for(int i=0;i<input.length();i++)
		{
			char ch = input.charAt(i);
			
			if(finalList.indexOf(ch) < 0)
			{
				//System.out.println("added " + ch);
				finalList.add(ch);
			}
		}
	}
	
	// method to print the output list of characters
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
		Question1 q1 = new Question1();
		q1.removeMethod("qwertyuioplkjhgfdsazxcvbnmabcdefghijklmnopqrstuvwxyz");
		q1.print();
	}
}
