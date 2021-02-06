/**
 * 
 */
package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author LENOVO
 *
 */
public class MedianExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr1 = {100};
		Integer[] arr2 = {2,7};
		Double median;
		List<Integer> myList = new ArrayList<Integer>();
		myList.addAll(Arrays.asList(arr1));
		myList.addAll(Arrays.asList(arr2));
		Collections.sort(myList);
		int len = myList.size();
		if (len % 2 == 0) {
			int i = len/2;
			int j = i-1;
			median =  ((double) (myList.get(i)+myList.get(j))/2);
		}
		
		else {
			median = (double )myList.get((int) Math.ceil(len/2));
		}
		System.out.println("Median of "+myList+" is"+median);
	}

}
