package com.ravi.functional.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamIntermediateOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(3, 5, 8, 231, 7, 8, 7, 9));

		// sorting in a stream

		// list.stream().sorted().forEach(ele -> System.out.println(ele));

		// find first distinct & then sorted

		// list.stream().distinct().sorted().forEach(ele->System.out.println(ele));

		// find the distinct elem & then print the square of distinct ele.

		// list.stream().distinct().map(ele -> ele * ele).forEach(ele ->
		// System.out.println("Square::" + ele));

		// Print the square of 10 numbers

	//	IntStream.range(1, 11).map(ele -> ele * ele).forEach(ele -> System.out.println("square::=>" + ele));

		// Print all list item in lowercase & uppercase * length of ele:
		List<String> listName = new ArrayList<String>(Arrays.asList("Ravi", "Pooja", "Renu", "Abhishek"));

		listName.stream().map(ele -> ele.toLowerCase()).forEach(ele -> System.out.println(ele));
		listName.stream().map(ele->ele.toUpperCase()).forEach(ele->System.out.println(ele));
		listName.stream().map(ele->ele.length()).forEach(ele->System.out.println(ele));
		
		
		

	}

}
