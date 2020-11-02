package com.ravi.functional.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FPBasic {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>(Arrays.asList("Ram", "Dog", "Babu", "cat", "bat"));

		// printBasic(list);
		// printViaFP(list);

		// printBasicusingFiltering(list);

		// printFPUsingFiltering(list);

		List<Integer> listNum = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		// PrintBasicNumber(listNum);

		// printOddEvenNumber(listNum);

		// printEvenNumberUsingFilter(listNum);

		// Sum of all ele inside the list
		// printSumOfListEleBasicWay(listNum);

		int sumOfList = printSumOfListEleUsingFP(listNum);

		System.out.println(sumOfList);

		int sumOfOddNumberInList = sumOfOddNumberInAListUsingFP(listNum);

		System.out.println(sumOfOddNumberInList);

		/**
		 * stream(stream is source of objects) have two type of operations : 1.
		 * Intermediate Operations : (IR operation takes a stream of elements either
		 * reduce the element in stream or it might map one element to differnet element
		 * )(result of intermediate operation is another stream) (sort, map,
		 * filter,distinct) 2. Terminal Operations: (TR operations is where we are
		 * process/consumes the stream) (reduce, forEach, )
		 */

		List<Integer> listNewInt = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
		
		listNewInt.forEach(System.out::println);

	}

	private static int sumOfOddNumberInAListUsingFP(List<Integer> listNum) {
		int sumOfOddNumberInList = listNum.stream().filter(ele -> ele % 2 == 1).reduce(0, (n1, n2) -> n1 + n2);
		return sumOfOddNumberInList;
	}

	private static int printSumOfListEleUsingFP(List<Integer> listNum) {
		int sumOfList = listNum.stream().reduce(/* intial value */0, (num1, num2) -> num1 + num2);
		return sumOfList;
	}

	private static void printSumOfListEleBasicWay(List<Integer> listNum) {
		int sum = 0;
		for (Integer num : listNum) {
			sum += num;
		}

		System.out.println(sum);
	}

	private static void printEvenNumberUsingFilter(List<Integer> listNum) {
		listNum.stream().filter(ele -> (ele % 2 == 0)).forEach(ele -> System.out.println("even::=>" + ele));
	}

	private static void printFPUsingFiltering(List<String> list) {
		list.stream().filter(ele -> ele.endsWith("at")).forEach(ele -> System.out.println(ele));
	}

	private static void printBasicusingFiltering(List<String> list) {
		for (String ele : list) {
			if (ele.endsWith("at")) {
				System.out.println(ele);
			}
		}
	}

	private static void PrintBasicNumber(List<Integer> listNum) {
		listNum.stream().forEach(ele -> System.out.println("Num->" + ele));
	}

	private static void printOddEvenNumber(List<Integer> listNum) {
		listNum.stream().forEach((ele) -> {
			if (ele % 2 == 0) {
				System.out.println("Even::" + ele);
			} else {
				System.out.println("odd::" + ele);
			}
		});
	}

	//imprtrative style of programming
	private static void printBasic(List<String> list) {
		for (String ele : list) {
			System.out.println(ele);
		}
	}

	//fp is declarative style of programming
	private static void printViaFP(List<String> list) {

		list.stream().forEach(ele -> System.out.println("ele->" + ele));
	}

}
