package com.ravi.functional.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.omg.CORBA.portable.BoxedValueHelper;

public class StreamTerminalOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sum of ele
		
	//	IntStream.range(1, 11).forEach(ele->System.out.println(ele));
		
		
		int sum = IntStream.range(1, 11).reduce(0, (n1,n2) -> n1+n2);
		System.out.println(sum);
		
		List<Integer> list = new ArrayList<Integer>(
				Arrays.asList(11,23,45,6,78,-90,9));
		
		Optional<Integer> maxVal =list.stream().max((n1,n2)->Integer.compare(n1, n2));
		
		System.out.println(maxVal);
		
		Integer maxVal1 =list.stream().max((n1,n2)->Integer.compare(n1, n2)).get();
		System.out.println(maxVal1);
		
		
		Integer minVal =list.stream().min((n1,n2)->Integer.compare(n1, n2)).get();
		System.out.println(minVal);
		
		//Collect List of odd number:
		List<Integer> oddList =list.stream().filter(ele->ele%2==1).collect(Collectors.toList());
		System.out.println(oddList);
		
		List<Integer> evenList =list.stream().filter(ele->ele%2==0).collect(Collectors.toList());
		System.out.println(evenList);
		
		//find out the first 10 number square and take into the list.
		//we use boxed() for converting into Stream
		
		List<Integer> squareFirstTenNumbers = IntStream.range(1, 11).map(ele->ele*ele).boxed().collect(Collectors.toList());
		System.out.println(squareFirstTenNumbers);
	}

}
