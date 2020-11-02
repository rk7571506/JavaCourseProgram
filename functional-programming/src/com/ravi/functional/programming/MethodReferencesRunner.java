package com.ravi.functional.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MethodReferencesRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method

		List<String> list = new ArrayList<String>(Arrays.asList("Ant", "Bat", "Cow", "Hulk"));

		list.stream().map(n -> n.length()).forEach(n -> System.out.println(n));

		// Using Method References:
		System.out.println("-------------------");
		list.stream().map(String::length).forEach(System.out::println);
		System.out.println("------------------------");
		list.stream().map(String::length).forEach(MethodReferencesRunner::myPrint);
		System.out.println("------------------");
		Integer max = new ArrayList<Integer>(Arrays.asList(23, 46, 47, 78, 79, 80)).stream().filter(n -> n % 2 == 0)
				.max(Integer::compare).orElse(0);
		
		System.out.println("Max::"+max);
		
		
		//Function Programming : Functions are first class citizens.
		/**
		 * 1. Storing functions in variable.
		 * 2. Passing function to methods. <==Done
		 * 3. Returning functions from methods
		 * */
		
		
		//Storing Function in varable:
		//Returing functions from methods
		Predicate<? super Integer> evenPredicate = n -> n % 2 == 0;
		Predicate<? super Integer> oddPredicate = oddPredicateMethod() ;
		new ArrayList<Integer>(Arrays.asList(23, 46, 47, 78, 79, 80)).stream().filter(evenPredicate)
		.forEach(System.out::println);
		
		new ArrayList<Integer>(Arrays.asList(23, 46, 47, 78, 79, 80)).stream().filter(oddPredicate)
		.forEach(System.out::println);

	}

	private static Predicate<? super Integer> oddPredicateMethod() {
		return n -> n % 2 ==1;
	}

	public static void myPrint(Integer i) {
		System.out.println(i);
	}

}
