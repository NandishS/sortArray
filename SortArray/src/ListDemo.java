import java.util.Scanner;

import edu.nvcc.csc201.gui.UserInterface;
import edu.nvcc.csc201.utils.List;

/**
 *  
 * @author tkanchanawanchai6403
 *
 */
public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String list3 [] = {"B","C","D","E","F","Z","H","A","G"};
		String list2 [] = {"Thomas", "Sally", "Edward", "Henry"};
		List aList = new List(list2);
		List bList = new List(list3);
		bList.selectionSort();
		System.out.println(bList);
		aList.selectionSort();
		System.out.println(aList);
		new UserInterface();
		
	}

}
