//Morgan Weaver Gold#4
package reverseTheArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter count, integers separated by a space:");
		String numbers = input.nextLine();
		input.close();
		
		String[] nums = numbers.split(" ");
		List<String> results = new ArrayList<>();
		results.add(nums[1]);
		for(int i = 2; i < nums.length; i++) {
			results.add(results.size(), nums[i]);
			Collections.reverse(results);
		}
		for(String x: results) {
			System.out.print(x + " ");
		}
		
	}

}
