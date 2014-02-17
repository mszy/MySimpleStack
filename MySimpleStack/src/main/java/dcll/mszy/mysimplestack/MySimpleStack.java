package dcll.mszy.mysimplestack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MySimpleStack {
	private ArrayList<Item> s;
	
	public MySimpleStack() {
		s = new ArrayList<Item>();
	}
	
	/**
	* Tests if this stack is empty
	*/
	public boolean isEmpty() {
		return s.isEmpty();
	}
	/**
	* Returns the number of items in this stack.
	*/
	public int getSize() {
		return s.size();
	}
	/**
	* Pushes an item onto the top of this stack.
	* null item is allowed.
	*/
	public void push(Item item) {
		s.add(item);
	}
	/**
	* Looks at the object at the top of this stack without removing it from the stack.
	*/
	public Item peek() throws EmptyStackException {
		if(!isEmpty())
			return s.get(s.size()-1);
		else
			throw new EmptyStackException();
	}
	/**
	* Removes the object at the top of this stack and returns that object as the value of this function.
	* @throws EmptyStackException if this stack is empty.
	*/
	public Item pop() throws EmptyStackException {
		Item i = peek();
		return i;
	}
}
