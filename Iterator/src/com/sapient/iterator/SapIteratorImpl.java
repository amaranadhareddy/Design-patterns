package com.sapient.iterator;

public class SapIteratorImpl implements SapIterator {

	private Object[] arr;
    private int idx;
    
	public SapIteratorImpl(Object[] arr) {
		super();
		if(arr == null)
			this.arr = new Object[]{};
		this.arr = arr;
	}
	@Override
	public Object getFirst() {
		if(arr.length > 0)
			return arr[0];
		return null;
	}
	@Override
	public Object getLast() {
		if(arr.length > 0)
			return arr[arr.length-1];
		return null;
	}
	@Override
	public Object getPrev() {
        if(idx > 0){
        	Object obj = arr[--idx];
    		return obj;
        }
		return null;
	}
	@Override
	public Object getNext() {
		if(idx < arr.length-1){
			Object obj = arr[++idx];
			return obj;
		}
		return null;
	}
	@Override
	public Object get(int idx) {
		this.idx = idx;
		if(arr.length>0 && idx > 0 && idx<arr.length)
			return arr[this.idx];
		return null;
	}
	@Override
	public void beforeFirst() {
		this.idx =-1;
		
	}
	@Override
	public void afterLast() {
		this.idx = arr.length;
		
	}

	

}
