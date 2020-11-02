package com.ravi.functional.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

class EvenNumberFinderPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		return t % 2 == 0;
	}

}

class ElementConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println("Hello::" + t);

	}

}

class  ElementSquareFuntion implements Function<Integer, Integer>{

	@Override
	public Integer apply(Integer t) {
		
		return t*t;
	}
	
}

public class LambdaBehindTheScreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

		// list.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));

		// Behind The Screen:

		// filter:
		// Stream<T> filter(Predicate<? super T> predicate);
		// boolean test(T t);

		// list.stream().filter(new EvenNumberFinderPredicate()).forEach(n ->
		// System.out.println(n));

		// forEach:
		// void forEach(Consumer<? super T> action);
		// void accept(T t);

		//list.stream().filter(new EvenNumberFinderPredicate()).forEach(new ElementConsumer());
		
		
		//map
		//<R> Stream<R> map(Function<? super T, ? extends R> mapper);
		// R apply(T t);
		
		list.stream().filter(new EvenNumberFinderPredicate()).map(new ElementSquareFuntion()).forEach(new ElementConsumer());

	}

}
