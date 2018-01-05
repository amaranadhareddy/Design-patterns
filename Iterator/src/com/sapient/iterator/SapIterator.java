package com.sapient.iterator;

public interface SapIterator {

	Object getFirst();
	Object getLast();
	Object getPrev();
	Object getNext();
	Object get(int idx);
	void beforeFirst();
	void afterLast();
}
