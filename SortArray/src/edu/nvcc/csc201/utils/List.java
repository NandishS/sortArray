package edu.nvcc.csc201.utils;
/**
 * List class provides sort and search functions. This class only support String. 
 * @author tkanchanawanchai6403
 *
 */
public class List {
	String list[];
	/**
	 * Constructor
	 * list is null.
	 */
	public List() {
		list = null;
	}

	/**
	 * A constructor with array parameter
	 * @param list an array list of String to sort
	 */
	public List(String list[]) {
		this.list = list;
	}

	/**
	 * sort the list
	 */
	public void selectionSort() {
		// TODO Auto-generated method stub
		// selection sort
		for (int i = 0; i < list.length; i++)
			swap(i, findSmallest(i));
	}

	/**
	 * Move the smallest value to the first index on the list
	 * and move the value from the first index to the smallest index.
	 * @param startIndex
	 * @param smallestIndex
	 */
	public void swap(int startIndex, int smallestIndex) {
		String temp = list[startIndex];
		list[startIndex] = list[smallestIndex];
		list[smallestIndex] = temp;
	}

	/**
	 * Find the index of the smallest
	 * @param startIndex provide the beginning index of the list
	 * @return smallest index
	 */
	public int findSmallest(int startIndex) {
		String smallest = list[startIndex];
		int smallestIndex = startIndex;
		for (int i = startIndex; i < list.length; i++) {
			if (smallest.compareTo(list[i]) > 0) {
				smallest = list[i];
				smallestIndex = i;
			}
		}
		return smallestIndex;
	}

	/**
	 * Search and return index of the value 
	 * @param element provide the value to search
	 * @return -1 if not found or return index of the value 
	 */
	public int findValue(String element) {
		for (int i = 0; i < list.length; i++) {
			if (element.equals(list[i])) {
				// returns the first index that matches element
				return i;
			}
		}
		// Not found, returns -1
		return -1;
	}

	/**
	 * Display the list
	 */
	public String toString() {
		// print list after sort
		String temp = "";
		for (int i = 0; i < list.length; i++)
			temp += list[i] + " ";
		return temp;
	}
}
