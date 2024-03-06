package com.coderscampus;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {

	Object[] items = new Object[10];
	int index = 0;
	
	


	
	@Override
	public boolean add(T item) {
		items[index]= item;
		index++;
		
	
		
	//	System.out.println(item);
//		if(items.length == index) {
//			items = Arrays.copyOf(items, 10);
//			
//		}
	if (items.length == index+1) {
			items = Arrays.copyOf(items, 20);		
		}
	else if (items.length == index+1) {
			items = Arrays.copyOf(items, 40);
		}
//		else(items.length==null) {
//			System.out.println(" ");
//		}
		return true;
	}

	@Override
	public int getSize() {
		int itemSize = items.length;
	//	System.out.println("Number of items in the array: " + itemSize);
		return itemSize;
	}

	@Override
	public T get(int index) {
		
	//	System.out.println();
		return (T) items[index];
	}

}
