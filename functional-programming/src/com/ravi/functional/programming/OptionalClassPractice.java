package com.ravi.functional.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassPractice {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(56,58,88,910));
		
		
		Optional<Integer> maxNum = list.stream().filter(n -> n%2==0).max((n1,n2)->Integer.max(n1, n2));
		System.out.println(maxNum);
		System.out.println(maxNum.isPresent()); //true
		Optional<Integer> maxNum1 = list.stream().filter(n -> n%2==1).max((n1,n2)->Integer.max(n1, n2));
		
		System.out.println(maxNum1); //Optional.empty
		System.out.println(maxNum1.isPresent()); //false
		
		
		//if we list don't have maximum even no then it will return 0.
		Integer maxNum2 = list.stream().filter(n -> n%2==1).max((n1,n2)->Integer.max(n1, n2)).orElse(0);
		
		System.out.println(maxNum2); //0
		
		
		
	}

}
