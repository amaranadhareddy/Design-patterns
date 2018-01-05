package com.sapient.iterator;

public class Client {

	public static void main(String[] args) {
		
		String[] arr = {"rama", "tom", "sam","peter", "akbar"};
		
		SapIterator it = new SapIteratorImpl(arr);
		
		System.out.println(it.get(2));
		System.out.println(it.getPrev());
		System.out.println(it.getNext());
		System.out.println(it.getLast());
		
		System.out.println("iterating in forward direction");
		String str = null;
		it.beforeFirst();
		while((str= (String)it.getNext()) != null){
			System.out.println(str);
		}
		
		System.out.println("iterating in reverse direction");
		str = null;
		it.afterLast();
		while((str= (String)it.getPrev()) != null){
			System.out.println(str);
		}

	}

}
